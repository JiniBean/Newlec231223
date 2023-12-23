package com.newlecture.study.method;

public class Calculator {
	private int x;
	private int y;
	private int result;
	
	public void inputX(int i) {
		this.x=i;
	}
	public void inputY(int i) {
		this.y=i;
	}
	public void add() {
		this.result= this.x + this.y;
	}
	public void print() {
		System.out.println(this.result);
	}
	public void sub() {
		this.result= this.x - this.y;
		
	}
	
	public static int calculate(int x, int y) {
		int result = x + y;
		return result;
	}
	
	
}
