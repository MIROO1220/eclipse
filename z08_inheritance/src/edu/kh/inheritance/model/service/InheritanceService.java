package edu.kh.inheritance.model.service;

import java.util.Scanner;

import edu.kh.inheritance.model.vo.Employee;
import edu.kh.inheritance.model.vo.Person;
import edu.kh.inheritance.model.vo.Student;

public class InheritanceService {
	
	public void ex1() {
		// 상속 확인
		// -Person을 상속 받은 Student가 Person의 필드, 메소드를 사용할 수 있는가?
		
		Person p = new Person();
		
		// p.name = "홍길동"; // private 때문에 직접 접근 불가
		p.setName( "한미루" );
		p.setAge( 27 );
		p.setNationality( "대한민국" );
		
		System.out.println( p.getName() );
		System.out.println( p.getAge() );
		System.out.println( p.getNationality() );
		
		System.out.println( "==================================" );
		
		// Student 객체 생성
		
		Student std = new Student();
		
		// Student만의 고유한 메소드
		std.setGrade( 5 );
		std.setClassRoom( 3 );
		
		// Person 클래스로부터 상속 받은 메소드
		std.setName( "한미루" );
		std.setAge( 17 );
		std.setNationality( "대한민국" );
		
		System.out.println( std.getGrade() );
		System.out.println( std.getClassRoom() );
		
		// Student가 Person의 메소드 뿐만 아니라 필드도 상속 받았는지 확인
		System.out.println( std.getName() );
		System.out.println( std.getAge() );
		System.out.println( std.getNationality() );
		
		System.out.println( "=================================" );
		
		Employee emp = new Employee();
		
		// Employee만의 고유 메소드
		emp.setCompany( "kh정보교육원" );
		
		// Person 클래스로부터 상속 받은 메소드
		emp.setName( "도레미" );
		emp.setAge( 19 );
		emp.setNationality( "대한민국" );
		
		System.out.println( emp.getCompany() );
		
		System.out.println( emp.getName() );
		System.out.println( emp.getAge() );
		System.out.println( emp.getNationality() );
		
		System.out.println( "=================================" );
		
		// 추가된 breath() 메소드 확인하기
		p.breath();
		std.breath();
		emp.breath();
		
	}
	
	public void ex2() {
		
		// super() 생성자 사용 방법
		
		// Student 매개변수 5개짜리 생성자
		Student std = new Student( "박서준", 18, "한국", 2, 3 );
		
		System.out.println( std.getName() ); // 박서준
		System.out.println( std.getAge() ); // 18
		System.out.println( std.getNationality() ); // 한국
		System.out.println( std.getGrade() ); // 2
		System.out.println( std.getClassRoom() ); // 3
		
	}
	
	public void ex3() {
		
		// 오버라이딩 확인 예제
		
		Student std = new Student();
		Employee emp = new Employee();
		
		std.move(); // 오버라이딩 X -> Person의 메소드 수행
		
		emp.move(); // 오버라이딩 O -> Employee의 메소드 수행
		
	}
	
	public void ex4() {
		
		// 모든 클래스는 Object 클래스의 후손
		// == 모든 클래스의 최상위 부모는 Object
		
		// 1) Object 상속 여부 확인
		Person p = new Person(); // Object를 상속 받은 Person 객체 생성
		
		Student std = new Student(); // Person을 상속 받은 Student 객체 생성
		// Object - Person - Student
		
		Scanner sc = new Scanner(System.in);
		String str = "abc";
		
		// ** Object 상속과 단계적인 상속 확인
		
		System.out.println( p.hashCode() ); // Object에서 물려 받은 hashCode()
		
		System.out.println( std.getAge() ); // Person에서 물려 받은 getAge()
		
		System.out.println( std.hashCode() );
		// Person이 Object에서 물려 받은 hasCode()를
		// Student가 또 물려 받아 사용
		
		// -> 상속의 상속의 상속의 ... 상속 가능
		
		// * Object가 모든 클래스의 최상위 부모인지 확인
		System.out.println( sc.hashCode() );
		// Object - hashCode()
		
		System.out.println( str.hashCode() );
		// String - hashCode()
		// -> String이 Object에게 물려 받은 hashCode()를 오버라이딩함
		
	}
	
	public void ex5() {
		
		// toString() 오버라이딩
		Person p = new Person( "한미루", 27, "한국" );
		
		System.out.println( p.toString() ); // 한미루 / 27 / 한국
		System.out.println( p ); // 한미루 / 27 / 한국
		
		// print 구문 수행 시 참조 변수명을 작성하면
		// 자동으로 toString() 메소드를 호출해서 출력한다!
		
		System.out.println("==========================");
		
		Student std = new Student( "도레미", 20, "미국", 2, 8 );
		
		System.out.println( std.toString() );
		// 1) Student 클래스 toString() 오버라이딩 전
		// Person으로 부터 상속 받은 오버라이딩된 toString() 수행
		
		// 2) Student 클래스 toString() 오버라이딩 후
		// Student의 toString() 수행
		
		Employee emp = new Employee( "조정석", 33, "한국", "00증권" );
		System.out.println( emp );
	}

}




















