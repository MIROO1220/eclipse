package p01.basic;

// Student : child class, Person : parent class
public class Student extends Person {
	
	String ssn = "123456"; // 학번 선언
	
	public Student() {
		System.out.println("Student 생성자 호출");
	}
	
	void study() {
		walk();
		System.out.println(name + "는 공부합니다.");
	}

}
