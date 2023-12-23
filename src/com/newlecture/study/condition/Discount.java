package com.newlecture.study.condition;

import java.util.Scanner;

public class Discount {
	public static void main(String[] args) {
		
		double cost;
		double discountFor5 = 0.9;
		double discountFor3 = 0.95;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("가격을 입력해주세요");
		cost = scan.nextDouble();
		
		if(cost >= 50_000) {
			
			System.out.println( (int)cost*discountFor5 );
		}
		else if(cost >= 30_000) {
			System.out.println( (int)cost*discountFor3);
		}
		else {
			System.out.println((int)cost);
		}
	}
}
