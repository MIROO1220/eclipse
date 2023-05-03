package edu.kh.control.practice;

import java.util.Iterator;
import java.util.Scanner;

public class LoopPractice {
	/*
	 * 다음과 같은 실행 예제를 구현하세요 ex. 정수 입력 : 4
	 *
	 **
	 *** 
	 **** 
	 */
	public void practice() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		for (int x = 1; x <= input; x++) {

			// 1) for문 하나 더 작성
			// * 1개 출력 전에 띄어쓰기 3번
			// * 2개 출력 전에 띄어쓰기 2번
			// * 3개 출력 전에 띄어쓰기 1번
			// * 4개 출력 전에 띄어쓰기 0번

			// i == 4 3 2 1

			/*
			 * for(int i = 1; i <= input - x; i++) { System.out.println(" "); } for(int j =
			 * 1; j <= x; j++) System.out.print("*");
			 */
			// 2) for + if else
			for (int i = 1; i <= input; i++) {
				if (i <= input - x) {
					System.out.print(" ");
				} else {

					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		// 위쪽 삼각형
		for (int x = 1; x <= input; x++) {

			for (int i = 1; i <= x; i++) {
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈
		}

		// 아랫쪽 삼각형
		for (int y = input - 1; y >= 1; y--) {

			for (int i = 2; i <= y; i++) {
				System.out.print("*");
			}
			System.out.println("*");
		}

	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		// row : 행 (줄)
		// col(column) : 열 (칸)

		for (int row = 1; row <= input; row++) {

			for (int col = 1; col <= input; col++) {
				// row 또는 col이 1또는 input인 경우 * 출력
				// == 테두리

				if (row == 1 || row == input || col == 1 || col == input) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}
}
