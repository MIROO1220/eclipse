package edu.kh.exception.test;

import java.util.Scanner;

public class ExceptionTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print( "정수 입력(0 입력시 종료) : " );
			int input = sc.nextInt();
			
			int a = (int)99.9; // 자료형이 맞지 않아 연산을 못해서 "컴파일 에러"(코드 틀림)
						  // 코드로 수정 가능!
						  // 1) 변수 자료형을 double
						  // 2) (int)99.9 강제 형변환
						  // 3) 99.9 -> 99 또는 100 변경
			
			if(input==0) {
				break;
			}
		}
		
		// 런타임 에러 예제
		// 런타임 에러 : 프로그램 수행 중 발생하는 에러
		//  			 주로 if문으로 처리 가능
		
		int[] arr = new int[3]; // 인덱스 2 까지
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		if( arr.length >= 3 ) { // 배열 인덱스 범위 초과 시
			System.out.println( "배열 범위를 초과했습니다." );
		}else {
			arr[3] = 40;
		}
		
		// java.lang.ArrayIndexOutOfBoundsException : 배열 범위 초과 예외
	}

}

















