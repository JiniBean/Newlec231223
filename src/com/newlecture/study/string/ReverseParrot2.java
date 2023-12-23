package com.newlecture.study.string;

import java.util.Scanner;

public class ReverseParrot2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문장을 입력해주세요");
		String a = sc.nextLine();
		
		String[] as = a.split(" ");
		
		for(int i=0, n=as.length-1; i<as.length; i++, n--) {
			String before= as[n];
			System.out.print(before+" ");
		}
		
		
	}
}
