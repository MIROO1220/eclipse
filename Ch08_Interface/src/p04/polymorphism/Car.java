package p04.polymorphism;

public class Car {
	
//	Tire frontLeftTire = new HankookTire(); // promotion
//	Tire frontRightTire = new HankookTire();
//	Tire backLeftTire = new HankookTire();
//	Tire backRightTire = new HankookTire();
	
	Tire[] tires = {
			new HankookTire(), // index 0 : frontLeftTire
			new HankookTire(), // index 1 : frontRightTire
			new HankookTire(), // index 2 : backLeftTire
			new HankookTire() // index 3 : backRightTire
	};
	
	void run() {
//		frontLeftTire.roll(); // override => polymorphism
//		frontRightTire.roll();
//		backLeftTire.roll();
//		backRightTire.roll();
		
//		for(int i=0; i<tires.length; i++) {
//			tires[i].roll();
//		}
		
		for(Tire tire : tires) { // 향상된 for문
			tire.roll();
		}
	}

}
