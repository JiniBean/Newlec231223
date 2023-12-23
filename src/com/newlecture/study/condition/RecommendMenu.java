package com.newlecture.study.condition;

import java.util.Scanner;

public class RecommendMenu {

	public static void main(String[] args) {
		
		int age;
		
		Scanner scanner = new Scanner(System.in);
			
		
		do {
			
			System.out.println("숫자를 입력해주세요(범위 : 1 ~ 5)");
			age = scanner.nextInt();
			
			
			if (age == 1) {
				System.out.println("떡볶이");
			}
			else if (age == 2) {
				System.out.println("어묵");
			}
			else if (age == 3) {
				System.out.println("순대");
			}
			else if (age == 4) {
				System.out.println("튀김");
			}
			else if (age == 5) {
				System.out.println("핫도그");
			}
			else {
				System.out.println("유효한 숫자의 범위가 아닙니다. 다시 입력해주세요");
			}
			
			
		} while ( !(1 <= age && age <= 5) );
	

	}

}

