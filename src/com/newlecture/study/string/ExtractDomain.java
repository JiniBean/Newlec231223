package com.newlecture.study.string;

import java.util.Scanner;

public class ExtractDomain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이메일을 입력해주세요");
		String a = sc.nextLine();
		
		int idx = a.indexOf("@")+1;
		int lenth = a.length();
		
		System.out.println("도메인 : " + a.substring(idx, lenth));
		
	}
}
