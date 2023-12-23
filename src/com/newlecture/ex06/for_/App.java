package com.newlecture.ex06.for_;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws IOException {
		boolean isRun = true;
		
		int kor1 = 0;
		int	kor2 = 0;
		int kor3 = 0;
			
//		loop:
		while(/*true*/isRun)
		{
//			----- 메뉴 선택 --------------------------------------
			int menu;
			{
				Scanner scan = new Scanner(System.in);
				
				System.out.println("┌─────────────────────────────┐");
				System.out.println("│          성적 입력          │");
				System.out.println("└─────────────────────────────┘");
				System.out.println("1. 성적 입력");
				System.out.println("2. 성적 출력");
				System.out.println("3. 성적 읽어오기");
				System.out.println("4. 성적 저장");
				System.out.println("5. 종료");
				System.out.println(" >");
				
				menu = scan.nextInt();
			}
			
			float avg;
			int total;
			
			switch(menu) {
	//		------ 성적 로드 ------------------------------------
			
			case 3:
				{
					
					FileInputStream fis = new FileInputStream("res/ex03.txt");
					
					Scanner scan = new Scanner(fis);
					kor1 = scan.nextInt();
					kor2 = scan.nextInt();
					kor3 = scan.nextInt();
					
					total = kor1 + kor2 + kor3;
					avg =  total/3.0f;
					
					System.out.println("┌─────────────────────────────┐");
					System.out.println("│          성적 출력          │");
					System.out.println("└─────────────────────────────┘");
					System.out.printf("국어1 : %d\n", kor1);
					System.out.printf("국어2 : %d\n", kor2);
					System.out.printf("국어3 : %d\n", kor3);
					System.out.println();
					System.out.printf("total : %d\n", total);
					System.out.printf("avg : %f\n", avg);//평균값 출력
					System.out.println();
					System.out.println("--------------------------------------");
					System.out.println("메뉴로 돌아가려면 아무 키나 입력하세요");
					System.in.read();
		//			
		//			System.out.println(kor1);
		//			System.out.println(kor2);
		//			System.out.println(kor3);
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
		//			
		//			{
		//				int b = fis.read();
		//				System.out.println(b);
					break;
					}
				
			//		----- 성적 출력 ------------------------------------------- 
			case 2:
				{
					
					
					total = kor1 + kor2 + kor3;
					avg =  total/3.0f;
					
					System.out.println("┌─────────────────────────────┐");
					System.out.println("│          성적 출력          │");
					System.out.println("└─────────────────────────────┘");
					
					for(int i=0, y=0; i<3;  i++) {
						System.out.printf("국어%d : %d\n", i+1, kor1);
					}
					
//					System.out.printf("국어2 : %d\n", kor2);
//					System.out.printf("국어3 : %d\n", kor3);
					System.out.println();
					System.out.printf("total : %d\n", total);
					System.out.printf("avg : %f\n", avg);//평균값 출력
					System.out.println();
					System.out.println("--------------------------------------");
					System.out.println("메뉴로 돌아가려면 아무 키나 입력하세요");
					System.in.read();
					break;
				}
				
		//	 	----- 성적 입력 -----------------------------------------
			case 1:
				{
					
					Scanner scan1 = new Scanner(System.in);
					
					System.out.println("┌─────────────────────────────┐");
					System.out.println("│          성적 입력          │");
					System.out.println("└─────────────────────────────┘");
					
					do {
						System.out.print("국어1 : ");
			//			kor1 = System.in.read();
						kor1 = scan1.nextInt();
						
						if (!(0<=kor1 && kor1 <=100)) {
							System.out.println("성적 범위를 초과하셨습니다.(0~100)");
						}
					}
					while ( !(0<=kor1 && kor1 <=100) ); 
		
					
					do {
						System.out.print("국어2 : ");
		//				kor2 = System.in.read();
						kor2 = scan1.nextInt();
						
						if (!(0<=kor2 && kor2 <=100)) {
							System.out.println("성적 범위를 초과하셨습니다.(0~100)");
						}
					}
					while ( !(0<=kor2 && kor2 <=100) ); 
					
					
					do {
						System.out.print("국어3 : ");
		//				kor3 = System.in.read();
						kor3 = scan1.nextInt();
						
						if (!(0<=kor3 && kor3 <=100)) {
							System.out.println("성적 범위를 초과하셨습니다.(0~100)");
						}
					}
					
					while ( !(0<=kor3 && kor3 <=100) ); 
					
					System.out.println("--------------------------------------");
					System.out.println("메뉴로 돌아가려면 아무 키나 입력하세요");
					System.in.read();
		//			scan1.close(); // 닫으면 콘솔입력스트림까지 닫혀버림 근데 우리는 생성할 수가 없음
				break;
				}
				
		//    	------ 성적 저장 -----------------------------------------
			case 4:
				{
		//		  	
		//			int kor1, kor2, kor3;
		//		  	kor1 = 50;
		//		  	kor2 = 60;
		//		  	kor3 = 80;
		//		  	
				  	FileOutputStream fos = new FileOutputStream("res/ex03.txt");
				  	PrintStream fout = new PrintStream(fos);
				  	fout.printf("%d %d %d" , kor1, kor2, kor3);
				   	System.out.println("작업 완료");
				   	System.out.println("--------------------------------------");
					System.out.println("메뉴로 돌아가려면 아무 키나 입력하세요");
					System.in.read();
				  	fout.close();
				  	break;
				}	
				
			case 5:
				{
//					break loop;
					isRun = false;
					break;
				}
				
			default: 
				{
					
					System.out.println("해당 메뉴는 존재하지 않습니다.");
					System.out.println("--------------------------------------");
					System.out.println("메뉴로 돌아가려면 아무 키나 입력하세요");
					System.in.read();
					break;
				}
			}
	 	}
		
		System.out.println("안녕");
	}
	
}