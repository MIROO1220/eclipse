package sh.java.collections.list;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import sh.java.collections.student.Student;

public class ArrayListStudy {

	public static void main(String[] args) {
		ArrayListStudy study = new ArrayListStudy();
//		study.test1();
		study.test2();
//		study.test3();
//		study.test4();
//		study.test5();
//		study.test6();
//		study.test7();
	}
	

	/**
	 * LinkedList
	 * - 내부적으로 배열을 관리하지않고, 요소와 요소를 체인형식으로 연결해서 관리.
	 * - 중간에 요소를 삽입/삭제하는 일이 빈번하다면 ArrayList보다 LinkedList를 사용하는 것이 더 효율적!
	 * */
	private void test7() {
		List<Integer> list = new LinkedList<>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(1, 150);
		list.add(1, 125);
		
		System.out.println(list);
	}


	/**
	 * List 요소의 정렬
	 * - 저장된 순서가 바뀌므로 주의할 것
	 * 
	 * 기본정렬 (클래스당 1가지) - Comparable 인터페이스 구현
	 * 그외 정렬 (클래스당 n가지) - Comparator 인터페이스 구현클래스 작성 (익명클래스 작성도 가능)
	 * */
	private void test6() {
		List<Integer> list = new ArrayList<>();
		list.add(80);
		list.add(75);
		list.add(53);
		list.add(95);
		
		// 정수 정렬 (오름차순 : 기본값)
		list.sort(null); // 비교기준객체 전달 안함 -> 기본정렬
		list.sort(Collections.reverseOrder()); // 기본정렬 반대순서
		
		Collections.sort(list); // 기본정렬
		Collections.sort(list, Collections.reverseOrder()); // 기본정렬 반대순서
		
		System.out.println(list);
		
		List<Student> students = new ArrayList<>();
		students.add(new Student(30, "홍길동"));
		students.add(new Student(17, "신사임당"));
		students.add(new Student(55, "김삿갓"));
		students.add(new Student(27, "한미루"));
		
//		students.sort(null); // 기본정렬
//		students.sort(new StudentNameASC()); // 이름기준 오름차순 기타정렬
//		students.sort(Collections.reverseOrder(new StudentNameASC())); // 이름기준 내림차순
		
		students.sort(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		System.out.println(students);
		
	}

	/**
	 * List 열람
	 * - 일반 for문 // 인덱스 필요할때 사용
	 * - for each문
	 * - Iterator객체를 통한 반복처리
	 * */
	private void test5() {
		List<Double> list = new ArrayList<>();
		list.add(1.1);
		list.add(2.2);
		list.add(3.3);
		
		// for each문
		for(Double d : list) {
			System.out.println(d);
		}
		
		// Iterator 객체 : 다음요소를 가리키는 포인터를 가지고있다. next 호출 시 마다 다음 요소로 이동
		// Iterator객체 - 단방향 ListIterator - 왔다갔다
		Iterator<Double> iter = list.iterator();
		while(iter.hasNext()) { // 다음 접근할 요소가 존재하면 true, 더이상 요소가 존재하지 않으면 false
			Double d = iter.next();
			System.out.println(d);
		}
	}

	/**
	 * List API
	 * */
	private void test4() {
		List<Integer> list = new ArrayList<>();
		
		// 요소 추가
		list.add(10);
		list.add(20);
		
		// 요소 삽입
		list.add(1, 15); // index, 값
		list.add(2, 16);
		list.add(3, 17);
		list.add(4, 18);
		list.add(5, 19);
		
		// 요소 삭제
		list.remove(1); // 1번지 요소 삭제 & 뒤번지수의 요소를 하나씩 앞당기는 작업도 포함
		
		// 요소 검색
		System.out.println(list.indexOf(17)); // 해당요소의 번지수를 반환
		System.out.println(list.indexOf(10000)); // 값이 없다면 -1 반환
		
		System.out.println(list.contains(17)); // 존재하는지 boolean 반환 true
		System.out.println(list.contains(10000)); // false
		
		// 요소 대체
		list.set(2, 1700); // 인덱스, 새로운 값
		
		// 요소 전체 제거
		list.clear();
		
		// 요소가 0개인지 검사
		System.out.println("isEmpty : " + list.isEmpty()); // 비어있니?
		
//		System.out.println(list.size()); // 요소의 개수
		
		// 반복처리
		for(int i=0; i<list.size(); i++) {
			Integer num = list.get(i);
			System.out.println(i + " : " + num);
		}
	}


	/**
	 * Generics 타입제한
	 * - 요소를 추가할때 해당 타입만 추가할 수 있다.
	 * - 요소를 꺼내면 Object가 아닌 해당타입의 값이 바로 나온다.
	 * - 기본형은 요소로 사용할 수 없으므로, 기본형에 상응하는 Wrapper Class를 사용해야 한다.
	 * - int - Integer, double - Double, char - Character, boolean - Boolean
	 * */
	private void test3() {
//		List<String> list = new ArrayList<String>();
		List<String> list = new ArrayList<>();
		
		// 요소 추가
		list.add("helloworld");
//		list.add(123); String 타입만 가능
//		list.add(new Date());
		list.add("bye bye");
		list.add("졸면 안돼!");
		list.add("살아 남아!");
		
		// 요소 가져오기
		String str0 = list.get(0);
		
		System.out.println(list);
	}


	/**
	 * Collection 인터페이스
	 *  - List 인터페이스
	 * 	  - ArrayList 구현클래스
	 * 
	 * - 크기제한이 없다.
	 * - 중간에 요소 추가/삭제가 쉽다.
	 * - 저장된 순서를 기억한다.
	 * */
	private void test2() {
		ArrayList list1 = new ArrayList();
		List list2 = new ArrayList();
		Collection list3 = new ArrayList();
		
		list2.add(100);
		list2.add(200);
		list2.add(300);
		list2.add(123.45);
		list2.add(true);
		list2.add("안녕");
		list2.add(new Date()); // java.util.Date
		list2.add(LocalDateTime.now()); // java.time.LocalDateTime
		list2.add(2, "ㅋㅋㅋ"); // 2번지에 요소 삽입
		
		System.out.println(list2);
		
		Object obj = list2.get(2);
		System.out.println(obj);
	}

	/**
	 * 배열이 구린 이유
	 * - 한번 작성된 배열의 크기는 변경할 수 없다.
	 * - 요소를 중간에 삽입/삭제가 불편하다.
	 * */
	private void test1() {
		Student[] students = new Student[3];
		students[0] = new Student(1, "홍길동");
		students[1] = new Student(2, "신사임당");
		students[2] = new Student(3, "이순신");
		
		// 2명의 학생을 추가
		Student[] students2 = new Student[50];
		System.arraycopy(students, 0, students2, 0, students.length);
		students2[3] = new Student(4, "유관순");
		students2[4] = new Student(5, "윤봉길");

		// 학생 1명을 중간에 삭제
//		students2[2] = null; // 중간에 null(x) 앞으로 땡겨줘야함
		students2[2] = students2[3];
		students2[3] = students2[4];
		students2[4] = null;
		
		// 학생 1명을 중간에 삽입
		students2[4] = students2[3];
		students2[3] = students2[2];
		students2[2] =  new Student(100, "도요토미");
		
		System.out.println(Arrays.toString(students2));
		
	}

}
