package p09.access_modifier.pkg2;

import p09.access_modifier.pkg1.A;

// 1. private : 해당 class 내부에서만 사용 가능
//	  => 적극 사용 권장

// 2. default : package 내부에서만 사용 가능
//	  => 사용 권장 (1개의 package안에 있는 class들은 서로 연관 관계가 높고, 사용 빈도수가 높음)

// 3. public : 다른 package에서도 사용 가능
//	  -> 사용할 때 조심해야 함 (꼭 필요한 경우에만 field, method,constructor등에 public을 사용할 것)
public class C {
	
	A a1 = new A(); // public constructor
//	A a2 = new A(1); // default constructor
//	A a3 = new A("홍길동"); // private constructor
	
	public C() {
//		a1.a = 1; // default field
		a1.b = 2; // public field
//		a1.c = 3; // private field
		
		a1.printPublic(); // public method
//		a1.printDefault(); // default method
//		a1.printPrivate(); // private method
		
	}
}
