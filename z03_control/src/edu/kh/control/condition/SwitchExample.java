package edu.kh.control.condition;

import java.util.Scanner;

public class SwitchExample {

	/*
	 * switch문 - 식 하나의 결과로 많은 경우의 수를 처리할 때 사용하는 조건문 > 식의 결과로 얻은 값과 같은 case 구문이 수행된다.
	 * 
	 * [작성법]
	 * 
	 * switch(식) {
	 * 
	 * case 결과값1 : 수행코드1; break; case 결과값2 : 수행코드2; break; case 결과값3 : 수행코드3; break;
	 * ... default : case를 모두 만족하지 않을 경우 수행하는 코드
	 * 
	 * }
	 */

	public void ex1() {
		// 키보드로 정수를 입력 받아
		// 1 이면 "빨강색"
		// 2 이면 "주황색"
		// 3 이면 "노란색"
		// 4 이면 "초록색"
		// 1~4 사이 숫자가 아니면 "흰색" 출력

		Scanner sc = new Scanner(System.in);
		// System.in : 키보드 입력
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		String result;

		/*
		 * if(input == 1) { result = "빨강색";
		 * 
		 * }else if (input == 2) { result = "주황색";
		 * 
		 * }else if (input == 3) { result = "노란색";
		 * 
		 * }else if (input == 4) { result = "초록색";
		 * 
		 * }else { result = "흰색"; } System.out.println(result);
		 */

		// 여러 값이 나오는 식
		switch (input) {

		case 1:
			result = "빨강색";
			break;
		// input에 입력된 값이 1인 경우(case)
		// result 변수에 "빨강색"을 대입하고 switch 문을 멈춤(break)

		case 2:
			result = "주황색";
			break;
		case 3:
			result = "노란색";
			break;
		case 4:
			result = "초록색";
			break;

		default:
			result = "흰색";
			break;
		// default == 기본값
		}

		System.out.println(result);

	}

	public void ex2() {
		// 정수를 입력 받아 4팀으로 나누기
		// 1번 백팀
		// 2번 백팀
		// 3번 백팀
		// 4번 백팀
		// 그 외에 흑팀

		Scanner sc = new Scanner(System.in);
		System.out.print("번호 입력 : ");
		int input = sc.nextInt();
		String team;

		switch (input % 4) { // 1, 2, 3, 0

		case 1:
			team = "백팀";
			break;
		case 2:
			team = "홍팀";
			break;
		case 3:
			team = "청팀";
			break;
		default:
			team = "흑팀";
			break;

		}
		System.out.println(team + "입니다.");

	}

	public void ex3() {

		// switch문에서 break의 역할

		// 달(month) 입력 시 계절 판별(switch 버전)

		Scanner sc = new Scanner(System.in);
		System.out.print("달(월) 입력 : ");

		int month = sc.nextInt();

		String season;

		switch (month) {

		case 12:
		case 1:
		case 2:
			season = "겨울";
			break;
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;

		default:
			season = "계절이 아닙니다.";
			break;
		}
		System.out.println(season + "입니다.");
	}

	public void ex4() {

		// switch 식의 결과값이 정수가 아닌 경우

		// 정수 2개와 연산자(+ - * / %) 1개를 입력 받아서 결과 출력

		// ex)
		// 정수 1 입력 : 5
		// 연산자 입력 : +
		// 정수 2 입력 : 2

		// 계산 결과 : 5 + 2 = 7

		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();

		System.out.print("연산자 입력 : ");
		// sc.nextChar() : 스캐너는 문자 하나(char)를 입력 받는 기능이 별도로 없음

		String op = sc.next(); // 다음 입력되는 한 단어(String) 읽어오기

		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();

		// case에 작성되는 값은 switch 식의 결과 값 자료형의 리터럴 표기법이다.
		switch (op) {
		case "+":
			System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
			break;
		case "-":
			System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
			break;
		case "*":
			System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
			break;
		case "/":

			if (num2 == 0) { // 오류거 발생되는 경우
				System.out.println("0으로 나눌 수 없습니다.");
			} else {
				System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
			}
			break;

		case "%":

			if (num2 == 0) {
				System.out.println("0으로 나머지를 구할 수 없습니다.");
			} else {

				System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2);
			}

			break;

		// %는 %한번 더 써야한다.

		default:
			System.out.println("존재하지 않는 연산자 입니다.");

		}

	}

}
