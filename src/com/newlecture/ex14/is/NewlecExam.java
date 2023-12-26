package com.newlecture.ex14.is;

import com.newlecture.ex14.reuse1.Exam;

public class NewlecExam extends Exam {
	private int com;

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}
	
	@Override
	public int total() {
		return super.total()+com;
	}
	
}
