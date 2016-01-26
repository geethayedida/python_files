/**
 * 
 */
package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;

/**
 * @author Geetha Yedida
 * 
 */
public class NextGenerationRunner {

	/**
	 * @param args
	 */

	
	public static void read(int xml1,int xml2, String path, int id){
		try {
			
			String[] attributes = new String[]{"pheromoneRate","pheromoneDecayRate","travelGiveupProbability","siteFidelityRate","informedSearchDecay","searchGiveupProbability","uninformedSearchCorrelation"};
			double[] values = new double[]{3,0.05,0.001,2,0.01,0.001,20};
			double[] maxVals = {20,1,1,20,1,1,720};
			List<Integer> indexes = Arrays.asList(new Integer[]{0,1,2,3,4,5,6}); 
			Collections.shuffle(indexes);
			System.out.println(indexes);
			
			File fXmlFile = new File(path+"GA_"+xml1+".argos");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			doc.getDocumentElement().normalize();

			NodeList nList = doc.getElementsByTagName("CPFA");
			NamedNodeMap params = nList.item(0).getAttributes();
			String pheromoneRate = params.getNamedItem(attributes[indexes.get(0)])
					.getNodeValue();
			String pheromoneDecayRate = params.getNamedItem(attributes[indexes.get(1)])
					.getNodeValue();
			
			String travelGiveupProbability = params.getNamedItem(attributes[indexes.get(2)])
					.getNodeValue();
			
			
			File fXmlFile2 = new File(path+"GA_"+xml2+".argos");
			DocumentBuilderFactory dbFactory2 = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder dBuilder2 = dbFactory2.newDocumentBuilder();
			Document doc2 = dBuilder2.parse(fXmlFile2);
			doc2.getDocumentElement().normalize();

			NodeList nList2 = doc2.getElementsByTagName("CPFA");
			NamedNodeMap params2 = nList2.item(0).getAttributes();
			
			
			String siteFidelityRate = params2.getNamedItem(attributes[indexes.get(3)])
					.getNodeValue();
			String informedSearchDecay = params2.getNamedItem(attributes[indexes.get(4)])
					.getNodeValue();
			String searchGiveupProbability = params2.getNamedItem(attributes[indexes.get(5)])
					.getNodeValue();
			String uninformedSearchCorrelation = params2.getNamedItem(attributes[indexes.get(6)])
					.getNodeValue();
			/*System.out.println(pheromoneRate);
			System.out.println(pheromoneDecayRate);
			System.out.println(travelGiveupProbability);
			System.out.println(siteFidelityRate);
			System.out.println(informedSearchDecay);
			System.out.println(searchGiveupProbability);
			System.out.println(uninformedSearchCorrelation);*/
			List<String> attribs = new ArrayList<String>();
			attribs.add(attributes[indexes.get(0)]);
			attribs.add(attributes[indexes.get(1)]);
			attribs.add(attributes[indexes.get(2)]);
			attribs.add(attributes[indexes.get(3)]);
			attribs.add(attributes[indexes.get(4)]);
			attribs.add(attributes[indexes.get(5)]);
			attribs.add(attributes[indexes.get(6)]);
			
			int pherId = indexes.indexOf(0);
			int siteId = indexes.indexOf(3);
			int unInfoId = indexes.indexOf(6);
			
			Random random = new Random();
			double res = 0.0;
			List<Double> vals = new ArrayList<Double>();
			res = computeValue(values[indexes.get(0)], Double.parseDouble(params.getNamedItem(attributes[indexes.get(0)]).getNodeValue()), maxVals[indexes.get(0)]);
			vals.add(res);
			res = computeValue(values[indexes.get(1)], Double.parseDouble(params.getNamedItem(attributes[indexes.get(1)]).getNodeValue()), maxVals[indexes.get(1)]);
			vals.add(res);
			res = computeValue(values[indexes.get(2)], Double.parseDouble(params.getNamedItem(attributes[indexes.get(2)]).getNodeValue()), maxVals[indexes.get(2)]);
			vals.add(res);
			res =computeValue(values[indexes.get(3)], Double.parseDouble(params2.getNamedItem(attributes[indexes.get(3)]).getNodeValue()), maxVals[indexes.get(3)]);
			vals.add(res);
			res = computeValue(values[indexes.get(4)], Double.parseDouble(params2.getNamedItem(attributes[indexes.get(4)]).getNodeValue()), maxVals[indexes.get(4)]);
			vals.add(res);
			res = computeValue(values[indexes.get(5)], Double.parseDouble(params2.getNamedItem(attributes[indexes.get(5)]).getNodeValue()), maxVals[indexes.get(5)]);
			vals.add(res);
			res = computeValue(values[indexes.get(6)], Double.parseDouble(params2.getNamedItem(attributes[indexes.get(6)]).getNodeValue()), maxVals[indexes.get(6)]);
			vals.add(res);
			
			/*vals.add(random.nextGaussian()*values[indexes.get(0)]+Double.parseDouble(params.getNamedItem(attributes[indexes.get(0)]).getNodeValue()));
			vals.add(random.nextGaussian()*values[indexes.get(1)]+Double.parseDouble(params.getNamedItem(attributes[indexes.get(1)]).getNodeValue()));
			vals.add(random.nextGaussian()*values[indexes.get(2)]+Double.parseDouble(params.getNamedItem(attributes[indexes.get(2)]).getNodeValue()));
			vals.add(random.nextGaussian()*values[indexes.get(3)]+Double.parseDouble(params.getNamedItem(attributes[indexes.get(3)]).getNodeValue()));
			vals.add(random.nextGaussian()*values[indexes.get(4)]+Double.parseDouble(params.getNamedItem(attributes[indexes.get(4)]).getNodeValue()));
			vals.add(random.nextGaussian()*values[indexes.get(5)]+Double.parseDouble(params.getNamedItem(attributes[indexes.get(5)]).getNodeValue()));
			vals.add(random.nextGaussian()*values[indexes.get(6)]+Double.parseDouble(params.getNamedItem(attributes[indexes.get(6)]).getNodeValue()));*/
			
			vals.set(pherId, Math.floor(vals.get(pherId)));
			vals.set(siteId, Math.floor(vals.get(siteId)));
			vals.set(unInfoId, Math.floor(vals.get(unInfoId)));
			
			String filename = path+"GA_"+id+".argos";
			XML.generate(attribs, vals, filename);
			
		} catch (Exception exception) {
			exception.printStackTrace();
		}

	}
	
	
	private static double computeValue(double sd,double mean, double max){
		double res = 0.0;
		Random random = new Random();
			res = random.nextGaussian()*sd+mean;
			if(res < 0){
				res = Math.abs(res);
			}
			
			if(res > max){
				res = res % max;
			}
			
			return res;
		
	}
	
	
	private static double computeValues(double sd,double mean, double max){
		double res = 0.0;
		Random random = new Random();
		while(true){
			res = random.nextGaussian()*sd+mean;
			if(res>=0 && res <=max){
				return res;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(randInt(0, 9));
		System.out.println(randInt(0, 9));
		System.out.println(randInt(0, 9));
		System.out.println(randInt(0, 9));
		System.out.println(randInt(0, 9));
		System.out.println();
		//read(1, 2, null);
			}
	
	public static int randInt(int min, int max) {
	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}
	
	public static int randIntc(int min, int max, Random rand) {
	    
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}

}
