package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1) next() : 한 단어(띄어쓰기, 엔터를 만나면 입력 종료)
		//    nextLine() : 한 문장(엔터를 만나면 입력 종료)
		
		System.out.print( "입력 : ");
		String str = sc.nextLine();
		
		System.out.println( str ); // next() : hello
								   // nextLine() : hello world
		
		// 2) 스캐너 입력 버퍼와 nextXXX의 의미
		
		// 입력 -> 입력 버퍼에 저장 -> nextXXX() 통해 버퍼 내용을 읽어옴
		
		// 			         입력버퍼			   nextXXX()		후처리
		// nextLine() : hello world(엔터) -> hello world(엔터) -> 엔터 제거
		// nextInt()  : 	 100(엔터)	 ->    	 100		
		
		// *** next(), nextDouble(), nextInt() 등
		// 	   모두 입력 버퍼에서 (엔터)를 제외하고 내용만 읽어옴 ***
		
		System.out.println("------------------------------");
		
		System.out.print( "nextInt() : " ); // 입력 버퍼 : [ 100(엔터) ]
		int a = sc.nextInt();
		// 100     // 입력버퍼 : [ (엔터) ]
		
		sc.nextLine(); // 입력 버퍼 : [ ]
		
		System.out.print( "nextLine() : " ); // 입력 버퍼 : [ a b c (엔터) ]
		String s = sc.nextLine();
		// a b c      // 입력버퍼 : [ ]
		
		System.out.println( "종료" );
		
		// [문제점]
		// nextInt() 이후 입력 버퍼에 남아있는 (엔터) 때문에
		// 다음 nextLine() 수행 시 버퍼에 남아있는 (엔터)를 읽어버리기 때문에
		// 추가적인 입력을 시도하지 못하고 다음 코드로 넘어가는 문제 발생
		
		// [해결방법]
		// 입력을 위한 nextLine() 수행 전
		// 입력 버퍼에서 (엔터)를 제거
		// -> 빈 공간에 sc.nextLine() 구문을 한번 작성하면 (엔터)가 제거됨
	}

}











