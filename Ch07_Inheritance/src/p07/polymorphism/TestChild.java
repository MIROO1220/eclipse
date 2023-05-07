package p07.polymorphism;

// polymorphism (다형성)
// -> promotion + override => override된 자식 메소드를 실행
public class TestChild {

	public static void main(String[] args) {
		
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();
		
		System.out.println();
		
		Parent parent = child; // promotion(자동형변환)
		parent.method1();
		parent.method2(); // 부모꺼를 쓰지만 자식꺼로 실행
//		parent.method3();

	}

}
