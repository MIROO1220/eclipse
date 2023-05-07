package com.sh.exception.charcheck;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {

		Run r = new Run();
		r.test1();
	}

	/**
	 * - 사용자입력값을 받기
	 * - CharacterProcess#countAlpha 메소드 호출. 사용자입력값 전달
	 * - 알파벳개수를 출력
	 * */
	private void test1() {
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("문자열 입력 : ");
			String input = sc.nextLine(); // .next()를 사용하면 공백 포함x
			
			CharacterProcess cp = new CharacterProcess();
			int count = cp.countAlpha(input);
			System.out.printf("입력하신 문자열 [%s]에서 알파벳의 개수는 %d개 입니다.", input, count);
			
		} catch(CharCheckException e) {
			System.err.println(e.getMessage());
		}		
	}

}
