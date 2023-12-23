package com.newlecture.ex08.string;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ExamApp {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("res/ex08.csv");
		Scanner fscan = new Scanner(fis);
		fscan.nextLine();
		
//		while(fscan.hasNextLine()) {
//			
//			String line = fscan.nextLine();
//			String[] tokens = line.split(",");
//			
//			String name = tokens[0];
//			int kor = Integer.parseInt(tokens[1]);
//			int math = Integer.parseInt(tokens[2]);
//			int eng = Integer.parseInt(tokens[3]);
//			
//			int total = kor + math + eng;
//			Double avg = total/3d;
//			
//			System.out.printf("name = %s, kor = %d, math = %d, eng = %d, total = %d, avg = %.1f\n", name, kor, math, eng, total, avg);
//			
//		}
		int count = 0;
		int kors = 0;
		int maths = 0;
		int engs = 0;
		int totals =0;
		double avgs =0;
		
		while(fscan.hasNextLine()) {
			
			String line = fscan.nextLine();
			String[] tokens = line.split(",");
			
			String name = tokens[0];
			int kor = Integer.parseInt(tokens[1]);
			int math = Integer.parseInt(tokens[2]);
			int eng = Integer.parseInt(tokens[3]);
			
			int total = kor + math + eng;
			double avg = total/3d;
			System.out.printf("name = %s, kor = %d, math = %d, eng = %d, total = %d, avg = %.1f\n", name, kor, math, eng, total, avg);
			
			count++;
			kors += kor;
			maths += math;
			engs += eng;
			totals += total;
			avgs += avg;
		}
		
		int korAvg = kors/count;
		int mathAvg = maths/count;
		int engAvg = engs/count;
		double avgAvg = avgs/(double)count;
		
		System.out.printf("인원수 : %d, 국어 : %d/%d, 수학 : %d/%d, 영어 : %d/%d, 총합 : %d, 총 평균 : %.1f", count, kors, korAvg, maths, mathAvg, engs, engAvg, totals, avgAvg);
		
		fscan.close();
		fis.close();
		
	}
}
