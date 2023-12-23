package com.newlecture.study.condition;

import java.util.Scanner;

public class OrderManagement {
	public static void main(String[] args) {
		
		boolean isRun = true;
		
		while (isRun) {
			
			int status;
			
			{
				Scanner scanner = new Scanner(System.in);
				
				System.out.println("번호를 입력해주세요 (프로그램 종료를 원하시면 6을 입력해주세요)");
				status = scanner.nextInt();
				
			}
			
			switch (status) {
			case 1:
				System.out.println("주문 접수");
				break;
				
			case 2:
				 System.out.println("결제 완료");
				 break;
				 
			case 3:
				System.out.println("배송 중");
				break;
				
			case 4:
				System.out.println("배송 완료");
				break;
				
			case 5:
				System.out.println("주문 취소");
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				isRun = false;
				break;

			default:
				System.out.println("잘못 입력하셨습니다. (범위 1~5)");
				continue;
			}
		}
		
	}
}
