package p02.superclass_constructor2;

public class TestColorPoint {

	public static void main(String[] args) {
		
		ColorPoint cp = new ColorPoint();
		cp.setColorAndPoint("red", 3, 4);
		cp.showColorPoint();
		
		ColorPoint cp2 = new ColorPoint(5, 6, "blue");
		cp2.showColorPoint();
		
		ColorPoint cp3 = new ColorPoint(8, 7);
		cp3.showColorPoint();
		
	}

}
