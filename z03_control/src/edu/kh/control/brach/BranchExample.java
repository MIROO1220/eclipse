package edu.kh.control.brach;

import java.util.Scanner;

public class BranchExample {

	public void ex1() {

		// 1부터 10까지 1씩 증가하며 출력하는 반복문 작성
		// 단 5,를 출력하면 반복문을 멈춤

		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				System.out.println(i + " ");
				break;
			}
		}
	}

	public void ex2() {

		// 0이 입력 될 때 까지의 모든 정수의 합 구하기

		Scanner sc = new Scanner(System.in);

		int input = 0;
		int sum = 0;

		// while문을 처음에 무조건 수행하고, 특정 조건에 종료하는 방법
		// 1) input에 초기값을 0이 아닌 다른 값
		// while(input != 0)

		// 2) do ~ while문 사용

		// 3) 무한 루프 상태의 while문을 만들고
		// 내부에 break 조건 작성

		while (true) { // 무한 루프

			System.out.print("정수 입력 : ");
			input = sc.nextInt(); // 입력

			// 입력 받은 수가 0인지 검사 (while문 종료 조건)
			if (input == 0) {
				break;
			}
			sum += input;

		}
		System.out.println("합계 : " + sum);
		// unreachable code(도달할 수 없는 코드)

	}

	public void ex3() {

		// 입력 받은 모든 문자열을 누적
		// 단, "exit!" 입력 시 문자열을 누적을 종료 하고 결과 출력

		Scanner sc = new Scanner(System.in);

		String str = ""; // 빈 문자열로 초기화
							// 쌍따옴표("") 라는 기호를 이용해서 String 리터럴임을 지정
							// 하지만 내용이 없음

		while (true) { // 무한 루프

			System.out.print("문자열 입력(exit! 입력 시 종료) : ");

			String input = sc.nextLine();
			// next() : 다음 한 단어 (띄아쓰기 포함 x)
			// nextLine() : 다음 한 줄 (띄어쓰기 포함 o)

			// 입력 받은 문자열이 "exit!" 이면 반복 종료
			// if(input == "exit!")

			if (input.equals("exit!")) {

				// String 자료형은 비교 연산자(==)로 같은 문자열인지 판별할 수 없다.

				// 비교 연산자는 보통 기본 자료형 끼리의 연산에만 사용이 가능하다.
				// > String은 기본 자료형이 아닌 참조형

				// *** 해결 방법 : 문자열1. equals(문자열2)으로 비교 가능 ***
				break;
			}
			str += input + "\n"; // 누적 시 개행문자 추가

		} // while 끝

		System.out.println("----------------------------------");
		System.out.println(str);
	}

	public void ex4() {

		// 중첩 반복문 내부에서 break 사용하기

		// 구구단 2 ~ 9단까지 모두 출력
		// 단, 2단은 X 2 까지, 3단은 X 3까지 .. 9단은 X 9 까지만 출력

		for (int dan = 2; dan <= 9; dan++) {

			for (int num = 1; num <= 9; num++) {
				System.out.printf("%2d X %2d = %2d ", dan, num, dan * num);
				if (num == dan) { // 단과 곱해지는 수가 같을 경우
					break;
					// 분기문이 중첩 반복문 내에서 사용되면
					// 가장 가까운 반복문에 작용한다!
				}
			}
			System.out.println();
		}
	}

	public void ex5() {

		// break : 반복문을 바로 멈충

		// continue : 다음 반복으로 넘어감

		for (int i = 1; i <= 10; i++) {

			if (i % 3 == 0) {// i가 3의 배수인 경우
								// 다음 반복으로 넘어감
				continue;
			}

			System.out.print(i + " ");
		}
	}

	// 1 ~ 100까지 1씩 증가하며 출력하는 반복문
	// 단, 5의 배수는 건너뛰고
	// 증가하는 값이 40이 되었을 때 반복을 멈춤

	public void ex6() {

		for (int i = 1; i <= 100; i++) {

			if (i == 40) {
				break;
			}

			if (i % 5 == 0) {
				continue;

			}

			System.out.print(i + " ");

		}
	}
	// 가위 바위 보 게임

	// 몇판 : 3

	// 1번째 게임
	// 가위/바위/보 중 하나를 입력해주세요 : 가위
	// 컴퓨터는 [보]를 선택 했습니다.
	// 플레이어 승!
	// 현재 기록 : 1승 0무 0패

	// 2번째 게임
	// 가위/바위/보 중 하나를 입력 해주세요 : 보
	// 컴퓨터는 [보]를 선택 했습니다.
	// 비겼습니다.
	// 현재 기록 : 1승 1무 0패

	// 3번째 게임
	// 가위/바위/보 중 하나를 입력 해주세요 : 가위
	// 컴퓨터는 [바위]를 선택 했습니다.
	// 졌습니다ㅠㅠ
	// 현재 기록 : 1승 1무 1패

	public void RPSGame() {

		Scanner sc = new Scanner(System.in);

		System.out.println("[가위 바위 보 게임]");
		System.out.print("몇 판? : ");
		int round = sc.nextInt();

		// 승패 기록용 변수
		int win = 0;
		int draw = 0;
		int lose = 0;

		// 입력 받은 판 수 만큼 반복
		for (int i = 1; i <= round; i++) {

			System.out.print("\n" + i + "번째 게임" + " ");

			System.out.print("가위/바위/보 중 하나를 입력해주세요 : ");

			String input = sc.next(); // 플레이어가 가위/바위/보 입력

			// 컴퓨터가 가위/바위/보 정하기(랜덤)
			// 1) 1~3 사이 난수 생성
			// 2) 1이면 가위, 2이면 바위, 3이면 보 지정

			// 난수 생성 방법 : Math.random()
			// > 0.0 이상 1.0 미만의 난수가 생성됨

			int random = (int) (Math.random() * 3 + 1);
			// 0.0 <= x < 1.0
			// 0.0 <= x * 3 < 3.0
			// 1.0 <= x * 3 + 1 < 4.0
			// 1 < = (int)(x * 3 + 1) < 4
			// == 1이상 4미만의 정수 == 1 2 3

			String com = null; // 컴퓨터가 선택한 가위/바위/보를 저장하는 변수
			// null : 아무것도 참조하고 있지 않음.

			switch (random) {
			case 1:
				com = "가위";
				break;
			case 2:
				com = "바위";
				break;
			case 3:
				com = "보";
				break;
			}

			// 컴퓨터는 [바위]를 선택했습니다.
			System.out.printf("컴퓨터는 [%s]를 선택했습니다.\n", com);

			// The local variable com may not have been initialized

			// 컴퓨터와 플레이어(기준) 가위 바위 보 판별
			// win, draw, lose

			// String 비교 시 equals() 사용!!!
			if (input.equals(com)) { // 비긴경우
				System.out.println("비겼습니다.");
				draw++;
			} else {

				boolean win1 = input.equals("가위") && com.equals("보");
				boolean win2 = input.equals("바위") && com.equals("가위");
				boolean win3 = input.equals("보") && com.equals("바위");

				if (win1 || win2 || win3) {
					System.out.println("플레이어 승!");
					win++;
				} else {
					System.out.println("졌습니다ㅠㅠ");
					lose++;
				}
//				if(input.equals("가위") && com.equals("보"));
			} // else 끝
			System.out.printf("현재 기록 : %d승 %d무 %d패\n", win, draw, lose);

		}

	}

}
