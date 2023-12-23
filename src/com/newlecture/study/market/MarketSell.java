package com.newlecture.study.market;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class MarketSell {

	public static void main(String[] args) throws IOException {
		
//		--- 변수 선언 -------------------
		
		String loadCategory = "상품 분류 : ";
		String loadType = "상품 종류 : ";
		String loadName = "상품 명 : ";
		String loadCost = "판매가 : ";
		String loadStock = "재고 수량 : ";
		
//		--- 데이터 입력 및 저장-----------------
			
		{
			Scanner scan = new Scanner(System.in);
			
			System.out.println("등록할 상품의 갯수를 입력해주세요");
			int num = scan.nextInt();
			scan.nextLine();
			
			Product[] product = new Product[num];
			
			for(int i=0; i<num; i++) {
				Product temp = new Product();
				
				System.out.print(loadCategory);
				temp.category = scan.nextLine();
				
				System.out.print(loadType);
				temp.type = scan.nextLine();
				
				System.out.print(loadName);
				temp.name = scan.nextLine();

				boolean IsRun = true;
				while(IsRun) {
					int n;
					try {
						System.out.print(loadCost);
						n= Integer.parseInt(scan.nextLine());
					} catch (Exception e) {
						System.out.println("정수만 입력헤주세요. (금액 범위 : 100~100,000)\n");
						n = -1;
						continue;
					}
					
					if(n < 100 || 10_000 < n) {
						System.out.println("금액 범위를 벗어났습니다. (금액 범위 : 100원~100,000원)");
						continue;
					}
					
					temp.cost = String.valueOf(n);
					IsRun = false;
				}
				
				IsRun = true;
				while(IsRun) {
					int n;
					try {
						System.out.print(loadStock);
						n = Integer.parseInt(scan.nextLine());
					} catch (Exception e) {
						System.out.println("0 이상의 정수만 입력헤주세요\n");
						n = -1;
						continue;
					}
					
					if(n < 0 || 1_000 < n) {
						
						System.out.println("재고 수량 범위를 벗어났습니다. (재고 수량 범위 : 0개~1,000개)");
						continue;
					} 
					
					if(n>0)
						IsRun = false;
					temp.stock = String.valueOf(n);
					}
					
				product[i] = temp;
				}
				
			PrintStream fout = new PrintStream("res/market.txt");
			for(int i=0; i<num; i++) {
				fout.printf("%s,%s,%s,%s,%s",product[i].category, product[i].type, product[i].name, product[i].cost, product[i].stock);
				fout.println();
			}
		}
		
		
		
//		--- 데이터 로드 ----------------
		int count = 0;
		{
			
			FileInputStream fis = new FileInputStream("res/market.txt");
			Scanner fscan = new Scanner(fis);
			
			while(fscan.hasNextLine()) {
				count++;
				fscan.nextLine();
			}
			fscan.close();
			fis.close();
		}
		
		{
			FileInputStream fis = new FileInputStream("res/market.txt");
			Scanner fscan = new Scanner(fis);
			
			Product[] product =  new Product[count];
			Product temp = new Product();
			
			
			for(int i=0; i<count; i++) {
				String line = fscan.nextLine();
				String[] tokens = line.split(",");
				
				temp.category = tokens[0];
				temp.type = tokens[1];
				temp.name = tokens[2];
				temp.cost = tokens[3];
				temp.stock = tokens[4];
				product[i] = temp;
			}
			
			for(int i=0; i<count; i++) {
				
				System.out.println(loadCategory + product[i].category);
				System.out.println(loadType + product[i].type);
				System.out.println(loadName + product[i].name);
				System.out.println(loadCost + product[i].cost);
				System.out.println(loadStock + product[i].stock);
			}
			fscan.close();
			fis.close();
		}
			

	}

}
