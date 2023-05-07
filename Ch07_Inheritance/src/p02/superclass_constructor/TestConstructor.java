package p02.superclass_constructor;

// 상속관계에서 constructor 호출 순서
// 1. 부모 인스턴스를 힙메모리에 먼저 생성하고, 자식 인스턴스를 힙메모리에 나중에 생성
// 2. 부모 인스턴스를 힙메모리에 생성하고 나서 부모 class의 default constructor를 무조건 호출
// 3. 원하는 부모 constructor를 호출할 경우에는 super 키워드를 자식 생성자에서 사용함
public class TestConstructor {

	public static void main(String[] args) {

		Child c = new Child();
		System.out.println();
		
		Child c2 = new Child(10);
		System.out.println("집 전화번호 : " + c2.homePhoneNumber);
		c2.printParentInformation();
		
	}

}
