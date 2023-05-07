package test;

import java.util.Arrays;

/**
 * 프로그램 시작시 사용자로부터 입력값 받기
 * - 프로그램 시작시 전달한 값은 공백을 기준으로 parsing되어 main메소드의 args매개변수에 전달된다.
 * */
public class Test {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(args));
		
		String arg1 = args[1];
		String arg2 = args[2];
		String arg3 = args[3];
		System.out.println(arg3);
			
	}

}
