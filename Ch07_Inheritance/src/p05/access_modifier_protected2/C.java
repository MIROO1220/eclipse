package p05.access_modifier_protected2;

// class C는 다른 package에 있는 A와 상속관계가 없어서
// A에서 protected로 선언된 생성자, 필드, 메소드 사용 불가
public class C {
	
	public void method() {
//		A a = new A();
//		a.field = "new_value";
//		a.method();
	}

}
