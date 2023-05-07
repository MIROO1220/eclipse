package com.sh.exception.charcheck;

import java.util.Scanner;

public class CharacterProcess {
	
	
	public CharacterProcess() {}
	
	// 전달된 문자열값에서 영문자가 몇개인지 카운트해서 리턴
//	public int countAlpha(String s) {
//		int count = 0;
//		
//		for(int i=0; i<s.length(); i++) {
	
			// char ch = s.charAt(i);
			// if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
			// if(isUpperCase(ch) || isLowerCase(ch))
			// if(isAlphabetic(ch))
	
//			if(s.charAt(i) == ' ')
//				throw new CharCheckException("체크할 문자열 안에 공백 포함할 수 없습니다.");
//			
//			if((65<=s.charAt(i) && s.charAt(i)<=90) ||
//					(97<=s.charAt(i) && s.charAt(i)<=122))
//				count++;
//		}
//		return count;
//	}

	public boolean isAlphabetic(char ch) {
		return isUpperCase(ch) || isLowerCase(ch);
	}
	
	public boolean isUpperCase(char ch) {
		return (ch >= 'A' && ch <= 'Z');
	}
	
	public boolean isLowerCase(char ch) {
		return (ch >= 'a' && ch <= 'z');
	}
	
	
	/**
	 * 전달된 문자열에서 알파벳(소문자/대문자)의 개수를 세어서 반환
	 * */
	public int countAlpha(String s) {
		// 문자열 메소드 string.indexOf(검사문자열)은 검사문자열의 index를 리턴한다.
		// string내에 검사문자열이 존재하지 않으면 -1을 리턴한다.
		if (s.indexOf(" ") > -1) // 공백이 존재한다면
			throw new CharCheckException("체크할 문자열 안에 공백 포함할 수 없습니다.");

		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {

			if (Character.isUpperCase(s.charAt(i)) || Character.isLowerCase(s.charAt(i)))
				cnt++;
		}
		return cnt;
	}
	
}

// ** indexOf() **
// indexOf() 는 특정 문자나 문자열이 앞에서부터 처음 발견되는 인덱스를 반환하며,
// 만약 찾지 못했을 경우 "-1"을 반환
// .indexOf( "찾을 특정 문자" , "시작할 위치" ) 이런식으로 사용해 주면된다.
// "시작할 위치" 같은경우는 생략이 가능하며 생략할 경우 0번째 즉 처음부터 찾기 시작

// ** Character.isUpperCase() **
// 문자가 대문자인지 판단해 true 또는 false 값을 리턴
// ** Character.isLowerCase() **
// 문자가 소문자인지 판단해 true 또는 false 값을 리턴