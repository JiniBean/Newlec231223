package com.newlecture.study.loop;

import java.util.Scanner;

public class AgeGroupChecker {

	public static void main(String[] args) {
		
		int age;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		
		
		do {
			
			age = scanner.nextInt();
			
			if ( !(0 <= age && age <= 150) ) {
				System.out.println("유효한 숫자의 범위가 아닙니다. 다시 입력해주세요");
			}
			
		} while ( !(0 <= age && age <= 150) );
			
			if (age < 13) {
				System.out.println("아이입니다.");
			}
			else if (age < 19) {
				System.out.println("청소년입니다.");
			}
			else if (age < 65) {
				System.out.println("성인입니다.");
			}
			else {
				System.out.println("노인입니다.");
			}
			
	}

}
