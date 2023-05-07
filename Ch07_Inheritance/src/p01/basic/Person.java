package p01.basic;

public class Person {
	
	String name;
	int age;
	
	public Person() {
		System.out.println("Person 생성자 호출");
	}
	
	void speak() {
		System.out.println(name + "는 말합니다.");
	}
	
	void eat() {
		System.out.println(name + "는 먹습니다.");
	}
	
	void walk() {
		System.out.println(name + "는 걷습니다.");
	}
	
	void sleep() {
		System.out.println(name + "는 잠을 잡니다.");
	}

}
