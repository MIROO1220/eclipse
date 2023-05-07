package p04.field.encapsulation;

// 1. field를 private으로 선언
// - class 내부의 모든 method내에서 자유롭게 사용 가능
// - class 외부의 다른 class에서는 직접 사용 불가
// - private 사용 목적
//	 1) class 내부에서만 사용하고 외부에 다른 고객(다른 개발자)에게 알리고 싶지 않은 경우
//	 2) 외부 사용자가 잘못 사용하는 것을 방지할 경우 (예를 들면, 외부사용자가 c.radius = -10등으로 잘못 사용)
//	 	=> 외부 사용자가 radius를 다른 방법으로 사용가능하게 해줌 : getter/setter method 제공
//		=> getter.setter method는 반드시 public으로 선언 (public : 모든 사람(개발자)들이 사용 가능)

// 2. data(field) encapsulation : field나 method들을 private으로 선언해서 class외부에서 사용하는 것을 차단
public class Circle {
	
	private double radius; // instance field
	private static int numberOfInstances = 0; // new로 생성된 instance 갯수 관리용 field
	
	public Circle() {
		this.radius = 1;
		numberOfInstances++;
	}

	public Circle(double radius) { // 생성자는 힙메모리에 있는 필드값을 초기화하기때문에 힙메모리에 존재하지 않는 static은 생성자x
		super();
		this.radius = radius;
		numberOfInstances++;
	}

	// static method
	public static int getNumberOfInstances() { // 메소드에서도 static 사용 가능 -> static field만 사용 가능! (static으로 return된다고 static으로 안적어도됨)
//		helloPrint(); // static method에서 instance method 호출 불가!
		return numberOfInstances;
	}
	
	// getter method
	public double getRadius() {
		return radius;
	}

	// setter method
	public void setRadius(double radius) {
		if(radius>=0) {
			this.radius = radius;
		}else {
			this.radius = 0;
		}
	}

	// instance method
	// 원의 면적
	public double getArea() {
		return this.radius*this.radius*Math.PI;
	}
	
	// instance method
	// 원의 둘레
	public double getPerimeter() { 
		return 2*Math.PI*this.radius;
	}
	
	public void helloPint() {
		printPrivate();
		staticHelloPrint(); // instance method내에서 static method 호출 가능(제약x)
		System.out.println("Hello, Instance Print");
	}
	
	public static void staticHelloPrint() {
//		this.radius = 20;
		Circle c = new Circle(); // 객체를 만들어서 사용하면 쓸 수 있음(우회적으로 만들어놓음)
		c.radius = 20;
		System.out.println("Hello, static Print");
	}
	
	// instance method
	private void printPrivate() {
		System.out.println("Hello, private");
	}
	
}








