package com.newlecture.study;

import java.util.Scanner;

public class PsychologicalTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*문제*/
		System.out.println("간단한 심리테스트!!");
		System.out.println("당신은 사랑하는 애인과 함께 중국집에 갔습니다. \n다음 중 어떤 음식을 주문하실건가요? (숫자로 입력해주세요)");
		System.out.println("1. 짜장면 \n2. 짬뽕 \n3. 탕수육 \n4. 볶음밥");
		int x = 10;		
		
//		if (type == 1) {
//			System.out.println("짜장면을 선택하신 당신은 A타입입니다.");
//		} else if (type == 2) {
//			System.out.println("짬뽕을 선택하신 당신은 B타입니다.");
//		} else if (type == 3) {
//			System.out.println("탕수육을 선택하신 당신은 C타입니다.");
//		} else if (type == 4){
//			System.out.println("볶음밥을 선택하신 당신은 D타입입니다.");
//		} else {
//			System.out.println("잘못 입력하셨습니다. 테스트를 종료합니다.");
//		}

		
		/*첫번째 입력*/
		int type=0;
		while(x<20){
			
			type = sc.nextInt();
			
			switch (type) {
		
			case 1:
				System.out.println("짜장면을 선택하신 당신은 A타입입니다.");
				x = 30;
				break;
				
			case 2:
				System.out.println("짬뽕을 선택하신 당신은 B타입니다.");
				x = 30;
				break;
				
			case 3:
				System.out.println("탕수육을 선택하신 당신은 C타입니다.");
				x = 30;
				break;
				
			case 4:
				System.out.println("볶음밥을 선택하신 당신은 D타입입니다.");
				x = 30;
				break;
				
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
				continue;
			}
		}
		
		/*Scanner 비우기*/
		String next = sc.nextLine();
		
		System.out.println(next);
		
		/*두번째 입력*/
		System.out.println("당신의 타입을 입력해주세요.");
			
		String result;
		
		while (x<40) {
			
			result = sc.nextLine(); 
			
			if (type == 1 && (result.equals("A")  || result.equals("a") ) ) {
				System.out.println("당신은 짜장면을 좋아하는 타입입니다.");
				x = 50;
				
			} else if (type == 2 && (result.equals("B") || result.equals("b") ) ){
				System.out.println("당신은 짬뽕을 좋아하는 타입입니다.");
				x = 50;
				
			} else if ( type == 3 && (result.equals("C") || result.equals("c") ) ) {
				System.out.println("당신은 탕수육을 좋아하는 타입입니다.");
				x = 50;
			} else if (type == 1 && (result.equals("D") || result.equals("d") ) ){
				System.out.println("당신은 볶음밥을 좋아하는 타입입니다.");
				x = 50;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			
//			switch (result) {
//			
//			case "A", "a" :
//				System.out.println("당신은 짜장면을 좋아하는 타입입니다.");
//				x = 50;
//				if(type == 1)
// 					break;
//				
//			case "B", "b" :
//				System.out.println("당신은 짬뽕을 좋아하는 타입입니다.");
//				x = 50;
//				if(type == 2)
//				break;
//				
//			case "C", "c" :
//				System.out.println("당신은 탕수육을 좋아하는 타입입니다.");
//				x = 50;
//				if(type == 3)
//				break;
//				
//			case "D", "d" :
//				System.out.println("당신은 볶음밥을 좋아하는 타입입니다.");
//				x = 50;
//				if(type == 4)
//				break;
//			
//			default :
//				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
//				continue;
//				
			}
				

			sc.close();					
	}

}
