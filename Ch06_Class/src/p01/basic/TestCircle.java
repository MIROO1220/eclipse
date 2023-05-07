package p01.basic;

// 1. Circle c = new Circle();
// 의미 : data type(Circle) + 변수이름(c) = 데이터 값(힙메모리의 인스턴스 : new Circle())
// - 힙메모리에 저장되는 class의 인스턴스내에는 field들만 관리됨 (constructor, method 제외)

// 2. Circle class의 인스턴스를 통해 Circle class의 field값과 method들을 사용

// 3. "Circle c = new Circle();" 명령어를 기계어로 변환되어 내부적으로 실행 순서
//	  1) new를 실행 : heap memory에 Circle class 인스턴스 생성하고, 인스턴스 주소 값을 획득
//	  2) Circle class의 생성자(constructor)를 호출하여 field값들을 초기화
//	  3) heap memory의 인스턴스 주소 값을 변수 c에 넣어줌
public class TestCircle {

	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println("c의 주소 : " + System.identityHashCode(c));
		
		System.out.println("c인스턴스의 반지름 = " + c.getRadius());
		System.out.println("c인스턴스의 면적 = " + c.getArea());
		System.out.println("c인스턴스의 원의 둘레 = " + c.getPerimeter());
		
		System.out.println();
		Circle c1 = new Circle(2);
		System.out.println("c1의 주소 : " + System.identityHashCode(c1));

		System.out.println("c1인스턴스의 반지름 = " + c1.getRadius());
		System.out.println("c1인스턴스의 면적 = " + c1.getArea());
		System.out.println("c1인스턴스의 원의 둘레 = " + c1.getPerimeter());
		
		System.out.println();
		Circle c2 = new Circle("페퍼로니피자");
		System.out.println("c2의 주소 : " + System.identityHashCode(c2));
		c2.setRadius(5);
		System.out.println("c2인스턴스의 반지름 = " + c2.getRadius());
		System.out.println("c2인스턴스의 면적 = " + c2.getArea());
		System.out.println("c2인스턴스의 원의 둘레 = " + c2.getPerimeter());
		
		System.out.println();
		Circle c3 = new Circle(3, "콤비네이션피자");
		System.out.println("c3의 주소 : " + System.identityHashCode(c3));

		System.out.println("c3인스턴스의 반지름 = " + c3.getRadius());
		System.out.println("c3인스턴스의 면적 = " + c3.getArea());
		System.out.println("c3인스턴스의 원의 둘레 = " + c3.getPerimeter());
	}

}
