package com.newlecture.ex14.reuse1;

public class Exam {
	private String name;
	private int kor;
	private int math;
	private int eng;
	private int total;
	private double avg;
	
	
	public Exam() {
		super();
	}
	
	public Exam(String name, int kor, int math, int eng, int total, double avg) {
		super();
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.total = total;
		this.avg = avg;
	}
	
	public int total() {
		return kor + math + eng;
	}
	
	public double avg() {
		return total()/3.0;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	@Override
	public String toString() {
		return "Exam [name=" + name + ", kor=" + kor + ", math=" + math + ", eng=" + eng + ", total=" + total + ", avg="
				+ avg + "]";
	}
}