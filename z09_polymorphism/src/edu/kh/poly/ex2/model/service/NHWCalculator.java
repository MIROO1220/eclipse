package edu.kh.poly.ex2.model.service;

import edu.kh.poly.ex2.model.vo.Animal;
import edu.kh.poly.ex2.model.vo.Person;

public class NHWCalculator implements Calculator {

	// extends : 확장하다, implement : 구현하다
	
	// (부)클래스 - (자식)클래스 상속 시에는 extends (추상 클래스도 포함)
	
	// (부)인터페이스 - (자)클래스 상속 시 implement
	
	@Override
	public int plus(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int minus(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public int multiple(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public double divide(int num1, int num2) {
		return num1 / num2;
	}

	
}
