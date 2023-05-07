package p06.constructor_this;

// this : constructor method를 의미
// => this(1, "플레인피자");을 실행하면, Circle(double radius, String name)를 호출함
// Constructor를 coding : 입력값이 valid값인지 반드시 checking하는 code 필요
// - 문제점
//	 1) 유사한 constructor들이 많을 경우 constructor마다 중복해서 똑같은 coding 필요
//	 2) valid값을 check하는 coding 내용이 변경되면 해당되는 모든 constructor code를 수정해야 하고,
//		수정할 때 잘못 수정해서 개발시간이 많이 소요
// - 해결책 : constructor this()를 사용
//	 DRY (Don't Repeat Yourself) => 똑같은 code를 중복해서 코딩하지 마라
public class Circle {
	
	double radius;
	String name;
	
	// Default(기본) Constructor(생성자)
	public Circle() {
		this(1, "플레인피자");
		System.out.println("dufault constructor 호출");
	}
	
	// Constructor
	public Circle(double radius) {
		this(radius, "플레인피자");
		System.out.println("constructor Circle(double radius) 호출");
	}
	
	public Circle(String name) {
		this(1, name);
		System.out.println("constructor Circle(String name) 호출");
	}
	
	public Circle(double radius, String name) {
		super();
		System.out.println("constructor Circle(double radius, String name) 호출");
		// 실제 coding할 때, 입력값을 그대로 받아 초기화 하면 안됨 (예들 들면, radius가 음수인 경우 체크 필요)
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
	
	public void printCircleInformation() {
		System.out.println("피자이름 : " + name + ", 반지름 : " + radius + ", 피자면적 : " + getArea() + ", 피자둘레 : " + getPerimeter());
	}
}



















