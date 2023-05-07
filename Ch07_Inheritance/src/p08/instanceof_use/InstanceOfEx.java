package p08.instanceof_use;

class Parent{}
class Child extends Parent {}

// A instanceof B : A가 B class의 인스턴스이면 true를 return, 아니면 false를 return
// -> A : parent instance, B : child class
// => 자식 instance로 강제형변환(casting)할 때는 반드시 instanceof 키워드를 사용하여 체크할 것
public class InstanceOfEx {
	
	public static void main(String[] args) {
		
		Parent pa = new Child(); // promotion
		method1(pa);
		method2(pa);
		
		Parent pb = new Parent();
		method1(pb);
		method2(pb);
		
	}
	
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent; // casting
			System.out.println("method1 - Child 인스턴스 변환 성공");
		}else {
			System.out.println("method1 - Child 인스턴스 변환할 수 없습니다.");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child 인스턴스 변환 성공");
	}

}
