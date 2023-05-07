package p01.basic2;

public class TestPhone {

	public static void main(String[] args) {

		Phone phone;
//		phone = new ApplePhone();
//		phone = new LGPhone();
		phone = new SamSungPhone(); // promotion
		
		phone.sendCall(); // override => polymorphism
		phone.receiveCall();
//		phone.flash(); 
		
		SamSungPhone sp = (SamSungPhone) phone; // casting
		sp.flash();
	}

}
