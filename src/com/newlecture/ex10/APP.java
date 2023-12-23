package com.newlecture.ex10;

import java.util.Scanner;

public class APP {
	public static void main(String[] args) {
		
		String up1 = "┌";
		String up2 = "┬";
		String up3 = "┐";
		
		String middle1 = "├";
		String middle2 = "┼";
		String middle3 = "┤";
				    
		String douwn1 = "└";
		String douwn2 = "┴";
		String douwn3 = "┘";
		
		final int HEIGHT, WIDTH;
		Omok[] omoks;
		String[][] board;
		int size =0;
		
		// 오목 크기 입력
		{
			Scanner scan = new Scanner(System.in);
			
			System.out.println("행의 개수를 입력해주세요");
			HEIGHT = Integer.parseInt( scan.nextLine() );
			
			System.out.println("열의 개수를 입력해주세요");
			WIDTH = Integer.parseInt( scan.nextLine() );
			
			size = WIDTH*HEIGHT;
			
			omoks = new Omok[HEIGHT*WIDTH];
			board = new String[HEIGHT][WIDTH];
			
		}
		
		// board 초기화
		{
			for(int y=0; y<HEIGHT; y++) {
				for(int x=0; x<WIDTH; x++) {
					board[y][x]=middle2;
				}
			}
			
			for(int x=0; x<WIDTH; x++) {
				int y=0;
				board[y][x]=up2;
				
				y=HEIGHT-1;
				board[y][x]=douwn2;
			}
			
			for(int y=0; y<HEIGHT; y++) {
				int x=0;
				board[y][x]=middle1;
				x=WIDTH-1;
				board[y][x]=middle3;
			}
			
			{
				int x = 0;
				int y = 0;
				board[y][x]=up1;
				
				x = WIDTH-1;
				board[y][x]=up3;
			}
			
			{
				int x = 0;
				int y = HEIGHT-1;
				board[y][x]=douwn1;
				
				x = WIDTH-1;
				board[y][x]=douwn3;
			}
			
			//오목 출력
			for(int y=0; y<HEIGHT; y++) {
				for(int x=0; x<WIDTH; x++) 
					System.out.print(board[y][x]);
				
				System.out.println();
			}
			
		}
		
		
		String player1 = "●";
		String player2 = "○";
		
		
		int count = 0;
		//오목 입력
		while(count<2){
			{
				int x, y;
				
				Scanner scan = new Scanner(System.in);
				System.out.print("오목 x좌표 : ");
				x = Integer.parseInt( scan.nextLine() )-1;
				
				System.out.print("오목 y좌표 : ");
				y = HEIGHT-Integer.parseInt( scan.nextLine() );
				
//				Omok omok = new Omok();
//				omok.x = x;
//				omok.y = y;
				board[y][x] = count%2 == 0? player1 : player2;
			}
			
			board[0] = new String[1];
			//오목 출력
			for(int y=0; y<HEIGHT; y++) {
				for(int x=0; x<WIDTH; x++) 
					System.out.print(board[y][x]);
				
				System.out.println();
			}
			
			count++;
		}
		
			
		//오목 출력
		for(int y=0; y<HEIGHT; y++) {
			for(int x=0; x<WIDTH; x++) 
				System.out.print(board[y][x]);
			
			System.out.println();
		}
//			{
//				String stone = null;
//				
//				for(int y=0; y<HEIGHT; y++) {
//					for(int x=0; x<WIDTH; x++) {
//						boolean gottaPrint = false;
//						
//						for(int i=0; i<size; i++)
//							if(omoks[i].x == x && omoks[i].y == y) {
//								gottaPrint = true;
//								stone = omoks[i].colors;
//							}
//						
//						if(gottaPrint)
//							System.out.print(stone);
//						else if(y==0 && x==0 )
//							System.out.print(up1);
//						else if(y==0 && x==WIDTH-1)
//							System.out.print(up3);
//						else if(y==0)
//							System.out.print(up2);
//						
//						else if(y==HEIGHT-1 && x==0)
//							System.out.print(douwn1);
//						else if(y==HEIGHT-1 && x==WIDTH-1)
//							System.out.print(douwn3);
//						else if(y==HEIGHT-1)
//							System.out.print(douwn2);
//						
//						else if(x==0)
//							System.out.print(middle1);
//						else if(x==WIDTH-1)
//							System.out.print(middle3);
//						else
//							System.out.print(middle2);
//					}
//					System.out.println();
//				}
		
		
		

	}
}
