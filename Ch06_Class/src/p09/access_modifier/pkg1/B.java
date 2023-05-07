package p09.access_modifier.pkg1;

public class B {
	
	A a1 = new A(); // public constructor
	A a2 = new A(1); // default constructor
//	A a3 = new A("홍길동"); // private constructor -> The constructor A(String) is not visible
	
	public B() {
		a1.a = 1; // default field
		a1.b = 2; // public field
//		a1.c = 3; // private field -> The field A.c is not visible
		
		a1.printPublic(); // public method
		a1.printDefault(); // default method
//		a1.printPrivate(); // private method -> The method printPrivate() from the type A is not visible
	}

}
