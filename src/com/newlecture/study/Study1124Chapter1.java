package com.newlecture.study;

public class Study1124Chapter1 {

	public static void main(String[] args) {
		
		int a, b;
		int numEgg;
		
		numEgg = 10;
		System.out.println(numEgg);
//		numEgg = 3000000000; //int 타입의 범위를 넘어가는 값 정수로 2,147,483,647까지 표현할 수 있음
		long numEgg1 = 3_000_000_000L;
		System.out.println(numEgg1);
		
		
		int numApple;
		
		numApple = 15;
		
		double numOneApple = 1.5;
		
		System.out.println( numApple + 30 + numOneApple );
		
		
		/*스피드랑 파이*/
		int maxSpeed = 240;
		double pi = 3.14159265359;
		float floatPi = (float)pi;
		
		System.out.println(maxSpeed);
		System.out.println(floatPi);
		
		a = 5;
		System.out.println(a);
		
		b = a;
		System.out.println(b);
		
		
		/*논리값*/		
		boolean isTrue = true;
		boolean isFalse = !isTrue;
		System.out.println(isFalse);
		
		boolean isOdd = false;
		System.out.println(isOdd);
		
		int numCanddy = 33;
		System.out.println(numCanddy-17);
		
		
		/*temp*/
		int x, y, temp;
		
		x = 10;
		y = 20;
		temp = y;
		y = x;
		x = temp;
		
		System.out.println(y);
		System.out.println(x);
		
		
		/*대입*/
		int positiveNumber = 3;
		int nagativeNumber = -positiveNumber;
		System.out.println(nagativeNumber);
		
		int number = 15;
		System.out.println(number + 5);
		
		int total = 0;
		total = 1 + 2 + 3 + 4 + 5 + 6 + 7+ 8 + 9 + 10;
		System.out.println(total);
		
		char c = 'Q';
		System.out.println(c);
		
		char grade = 'A';
		System.out.println(grade);
		
		/*대입 연산*/
		int m = 40;
		int n = 30;
		System.out.println(m + n);
		
		int carWheel = 5;
		int car = 234;
		System.out.println("total =" + (carWheel*car) );
		
		double radius = 7;
		double result = 2*Math.PI*radius;
		System.out.println("result = " + result );
		
		int height = 5;
		int width = 10;
		System.out.println("사각형의 넓의 = " + (height*width) );
		
		int count = 0;
		++count;
		System.out.println(count++);
		System.out.println(count++);
		System.out.println(count++);
		System.out.println(count++);
		System.out.println(count++);
		System.out.println(count++);
		System.out.println(count++);
		System.out.println(count++);
		System.out.println(count++);
		System.out.println(count++);
		
		
		/*아인슈타인 나이*/
		int birth = 1879;
		int now = 2023;
		int age = now - birth - 1;
		System.out.println("age is " + age );
				
		count = 0;
		++count;
		++count;
		System.out.println(count);
		
		int q = 3;
		int w = 10;
		{ int result1 = q + w;
		System.out.println(result1);}
		
		int candyPrice = 7250;
		int paidAmount = 10000;
		int cange = paidAmount + candyPrice;
		System.out.println("cange is " + cange );
		
		int seconds = 86400;
		int minute = seconds / 60;
		int hour = minute / 60;
		System.out.println( minute + "분");
		System.out.println(hour + "시간");
		
		int days = 365;
		int weeks = days / 7;
		int otherDayse = days % 7;
		System.out.println(weeks + "주" + otherDayse + "일" );
		
		int byteSize = 1024;
		int kilobytes = byteSize / 1024;
		System.out.println( "kilobytes = " +  kilobytes);
		
		double distance = 150.5;
		double meter = distance / 100;
		System.out.println("거리는 " + meter + "미터이다");
		
		/*뉴렉이 평균*/
		int score1 = 74;
		int score2 = 95;
		int score3 = 80;
		int score4 = 100;
		double avg = ( score1 + score2 + score3 + score4 ) /4;
		System.out.println(avg);
		
		
		
	}

}
