package p03.method_override_super;

public class Shape {
	
	String name = "Shape";
	
	public void paint() {
		draw();
	}
	
	public void draw() {
		System.out.println("name : " + this.name);
	}

}
