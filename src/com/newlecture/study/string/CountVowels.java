package com.newlecture.study.string;

import java.util.Scanner;

public class CountVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력해주세요");
		int countA=0;
		int countE=0;
		int countI=0;
		int countO=0;
		int countU=0;
		
		String aa = sc.nextLine();
		
		String[] as = aa.split("");
		
		
		for(int i=0; i<as.length; i++) 
		{
			countA += (as[i].indexOf("a")>-1?1:0);
			countE += (as[i].indexOf("e")>-1?1:0);
			countI += (as[i].indexOf("i") >-1?1:0);
			countO += (as[i].indexOf("0")>-1?1:0);
			countU += (as[i].indexOf("u")>-1?1:0);
		}
		
		int total = countA + countE + countI+ countO + countU;
		System.out.println(total);
	}
	
}
