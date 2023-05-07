package p02.superclass_constructor;

public class Parent {
	
	int homePhoneNumber;
	String name;
	int age;
	
	public Parent() {
		System.out.println("Parent - default constructor 호출");
	}
	
	public Parent(int homePhoneNumber) {
		this.homePhoneNumber = homePhoneNumber;
		System.out.println("Parent - Parent(int homePhoneNumber) constructor 호출");
	}
	
	public void printInformation() {
		System.out.println("Parent 이름 : " + this.name + ", 나이 : " + this.age);
	}

}
