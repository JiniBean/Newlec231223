package com.newlecture.study.condition;

import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
		
		int score;
		Scanner scanner = new Scanner(System.in);
		System.out.println("성적을 입력해주세요");
		
		do {
			
			score = scanner.nextInt();
			
			if ( !(0 <= score && score <= 100) ) {
				System.out.println("유효한 숫자의 범위가 아닙니다. 다시 입력해주세요");
			}
			
		} while ( !(0 <= score && score <= 100) );
			
		
			if (score >= 90) {
				System.out.println("A");
			}
			else if (score >= 80) {
				System.out.println("B");
			}
			else if (score >= 70) {
				System.out.println("C");
			}
			else if (score >= 60) {
				System.out.println("D");
			}
			else {
				System.out.println("F");
			}
			
	}
}
