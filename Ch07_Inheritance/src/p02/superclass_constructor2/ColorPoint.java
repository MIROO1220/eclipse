package p02.superclass_constructor2;

public class ColorPoint extends Point {
	
	private String color;
	
	public ColorPoint() {}

	public ColorPoint(int x, int y) {
		super(x, y);
		this.color = "노란색";
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void setColorAndPoint(String color, int x, int y) {
		setColor(color);
		super.set(x, y);
	}
	
	public void showColorPoint() {
		System.out.print("color : " + color + ", ");
		super.showPoint();
	}

}
