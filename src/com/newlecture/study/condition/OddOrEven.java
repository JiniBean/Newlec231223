package com.newlecture.study.condition;

import java.util.Scanner;

public class OddOrEven {

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
				num = num % 2;
			
			
			if(num == 1) {
				System.out.println("홀수입니다.");
			} 
			else if(num == 0) {
				System.out.println("짝수입니다.");
			}
			
		}
		

	}

}
