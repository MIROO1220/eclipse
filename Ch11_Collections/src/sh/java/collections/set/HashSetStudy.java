package sh.java.collections.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import sh.java.collections.student.Student;

public class HashSetStudy {

	public static void main(String[] args) {
		HashSetStudy study = new HashSetStudy();
//		study.test1();
//		study.test2();
//		study.test3();
//		study.test4();
//		study.test5();
//		study.test6();
		study.test7();
		study.test8();
	}

	/**
	 * @실습문제 : Lotto 생성
	 * - 중복없는 1~45사이의 숫자 6개를 생성하고, 오름차순 정렬해서 출력
	 * */
	private void test8() {
		Set<Integer> lotto = new TreeSet<>();
		
		while(lotto.size()<6) {
			int n = (int)(Math.random()*45)+1;
			lotto.add(n);
		}
		System.out.println(lotto);
	}

	/**
	 * @실습문제 : 다음 문자열을 List를 생성한후, 대문자로 변환, 중복을 제거하세요.
	 * - abc, ABC, xyz, Java, code, happy, dinner, good, java, XYZ
	 * - 대문자로 변환 String#toUpperCase
	 * */
	private void test7() {
		List<String> list = new ArrayList<>();
		list.add("abc");
		list.add("ABC");
		list.add("xyz");
		list.add("Java");
		list.add("code");
		list.add("happy");
		list.add("dinner");
		list.add("good");
		list.add("XYZ");
		
		Set<String> set = new HashSet<>();
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			set.add(str.toUpperCase());
		}
		System.out.println(set);
	}


	/**
	 * LinkedHashSet 저장된 순서 유지
	 * TreeSet 기본정렬 지원
	 * */
	private void test6() {
//		Set<String> set = new LinkedHashSet<>();
		Set<String> set = new TreeSet<>();
		set.add("홍길동");
		set.add("신사임당");
		set.add("유관순");
		
		System.out.println(set);
	}


	/**
	 * 커스텀클래스의 중복관리
	 * - equals/ hashCode를 모두 오버라이드해야 한다.
	 * - 자바객체관리 룰 : equals의 결과가 true라면 hashcode도 동일해야한다.
	 * */
	private void test5() {
		// no, name필드값이 같다면 equals결과는 true
		System.out.println(new Student(2, "신사임당").equals(new Student(2, "신사임당")));
		// no, name필드 기준으로 hashCode 재생성 (no, name필드가 같다면 동일한 hashCode를 가진다.)
		System.out.println(new Student(2, "신사임당").hashCode());
		System.out.println(new Student(2, "신사임당").hashCode());
		
		Set<Student> studentSet = new HashSet<>();
		studentSet.add(new Student(1, "홍길동"));
		studentSet.add(new Student(2, "신사임당"));
		studentSet.add(new Student(3, "이순신"));
		studentSet.add(new Student(2, "신사임당"));
		
		System.out.println(studentSet);
	}


	/**
	 * List <---> Set
	 * - List의 중복된 요소를 제거하기 위해 Set으로 변환
	 * - Set에 순서나 정렬기능이 필요한 경우 List로 변환
	 * */
	private void test4() {
		List<String> nameList = new ArrayList<>();
		nameList.add("홍길동");
		nameList.add("신사임당");
		nameList.add("홍길동");
		nameList.add("이순신");
		System.out.println(nameList);
		
		Set<String> nameSet = new HashSet<>(nameList);
		System.out.println(nameSet);
		
		List<String> nameList2 = new ArrayList<>(nameSet);
		nameList2.sort(null);
		System.out.println(nameList2);
	}


	/**
	 * 요소 순회
	 * - forEach
	 * - Iterator
	 * */
	private void test3() {
		Set<Double> set = new HashSet<>();
		set.add(1.2);
		set.add(7.3);
		set.add(3.5);
		set.add(9.9);
		
		// forEach문
		for(Double d : set) {
			System.out.println(d);
		}
		
		// Iterator 객체
		Iterator<Double> iter = set.iterator();
		while(iter.hasNext()) {
			Double elem = iter.next();
			System.out.println(elem);
		}
	}


	/**
	 * Set API
	 * */
	private void test2() {
		Set<String> set = new HashSet<>();
		
		// 요소추가
		set.add("홍길동");
		set.add("신사임당");
		set.add("신사임당");
		set.add("신사임당");
		set.add("이순신");
		
		// 요소제거
		set.remove("이순신"); // 제거할 요소를 전달
		
		// 요소포함 여부
		System.out.println(set.contains("이순신"));
		System.out.println(set.contains("신사임당"));
		
		// 전체제거
		set.clear();
		
		// 비어있는지 여부
		System.out.println(set.isEmpty());
		
		System.out.println(set);
	}


	/**
	 * Set 중복을 허용하지 않는 컬렉션
	 * 
	 * 구현클래스
	 * - HashSet
	 * - LinkedHashSet : 저장한 순서 유지
	 * - TreeSet : 기본정렬 지원 (Comparable 인터페이스 구현 필수)
	 * */
	private void test1() {
		HashSet<String> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		Collection<Double> set3 = new HashSet<>();

		set2.add(3);
		set2.add(5);
		set2.add(7);
		set2.add(1);
		set2.add(3);
		set2.add(5);
		
		// set2.add(2, 100); // set은 인덱스기반으로 관리하지 않는다.
		// set2.get(2);
		
		System.out.println(set2);
	}

}
