package sh.java.collections.list;

import java.util.Comparator;

import sh.java.collections.student.Student;

/**
 * Ascending 오름차순
 * Descending 내림차순
 * */
public class StudentNameASC implements Comparator<Student> {

	/**
	 * 새로운 비교기준을 만들어서 정수로 반환
	 * */
	@Override
	public int compare(Student s1, Student s2) {
		String name1 = s1.getName();
		String name2 = s2.getName();
		return name1.compareTo(name2); // 문자열의 기본정렬 메소드를 대신 호출
	}

}
