package com.newlecture.study.method;

public class ex01 {
	public static void main(String[] args) {
		
		Calculator calc1 = new Calculator();
		
		calc1.inputX(3);
		calc1.inputY(4);
		calc1.add();
		calc1.print();

		calc1.inputX(6);
		calc1.inputY(5);
		calc1.sub();
		calc1.print();
		
		
	}
}
