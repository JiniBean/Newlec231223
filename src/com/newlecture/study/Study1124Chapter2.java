package com.newlecture.study;

public class Study1124Chapter2 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		boolean result = a > b;
		System.out.println(result);
		
		int tall = 180;
		boolean result1 = tall > 170;
		System.out.println(result1);
		
		int age = 13;
		boolean adult = age > 20;
		System.out.println(adult);
		
		int x = 5, y = 5;
		boolean compare = x == y;
		System.out.println(compare);
		
		int testScore = 83;
		boolean grade = 50 < testScore && testScore < 100;
		System.out.println(grade);
		
		
		a = 3;
		b = 7;
		int c = 11;
		
		compare = b < a && a < c;
		System.out.println(compare);
		
		compare = a < 1 || 5 < a;
		System.out.println(compare);
		
		compare = 10 < a && a < 15;
		System.out.println(compare);
		
		int num = 40;
		compare = 33 <= num && num < 50;
		
		/*예습*/
		int temperature = 101;
		
		if (temperature > 100) {
			System.out.println("끓음");
		}
		
		
		int number = 24;
		a = (number % 2);
		
		if ( a == 0) {
			System.out.println("짝수");
		}
		
		
		a = 27;
		if (a >= 65) {
			System.out.println("은퇴");
		}else {
			System.out.println("일하세요");
		}
		
		
		boolean isRaining = true;
		if (isRaining == true) {
			System.out.println("우산쓰기");
		}
		
		
		int day = 6;
		if ( day == 6 || a == 7 ) {
			System.out.println("주말입니다.");
		}
		
		
		boolean isHungry = true;
		boolean isMealTime = false;
		if ( isHungry == true && isMealTime == true) {
			System.out.println("식사시간이다!");
		}else {
			System.out.println("공부하세요!");
		}
		
		int score = 85;
		if ( score >= 80 ) {
			System.out.println("합격");
		} 
		if ( 80<= score && score < 90) {
			char grade1 = 'B';
			System.out.println(grade1);
		}
		
	}

}