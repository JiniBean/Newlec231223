package com.newlecture.ex05.conti;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Sis {

	public static void main(String[] args) throws IOException {
		int kor1, kor2, kor3;
		kor1 = 50;
		kor2 = 60;
		kor3 = 80;
		  	
		FileOutputStream fos = new FileOutputStream("res/ex02.txt");
		PrintStream fout = new PrintStream(fos);
		  	
		 fout.printf("%d, %d, %d" , kor1, kor2, kor3);


		FileInputStream fis = new FileInputStream("res/ex02.txt");
		  
			
		{
			int b = fis.read();
			System.out.println(b);
		}
			
		{
			int b = fis.read();
			System.out.println(b);
		}
			
		{
			int b = fis.read();
			System.out.println(b);
		}
			
		fis.close();
		  

	}

}
