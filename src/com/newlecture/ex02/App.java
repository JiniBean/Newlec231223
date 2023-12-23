package com.newlecture.ex02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws IOException {
		
//		------ 성적 로드 ------------------------------------
		int kor1, kor2, kor3 = 0;
		
		
//			FileInputStream fis = new FileInputStream("res/ex02.txt");
//			
//			Scanner scan = new Scanner(fis);
//			kor1 = scan.nextInt();
//			kor2 = scan.nextInt();
//			kor3 = scan.nextInt();
//			
//			
//			System.out.println(kor1);
//			System.out.println(kor2);
//			System.out.println(kor3);
	
//			{
//				int b = fis.read();
//				System.out.println(b);
//			}
//			
//			{
//				int b = fis.read();
//				System.out.println(b);
//			}
//			
//			{
//				int b = fis.read();
//				System.out.println(b);
//			}
			
//			scan.close();
//			fis.close();
			
		
		
//		----- 성적 출력 ------------------------------------------- 
//		{
//			
//			float avg;
//			int total;
//			total = kor1 + kor2 + kor3;
//			avg =  total/3.0f;
//			
//			System.out.println("┌─────────────────────────────┐");
//			System.out.println("│          성적 출력          │");
//			System.out.println("└─────────────────────────────┘");
//			System.out.printf("국어1 : %d\n", kor1);
//			System.out.printf("국어2 : %d\n", kor2);
//			System.out.printf("국어3 : %d\n", kor3);
//			System.out.println();
//			System.out.printf("total : %d\n", total);
//			System.out.printf("avg : %f\n", avg);//평균값 출력
//			System.out.println();
//			System.out.println("123456789123\b56789123");
//			System.out.println("────────────\n───────────────────");
//			
//		}
		
//	 	----- 성적 입력 -----------------------------------------
		
			
			Scanner scan1 = new Scanner(System.in);
			
			System.out.println("┌─────────────────────────────┐");
			System.out.println("│          성적 입력          │");
			System.out.println("└─────────────────────────────┘");
			
			System.out.print("국어1 : ");
//			kor1 = System.in.read();
			kor1 = scan1.nextInt();
	
			
			System.out.print("국어2 : ");
//			kor2 = System.in.read();
			kor2 = scan1.nextInt();
			
			
			System.out.print("국어3 : ");
//			kor3 = System.in.read();
			kor3 = scan1.nextInt();
			
		
		
		
//    	------ 성적 저장 -----------------------------------------
		{
//		  	
//			int kor1, kor2, kor3;
//		  	kor1 = 50;
//		  	kor2 = 60;
//		  	kor3 = 80;
//		  	
		  	FileOutputStream fos = new FileOutputStream("res/ex02.txt");
		  	PrintStream fout = new PrintStream(fos);
		  	fout.printf("%d %d %d" , kor1, kor2, kor3);
		   	
		  	fout.close();
		  	
		}	
		
	}
}