package p04.field.encapsulation;

// Circle class에서
// 1. radius를 private으로 선언한 경우 다른 class에서 직접 사용 불가
public class TestCircleWithPrivateFields {
	
	public static void main(String[] args) {
		
		Circle c1 = new Circle(5);
		
		// The field Circle.radius is not visible
//		c1.radius = 20;
//		c1.printPrivate();
	}
	
}
