package personalPrj.dartGame;

import java.io.IOException;

public class DartGame {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
//		--- 변수 선언 ----------------------------
		int target;
		int score = 0; 
		boolean isRun = true;
		
		Dart dart = new Dart();
		
//		--- 메뉴 선택 -------------------------
		
		dart.showTheHall();
		
//		--- 인트로 ----------------------------
		
		dart.dartArt();
		dart.intro();
		
//		--- 게임 진행 ----------------------------
		while(isRun) {
			
			//게임 세팅 
			SettingInfo info = dart.setGame();
			System.out.println(info.numPlayers);
			System.out.println(info.numRound);
			
			for(int i=0, j=1; i<info.numRound; i++,j++) {
				for(int k=0 ; k<info.numPlayers; k++) {
					
					//다트 던지기
					System.out.printf("\nRound%d %s\n\n",j, info.players[k].name );
					target = dart.throwDart();
				
					dart.throwAffect(); //쓔우웅
					
					//점수 계산 및 출력
					score = dart.scoreCheck(target);
					Thread.sleep(1000);
					System.out.printf("%s. your score = %d\n\n\n", info.players[k].name, score);
					Thread.sleep(900);
					
					//각 라운드 별 점수 저장
					switch (j) {
					case 1 : info.players[k].firstScore = score;
					case 2 : info.players[k].secondScore = score;
					case 3 : info.players[k].tirdScore = score;
					}
					
					info.players[k].totalScore += score; // 총점수에 더하기
				}
			}
		
//		--- 총 점수 출력 ----------------------------
			System.out.println("계산 중...\n");
			Thread.sleep(1100);
			
			info = dart.scoreCalculate(info);
			
//		--- 저장 및 반복여부 ---------------------------
			dart.loadToHall(info);
			isRun = dart.repeatGame();
		
		}
		System.out.println("게임이 종료되었습니다.");
	}
}
