package com.newlecture.prj1;
import java.util.Scanner;

public class Study3 {
	public static void main (String[]  args) {
		   Scanner 입력도구 = new Scanner(System.in);


		   System.out.println("1부터 100사이의 성적을 입력해주세요");


		   int input = 입력도구.nextInt();


		   System.out.println("당신의 성적은 " + input + "입니다");


		// 문제 : 만약 성적이 90 이상이라면 A, 80점 이상이라면 B, 70점 이상이라면 C, 그 외라면 F 출력하기
		   
		   if (input >= 90) {
			   System.out.println("당신의 성적은 " + "A"  + "입니다");
		   } else if(input >= 80 ) {
			   System.out.println("당신의 성적은 " + "B" + "입니다");
		   } else if(input >=70) {
			   System.out.println("당신의 성적은 " + "C" + "입니다");
		   } else {
			   System.out.println("당신의 성적은 " + "F" + "입니다");
		   }
		   입력도구.close();

	}

}
