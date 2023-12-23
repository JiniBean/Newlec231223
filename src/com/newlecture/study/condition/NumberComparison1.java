package com.newlecture.study.condition;

import java.util.Scanner;

public class NumberComparison1 {
	public static void main(String[] args) {
		
		int weight1;
		int weight2;		
		
//		--------- 입력 --------------------------------------------------
		{
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("사과의 무게를 입력해주세요");
			System.out.println("왼손에는");
			weight1 = scanner.nextInt();
			
			System.out.println("오른손에는");
			weight2= scanner.nextInt();
			
			
		}
		
//		--------- 출력----------------------------------------------------
		{
			int result;
			String left = "왼쪽";
			String right = "오른쪽";
			
			result = (weight1 > weight2) ? weight1 : weight2;
			
			if (result == weight1) {
				System.out.printf("%s 사과를 사야겠다", left);
			}
			else {
				System.out.printf("%S 사과를 사야겠다", right);
			}
			
		}
	}

}
