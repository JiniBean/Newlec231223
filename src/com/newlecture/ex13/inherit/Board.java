package com.newlecture.ex13.inherit;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;


public class Board {
	String[][] buf;
	int WIDTH;
	int HEIGHT;

	public Board() {
		this.WIDTH = 20;
		this.HEIGHT = 10;
		this.buf = new String[this.HEIGHT][this.WIDTH];
	}
	
	public void pirnt() {
		for(int y=0; y<this.HEIGHT; y++) {
			for(int x=0; x<this.WIDTH; x++) 
				System.out.print(this.buf[y][x]);
			
			System.out.println();
		}
	}
		
	
	public void deco() {
		String up1 = "┌";
		String up2 = "┬";
		String up3 = "┐";
		
		String middle1 = "├";
		String middle2 = "┼";
		String middle3 = "┤";
				
		String douwn1 = "└";
		String douwn2 = "┴";
		String douwn3 = "┘";
		
		for(int y=0; y<this.HEIGHT; y++)
			for(int x=0; x<this.WIDTH; x++) {
				this.buf[y][x]=middle2;
				
				if(x==0) 
					this.buf[y][x] = middle1;
				if(x == this.WIDTH-1)
					this.buf[y][x] = middle3;
				if(y==0)
					this.buf[y][x] = up2;
				if(y == this.HEIGHT-1)
				this.buf[y][x] = douwn2;
				
				if(x==0 && y==0)
					this.buf[y][x]=up1;
				if(x==0 && y==this.HEIGHT-1)
					this.buf[y][x]=douwn1;
				
				if(x==this.WIDTH-1 && y==0)
					this.buf[y][x]=up3;
				if(x==this.WIDTH-1 &&y==this.HEIGHT-1)
					this.buf[y][x]=douwn3;
			}
	}
	
	
	public Board putStone(int count) {
		int x, y;
		String player1 = "●";
		String player2 = "○";
		Board returnis = new Board();
		
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.print("오목 x좌표 : ");
			x = Integer.parseInt( scan.nextLine() )-1;
			
		} catch (Exception e) {
			x = -1;
		}
		if( !(0<=x && x<this.WIDTH) ) {
			System.out.printf("잘못 입력하셨습니다. 1부터 %d까지의 정수를 입력해주세요\n", this.WIDTH);
			returnis = new Board();
			returnis.HEIGHT=1;
			return returnis;
		}
		
		try {
			System.out.print("오목 y좌표 : ");
			y = this.HEIGHT-Integer.parseInt( scan.nextLine() );
			
		} catch (Exception e) {
			y = -1;
		}
		if( !(0<=y && y<this.HEIGHT) ) {
			System.out.printf("잘못 입력하셨습니다. 1부터 %d까지의 정수를 입력해주세요\n", this.HEIGHT);
			returnis.HEIGHT=1;
			return returnis;
		}
		
		if(this.buf[y][x] == player1 || this.buf[y][x] == player2) {
			System.out.println("이미 오목돌이 있습니다. 다시 입력해주세요\n");
			returnis.HEIGHT=1;
			return returnis;
		}
		
		this.buf[y][x] = count%2 == 0? player1 : player2;
		return returnis;
	}
	
	
	public void save(boolean run) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		PrintStream pis = new PrintStream("res/omok.txt/");
		
		System.out.println("현재 오목 판을 저장하시겠습니까?");
		System.out.println("1.예 2.아니오");
		
		int save = Integer.parseInt( scan.nextLine() );
		if(save==1) {
			for(int y=0; y<this.HEIGHT; y++) {
				for(int x=0; x<this.WIDTH; x++) 
					pis.print(this.buf[y][x]);
				
				pis.println();
			}
			run = false;
		}
		
	}

	public void put(Omok omok) {
		int x = omok.x;
		int y = omok.y;
		
		this.buf[x][y]=omok.colors;
	}
	
//	public static Board make() {
//		
//		return board;
//	}

}
