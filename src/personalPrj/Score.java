package personalPrj;

import java.util.Scanner;

public class Score {

	int korean;
	int math;
	int eng;
	int sci;
	int tech;
	int total;
	
	
	public Score(int korean, int math, int eng, int sci, int tech, int total){
		this.korean = korean;
		this.math = math;
		this.eng = eng;
		this.sci = sci;
		this.tech = tech;
		this.total = total;
		
	}
	
	void add() {
		
		System.out.println("total : " +  total);
	}
	
	void average() {
	
		System.out.println("average : " +  (total/5));
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요");
		int korean = in.nextInt();
		
		System.out.println("수학 점수를 입력하세요");
		int math = in.nextInt();
		
		System.out.println("영어 점수를 입력하세요");
		int eng = in.nextInt();
		
		System.out.println("과학 점수를 입력하세요");
		int sci = in.nextInt();
		
		System.out.println("기술 점수를 입력하세요");
		int tech = in.nextInt();
		
		int total = korean + math + eng + sci + tech;
		
		Score sc = new Score(korean, math, eng, sci, tech, total);
		
		sc.add();
		sc.average();
		in.close();
		
	}

}

