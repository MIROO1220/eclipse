package p01.basic2;

public class ApplePhone implements Phone {

	@Override
	public void sendCall() {
		System.out.println("Apple Phone - 따르릉");
	}

	@Override
	public void receiveCall() {
		this.flash();
		System.out.println("Apple Phone - 전화왔습니다.");
	}
	
	public void flash() {
		System.out.println("Apple Phone - 전화기에 불이 켜졌습니다.");
	}

}
