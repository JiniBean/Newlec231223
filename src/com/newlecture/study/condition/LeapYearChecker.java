package com.newlecture.study.condition;

import java.util.Scanner;

public class LeapYearChecker {
	public static void main(String[] args) {
		
		int year;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("연도를 입력해주세요");
		year = scan.nextInt();
		
		System.out.println( ( year%4 == 0 && ( !(year%100==0) || year%400 == 0 ) ) ? "윤년" : "윤년이 아니에요" );
		
		
	}
}
