package p05.access_modifier_protected1;

// protected
// 정의 : default access modifier + A를 부모로 한 자식 class에서만 사용 가능
// -> 부모 자식 관계가 아닌 경우 사용 불가
public class A {
	
	protected String field;
	
	protected A() {}
	
	protected void method() {
		System.out.println("A class method");
	}

}
