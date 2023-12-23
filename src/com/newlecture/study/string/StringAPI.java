package com.newlecture.study.string;

public class StringAPI {
	public static void main(String[] args) {
		String api = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.";
		
		System.out.println(api.length());
		System.out.println(api.indexOf("."));
		System.out.println(api.indexOf("simply"));
		
		
		int ii = api.indexOf("I");
		int m = api.indexOf("i");
	
		System.out.println(api.substring(ii,m));
		
		System.out.println(api.toUpperCase());
		System.out.println(api.toLowerCase());
		
		
		System.out.println(api.charAt(4));
		
		String[] tokens = api.split(" ");
		for(int i=0; i<tokens.length; i++)
			System.out.println(tokens[i]);
		
		
	}
}
