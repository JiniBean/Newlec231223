package com.newlecture.study;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class study1127 {

	public static void main(String[] args) throws FileNotFoundException {
		
		char ch = 'H';
		
		FileOutputStream fos = new FileOutputStream("res/ex04.txt");
		PrintStream prs = new PrintStream(fos);
		
		prs.print(ch);
		prs.print('e');
		prs.print('l');
		prs.print('l');
		prs.print('o');
		
		prs.close();
		
		String h = "Hello";
		
		FileOutputStream fos1 = new FileOutputStream("res/ex03.txt");
		PrintStream prs1 = new PrintStream(fos1);
		
		prs1.print(h);
		prs1.print("hello");
		
		char b = '가';

	}

}
