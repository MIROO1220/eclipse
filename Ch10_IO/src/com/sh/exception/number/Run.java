package com.sh.exception.number;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {

		Run r = new Run();
		r.test();
	}

	private void test() {
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수1 입력 : ");
			int input1 = sc.nextInt();
			
			System.out.print("정수2 입력 : ");
			int input2 = sc.nextInt();
			
			NumberProcess np = new NumberProcess();
			if(np.checkDouble(input1, input2)) {
				System.out.printf("%d는 %d의 배수다", input1, input2);
			} else {
				System.out.printf("%d는 %d의 배수가 아니다", input1, input2);
			}
			
		} catch(NumberRangeException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
