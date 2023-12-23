package com.newlecture.study.condition;

import java.util.Scanner;

public class WeekdayOrWeekend {
	public static void main(String[] args) {
		
		int isToday;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("오늘의 숫자는? >>");
		
		do {
					
			isToday = scanner.nextInt();
					
			if( !(1 <= isToday && isToday <= 7) ) {
			System.out.println("잘못 입력 하셨습니다. (범위 : 1~7)");
			}
				
		}
		while (  !(1 <= isToday && isToday <= 7) );
		
		if (isToday >= 6) {
			System.out.println("주말이다!");
		}
		else {
			System.out.println("주중이다...");
		}
	}
}
