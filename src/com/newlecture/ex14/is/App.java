package com.newlecture.ex14.is;

import com.newlecture.ex14.reuse1.Exam;

public class App {

	public static void main(String[] args) {
	
		NewlecExam exam = new NewlecExam();
		exam.setKor(100);
		exam.setCom(90);
		
//		Exam exam1 = new NewlecExam();
//		exam1.setCom();
		
		System.out.println(exam.total());
		System.out.println(exam.avg());
		System.out.println();
		
		PaintFrame win = new PaintFrame();
		win.setVisible(true);
	}
}

