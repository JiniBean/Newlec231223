package com.newlecture.study.market;

import java.io.IOException;
import java.util.Scanner;


public class BuyerUI {
	
	private MemberRepository mRepository;
	private ProductRepository pRepository;
	private HistoryRepository hRepository;
	private Member member;
	private ProductList pList;
	private MemberList mList;
	private Product product;
	
	public BuyerUI() {
		mRepository = new MemberRepository();
		pRepository = new ProductRepository();
		hRepository = new HistoryRepository();
		member=null;
	}

	public void index() throws IOException {
		
		boolean isRun = true;
		
		while(isRun) {
			
			int menu = inputMenu();
			
			switch (menu) {
			case 1: 
				list();
				break;
			case 2:
				if(member==null)
					login();
				else
					logout();
				break;
			case 3: 
				isRun = false;
				break;
			default:
				System.out.println("오류");
			}
		}
		System.out.println("시스템이 종료되었습니다. 이용해주셔서 감사합니다.");
		
	}
	
	
	public int inputMenu() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[메뉴관리]");
		System.out.println("1.메뉴목록");
		
		System.out.println(this.member==null?"2.로그인":"2.로그아웃");
		
		System.out.println("3.내 구매목록");
		System.out.println("3.종료");
		System.out.print(">>");
		
		int menu = scan.nextInt();
		System.out.println();
		
		return menu;
	}


	public void list() throws IOException {
		Scanner scan = new Scanner(System.in);
		
		pList = new ProductList();
		pList = pRepository.findAll();
		
		int count = pList.getCount();
		
		for(int i=0; i<count; i++) {
			Product temp = pList.get(i);
			System.out.printf("[%d] 상품명: %s  판매가: %d\n", i+1, temp.getName(), temp.getCost() );
			System.out.println();
		}
		
		System.out.println("선택하고 싶은 상품의 번호를 입력해주세요\n(메인 메뉴로 가려면 아무 키나 눌러주세요)");
		String str = scan.nextLine();
		System.out.println();
		if('0'<str.charAt(0) &&str.charAt(0)<='9') {
			int i = (Integer.parseInt(str)-1);
			product = pList.get(i);
			indexDetail();
		}
		
	}
	
	public String indexDetail() throws IOException {
		Scanner scan = new Scanner(System.in);
		
		int menu = 0;
		
		System.out.printf("[%s] %d원\n", product.getName(), product.getCost());
		System.out.println();
		System.out.println("1.상세페이지");
		System.out.println("2.구매하기");
		System.out.println("(메인 메뉴로 가려면 아무 키나 눌러주세요)");
		System.out.print(">>");
		String str = scan.nextLine();
		System.out.println();
		System.out.println();
		
		if(str==null)
			return null;
		
		if( ('0'<str.charAt(0) &&str.charAt(0)<='9') ) 
			menu = Integer.parseInt(str);
			
		switch (menu) {
		case 1:
			detailPage();
			break;
		case 2:
			purchase();
			break;
		
		}
		
		return null;
	}

	private void purchase() throws IOException {
		Scanner scan = new Scanner(System.in);
		
		boolean isRun = true;
		int menu=0;
		
		while(isRun) {		
			if(member==null) {
				System.out.println("회원 정보가 없습니다. 로그인을 먼저 해주세요\n");
				login();
			}
			
			System.out.println("주문자 정보를 확인해 주세요\n");
			System.out.printf("이름 : %s\n", member.getName() );
			System.out.printf("전화번호 : %d\n", member.getPhone() );
			System.out.printf("주소 : %s\n", member.getAddress() );
			System.out.println();
			System.out.println("1.예");
			System.out.println("2.아니오");
			System.out.print(">>");
			String str = scan.nextLine();
			System.out.println();
			
			if('0'<str.charAt(0) &&str.charAt(0)<='9') 
				menu = Integer.parseInt(str);
			
			switch (menu) {
			case 1:
				hRepository.save(member, product);
				System.out.println("주문이 완료되었습니다.");
				System.out.println();
				isRun = false;
				break;
			case 2:
				
				break;
			}
		}
	}

	public void detailPage() throws IOException {
		Scanner scan = new Scanner(System.in);
		int menu=0;
		
		System.out.printf("[%s]\n판매가 : %d\n%s\n\n", product.getName(), product.getCost(), product.getDetail() );
		System.out.println("1.구매하기");
		System.out.println("2.상품목록");
		System.out.println("(메인 메뉴로 가려면 아무 키나 눌러주세요)");
		System.out.print(">>");
		String str = scan.nextLine();
		System.out.println();
		System.out.println();
		
		if('0'<str.charAt(0) &&str.charAt(0)<='9') 
			menu = Integer.parseInt(str);
		
		switch (menu) {
		case 1:
			purchase();
			break;
		case 2:
			list();
			break;
		}
	}

	public void login() throws IOException {
		Scanner scan = new Scanner(System.in);
		
		mList = new MemberList();
		Member temp = new Member();
		
		System.out.print("아이디 : ");
		temp.setId(scan.nextLine());
		
		System.out.print("비밀번호 : ");
		temp.setPassword(scan.nextLine() );
		System.out.println();
		
		mList = mRepository.findAll();
		
		member = mList.find(temp);
		
		if(member != null) 
			System.out.printf("%s님 로그인 되었습니다.\n", member.getName() );
		System.out.println();
		
		
	}

	public void logout() {
		System.out.printf("%s님 로그아웃 되셨습니다.", member.getName() );
		System.out.println();
		System.out.println();
		this.member = null;
	}



}
