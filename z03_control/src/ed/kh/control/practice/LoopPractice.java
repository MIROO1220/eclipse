package ed.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	
	/*
	 * 다음과 같은 실행 예제를 구현하세요
	 * ex.
	 * 정수 입력 : 4
	 *    *
	 *   **
	 *  ***
	 * ****  
	 */
	
	public void ex1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print( "정수 입력 : " );
		int input = sc.nextInt();
		
		for(int x = 1; x <= input; x++) {
			
			// 1) for문 하나 더 작성
			// * 1개 출력 전에 띄어쓰기 3번
			// * 2개 출력 전에 띄어쓰기 2번
			// * 3개 출력 전에 띄어쓰기 1번
			// * 4개 출력 전에 띄어쓰기 0번
			
			// i == 4 3 2 1
			
			/*
			for(int i = 1; i <= input - x; i++) {
				System.out.print( " " );
			}
			for(int j = 1; j <= i; j++) {
				System.out.print( "*" );
			}
			*/
			
			// 2) for + if else
			for(int i=1; i<=input; i++) {
				
				if( i <= input - x ) {
					System.out.print( " " );
				}else {
					System.out.print( "*" );
				}
			}
			System.out.println();
			
		}
	}
	
	
	// 정수 입력 : 
	// *
	// **
	// ***
	// **
	// *
	public void ex2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print( "정수 입력 : " );
		int input = sc.nextInt();
		
		for(int i=1; i<=input; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=input-1; i>=1; i--) {
			for(int j=i; j>=1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	// 정수 입력 : 4
	//	  *
	//   ***
	//  *****
	// *******
	public void ex3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print( "정수 입력 : " );
		int input = sc.nextInt();
		
		for(int x=1; x<=input; x++) { // 입력 받은 input 만큼 줄 출력
			
			// 공백 출력 for문
			for(int i=input-x; i>=1; i--) {
				System.out.print( " " );
			}
			
			// 별 출력 for문
			// -> 1, 3, 5, 7, 9
			for(int i=1; i<=2*x-1; i++) {
				System.out.print( "*" );
			}
			
			System.out.println();
			
		}
		
}
	
	
	// 정수 입력 : 5
	// *****
	// *   *
	// *   *
	// *   *
	// *****
	public void ex4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print( "정수 입력 : " );
		int input = sc.nextInt();
		
		// row : 행 (줄)
		// col(colunm) : 열 (칸)
		
		for(int row=1; row<=input; row++) {
			
			for(int col=1; col<=input; col++) {
				// row 또는 col이 1 또는 input인 경우 * 출력
				
				// == 테두리
				if( row==1 || row==input || col==1 || col==input ) {
					System.out.print( "*" );
				}else { // 내부
					System.out.print( " " );
				}
				
			}
			System.out.println();
		}
		
	}
}




















