package com.newlecture.prj1;

import java.util.Scanner;

private class Menu {
	private int id;
	private String korName;
	private String engName;
	private String img;
	private int price;
	private int likes;
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[메뉴 입력]\n");
		
		System.out.print("id : ");
		this.id = scan.nextInt();
		scan.nextLine();
		System.out.println();

		System.out.print("korName : ");
		this.korName = scan.nextLine();
		System.out.println();
		
		System.out.print("engName : ");
		this.engName = scan.nextLine();
		System.out.println();
		
		System.out.print("image : ");
		this.img = scan.nextLine();
		System.out.println();
		
		System.out.print("price : ");
		this.price = scan.nextInt();
		System.out.println();
		
		System.out.print("likes : ");
		this.likes = scan.nextInt();
		System.out.println();
		
	}
	
	public void print() {
		System.out.printf("[%d] %s(%s) / %d / 좋아요(%d)\n", this.id, this.korName, this.engName, this.price, this.likes);
	}
	
}
