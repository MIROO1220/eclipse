package p09.practice1;

public interface PhoneInterface {
	
	int TIMEOUT = 100000;
	
	void sendCall();
	void receiveCall();
	
	default void printLogo() {
		System.out.println("** Phone **");
	}

}
