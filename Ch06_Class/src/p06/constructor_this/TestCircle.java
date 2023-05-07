package p06.constructor_this;

public class TestCircle {

	public static void main(String[] args) {
		
		Circle plainPizza = new Circle();
		plainPizza.printCircleInformation();
		System.out.println();
		
		Circle largePizza = new Circle();
		largePizza.printCircleInformation();
		System.out.println();
		
		Circle supremePizza = new Circle("슈프림피자");
		supremePizza.printCircleInformation();
		System.out.println();
		
		Circle superSupremePizza = new Circle(15, "슈퍼슈프림피자");
		superSupremePizza.printCircleInformation();

	}

}
