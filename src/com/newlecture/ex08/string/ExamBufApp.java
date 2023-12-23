package com.newlecture.ex08.string;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ExamBufApp {
	public static void main(String[] args) throws IOException {
		//현재 데이터 개수 알기
		int count = 0;
		{
			FileInputStream fis = new FileInputStream("res/ex08.csv");
			Scanner fscan = new Scanner(fis);
			
			//반복해서 개수 알기
			while(fscan.hasNextLine()) {
				count++;
				fscan.nextLine();
			}
			
			fscan.close();
			fis.close();

		}
		
//		-----------------------------------------------------------------
		//성적에 대한 배열(버퍼)을 준비
		String[] names = new String[count];
		int[] kors = new int[count];
		int[] maths = new int[count];
		int[] engs = new int[count];
		int[] totals = new int[count];
		double[] avgs = new double[count];
		
		{
			FileInputStream fis = new FileInputStream("res/ex08.csv");
			Scanner fscan = new Scanner(fis);
			
			//첫줄 버리기
			if(fscan.hasNextLine())
				fscan.nextLine();

			//배열에 성적 입력하기
			for(int i=0; i<count; i++) {
				String line = fscan.nextLine();
				String[] tokens = line.split(",");
				
				names[i] = tokens[0];
				kors[i]  = Integer.parseInt(tokens[1]);
				maths[i] = Integer.parseInt(tokens[2]);
				engs[i] = Integer.parseInt(tokens[3]);
			}	
		}
		
//		---------------------------------------------------------------------
		// 성적 결산하기
		int korSum = 0;
		int mathSum = 0;
		int engSum = 0;
		int total = 0;
		double avgAdd= 0;
		
		for(int i=0; i<count; i++) {
			totals[i] = kors[i]+maths[i]+engs[i];
			avgs[i] = (double)totals[i]/3.0;
			korSum += kors[i];
			mathSum+= maths[i];
			engSum += engs[i];
			total += totals[i];
			avgAdd += avgs[i];
		}
		
		// 과목별 합계 평균
		int korAvg = korSum/count;
		int mathAvg = mathSum/count;
		int engAvg = engSum/count;
		double avgAvg = avgAdd/(double)count;
		
//		-----------------------------------------------------------------
//		// 학생 성적 바꾸기
//		int t;
//		
//		t = kors[0];
//		kors[0] = kors[1];
//		kors[1] = t;
//		
//		//국어랑 영어 이름 바꾸기
//		int[] temp;
//		
//		temp = kors;
//		kors = engs;
//		engs = temp;
		
		// kors 출력
		for(int i=0; i<count; i++)
			System.out.printf("%d, ",kors[i]);
		System.out.println();
		
		
		for(int i=0; i<count-1; i++)
			for(int j=0; j<count-1-i; j++)  
				if(kors[j]>kors[j+1]) {
					int temp = kors[j];
					kors[j] = kors[j+1];
					kors[j+1] = temp;
				}
			
		
		
		// kors 출력
		for(int i=0; i<count; i++)
			System.out.printf("%d, ",kors[i]);

		
//		-----------------------------------------------------------------
//		// 위 데이터 출력하기
//		
//		{
//			//학생별 성적 출력
//			for(int i=0; i<count; i++)
//				System.out.printf("\nname = %s, kor = %d, math = %d, eng = %d, total = %d, avg = %.2f\n", names[i], kors[i], maths[i], engs[i], totals[i], avgs[i]);
//			
//			// 총 결산 출력
//			System.out.printf("\n인원수 : %d, 국어 : %d/%d, 수학 : %d/%d, 영어 : %d/%d, 총합 : %d, 총 평균 : %.1f", count, korSum, korAvg, mathSum, mathAvg, engSum, engAvg, total, avgAvg);
//		}
		
	}
}
