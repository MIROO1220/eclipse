package p02.superclass_constructor;

import javax.swing.plaf.synth.SynthScrollBarUI;

// this(); : 자신
// super(); : parent constructor
// super : parent instance
// - 힙메모리에 존재하는 parent의 인스턴스 주소
// -> 부모의 field, method를 호출 가능
// -> super()를 사용하여 부모 constructor를 호출할 수도 있음
public class Child extends Parent {
	
	public Child() {
		super(); // 부모의 default constructor 호출함
		System.out.println("Child - default constructor 호출");

	}
	public Child(int homePhoneNumber) {
		super(homePhoneNumber);
		System.out.println("Child - Child(int homePhoneNumber) constructor 호출");
		System.out.println("homePhoneNumber : " + super.homePhoneNumber);
	}
	
	public void printParentInformation() {
		super.name = "홍아버지";
		super.age = 55;
//		System.out.println("Parent 이름 : " + name + ", 나이 : " + age);
//		System.out.println("Parent 이름 : " + super.name + ", 나이 : " + super.age);
		super.printInformation();
	}

}
