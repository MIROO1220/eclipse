package sh.java.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Exception
 * - 프로그램 실행 중 오류가 발생했으나, 예외처리(try...catch)에 의해서 수습될 수 있는 미약한 오류.
 * - Unchecked Exception - 컴파일타임에 확인불가한 예외. 예외처리를 강제화하지 않음.
 *   - RuntimeException 클래스와 그 후손 클래스 모두
 * - Checked Exception - 컴파일타임에 확인가능한 예외. 예외처리를 강제화. 예외처리를 안하면 컴파일오류 발생
 * - 두 타입의 예외 모두 발생시 예외처리가 안되면 프로그램은 비정상 종료된다.
 * */
public class ExceptionStudy {

	public static void main(String[] args) {
		System.out.println("---- 시작 ----");
		
		ExceptionStudy study = new ExceptionStudy();
//		study.test1();
//		study.test2();
//		study.test3();
//		study.test4();
		study.test5();
		
		System.out.println("---- 끝 ----");
	}
	
	
	/**
	 * @실습문제 : 사용자로부터 2개의 정수를 받아서 합을 출력하는 코드를 작성
	 * - 사용자가 정수가 아닌 문자열을 입력한 경우, 잘못 입력하셨습니다. 출력 후 종료되어야 함*/
	private void test5() {
		
		while(true) {
			
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("정수1 입력 : ");
				int input1 = sc.nextInt();
				
				System.out.print("정수2 입력 : ");
				int input2 = sc.nextInt();
				
				System.out.printf("%d + %d = %d\n", input1, input2, input1+input2);
				break; // 정상처리시 반복문 종료
			} catch (Exception e) {
				System.out.println("잘못 입력하셨습니다.");
			}
			
		}
		
	}


	/**
	 * catch절의 다형성 (부모타입의 변수를 통해 자식객체를 제어)
	 * - 예외객체의 부모자식 관계를 고려해 다형성을 적용
	 * - 자식/부모타입의 예외를 동시에 여러개 작성하는 경우, 자식-부모 타입순으로 catch절을 작성해야한다.
	 * */
	private void test4() {
		try {
			Random rnd = new Random();
			int n = rnd.nextInt(4); // 3가지 경우의 정수형 난수를 반환. 0 1 2
			// int n = new Random().nextInt(3); -> 한번 쓰고 버릴 때 보통 사용
			System.out.println(n);
			
			switch(n) {
			case 0:
				System.out.println(100/0);
				break;
			case 1:
				String s = null;
				System.out.println(s.length());
				break;
			case 2:
				int[] arr = new int[3];
				System.out.println(arr[100]);
				break;
			default:
				System.out.println("Lucky~");
			}
			
		} catch (NullPointerException e) {
			System.out.println("null null null~");
		} catch (Exception e) {
			e.printStackTrace();
		}
			
//		} catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//		} catch (ArithmeticException e) {
//			e.printStackTrace();
//		} catch (NullPointerException e) {
//			e.printStackTrace();
//		}
	}


	/**
	 * try...catch 처리흐름
	 * */
	private void test3() {
		System.out.println(1);
		try {
			System.out.println(2);
			
//			System.out.println(100/0);
			
			System.out.println(3);
			
			if(true)
				return; // 현재 실행중인 메소드를 종료하고, 현재 메소드의 호출부로 돌아간다.
			
		} catch (ArithmeticException e) {
			System.out.println(4);
		} finally {
			// 예외가 발생유무와 관계없이 실행되는 구문
			// 메모리 자원반납 등을 작성
			// try절의 조기리턴시에도 실행
			System.out.println("*");
		}
		System.out.println(5);
	}


	/**
	 * catch 예외처리절에서도 예외로그, 예외메세지등 확인이 가능하다.
	 * */
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		
		int num = 0;
		
		try {
			num = sc.nextInt();
			
		} catch (InputMismatchException e) {
			System.out.println("올바른 정수를 입력해주세요.");
			System.out.println(e.getMessage()); // 예외메세지
			e.printStackTrace(); // 호출스택 출력
		}
		System.out.printf("[%d]를 입력하셨습니다.\n", num);
	}
	
	
	/**
	 * ArithmeticException, InputMismatchException등의 예외는 try...catch 예외처리절에 의해 정상적으로 복구될 수 있다.
	 * */
	public void test1() {
		try {
			// unchecked exception
//			System.out.println(10/0); // java.lang.ArithmeticException: / by zero
//										     throw exception class		exception message
			// unchecked exception
			String str = null;
			System.out.println(str.length()); // java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
			
			// checked exception
			FileReader fr = new FileReader("hello.txt"); // FileNotFoundException은 checked exception이라 예외처리 강제화.
			
		} catch (ArithmeticException e) {
			// ArithmeticException가 발생하면 이 catch절에 의해서 예외처리되고, 프로그램은 이후 정상적으로 실행된다.
			System.out.println("ArithmeticException이 발생했음(던져졌음)!");
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException이 발생했음");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException이 발생했음");
		}
	}
	
}
