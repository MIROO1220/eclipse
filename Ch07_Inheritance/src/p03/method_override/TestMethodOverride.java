package p03.method_override;

public class TestMethodOverride {

	public static void main(String[] args) {

		Shape shape = new Shape();
//		shape.draw();
		shape.paint();
		
		Line line = new Line();
//		line.draw();
		line.paint();
		
		Rectangle rect = new Rectangle();
//		rect.draw();
		rect.paint();
		
		Circle circle = new Circle();
//		circle.draw();
		circle.paint();
		
	}

}
