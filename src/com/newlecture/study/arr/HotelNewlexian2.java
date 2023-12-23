package com.newlecture.study.arr;

import java.util.Scanner;

public class HotelNewlexian2 {
	public static void main(String[] args) {
		
		int n;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("객실 수를 입력해주세요");
		n = scanner.nextInt();
		int [] rooms = new int[n];
		
		for(int i=0; i<n; i++)
			rooms[i]=0;
		
		boolean run= true;
		
		while(run) {
			System.out.println("몇번 방을 예약할까요? (0을 입력하면 종료됩니다)");
			
			int roonNum=scanner.nextInt();
			
			if (roonNum==0) {
				run=false;
				System.out.println("종료");
				break;
			}
			else if(rooms[roonNum-1]==1) {
				System.out.printf("%d번 방은 예약이 불가능합니다. 다시 입력해주세요.\n", roonNum);
			}
			else {
				rooms[roonNum-1]=1;
				System.out.printf("%d번 방이 예약되었습니다.\n", roonNum);
			}
		
		}
		
		while(run) {
			System.out.println("몇번 방을 예약할까요? (0을 입력하면 종료됩니다)");
			int roonNum=scanner.nextInt();
			
			if (roonNum==0) {
				run=false;
				System.out.println("종료");
				break;
			}
			
			
			
		}
	}	
}
