package com.newlecture.study.condition;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		
//		------- 입력 ------------------------------
		{
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("첫 번째 숫자를 입력해주세요");
			num1 = scanner.nextInt();
			
			System.out.println("두 번째 숫자를 입력해주세요");
			num2 = scanner.nextInt();
		
		}
		
//		------ 출력 ---------------------------------
		{
			int plus = num1 + num2;
			int minus = num1 - num2;
			int multiply = num1 * num2;
			int divide = num1 / num2;
			
			System.out.printf("%d + %d = %d\n", num1, num2, plus);
			System.out.printf("%d - %d = %d\n", num1, num2, minus);
			System.out.printf("%d * %d = %d\n", num1, num2, multiply);
			System.out.printf("%d / %d = %d\n", num1, num2, divide);
			
		}

	}

}
