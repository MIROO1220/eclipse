package p01.basic2;

public class ColorPoint extends Point {
	
	private String color;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setColorAndPoint(String color, int x, int y) {
		setColor(color);
		set(x, y); // 부모 method 호출 -> this.x = x; this.y = y;
	}
	
	public void showColorPoint() {
		System.out.print("color : " + color + ", ");
		showPoint();
	}

}
