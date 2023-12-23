package com.newlecture.ex07.arr.ex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws IOException {
		boolean isRun = true;
		
		int[] kors = new int[3];
			
//		loop:
		while(/*true*/isRun)
		{
//			----- 메뉴 선택 --------------------------------------
			int menu;
			{
				Scanner scan = new Scanner(System.in);
				
				System.out.println("┌─────────────────────────────┐");
				System.out.println("│          메뉴 선택          │");
				System.out.println("└─────────────────────────────┘");
				System.out.println("1. 성적 입력");
				System.out.println("2. 성적 출력");
				System.out.println("3. 성적 읽어오기");
				System.out.println("4. 성적 저장");
				System.out.println("5. 종료");
				System.out.println(" >");
				
				menu = scan.nextInt();
			}
			
			int avg;
			int total;
			
			switch(menu) {
	//		------ 성적 로드 ------------------------------------
			
			case 3:
				{
					total = 0;
					
					FileInputStream fis = new FileInputStream("res/ex03.txt");
					
					Scanner scan = new Scanner(fis);
					
					for(int i=0; i<3; i++) {
						kors[i] = scan.nextInt();
						total += kors[i];
					}
					
					avg =  total/3;
					
					System.out.println("┌─────────────────────────────┐");
					System.out.println("│          성적 출력          │");
					System.out.println("└─────────────────────────────┘");
					
					for(int i=0; i<3; i++)
						System.out.printf("국어%d : %d\n", i+1,kors[i]);
			
					System.out.println();
					System.out.printf("total : %d\n", total);
					System.out.printf("avg : %d\n", avg);//평균값 출력
					System.out.println();
					System.out.println("--------------------------------------");
					System.out.println("메뉴로 돌아가려면 아무 키나 입력하세요");
					System.in.read();
					
					scan.close();
					fis.close();
					break;
					
					
				}
				
			//		----- 성적 출력 ------------------------------------------- 
			case 2:
				{
					total = 0;
					
					for(int i=0; i<3;  i++) 
						total += kors[i];
					
					avg =  total/3;
					
						System.out.println("┌─────────────────────────────┐");
						System.out.println("│          성적 출력          │");
						System.out.println("└─────────────────────────────┘");
						
					for(int i=0; i<3;  i++) 
						System.out.printf("국어%d : %d\n", i+1, kors[i]);
						
						System.out.println();
						System.out.printf("total : %d\n", total);
						System.out.printf("avg : %d\n", avg);//평균값 출력
						System.out.println();
						System.out.println("--------------------------------------");
						System.out.println("메뉴로 돌아가려면 아무 키나 입력하세요");
						System.in.read();
						break;
					
				}
				
		//	 	----- 성적 입력 -----------------------------------------
			case 1:
				{
					
					Scanner scan = new Scanner(System.in);
					
					System.out.println("┌─────────────────────────────┐");
					System.out.println("│          성적 입력          │");
					System.out.println("└─────────────────────────────┘");
					
					
					for(int i=0; i<3;  i++) 
						do {
							System.out.printf("국어%d : ", i+1);
							kors[i] = scan.nextInt();
							
							if (!(0<=kors[i] && kors[i] <=100)) {
								System.out.println("성적 범위를 초과하셨습니다.(0~100)");
							}
						}
						while ( !(0<=kors[i] && kors[i] <=100) ); 
					

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
					FileOutputStream fos = new FileOutputStream("res/ex03.txt");
					PrintStream fout = new PrintStream(fos);
					
					for(int i=0; i<3;  i++) {
						fout.printf("%d" , kors[i]);
						
						if(i!=2)
							fout.print(" ");
					}
					
					System.out.println("작업 완료");
					System.out.println("--------------------------------------");
					System.out.println("메뉴로 돌아가려면 아무 키나 입력하세요");
					System.in.read();
					
					fout.close();
					fos.close();
					
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
		System.out.println("안녕~");
	}
	
}
	


