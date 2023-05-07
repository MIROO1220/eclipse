package p05.methods.pass_object;

public class TestPassObject {

	public static void main(String[] args) {

//		Circle myCircle = new Circle(1);
		Circle myCircle = createCircleInstance(1);
		
		System.out.println("myCircle 힙메모리 주소 : " + System.identityHashCode(myCircle));
		
		int loop_times = 5;
		
//		System.out.println("Radius\t\tArea");
//		while(loop_times>=1) {
//			System.out.println(myCircle.getRadius() + "\t\t" + myCircle.getArea());
//			myCircle.setRadius(myCircle.getRadius()+1);
//			loop_times--;
//		}
		printAreas(myCircle, loop_times);
		
	}
	
	public static Circle createCircleInstance(double radius) {
		if(radius<0) {
			return null;
		}
		Circle c = new Circle(radius);
		System.out.println("c 힙메모리 주소 : " + System.identityHashCode(c));
		return c;
	}
	
	public static void printAreas(Circle c, int loop_times) {
		System.out.println("printAreas 힙메모리 주소 : " + System.identityHashCode(c));
		System.out.println("Radius\t\tArea");
		while(loop_times>=1) {
			System.out.println(c.getRadius() + "\t\t" + c.getArea());
			c.setRadius(c.getRadius()+1);
			loop_times--;
		}
	}

}




















