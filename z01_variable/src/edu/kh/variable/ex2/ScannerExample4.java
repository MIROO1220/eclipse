package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 1 : ");
		String input = sc.next() + " "; // 띄어쓰기 추가
					// 안녕
		System.out.println(input);
		
		System.out.print("입력 2 : ");
		input = input + sc.next() + " ";
			// 안녕_반가워
		// 대입 연산자(=) : 오른쪽에 작성된 값을 왼쪽 변수에 대입
		System.out.println(input);
		
		System.out.print("입력 3 : ");
		input = input + sc.next();
		
		System.out.println(input);
		
		// 누적 효과 (변수의 재사용성)
	}
	

}






















