package p09.abstract_class2;

// 추상메소드를 선언하면 class는 반드시 abstract class로 선언되어야만 함
// => 추상메소드 만든 목적 : 메소드 이름과 parameter type(method signature)은 정해져 있고,
//					   자식메소드에서는 추상메소드의 contents(내용)만 코딩
public abstract class Animal {
	
	public String kind;
	
	public void breath() {
		System.out.println("숨을 쉽니다.");
	}
	
	// abstract method (추상메소드는 통상 public으로 선언하는 것이 일반적)
	public abstract void sound();
	
}
