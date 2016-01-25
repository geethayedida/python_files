package com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MyThread extends Thread{
	private int tagsCollected = -1;
	private int xmlNum = -1;
	private String path = null;
	public MyThread(int xmlNum, String path){
		this.xmlNum = xmlNum;
		this.path = path;
	}
public void run(){
	try{
		System.out.println(Thread.currentThread().getName());
	Process p = Runtime.getRuntime().exec(
			"argos3 -c " + path + "GA_" + xmlNum + ".argos");
	//indexes[i-1] = i-1;
	BufferedReader stdInput = new BufferedReader(
			new InputStreamReader(p.getInputStream()));

	BufferedReader stdError = new BufferedReader(
			new InputStreamReader(p.getErrorStream()));

	// read the output from the command
	//System.out
	//		.println("Here is the standard output of the command:\n");
	String s = null;
	while ((s = stdInput.readLine()) != null) {
		//System.out.println(s);
		if (s.contains("TTC:")) {
			System.out.println(s);
			int val = Integer.parseInt(s.substring(s.indexOf(":")+1).trim());
			//ttc.add(val);
			setTagsCollected(val);
			
			/*int val = Integer.parseInt(s.substring(s.indexOf(":")+1,s.indexOf("[1;32m")));
			//System.out.println(val);
			if(val > max){
				index = i;
				max = val;
			}*/
		}
	}

	//System.out.println("ITR:"+i+", File: "+index);
	// String last = (String)
	// stdInput.lines().toArray()[stdInput.lines().toArray().length-1];
	// System.out.println("S: "+last);

	// read any errors from the attempted command
	/*System.out
			.println("Here is the standard error of the command (if any):\n");
	while ((s = stdError.readLine()) != null) {
		System.out.println(s);
	}*/
	}catch(Exception e){
		e.printStackTrace();
	}
}
/**
 * @return the tagsCollected
 */
public int getTagsCollected() {
	return tagsCollected;
}
/**
 * @param tagsCollected the tagsCollected to set
 */
public void setTagsCollected(int tagsCollected) {
	this.tagsCollected = tagsCollected;
}
/**
 * @return the xmlNum
 */
public int getXmlNum() {
	return xmlNum;
}
/**
 * @param xmlNum the xmlNum to set
 */
public void setXmlNum(int xmlNum) {
	this.xmlNum = xmlNum;
}
}
