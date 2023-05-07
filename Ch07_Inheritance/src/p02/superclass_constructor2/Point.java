package p02.superclass_constructor2;

// 좌표상의 Point 점 (x, y)
public class Point {
	
	int x, y;

	public Point() {}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println("(" + x + ", " + y + ")");
	}
	
}
