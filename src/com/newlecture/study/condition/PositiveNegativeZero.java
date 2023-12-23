package com.newlecture.study.condition;

import java.util.Scanner;

public class PositiveNegativeZero {
	public static void main(String[] args) {
		
		int num;
		
//		------- 입력 ----------------------
		{
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("숫자를 입력해주세요");
			num = scanner.nextInt();
			
		}
		
//		------ 출력 -------------------------
		{
			
			if(1 <= num) {
				System.out.println("양수입니다.");
			} 
			else if(num == 0) {
				System.out.println("0입니다.");
			}
			else if (num < 0 ){
				System.out.println("음수입니다.");
			}
			
		}
	
	}

}
