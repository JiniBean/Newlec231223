package com.newlecture.ex10;

public class MArrayApp {
	public static void main(String[] args) {
		
		int[] a1 = {1,2,3};
		int[] a2 = {4,5,6};
		int[] a3 = {7,8};
		
		int[][] t1 = {a1, a2, a3};
		
		System.out.println(t1[2][1]);
	}
}
