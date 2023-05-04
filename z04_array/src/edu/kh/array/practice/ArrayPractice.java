package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	// 길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
	// 순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
	// 짝수 번째 인덱스 값의 합을 출력하세요. (0번째 인덱스는 짝수로 취급)
	
	/*
	 * [실행화면]
	 * 
	 *  1 2 3 4 5 6 7 8 9 
	 *  짝수 번째 인덱스 합 : 25
	 *  
	 *  */
	public void pra1() {
		
//		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//		
//		int sum = 0;
//		
//		for(int i=0; i<arr.length; i++) {
//			System.out.print( " " + arr[i] + " " );
//			
//			if( i % 2 == 0 ) {
//				sum += arr[i];
//			}
//		}
//		System.out.println( "\n짝수 번째 인덱스 합 : " + sum );
		
		int[] arr = new int[9];
		
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			
			System.out.print( arr[i] + " ");
			
			if( i % 2 == 0 ) {
				sum += arr[i];
			}
		}
		System.out.println( "\n짝수 번째 인덱스 합 : " + sum );
	}
	
	
	// 길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여
		// 순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
		// 홀수 번째 인덱스 값의 합을 출력하세요. (0번째 인덱스는 짝수로 취급)
		
		/*
		 * [실행화면]
		 * 
		 *  9 8 7 6 5 4 3 2 1 
		 *  홀수 번째 인덱스 합 : 20
		 *  
		 *  */ 
	public void pra2() {
		
//		int[] arr = new int[9];
//		
//		int sum = 0;
//		
//		for(int i=arr.length; i>0; i--) {
//			arr[i-1] = i;
//			System.out.print( " " + arr[i-1] + " " );
//			
//			if( i % 2 != 0 ) {
//				sum += arr[i-1];
//			}
//		}
//		System.out.println( "\n홀수 번째 인덱스 합 : " + sum );
		
		int[] arr = new int[9];
		
		int sum = 0;
		
		int num = 9;
		
		for(int i=0; i<arr.length; i++) {
			// arr[i] = 9-i;
			arr[i] = num;
			num--;
			
			if( i % 2 != 0 ) {
				sum += arr[i];
			}
			System.out.print( " " + arr[i] + " ");
		}
		System.out.println( "\n홀수번째 인덱스 합 : " + sum );
	}
	
	
	// 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
	// 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요
	/*
	 * [실행화면]
	 * 
	 * 양의 정수 : 5
	 * 1 2 3 4 5 
	 * 
	 * */
	public void pra3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print( "양의 정수 : " );
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = i+1;
			System.out.print( " " + arr[i] + " " );
		}
			
		}
	
	
	// 정수 5개를 입력 받아 배열을 초기화 하고
	// 검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력
	// 배열에 같은 수가 없을 경우 "일치하는 값이 존재하지 않습니다.: 출력
	public void pra4() {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print( "입력 " + i + " : " );
			arr[i] = sc.nextInt();
		}
		
		System.out.print( "검색할 값 : " );
		int input = sc.nextInt();
		
		boolean flag = false; // 일치하는 값 없음
		
		for(int i=0; i<arr.length; i++) {
			
			if( input == arr[i] ) {
				System.out.printf( "인덱스 : %d", i);
				flag = true;
			}
			
		}
		if( !flag ) {
			System.out.println( "일치하는 값이 존재하지 않습니다." );
		}
	}
	
	
	// 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
	// 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
	public void pra5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print( "문자열 : " );
		String input = sc.next();
		
		char[] arr = new char[input.length()]; // 입력 받은 문자열 길이 만큼의 배열 생성
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = input.charAt(i); // 입력 받은 문자열에서 i번째 인덱스 문자를 arr[i]에 대입
		}
		
		System.out.print( "문자 : " );
		char ch = sc.next().charAt(0); // 입력 받은 문자열에서 0번 인덱스 문자를 반환
		// String -> char
		
		int count = 0; // input에 일치하는 ch가 몇개 있는지 카운트하는 변수
		
		System.out.print(input + "에 " + ch + " 가 존재하는 위치(인덱스) : ");
		
		for(int i=0; i<arr.length; i++) {
			if( ch == arr[i] ) { // 검색 조건
				System.out.print( i + " " );
				count++;
			}
		}
		System.out.println( "\n" + ch + "개수 : " + count);
	}
	
	
	// 사용자가 배열의 길이를 직접 입력하여
	// 그 값만큼 정수형 배열을 선언 및 할당하고
	// 배열의 크기만큼 사용자가 직접 값을 입력하여
	// 각각의 인덱스에 값을 초기화 하세요.
	// 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
	
	/*
	 * [실행화면]
	 * 정수 : 5
	 * 배열 0번째 인덱스에 넣을 값 : 4
	 * 배열 1번째 인덱스에 넣을 값 : -4
	 * 배열 2번째 인덱스에 넣을 값 : 3
	 * 배열 3번째 인덱스에 넣을 값 : -3
	 * 배열 4번째 인덱스에 넣을 값 : 2
	 * 4 -4 -3 2
	 * 총합 : 2
	 * 
	 * */
	
	public void pra6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print( "정수 : " );
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		int sum = 0;
		String value = "";
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf( "배열 %d번째 인덱스에 넣을 값 : ", i );
			arr[i] = sc.nextInt();
			sum += arr[i];
			value += arr[i] + " ";
		}
		
		System.out.println( value );
		System.out.println( "\n총합 : " + sum );
		
		}
	
	
	
	// 주민등록번호 번호를 입력 받아 char 배열에 저장한 후 출력하세요.
	// 단, char 배열 저장 시 성별을 나타내는 숫자 이후부터 *로 저장하세요.
	
	/*
	 * [실행화면]
	 * 주민등록번호(-포함) : 123456-1234567
	 * 123456-1******
	 * 
	 * */
	public void pra7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print( "주민등록번호(-포함) : " );
		String input = sc.next();
		
		char[] arr = new char[input.length()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = input.charAt(i);
			
			if( i > 7 ) {
				System.out.print( "*" );
			}else {
				System.out.print( arr[i] );
			}
			
		}
		
	}
	
	
	// 3이상인 홀수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
	// 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
	// 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 "다시 입력하세요."를 출력하고
	// 다시 정수를 받도록 하세요.
	
	/*
	 * [실행화면]
	 * 정수 : 4
	 * 다시 입력하세요.
	 * 정수 : -6
	 * 다시 입력하세요.
	 * 정수 : 5
	 * 1, 2, 3, 2, 1
	 * 
	 * */
	public void pra8() {
		
//		Scanner sc = new Scanner(System.in);
//	      
//	      int input = 0;
//	      
//	      do {
//	         
//	         System.out.print( "정수 : " );
//	         input = sc.nextInt();
//	         
//	         if( input % 2 == 0 || input < 3 ) {
//	            System.out.println( "다시 입력하세요." );
//	         }
//	         
//	      }while( input % 2 == 0 || input < 3 );
//	      
//	      int[] arr = new int[input];
//	      
//	      String value = "";
//	      
//	      for(int i=0; i<arr.length/2; i++) {
//	         arr[i] = i+1;
//	         value += arr[i] + " ";
//	      }
//	      
//	      for(int i=arr.length/2; i<arr.length; i++) {
//	         arr[i] = arr.length-i;
//	         value += arr[i] + " ";
//	      }
//	      
//	      System.out.println( value );
		
		Scanner sc = new Scanner(System.in);
		
		while( true ) {
			
			
		}
		
	}
	
	
	// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
	// 1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
	public void pra9() {
		
		int[] arr = new int[10];
		
		String value = "";
		
		for(int i=0; i<arr.length;i ++) {
			
			int random = (int)(Math.random()*arr.length+1);
			arr[i] = random;
			value += arr[i] + " ";
		}
		System.out.println( "발생한 난수 : " + value );
		
	}
	
	
	// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
	// 1~10 사이의 난수를 발생시켜 배열에 초기화 후
	// 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
	public void pra10() {
		
		int[] arr = new int[10];

		String value = "";
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			
			int random = (int)(Math.random()*arr.length+1);
			arr[i] = random;
			value += arr[i] + " ";
			
			if( max < arr[i] ) {
				max = arr[i];
			}
			
			if( min > arr[i] ) {
				min = arr[i];
			}
		}
		System.out.println( "발생한 난수 : " + value );
		System.out.println( "최대값 : " + max );
		System.out.println( "최소값 : " + min );
		
	}
	
	
	// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
	// 1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
	public void pra11() {
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			
			int random = (int)(Math.random()*arr.length+1);
			
			arr[i] = random;
			
			for(int j=0; j<i; j++) {
				
				if( random == arr[j] ) {
					i--;
					break;
				}
			}
			
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print( " " + arr[i] + " " );
		}
	}
	
	
	// 로또 번호 자동 생성기 프로그램을 만들기
	// (중복 값 없이 오름차순으로 정렬하여 출력하세요.)
	public void pra12() {
		
		int[] arr = new int[6];
		
		for(int i=0; i<arr.length; i++) {
			
			int random = (int)(Math.random()*45+1);
			
			arr[i] = random;
			
			for(int j=0; j<i; j++) {
				
				if( random == arr[j] ) {
					i--;
					break;
				}
			}
			
		}
		for(int i=0; i<arr.length; i++) {
			Arrays.sort(arr);
			System.out.print( " " + arr[i] + " " );
		}
	}
	
	
	// 문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
	// 문자의 개수와 함께 출력하세요.
	public void pra13() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print( "문자열 : " );
		String input = sc.nextLine();
		
		char[] arr = new char[input.length()];
		
		int count = 0; // 카운트용 변수
		
		System.out.print( "문자열에 있는 문자 : " );
		for(int i=0; i<arr.length; i++) {
			arr[i] = input.charAt(i); // 문자열 -> char 배열에 옮겨 담기
			
			// 중복 검사 + flag
			// application
			// 배열 : [a, p, p, l, i, c, a, t, i, o, n]
			// 화면 : a, p, l, i, c, t, o, n
			// 개수 : 1  2  3  4  5  6  7  8
			
			boolean flag = true; // 신호용 변수
			
			for(int j=0; j<i; j++) { // 중복 검사용 for문
				if( arr[i] == arr[j] ) {
					// 현재 대입된 문자가 앞서 대입된 문자와 같다면 == 중복
					flag = false; // 신호용 변수의 값을 false로 변경
					break;
				}
			}
			
			if( flag ) { // flag가 true인 경우 == 중복이 없었다라는 의미
				count++; // 카운트 1증가
				
				if( i == 0 ) { // 첫 바퀴인 경우
					System.out.print( arr[i] );
				}else { // 첫 바퀴가 아닌 경우
					System.out.print( ", " + arr[i] );
				}
			}
			
		} // 바깥쪽 for문 끝
		System.out.println( "\n문자 개수 : " + count );
		
	}
	
}
























