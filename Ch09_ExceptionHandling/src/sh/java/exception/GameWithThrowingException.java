package sh.java.exception;

import java.util.Scanner;

public class GameWithThrowingException {

	public static void main(String[] args) {
		new GameWithThrowingException().start();
		
	}

	private void start() {
		
		try {
			checkAge(); // 성인이 아니면 예외를 던지고, 성인이면 종료
			System.out.println("<<< 성인용 야바위 게임 >>>");
			System.out.println("🍕🍔🍟🌭🍿🍖🍗🥩🥞🥐🥨");
		} catch (Exception e) {
			System.out.println(">>> 성인만 이용가능한 게임입니다 : " + e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * 메소드 안에서 예외를 던지면, 현재메소드를 호출한 쪽으로 던져진다.
	 * - checkAge를 호출한 start로 예외 던짐.
	 * 
	 * java에서 지원하는 예외클래스
	 * - RuntimeException
	 * - IllegalArgumentException
	 * - ...
	 * 
	 * 현재 프로그램의 상황을 구체적으로 설명할 수 있는 커스텀예외클래스를 작성하는 것도 좋다.
	 * */
	private void checkAge() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		if(age < 20)
//			throw new RuntimeException();
			throw new UnderAgeException("미성년자(" + age + ")");
	}

}
