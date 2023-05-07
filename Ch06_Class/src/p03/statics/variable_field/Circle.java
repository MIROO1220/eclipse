package p03.statics.variable_field;

// static 사용
// 1. field : 힙메모리에 저장되는 것이 아니라 메모리에 한 곳에서만 저장되고, 관리
// 2. method : static으로 선언 가능
//	  => static으로 선언된 method는 일반 field(힙메모리에서 선언된 field)들을 사용 불가
//		 static으로 선언된 method는 static field들만 사용 가능
//		 static method내에서 instance method 호출 불가
//	  => 일반 instance method는 instance field뿐만 아니라 static field, static method도 사용 가능
public class Circle {
	
	double radius; // instance field
	static int numberOfInstances = 0; // new로 생성된 instance 갯수 관리용 field
	
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

	// instance method
	public void setRadius(double radius) {
		this.radius = radius;
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
		staticHelloPrint(); // instance method내에서 static method 호출 가능(제약x)
		System.out.println("Hello, Instance Print");
	}
	
	public static void staticHelloPrint() {
//		this.radius = 20;
		Circle c = new Circle(); // 객체를 만들어서 사용하면 쓸 수 있음(우회적으로 만들어놓음)
		c.radius = 20;
		System.out.println("Hello, static Print");
	}
	
}








