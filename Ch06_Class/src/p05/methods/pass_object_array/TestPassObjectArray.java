package p05.methods.pass_object_array;

public class TestPassObjectArray {

	public static void main(String[] args) {

		Circle[] circleArray;
		circleArray = createCircleArray();
		
		System.out.println("circleArray 힙메모리 주소 : " + System.identityHashCode(circleArray));
		
		printCircleArrayAreas(circleArray);
		
	}
	
	public static Circle[] createCircleArray() {
		Circle[] c = new Circle[5];
		
		for(int i=0; i<c.length; i++) {
			c[i] = new Circle(Math.random()*100);
		}
		
		System.out.println("c 힙메모리 주소 : " + System.identityHashCode(c));
		return c;
	}
	
	public static void printCircleArrayAreas(Circle[] c) {
		System.out.println("printAreas 힙메모리 주소 : " + System.identityHashCode(c));
		
		System.out.println("Radius\t\tArea");
		for(int i=0; i<c.length; i++) {
			System.out.println(c[i].getRadius() + "\t\t" + c[i].getArea());
		}
	}

}




















