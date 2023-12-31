package personalPrj.dartGame;

import java.util.Scanner;

public class DartUI {
	
	GameRepository repository;
	
	public DartUI() {
		repository = new GameRepository();
		
	}

	public void index() {
		
		boolean isRun = true;
		
		while(isRun) {
			
			int menu = list();
			
			switch (menu) {
			case 1: 
				showTheHall();
				break;
			case 2:
				intro();
				break;
			case 3:
				game();
				break;
			case 4:
				isRun = false;
				break;
				
			default:
				
			}
		}
		
	}


	private int list() {
		
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		
		System.out.println("┌─────────────────────────────┐");
		System.out.println("│          메뉴 선택          │");
		System.out.println("└─────────────────────────────┘");
		System.out.println("1. 명예의 전당");
		System.out.println("2. 게임 설명");
		System.out.println("3. 게임 시작");
		System.out.println("4. 종료");
		
		boolean run = true;
		while (run) {
			
			System.out.print(">>");
			
			
			//유효성 검사
			String str =scan.nextLine();
			
			boolean isNum = !Character.isDigit(str.charAt(0));//입력값이 숫자가 아닐때
			
			if(isNum) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. (1부터 4까지의 정수만 입력해주세요)\n");
				continue;
			}
			
			int temp = Integer.parseInt(str);
			
			boolean isRight = !(1<=temp && temp <=4);//1~4가 아닐때
			if(isRight) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. (1부터 4까지의 정수만 입력해주세요)\n");
				continue;
			}
			
			menu = temp;
			run=false;
		}				
		
		System.out.println();
		return menu;
		
	}

	private void showTheHall() {
		
	}
	
	private void intro() {
		
	}
	
	private void game() {
		
	}
	
	
	
}
