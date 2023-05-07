package p04.polymorphism2;

public class Driver {
	
	// 파라미터로 넘길 때 promotion
	public void drive(Vehicle vehicle) {
		vehicle.run(); // override한 것을 실행 => polymorphism
	}

}
