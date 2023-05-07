package com.sh.exception.number;

public class NumberProcess {
	
	public NumberProcess() {}
	
	// 임의의 정수 두개를 전달받아, 첫번째수가 두번째수의 배수인지 확인하고,
	// 배수가 밪으면 true를 리턴하고, 아니면 false를 리턴함
	public boolean checkDouble(int a, int b) {
		if((a<1 || a>100) || (b<1 || b>100))
			throw new NumberRangeException("1부터 100사이의 값이 아닙니다.");
		
		if(a%b == 0) {
			return true;
		} else {
			return false;
		}
	}

}
