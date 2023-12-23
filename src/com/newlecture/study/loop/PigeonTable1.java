package com.newlecture.study.loop;

import java.util.Scanner;

public class PigeonTable1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("몇단을 출력할까요?");
		int number = scan.nextInt();

		for(int i=0, t=1 ; i<9 ; i++, t++) {
			
			int result = number*t;
			System.out.printf("\n%d X %d = %d", number, t, result);
		}
	}
}
