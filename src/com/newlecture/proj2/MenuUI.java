package com.newlecture.proj2;

import java.io.IOException;
import java.util.Scanner;



// 페이지를 가지는 서비스 클래스
public class MenuUI {
	
	private MenuRepository repository;
	
	public MenuUI() {
		repository = new MenuRepository();
	}

	
	public void index() throws IOException {
		
		
		boolean isRun = true;
		
		while(isRun) {
			
			int menu = inputMenu();
			
			switch (menu) {
			case 1: 
				list();
				break;
			case 2: 
				reg();
				break;
			case 3: 
				isRun = false;
				break;
			default:
				System.out.println("오류");
			}
		}
		System.out.println("시스템 종료");
		
	}

	
	private void reg() throws IOException {
		
		Menu menu = new Menu();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[메뉴 입력]\n");
		
		System.out.print("id : ");
		menu.setId(scan.nextInt());
		scan.nextLine();
		System.out.println();

		System.out.print("korName : ");
		menu.setKorName(scan.nextLine());
		System.out.println();
		
		System.out.print("engName : ");
		menu.setEngName(scan.nextLine());
		System.out.println();
		
		System.out.print("image : ");
		menu.setImg(scan.nextLine());
		System.out.println();
		
		System.out.print("price : ");
		menu.setPrice(scan.nextInt());
		System.out.println();
		
		System.out.print("likes : ");
		menu.setLikes(scan.nextInt());
		System.out.println();
		
		repository.save(menu);
	}


	private void list() throws IOException {
		int page = 1;
		
		MenuList menuList = repository.findAll(page);
		
		int size = menuList.size();
		
		for(int i=0; i<size; i++) {
			Menu menu = menuList.get(i);
			System.out.printf("[%d] %s(%s) / %d / 좋아요(%d)\n", menu.getId(), menu.getKorName(), menu.getEngName(), menu.getPrice(), menu.getLikes());
			System.out.println();
		}
	}
	
	
	public static int inputMenu() {
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
