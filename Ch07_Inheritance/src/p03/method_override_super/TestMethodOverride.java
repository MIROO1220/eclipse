package p03.method_override_super;

public class TestMethodOverride {

	public static void main(String[] args) {

		Shape shape = new Shape();
		shape.paint();
		
		System.out.println();
		
		Circle circle = new Circle();
		circle.paint();
		
	}

}
