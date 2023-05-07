package p07.polymorphism3;

public class TestDriver {

	public static void main(String[] args) {

		Driver driver = new Driver();
		Vehicle v;
		
//		v = new Bus(); // promotion
//		v = new Taxi();
//		v = new Sedan();
		
//		driver.drive(v);
//		driver.drive(new Bus());
		driver.drive(new Taxi());
		
	}

}
