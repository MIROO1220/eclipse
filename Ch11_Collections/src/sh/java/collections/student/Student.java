package sh.java.collections.student;

import java.util.Objects;

public class Student implements Comparable<Student> {
	private int no;
	private String name;
	
	public Student() {
		super();
	}
	
	public Student(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + "]";
	}

	/**
	 * 기본정렬 기준작성
	 * - no 오름차순
	 * 
	 * 객체간 필드값 비교결과 정수로 반환
	 * */
	@Override
	public int compareTo(Student other) {
		// 현재객체 - 다른객체 : 오름차순
		return this.no - other.no;
	}


	/**
	 * 필드값 기준으로 모든 필드가 동일하면 같은 객체라고 처리
	 * */
//	@Override
//	public boolean equals(Object obj) {
//		if(obj == null)
//			return false;
//		if(!(obj instanceof Student))
//			return false;
//		
//		Student other = (Student) obj;
//		if(this.no != other.no)
//			return false;
//		if(!this.name.equals(other.name))
//			return false;
//		
//		return true;
//	}
	
	/**
	 * 필드값 기준으로 hashCode를 재생성
	 * */
//	@Override
//	public int hashCode() {
//		return Objects.hash(this.no, this.name);
//	}
	
	
	/**
	 * 필드값 기준으로 hashCode를 재생성
	 * */
	@Override
	public int hashCode() {
		return Objects.hash(name, no);
	}
	
	/**
	 * 필드값 기준으로 모든 필드가 동일하면 같은 객체라고 처리
	 * */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) // 주소값이 같다면
			return true;
		if (obj == null)
			return false;
//		if(!(obj instanceof Student))
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && no == other.no;
	}
	
}
