package p01.basic2;

public class TestColorPoint {

	public static void main(String[] args) {

		Point p = new Point();
		p.set(1, 2);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.setColorAndPoint("red", 3, 4);
		cp.showColorPoint();
		
	}

}
