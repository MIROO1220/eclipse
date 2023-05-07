package p05.methods.pass_object;

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








