package com.newlecture.study.condition;

import java.util.Scanner;

public class RecommendOutfit {

	public static void main(String[] args) {
		
		int degree;
		Scanner scanner = new Scanner(System.in);
		System.out.println("온도를 입력해주세요");
		
		do {
			
			degree = scanner.nextInt();
			
			if ( !(-80 <= degree && degree <= 60) ) {
				System.out.println("유효한 숫자의 범위가 아닙니다. 다시 입력해주세요");
			}
			
		} while ( !(-80 <= degree && degree <= 60) );
			
		
			if (degree < 0) {
				System.out.println("으추으추 패딩!");
			}
			else if (degree < 9) {
				System.out.println("코트");
			}
			else if (degree < 20) {
				System.out.println("긴팔 & 아우터");
			}
			else {
				System.out.println("반팔!");
			}
			
	}
}
