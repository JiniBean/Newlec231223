//package com.newlecture.study.market;
//
//import java.io.IOException;
//import java.util.Scanner;
//
//public class MarketUI {
//
//	public SellerUI sellerUI;
//	public BuyerUI buyerUI;
//
//	public MarketUI() {
//		sellerUI = new SellerUI();
//		buyerUI = new BuyerUI();
//	}
//
//	public void index() throws IOException {
//
//
//		boolean isRun = true;
//
//		while(isRun) {
//
//			int menu = inputMenu();
//
//			switch (menu) {
//			case 1:
//				buyerUI.index();
//				break;
//			case 2:
//				sellerUI.index();
//				break;
//			case 3:
//				isRun = false;
//				break;
//			default:
//				System.out.println("오류");
//			}
//		}
//		System.out.println("시스템 종료");
//
//	}
//
//
//
//	public static int inputMenu() {
//		Scanner scan = new Scanner(System.in);
//
//		System.out.println("[메뉴관리]");
//		System.out.println("1.구매자 페이지");
//		System.out.println("2.판매자 페이지");
//		System.out.println("3.종료");
//		System.out.print(">>");
//
//		int menu = scan.nextInt();
//		System.out.println();
//
//		return menu;
//	}
//}
