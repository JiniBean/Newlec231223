package com.newlecture.ex09.code01;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class App {
	public static void main(String[] args) throws IOException {
		//현재 데이터 개수 알기
		int count = 0;
		{
			FileInputStream fis = new FileInputStream("res/ex08.csv");
			Scanner fscan = new Scanner(fis);
			
			if(fscan.hasNextLine())
				fscan.nextLine();
			
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
//		String[] names = new String[count];
//		int[] kors = new int[count];
//		int[] maths = new int[count];
//		int[] engs = new int[count];
//		int[] totals = new int[count];
//		double[] avgs = new double[count];
		
		Exam[] exams = new Exam[count];
		
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
				
				String name = tokens[0];
				int kor = Integer.parseInt(tokens[1]);
				int eng = Integer.parseInt(tokens[2]);
				int math = Integer.parseInt(tokens[3]);
				
				Exam exam = new Exam();
				
				exam.name = name;
				exam.kor = kor;
				exam.math = math;
				exam.eng = eng;
				exams[i] = exam;
				
			}	
		}
//		----------------------------------------------------------------
		//배열 공간 늘리기 +1
		{
			Exam[] temp = new Exam[count+1];
			
			for(int i=0; i<count; i++)
				temp[i] = exams[i];
			
			exams = temp;
		}
		
//		----------------------------------------------------------------
		//성적 새로 입력받기
		{
			Scanner sc = new Scanner(System.in);
			Exam exam = new Exam();
			
			System.out.println("이름을 입력해주세요");
			exam.name =  sc.nextLine();
			
			System.out.println("국어 점수를 입력해주세요");
			exam.kor = sc.nextInt();
			
			System.out.println("수학 점수를 입력해주세요");
			exam.math = sc.nextInt();
			
			System.out.println("영어 점수를 입력해주세요");
			exam.eng = sc.nextInt();
			
			exams[count++] = exam;
		}
//		---------------------------------------------------------------------
		// 성적 결산하기
		int korSum = 0;
		int mathSum = 0;
		int engSum = 0;
		int total = 0;
		double avgAdd= 0;
		
		for(int i=0; i<count; i++) {
			exams[i].total = exams[i].kor+ exams[i].math + exams[i].eng;
			exams[i].avg = (double)exams[i].total/3.0;
			korSum += exams[i].kor;
			engSum += exams[i].eng;
			mathSum+= exams[i].math;
			total += exams[i].total;
			avgAdd += exams[i].avg;
		}
		
		// 과목별 합계 평균
		int korAvg = korSum/count;
		int mathAvg = mathSum/count;
		int engAvg = engSum/count;
		double avgAvg = avgAdd/( (double)count);
		
//		-----------------------------------------------------------------
		//정렬하기
		for(int i=0; i<count-1; i++)
			for(int j=0; j<count-(1+i); j++)
				if(exams[j].kor < exams[j+1].kor){
					Exam temp;
					temp = exams[j];
					exams[j] = exams[j+1];
					exams[j+1] = temp;
				}
		
//		-----------------------------------------------------------------
		// 위 데이터 출력하기
		
		{
			//학생별 성적 출력
			for(int i=0; i<count; i++)
				System.out.printf("\nname = %s, kor = %d, math = %d, eng = %d, total = %d, avg = %.2f\n", exams[i].name, exams[i].kor, exams[i].math, exams[i].eng, exams[i].total, exams[i].avg);
			
			// 총 결산 출력
			System.out.printf("\n인원수 : %d, 국어 : %d/%d, 수학 : %d/%d, 영어 : %d/%d, 총합 : %d, 총 평균 : %.1f", count, korSum, korAvg, mathSum, mathAvg, engSum, engAvg, total, avgAvg);
		}
	}
}
