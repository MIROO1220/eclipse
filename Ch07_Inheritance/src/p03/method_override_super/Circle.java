package p03.method_override_super;

// 1. 자식 class에서 부모 class의 method를 override한 method대해서는
//	  자식 class에서 부모 class의 method를 직접 호출 가능
// 	  => 하지만, new로 자식 클래스를 인스턴스로 만들면 자식 인스턴스에서 직접 부모의 override된 메소드 직접 호출 불가

// 2. field name도 override가 가능 (부모 class의 field이름과 자식 class의 field이름이 동일)
public class Circle extends Shape {
	
	String name;
	
	@Override
	public void draw() {
		this.name = "Circle";
		super.name = "Shape_New";
		super.draw(); // 자식 클래스 내에서는 부모 호출 가능
		System.out.println("name : " + this.name);
	}
	
}
