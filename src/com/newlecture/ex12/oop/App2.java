package com.newlecture.ex12.oop;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class App2 {
	
	
	//보드 크기 입력
	
	static String[][] inputBoardSize(int WIDTH, int HEIGHT) {
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("행의 개수를 입력하세요 : ");
//		HEIGHT = scan.nextInt();
//		System.out.print("열의 개수를 입력하세요 : ");
//		WIDTH = scan.nextInt();
		
		String[][] board = new String[HEIGHT][WIDTH];
		
		return board;
	}
	
	static void pirntBoard(String[][] board, int WIDTH, int HEIGHT) {
		
		for(int y=0; y<HEIGHT; y++) {
			for(int x=0; x<WIDTH; x++) 
				System.out.print(board[y][x]);
			
			System.out.println();
		}
	}
	
	//보드판 만들기
	static void makeBoard(String[][] board, int WIDTH, int HEIGHT) {
		String up1 = "┌";
		String up2 = "┬";
		String up3 = "┐";
		
		String middle1 = "├";
		String middle2 = "┼";
		String middle3 = "┤";
				
		String douwn1 = "└";
		String douwn2 = "┴";
		String douwn3 = "┘";
		
		for(int y=0; y<HEIGHT; y++)
			for(int x=0; x<WIDTH; x++) {
				board[y][x]=middle2;
				
				if(x==0) 
					board[y][x] = middle1;
				if(x == WIDTH-1)
					board[y][x] = middle3;
				if(y==0)
					board[y][x] = up2;
				if(y == HEIGHT-1)
				board[y][x] = douwn2;
				
				if(x==0 && y==0)
					board[y][x]=up1;
				if(x==0 && y==HEIGHT-1)
					board[y][x]=douwn1;
				
				if(x==WIDTH-1 && y==0)
					board[y][x]=up3;
				if(x==WIDTH-1 &&y==HEIGHT-1)
					board[y][x]=douwn3;
			}
	}
	
	//오목 두기
	static String[][]  putStone(String[][] board, int WIDTH, int HEIGHT, int count) {
		int x, y;
		String player1 = "●";
		String player2 = "○";
		String[][] returnis = {{"0"}};
		
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.print("오목 x좌표 : ");
			x = Integer.parseInt( scan.nextLine() )-1;
			
		} catch (Exception e) {
			x = -1;
		}
		if( !(0<=x && x<WIDTH) ) {
			System.out.printf("잘못 입력하셨습니다. 1부터 %d까지의 정수를 입력해주세요\n", WIDTH);
			returnis[0][0] = "1";
			return returnis;
		}
		
		try {
			System.out.print("오목 y좌표 : ");
			y = HEIGHT-Integer.parseInt( scan.nextLine() );
			
		} catch (Exception e) {
			y = -1;
		}
		if( !(0<=y && y<HEIGHT) ) {
			System.out.printf("잘못 입력하셨습니다. 1부터 %d까지의 정수를 입력해주세요\n", HEIGHT);
			returnis[0][0] = "1";
			return returnis;
		}
		
		if(board[y][x] == player1 || board[y][x] == player2) {
			System.out.println("이미 오목돌이 있습니다. 다시 입력해주세요\n");
			returnis[0][0] = "1";
			return returnis;
		}
		
		board[y][x] = count%2 == 0? player1 : player2;
		return board;
	}
	
	//게임 저장하기
	static void saveGame(String[][] board, int WIDTH, int HEIGHT, boolean run) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		PrintStream pis = new PrintStream("res/omok.txt/");
		
		System.out.println("현재 오목 판을 저장하시겠습니까?");
		System.out.println("1.예 2.아니오");
		
		int save = Integer.parseInt( scan.nextLine() );
		if(save==1) {
			for(int y=0; y<HEIGHT; y++) {
				for(int x=0; x<WIDTH; x++) 
					pis.print(board[y][x]);
				
				pis.println();
			}
			run = false;
		}
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
		final int WIDTH=15, HEIGHT=15;
		
		String[][] board = inputBoardSize(WIDTH, HEIGHT);
		makeBoard(board, WIDTH, HEIGHT);
		pirntBoard(board, WIDTH, HEIGHT);
		
		int count = 0;
		boolean run = true;
		while(run) {
			
			String[][] returnis=putStone(board, WIDTH, HEIGHT, count);
//			if(Integer.parseInt(returnis[0][0]) == 1 )
//				continue;
			pirntBoard(board, WIDTH, HEIGHT);
			
			saveGame(board,WIDTH, HEIGHT, run);
			count++;
		}
		
	}
}