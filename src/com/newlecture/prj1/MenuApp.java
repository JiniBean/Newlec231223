package com.newlecture.prj1;

import java.util.Scanner;

public class MenuApp {
	public static void main(String[] args) {
	
		MenuList list = new MenuList();

		boolean run = true;
		while(run) {
			int menu = inputMenu();
			
			switch (menu) {
			case 1: {
				list.printAll();
				break;
			}
			case 2: {
				list.inputMenu();
				break;
			}
			case 3: {
				run = false;
				break;
			}
			default:
				System.out.println("오류");
			}
		}
		System.out.println("시스템 종료");
	}
	
	private static int inputMenu() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[메뉴관리]");
		System.out.println("1.메뉴목록");
		System.out.println("2.메뉴추가");
		System.out.println("3.종료");
		System.out.print(">>");
		
		int menu = scan.nextInt();
		System.out.println();
		
		return menu;
	}
}
