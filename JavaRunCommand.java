package com;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class JavaRunCommand {
	public static String path = System.getProperty("user.dir") + File.separator
			+ "experiments"
			+ File.separator;
	//static String path1 = "/nfs/student/g/manasa/workspace/ANT/iAnt-ARGoS-master/experiments/";

	public static void main(String args[]) {

		String s = null;

		System.out.println(new File(path).listFiles().length);

		System.out.println(path + "GA_1.argos");

		try {
			
			for(int gen =0;gen<10;gen++){

			// run the Unix "ps -ef" command
			// using the Runtime exec method:
			List<Integer> ttc = new ArrayList<Integer>();
			int max = 0;
			int index = 0;
			int fileCnt = 43;
			Integer[] indexes = new Integer[fileCnt];
			
			MyThread t1 = new MyThread(1, path);
			t1.start();
			MyThread t2 = new MyThread(2, path);
			t2.start();
			MyThread t3 = new MyThread(3, path);
			t3.start();
			MyThread t4 = new MyThread(4, path);
			t4.start();
			MyThread t5 = new MyThread(5, path);
			t5.start();
			MyThread t6 = new MyThread(6, path);
			t6.start();
			MyThread t7 = new MyThread(7, path);
			t7.start();
			MyThread t8 = new MyThread(8, path);
			t8.start();
			MyThread t9 = new MyThread(9, path);
			t9.start();
			MyThread t10 = new MyThread(10, path);
			t10.start();
			MyThread t11 = new MyThread(11, path);
			t11.start();
			MyThread t12 = new MyThread(12, path);
			t12.start();
			MyThread t13 = new MyThread(13, path);
			t13.start();
			MyThread t14 = new MyThread(14, path);
			t14.start();
			MyThread t15 = new MyThread(15, path);
			t15.start();
			MyThread t16 = new MyThread(16, path);
			t16.start();
			MyThread t17 = new MyThread(17, path);
			t17.start();
			MyThread t18 = new MyThread(18, path);
			t18.start();
			MyThread t19 = new MyThread(19, path);
			t19.start();
			MyThread t20 = new MyThread(20, path);
			t20.start();
			MyThread t21 = new MyThread(21, path);
			t21.start();
			MyThread t22 = new MyThread(22, path);
			t22.start();
			MyThread t23 = new MyThread(23, path);
			t23.start();
			MyThread t24 = new MyThread(24, path);
			t24.start();
			MyThread t25 = new MyThread(25, path);
			t25.start();
			MyThread t26 = new MyThread(26, path);
			t26.start();
			MyThread t27 = new MyThread(27, path);
			t27.start();
			MyThread t28 = new MyThread(28, path);
			t28.start();
			MyThread t29 = new MyThread(29, path);
			t29.start();
			MyThread t30 = new MyThread(30, path);
			t30.start();
			MyThread t31 = new MyThread(31, path);
			t31.start();
			MyThread t32 = new MyThread(32, path);
			t32.start();
			MyThread t33 = new MyThread(33, path);
			t33.start();
			MyThread t34 = new MyThread(34, path);
			t34.start();
			MyThread t35 = new MyThread(35, path);
			t35.start();
			MyThread t36 = new MyThread(36, path);
			t36.start();
			MyThread t37 = new MyThread(37, path);
			t37.start();
			MyThread t38 = new MyThread(38, path);
			t38.start();
			MyThread t39 = new MyThread(39, path);
			t39.start();
			MyThread t40 = new MyThread(40, path);
			t40.start();
			MyThread t41 = new MyThread(41, path);
			t41.start();
			MyThread t42 = new MyThread(42, path);
			t42.start();
			MyThread t43 = new MyThread(43, path);
			t43.start();
			
			while(true){
				if(!t1.isAlive() &&
						!t2.isAlive() &&
						!t3.isAlive() &&
						!t4.isAlive() &&
						!t5.isAlive() &&
						!t6.isAlive() &&
						!t7.isAlive() &&
						!t8.isAlive() &&
						!t9.isAlive() &&
						!t10.isAlive() &&
						!t11.isAlive() &&
						!t12.isAlive() &&
						!t13.isAlive() &&
						!t14.isAlive() &&
						!t15.isAlive() &&
						!t16.isAlive() &&
						!t17.isAlive() &&
						!t18.isAlive() &&
						!t19.isAlive() &&
						!t20.isAlive() &&
						!t21.isAlive() &&
						!t22.isAlive() &&
						!t23.isAlive() &&
						!t24.isAlive() &&
						!t25.isAlive() &&
						!t26.isAlive() &&
						!t27.isAlive() &&
						!t28.isAlive() &&
						!t29.isAlive() &&
						!t30.isAlive() &&
						!t31.isAlive() &&
						!t32.isAlive() &&
						!t33.isAlive() &&
						!t34.isAlive() &&
						!t35.isAlive() &&
						!t36.isAlive() &&
						!t37.isAlive() &&
						!t38.isAlive() &&
						!t39.isAlive() &&
						!t40.isAlive() &&
						!t41.isAlive() &&
						!t42.isAlive() &&
						!t43.isAlive() 
						){
					ttc.add(0,t1.getTagsCollected());
					ttc.add(1,t2.getTagsCollected());
					ttc.add(2,t3.getTagsCollected());
					ttc.add(3,t4.getTagsCollected());
					ttc.add(4,t5.getTagsCollected());
					ttc.add(5,t6.getTagsCollected());
					ttc.add(6,t7.getTagsCollected());
					ttc.add(7,t8.getTagsCollected());
					ttc.add(8,t9.getTagsCollected());
					ttc.add(9,t10.getTagsCollected());
					ttc.add(10,t11.getTagsCollected());
					ttc.add(11,t12.getTagsCollected());
					ttc.add(12,t13.getTagsCollected());
					ttc.add(13,t14.getTagsCollected());
					ttc.add(14,t15.getTagsCollected());
					ttc.add(15,t16.getTagsCollected());
					ttc.add(16,t17.getTagsCollected());
					ttc.add(17,t18.getTagsCollected());
					ttc.add(18,t19.getTagsCollected());
					ttc.add(19,t20.getTagsCollected());
					ttc.add(20,t21.getTagsCollected());
					ttc.add(21,t22.getTagsCollected());
					ttc.add(22,t23.getTagsCollected());
					ttc.add(23,t24.getTagsCollected());
					ttc.add(24,t25.getTagsCollected());
					ttc.add(25,t26.getTagsCollected());
					ttc.add(26,t27.getTagsCollected());
					ttc.add(27,t28.getTagsCollected());
					ttc.add(28,t29.getTagsCollected());
					ttc.add(29,t30.getTagsCollected());
					ttc.add(30,t31.getTagsCollected());
					ttc.add(31,t32.getTagsCollected());
					ttc.add(32,t33.getTagsCollected());
					ttc.add(33,t34.getTagsCollected());
					ttc.add(34,t35.getTagsCollected());
					ttc.add(35,t36.getTagsCollected());
					ttc.add(36,t37.getTagsCollected());
					ttc.add(37,t38.getTagsCollected());
					ttc.add(38,t39.getTagsCollected());
					ttc.add(39,t40.getTagsCollected());
					ttc.add(40,t41.getTagsCollected());
					ttc.add(41,t42.getTagsCollected());
					ttc.add(42,t43.getTagsCollected());
					break;
				}
				Thread.sleep(4000);
			}
			
			for (int i = 1; i <= fileCnt; i++) {
				indexes[i-1] = i-1;
				/*Process p = Runtime.getRuntime().exec(
						"argos3 -c " + path + "GA_" + i + ".argos");
				indexes[i-1] = i-1;
				BufferedReader stdInput = new BufferedReader(
						new InputStreamReader(p.getInputStream()));

				BufferedReader stdError = new BufferedReader(
						new InputStreamReader(p.getErrorStream()));

				// read the output from the command
				//System.out
				//		.println("Here is the standard output of the command:\n");
				while ((s = stdInput.readLine()) != null) {
					//System.out.println(s);
					if (s.contains("TTC:")) {
						int val = Integer.parseInt(s.substring(s.indexOf(":")+1,s.indexOf("[1;32m")));
						ttc.add(val);
						System.out.println(s);
						int val = Integer.parseInt(s.substring(s.indexOf(":")+1,s.indexOf("[1;32m")));
						//System.out.println(val);
						if(val > max){
							index = i;
							max = val;
						}
					}
				}

				System.out.println("ITR:"+i+", File: "+index);
				// String last = (String)
				// stdInput.lines().toArray()[stdInput.lines().toArray().length-1];
				// System.out.println("S: "+last);

				// read any errors from the attempted command
				System.out
						.println("Here is the standard error of the command (if any):\n");
				while ((s = stdError.readLine()) != null) {
					System.out.println(s);
				}
*/
			}
			System.out.println("here");
			Integer[] condEnt  = ttc.toArray(new Integer[fileCnt]);
			Arrays.sort(indexes, new Comparator<Integer>() {
				@Override
				public int compare(final Integer o1, final Integer o2) {
					return Integer.compare(condEnt[o1], condEnt[o2]);
				}
			});
			System.out.println("Tags Collected");
			for(int i=0;i<fileCnt;i++){
				System.out.print(condEnt[i]+", ");
			}
			System.out.println();
			int top10[] = new int[10];
			int j =0;
			for(int i =41;i>=32;i--){
				top10[j++] = indexes[i]+1;
			}			
			int topID = indexes[42];
			
			for(int x =1;x<=fileCnt;x++){
			if(x-1==topID){
				continue;
			}
			Random rand = new Random();
			int file1 = NextGenerationRunner.randIntc(0, 9,rand);
			int file2 = NextGenerationRunner.randIntc(0, 9,rand);
			System.out.println(topID);
			int file1ID = top10[file1];
			int file2ID = top10[file2];
			NextGenerationRunner.read(file1ID, file2ID, path,x);
			}
			}
			
		} catch (Exception e) {
			//System.out.println("exception happened - here's what I know: ");
			e.printStackTrace();
			//System.exit(-1);
		}
	}
}