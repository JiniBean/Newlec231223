package com.newlecture.ex01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class App {

	public static void main(String[] args) throws IOException {
//		char ch = 'a';
		
		FileOutputStream fos = new FileOutputStream("res/ex01.txt");
		PrintStream fout = new PrintStream(fos);
		fout.println("abcd");
		
//		fos.write(ch);		
//		fos.flush();
		
		FileOutputStream fos1 = new FileOutputStream("res/ex.txt");
		PrintStream fout1 = new PrintStream(fos1);
		fout1.print("");
		
//		FileInputStream fisStream = new FileInputStream("res/ex01.txt");
//		int b = fisStream.read();
//		System.out.println(b);
	
	}

}
