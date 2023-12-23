package com.newlecture.study.arr;

public class SearchAndReplace {
	public static void main(String[] args) {
		
		char[] chars = {'H', 'e', 'a', 'a', 'o', 'W', 'o', 'r', 'l', 'd', '!'};
		int n = chars.length;
		
		for(int i=0; i<n; i++) {
			if(chars[i]=='a')
				chars[i] = 'l';
			System.out.print(chars[i]);
		}
	}
}
