 package com.sh.collections.list.book;

import java.util.ArrayList;
import java.util.List;

public class CustomerMain {

	public static void main(String[] args) {

		CustomerMain cm = new CustomerMain();
		cm.test1();
//		cm.test2();
//		cm.test3();
//		cm.test4();
//		cm.test5();
	}

	/**
	 * 포인트 내림차순 (기타정렬) -> Comparator<Customer> 구현클래스 작성 -> Comparator#compare 오버라이딩(포인트 내림차순)
	 * */
	private void test5() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 나이 오름차순(기타정렬) -> Comparator<Customer> 구현클래스 작성 -> Comparator#compare 오버라이딩(나이 오름차순)
	 * */
	private void test4() {
		// TODO Auto-generated method stub
		
	}

	/**고객이름 가나다순(기본정렬) -> Customer implements Comparable<Customer> -> Comparable#compareTo 오버라이딩(고객이름)
	 * */
	private void test3() {
		
	}

	private void test2() {
		
	}

	private void test1() {
		List<Customer> list = new ArrayList<>();
		
		list.add(new Customer("홍길동", 25, '남', 1250.5));
		list.add(new Customer("박문수", 33, '남', 3457.8));
		list.add(new Customer("김춘추", 38, '남', 2485.6));
		list.add(new Customer("신사임당", 43, '여', 2300.9));
		System.out.println(list);
	}
	

}
