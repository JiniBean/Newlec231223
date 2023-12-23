package com.newlecture.study.condition;

import java.util.Scanner;

public class FindSupercar {
	public static void main(String[] args) {
		
		int speed1;
		int speed2;
		int speed3;
		
//		--------- 입력 --------------------------------------------------
		{
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("스포츠카의 속도를 입력해주세요");
			System.out.print("첫번째 스포츠카의 속도 : ");
			speed1 = scanner.nextInt();
			
			System.out.print("\n두번째 스포츠카의 속도 : ");
			speed2 = scanner.nextInt();
			
			System.out.print("\n세번째 스포츠카의 속도 : ");
			speed3 = scanner.nextInt();
		}
		
//		--------- 출력----------------------------------------------------
		{
			if (speed1 > speed2) {
				
				if (speed1 > speed3) {
					System.out.printf("가장 빠른 스포츠카의 최대 속도는 %d입니다", speed1);
				}
			}
			else if (speed2 > speed3) {
				System.out.printf("가장 빠른 스포츠카의 최대 속도는 %d입니다", speed2);
			}
			else {
				System.out.printf("가장 빠른 스포츠카의 최대 속도는 %d입니다", speed3);
			}
			
		}
		
	}

}
