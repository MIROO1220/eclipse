package sh.java.exception;

import java.util.Scanner;

public class GameWithIf {

	public static void main(String[] args) {
		new GameWithIf().start();
		
	}
	
	public void start() {
		boolean isAdult = checkAge();
		
		if(isAdult) {
			System.out.println("<<< 성인용 야바위 게임 >>>");
			System.out.println("🍕🍔🍟🌭🍿🍖🍗🥩🥞🥐🥨🍕🍔🍟🌭🍿🍖🍗🥩🥞🥐🥨");
		}else {
			System.out.println(">>> 성인만 이용가능한 게임입니다.");
		}
	}

	private boolean checkAge() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		return age>=20;
	}
}







