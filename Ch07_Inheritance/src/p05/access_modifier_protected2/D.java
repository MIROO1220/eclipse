package p05.access_modifier_protected2;

import p05.access_modifier_protected1.A;

// - A의 자식인 D class에서는 protected로 선언된 A class의 field, method 사용 가능
// - A class의 protected로 선언된 constructor에 대해서는 new로 사용하여 부모인 A class의 인스턴스 생성 불가
public class D extends A {
	
	public void method() {
//		A a = new A();
		super.field = "new_value";
		super.method();
	}

}
