package p01.basic2;

public class Point {
	
	int x, y; // 2차원 평면의 (x,y) 좌표
	
	public Point() {}
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println("(" + x + ", " + y + ")");
	}

}
