package p04.polymorphism;

public class TestCar {

	public static void main(String[] args) {

		Car myCar = new Car();
		
		myCar.run();
		
		System.out.println();
		
//		myCar.frontLeftTire = new KumhoTire();
//		myCar.frontRightTire = new KumhoTire();
		
		myCar.tires[0] = new KumhoTire();
		myCar.tires[1] = new KumhoTire();
		myCar.run();
	}

}
