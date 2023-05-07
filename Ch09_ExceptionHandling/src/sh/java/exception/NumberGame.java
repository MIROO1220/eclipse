package sh.java.exception;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		new NumberGame().start();
	}

	
	/**
	 * 점수에 따라 실행할 게임을 분기처리하는 앱
	 * - 점수가 60점이상이면 프리미엄게임 시작
	 * - 점수가 60점미만이면 그냥그런게임 시작
	 * */
	private void start() {
		try {
			inputScore();
			premiumGame();
		} catch (Exception e) {
			normalGame();
		}
		
	}
	
	/**
	 * 사용자에게 점수를 입력받고, 60점 미만이면 NoGoodScoreException을 던지는 메소드
	 * */
	private void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		
		if(score<60)
			throw new NoGoodScoreException();
	}
	
	private void premiumGame() {
		System.out.println("프리미엄 게임을 시작합니다~");
	}
	
	private void normalGame() {
		System.out.println("그냥 그런 게임을 시작합니다~");
	}

}
