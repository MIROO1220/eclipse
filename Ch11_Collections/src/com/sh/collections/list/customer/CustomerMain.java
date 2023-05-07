package com.sh.collections.list.customer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomerMain {
	private List<Customer> list = new ArrayList<>();

	public static void main(String[] args) {
		CustomerMain main = new CustomerMain();
		main.test1();
		main.test2();
		main.test3();
		main.test4();
		main.test5();
	}

	private void test1() {
		this.list.add(new Customer("홍길동", 25, '남', 1250.5));
		this.list.add(new Customer("박문수", 33, '남', 3457.8));
		this.list.add(new Customer("김춘추", 38, '남', 2485.6));
		this.list.add(new Customer("신사임당", 43, '여', 2300.9));
		System.out.println("[문제1] " + this.list);
	}
	
	private void test2() {
		this.list.add(0, new Customer("이황", 66, '남', 9999.9));
		System.out.println("[문제2] " + this.list);
	}
	
	/**
	 * 고객이름 가나다순 (기본정렬) -> Customer implements Comparable<Customer> -> Comparable#compareTo 오버라이딩(고객이름)
	 */
	private void test3() {
		this.list.sort(null);
		System.out.println("[문제3] " + this.list);
	}
	
	/**
	 * 나이 오름차순 (기타정렬) -> Comparator<Customer> 구현클래스 작성 -> Comparator#compare 오버라이딩(나이 오름차순)
	 */
	private void test4() {
		this.list.sort(new Comparator<Customer>() {
			@Override
			public int compare(Customer o1, Customer o2) {
				return o1.getAge() - o2.getAge();
			}
		});
		System.out.println("[문제4] " + this.list);		
	}
	
	/**
	 * 포인트 내림차순 (기타정렬) -> Comparator<Customer> 구현클래스 작성 -> Comparator#compare 오버라이딩(포인트 내림차순)
	 */
	private void test5() {
		this.list.sort(new Comparator<Customer>() {
			
			@Override
			public int compare(Customer o1, Customer o2) {
				return (int) (o2.getPoint() - o1.getPoint());
			}
			
		});
		System.out.println("[문제5] " + this.list);		
	}

}
