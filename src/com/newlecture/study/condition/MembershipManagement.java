package com.newlecture.study.condition;

import java.util.Scanner;

public class MembershipManagement {
	public static void main(String[] args) {
			
		String grade;
		double cost;
		
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("등급을 입력해주세요");
		grade = scanner.nextLine();
		
	
		
		switch (grade) {
		
		case "bronze":{
			System.out.println("가격을 입력해주세요");
			cost = scanner.nextDouble();
			System.out.printf("할인된 가격은 %.2f원 입니다", cost*0.98);
			break;
		}
			
		case "silver":{
			System.out.println("가격을 입력해주세요");
			cost = scanner.nextDouble();
			System.out.printf("할인된 가격은 %.2f원 입니다", cost*0.97);
			break;
		}
		
		case "gold":{
			System.out.println("가격을 입력해주세요");
			cost = scanner.nextDouble();
			System.out.printf("할인된 가격은 %.2f원 입니다", cost*0.95);
			break;
		}
		
				
		default:{
			System.out.println("등급을 잘못 입력하셨습니다.");
			
		}
			
			
		}
		
	}
	
}
