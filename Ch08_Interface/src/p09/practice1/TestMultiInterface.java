package p09.practice1;

public class TestMultiInterface {

	public static void main(String[] args) {

		SmartPhone smartPhone = new SmartPhone();
		
		smartPhone.printLogo();
		smartPhone.sendCall();
		smartPhone.play();
		
		System.out.println("3과 5를 더하면 " + smartPhone.calculate(3, 5));
		
		smartPhone.schedule();
		smartPhone.receiveCall();
		smartPhone.receiveSMS();
		smartPhone.stop();
	}

}
