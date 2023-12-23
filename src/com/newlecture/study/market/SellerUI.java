package com.newlecture.study.market;

import java.util.Scanner;

public class SellerUI {

	public void index() {
		
		boolean isRun = true;
		
		while(isRun) {
			
			int menu = inputMenu();
			
			switch (menu) {
			case 1: 
				menuList();
				break;
			case 2: 
				reg();
				break;
			case 3: 
				memberList();
			case 4:
				isRun = false;
				break;
			default:
				System.out.println("오류");
			}
		}
		System.out.println("시스템 종료");
		
	}
	

	public void reg() {
		
	}

	public void menuList() {
		
	}

	public void memberList() {
		
	}
	
	
	public static int inputMenu() {
		Scanner scan = new Scanner(System.in);

		System.out.println("[메뉴관리]");
		System.out.println("1.메뉴목록");
		System.out.println("2.메뉴추가");
		System.out.println("3.회원목록");
		System.out.println("4.종료");
		System.out.print(">>");
		
		int menu = scan.nextInt();
		System.out.println();
		
		return menu;
	}

}
