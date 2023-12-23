package com.newlecture.ex12.oop;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class App3 {
	
	
	//보드 크기 입력
	
	static Board makeBoardSize() {
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("행의 개수를 입력하세요 : ");
//		HEIGHT = scan.nextInt();
//		System.out.print("열의 개수를 입력하세요 : ");
//		WIDTH = scan.nextInt();
		
		Board board = new Board();
		board.WIDTH = 20;
		board.HEIGHT = 10;
		board.buf = new String[board.HEIGHT][board.WIDTH];
		return board;
	}
	
	static void pirntBoard(Board board) {
		
		for(int y=0; y<board.HEIGHT; y++) {
			for(int x=0; x<board.WIDTH; x++) 
				System.out.print(board.buf[y][x]);
			
			System.out.println();
		}
	}
	
	//보드판 만들기
	static void makeBoard(Board board) {
		String up1 = "┌";
		String up2 = "┬";
		String up3 = "┐";
		
		String middle1 = "├";
		String middle2 = "┼";
		String middle3 = "┤";
				
		String douwn1 = "└";
		String douwn2 = "┴";
		String douwn3 = "┘";
		
		for(int y=0; y<board.HEIGHT; y++)
			for(int x=0; x<board.WIDTH; x++) {
				board.buf[y][x]=middle2;
				
				if(x==0) 
					board.buf[y][x] = middle1;
				if(x == board.WIDTH-1)
					board.buf[y][x] = middle3;
				if(y==0)
					board.buf[y][x] = up2;
				if(y == board.HEIGHT-1)
				board.buf[y][x] = douwn2;
				
				if(x==0 && y==0)
					board.buf[y][x]=up1;
				if(x==0 && y==board.HEIGHT-1)
					board.buf[y][x]=douwn1;
				
				if(x==board.WIDTH-1 && y==0)
					board.buf[y][x]=up3;
				if(x==board.WIDTH-1 &&y==board.HEIGHT-1)
					board.buf[y][x]=douwn3;
			}
	}
	
	//오목 두기
	static Board putStone(Board board, int count) {
		int x, y;
		String player1 = "●";
		String player2 = "○";
		Board returnis;
		
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.print("오목 x좌표 : ");
			x = Integer.parseInt( scan.nextLine() )-1;
			
		} catch (Exception e) {
			x = -1;
		}
		if( !(0<=x && x<board.WIDTH) ) {
			System.out.printf("잘못 입력하셨습니다. 1부터 %d까지의 정수를 입력해주세요\n", board.WIDTH);
			returnis = new Board();
			returnis.HEIGHT=1;
			return returnis;
		}
		
		try {
			System.out.print("오목 y좌표 : ");
			y = board.HEIGHT-Integer.parseInt( scan.nextLine() );
			
		} catch (Exception e) {
			y = -1;
		}
		if( !(0<=y && y<board.HEIGHT) ) {
			System.out.printf("잘못 입력하셨습니다. 1부터 %d까지의 정수를 입력해주세요\n", board.HEIGHT);
			returnis = new Board();
			returnis.HEIGHT=1;
			return returnis;
		}
		
		if(board.buf[y][x] == player1 || board.buf[y][x] == player2) {
			System.out.println("이미 오목돌이 있습니다. 다시 입력해주세요\n");
			returnis = new Board();
			returnis.HEIGHT=1;
			return returnis;
		}
		
		board.buf[y][x] = count%2 == 0? player1 : player2;
		return board;
	}
	
	//게임 저장하기
	static void saveGame(Board board, boolean run) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		PrintStream pis = new PrintStream("res/omok.txt/");
		
		System.out.println("현재 오목 판을 저장하시겠습니까?");
		System.out.println("1.예 2.아니오");
		
		int save = Integer.parseInt( scan.nextLine() );
		if(save==1) {
			for(int y=0; y<board.HEIGHT; y++) {
				for(int x=0; x<board.WIDTH; x++) 
					pis.print(board.buf[y][x]);
				
				pis.println();
			}
			run = false;
		}
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Board board = makeBoardSize();
		makeBoard(board);
		pirntBoard(board);
		
		int count = 0;
		boolean run = true;
		while(run) {
			
			Board returnis=putStone(board, count);
			if(returnis.HEIGHT == 1 )
				continue;
			pirntBoard(board);
			
			saveGame(board, run);
			count++;
		}
		
	}
}