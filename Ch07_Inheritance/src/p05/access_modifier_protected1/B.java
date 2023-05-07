package p05.access_modifier_protected1;

public class B {
	
	public void method() { // 같은 패키지 내에 있으니깐 ok
		A a = new A();
		a.field = "new_value";
	}

}
