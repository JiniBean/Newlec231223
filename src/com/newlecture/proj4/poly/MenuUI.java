//package com.newlecture.proj4.poly;
//
//import java.io.IOException;
//import java.util.List;
//import java.util.Scanner;
//
//
//// 페이지를 가지는 서비스 클래스
//public class MenuUI {
//
////	private MenuRepository repository;
//
//	public MenuUI() {
//		repository = new FileMenuRepository();
//	}
//
//	public void index() throws IOException {
//		boolean run = true;
//
//		while(run) {
//			int menu = inputMenu();
//
//			switch(menu) {
//			case 1:
//				list();
//				break;
//			case 2:
//				reg();
//				break;
//			case 3:
//				run = false;
//				break;
//			default:
//				System.out.println("오류");
//			}
//		}
//	}
//
//	private void reg() throws IOException {
//		Menu menu = new Menu();
//
//		Scanner scan = new Scanner(System.in);
//
//		System.out.println("[ 메뉴 입력 ]");
//		System.out.println();
//		System.out.printf("id : ");
//		menu.setId(Integer.parseInt(scan.nextLine()));
//		System.out.printf("korName : ");
//		menu.setKorName(scan.nextLine());
//		System.out.printf("engName : ");
//		menu.setEngName(scan.nextLine());
//		System.out.printf("price : ");
//		menu.setPrice(Integer.parseInt(scan.nextLine()));
//		System.out.printf("img : ");
//		menu.setImg(scan.nextLine());
//		System.out.println();
//
//		repository.save(menu);
//	}
//
//	private int inputMenu() {
//		Scanner scan = new Scanner(System.in);
//
//		System.out.println("[ 메뉴관리 ]");
//		System.out.println("1.메뉴목록");
//		System.out.println("2.메뉴추가");
//		System.out.println("3. 종료");
//		System.out.print(">");
//		int menu = scan.nextInt();
//				System.out.println();
//
//		return menu;
//	}
//
//	public void list() throws IOException {
//		int page = 1;
//		//MenuList list = repository.findAll();
//		List<Menu> list = repository.findAll(page);
//		int size = list.size();
//
//		System.out.println("[ 메뉴 목록 ]");
//		System.out.println();
//		for(int i=0; i<size; i++) {
//			Menu menu = list.get(i);
//			System.out.printf(
//					"[%d] %s(%s) / %d / 좋아요(%d) / %s\n",
//					menu.getId(),//menu.id,
//					menu.getKorName(),
//					menu.getEngName(),
//					menu.getPrice(),
//					menu.getLike(),
//					menu.getImg());
//		}
//		System.out.println("----------------------------------------------------------------------------------------------------");
//		System.out.println();
//	}
//}
//
//
//
//
//
//
//
