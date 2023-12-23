package com.newlecture.study.condition;

import java.util.Scanner;

public class PasswordValidator {
	public static void main(String[] args) {
		
		
		String password;
		int num;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("비밀번호를 입력해주세요.");
		
		do {
			
			password = scan.nextLine();
			num = password.length();
			
			if( !(8 <= num && num <= 16) ) {
				System.out.println("비밀번호는 8~16자리로 만들어주세요.");
			}
		
		}
		while ( !(8 <= num && num <= 16) );
		
		System.out.println("유효한 비밀번호입니다.");
		
	}
}
