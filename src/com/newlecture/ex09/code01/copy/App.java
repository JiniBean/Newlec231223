package com.newlecture.ex09.code01.copy;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import com.newlecture.ex09.code01.Exam;

public class App {
	
	static int countStudent() throws IOException {
		
		int count = 0;
		
		FileInputStream fis = new FileInputStream("res/ex08.csv");
        Scanner scan = new Scanner(fis);
        if (scan.hasNextLine())
           scan.nextLine();

        // 반복해서 개수 알아보기
        while (scan.hasNextLine()) {
           count++;
           scan.nextLine();
        }

        scan.close();
        fis.close();

        return count;
	}
	
	static void loadScore(Exam[] exams, int count) throws IOException {
		 
         FileInputStream fis = new FileInputStream("res/ex08.csv");
         Scanner scan = new Scanner(fis);
         if (scan.hasNextLine())
            scan.nextLine();

         for (int i = 0; i < count; i++) {
            String line = scan.nextLine();

            String[] tokens = line.split(",");
            String name = tokens[0];
            int kor = Integer.parseInt(tokens[1]);
            int eng = Integer.parseInt(tokens[2]);
            int math = Integer.parseInt(tokens[3]);

            Exam exam = new Exam();
            exam.name = name;
            exam.kor = kor;
            exam.eng = eng;
            exam.math = math;            
            
            exams[i] = exam;
         }
         

	}
	
	static Exam[] plusMoreArray(Exam[] exams, int count) {
		Exam[] temp = new Exam[count+1];
         
         // 이주시키기
         for(int i=0; i<count; i++)
            temp[i] = exams[i];
         
         // temp가 참조하는 객체를 exams 에게도 참조하도록 수정
         exams = temp;
         return exams;
	}

	static int inputScore(Exam[] exams,int count) {
		Scanner scan = new Scanner(System.in);
        
        Exam exam =new Exam();
        
        System.out.printf("name:");
        String name = scan.nextLine();
        
        System.out.printf("kors:");
        int kor = Integer.parseInt(scan.nextLine());
        
        System.out.printf("eng: ");
        int eng = Integer.parseInt(scan.nextLine());
        
        System.out.printf("math: ");
        int math = Integer.parseInt(scan.nextLine());

        exam.name = name;
        exam.eng = eng;
        exam.kor = kor;
        exam.math = math;
        
        exams[count++] = exam;
        return count;
	}
	
	static void compareRank(Exam[] exams,int count) {
		for(int i=0; i<count-1; i++)
            for(int j=0; j<count-1-i; j++)
               if( exams[j].kor < exams[j+1].kor) {
                  String temp;
                  temp = exams[j];
                  exams[j] = exams[j+1];
                  exams[j+1] = temp;
               }         
	}
	
	static void printScore(Exam[] exams,int count) {
		  for (int i = 0; i < count; i++) {
	            Exam exam = exams[i];
	            
	            String name = exam.name;
	            int kor = exam.kor;//kors[i];
	            int eng = exam.eng;//engs[i];
	            int math = exam.math;//maths[i];
	            int total = kor + eng + math;
	            double avg = total / 3.0;

	            System.out.printf("name=%s, kor=%d, eng=%d, math=%d, total=%d, avg=%.2f\n", name, kor, eng, math, total,avg);
		  }
	
	
	}
	
	public static void main(String[] args) throws IOException {
		int count = countStudent();
		   Exam[] exams = new Exam[count];
		   
		   loadScore(exams, count); 
		   plusMoreArray(exams, count);
		   printScore(exams, count);
		   System.out.println(count);
		   
		   count = inputScore(exams, count);
		   compareRank(exams, count);
		   
		   printScore(exams, count);
	}


}
