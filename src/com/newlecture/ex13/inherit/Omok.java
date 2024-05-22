//package com.newlecture.ex13.inherit;
//
//import java.util.Scanner;
//
//public class Omok {
//
//	public int x;
//	public int y;
//	public String colors;
//
//
//	public Board input(int count) {
//
//		String player1 = "●";
//		String player2 = "○";
//		Board returnis = new Board();
//
//		Scanner scan = new Scanner(System.in);
//
//		try {
//			System.out.print("오목 x좌표 : ");
//			x = Integer.parseInt( scan.nextLine() )-1;
//
//		} catch (Exception e) {
//			x = -1;
//		}
//		if( !(0<=x && x<board.WIDTH) ) {
//			System.out.printf("잘못 입력하셨습니다. 1부터 %d까지의 정수를 입력해주세요\n", this.WIDTH);
//			returnis = new Board();
//			returnis.HEIGHT=1;
//			return returnis;
//		}
//
//		try {
//			System.out.print("오목 y좌표 : ");
//			y = board.HEIGHT-Integer.parseInt( scan.nextLine() );
//
//		} catch (Exception e) {
//			y = -1;
//		}
//		if( !(0<=y && y<board.HEIGHT) ) {
//			System.out.printf("잘못 입력하셨습니다. 1부터 %d까지의 정수를 입력해주세요\n", this.HEIGHT);
//			returnis.HEIGHT=1;
//			return returnis;
//		}
//
//		if(this.colors == player1 || this.colors == player2) {
//			System.out.println("이미 오목돌이 있습니다. 다시 입력해주세요\n");
//			returnis.HEIGHT=1;
//			return returnis;
//		}
//		this.x =x;
//		this.y =y;
//		this.colors = count%2 == 0? player1 : player2;
//		return returnis;
//	}
//
//}
//
