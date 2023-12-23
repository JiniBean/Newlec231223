package com.newlecture.study.condition;

import java.util.Scanner;

public class SmartParrot {
	public static void main(String[] args) {
		
		int time;
		Scanner scanner = new Scanner(System.in);
		System.out.println("시간을 입력해주세요");
		
		do {
			
			time = scanner.nextInt();
			
			if ( !( 0000 <= time && time <= 2359 ) ) {
				System.out.println("유효한 숫자의 범위가 아닙니다. 다시 입력해주세요");
			}
			
		} while ( !( 0000 <= time && time <= 2359 ) );
			
		
			if (time < 1200) {
				System.out.println("안녕 햇빛아!");
			}
			else {
				System.out.println("안녕 달아!");
			}
	}

}
