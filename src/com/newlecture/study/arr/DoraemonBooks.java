package com.newlecture.study.arr;

import java.util.Scanner;

public class DoraemonBooks {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n=0;
		int m=0;
		
		System.out.print("책의 개수를 입력하세요 : \n");
		n = scanner.nextInt();
		
		String s = scanner.nextLine();
		
		m = n*2;
		
		String[] books = new String[m];
		
		System.out.println();
		System.out.println("책들을 입력하세요");
			
			
		
//	case1
		for(int i=0; i<n; i++)
			books[i] = scanner.nextLine();	
		
		for(int i=0; i<m; i++)
			System.out.println(books[i]);
		
//	case2
		for(int i=0; i<n; i++) {
			if((2*i)%2==0)
				books[2*i] = scanner.nextLine();
		}
		
		for(int i=0; i<m; i++)
			System.out.println(books[i]);			
	}
}
