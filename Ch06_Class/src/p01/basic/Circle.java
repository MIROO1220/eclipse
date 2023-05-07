package p01.basic;

// 1. Constructor 만드는 기준
// - 기본 생성자를 반드시 만드는 것을 권장
//	 이유 : spring 등을 사용한 web application에서 class 만들 때 필수라고 생각하는 것이 좋음
// - 본인이나 다른 사용자(개발자)의 요구사항에 의해서 만듬
// - 생성자 이름 == class 이름
// - method signature = method 이름 + parameter를 합친 것을 의미
// - 생성자 overloading : 생성자의 이름은 동일하지만 생성자의 parameter의 data type이 틀린 경우 생성자를 중복 선언 가능
//						(다른 용어로 표현하면 생성자 signature가 틀린 경우에만 중복 선언 가능)
//						단, field 이름이 틀리더라도 data type이 동일하면 중복 선언 불가
//						error 내용 : Duplicate method Circle(double) in type Circle

// 2. this 정의 : 힙메모리에서 생성된 인스턴스의 주소
//	  -> this라는 이름은 동일하지만 실제로 사용되는 인스턴스의 주소를 실시간으로 가짐
public class Circle {
	
	double radius = 1;
	double id = 1;
	String name = "플레인피자";
	
	// Default(기본) Constructor(생성자)
	public Circle() {
		System.out.println("1. this 주소 : " + System.identityHashCode(this));
		System.out.println("default constructor 호출됨");
	}
	
	// Constructor
//	public Circle(double radius) {
//		super();
//		System.out.println("Circle(double radius) constructor 호출됨");
//		this.radius = radius;
//	}
	
	public Circle(double id) {
		super();
		System.out.println("2. this 주소 : " + System.identityHashCode(this));
		this.id = id;
	}
	
	public Circle(String name) {
		super();
		System.out.println("3. this 주소 : " + System.identityHashCode(this));
		System.out.println("Circle(String name) constructor 호출됨");
		this.name = name;
	}
	
	public Circle(double radius, String name) {
		super();
		System.out.println("4. this 주소 : " + System.identityHashCode(this));
		System.out.println("Circle(double radius, String name) constructor 호출됨");
		this.radius = radius;
		this.name = name;
	}

	// getter : field값을 가져오는 method
	public double getRadius() {
		return radius;
	}

	// setter : field값을 설정하는 method
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 원의 면적
	public double getArea() {
		// 원의 면적 = 반지름*반지름*3.14159...
		return radius*radius*Math.PI;
	}
	
	// 원의 둘레
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
}



















