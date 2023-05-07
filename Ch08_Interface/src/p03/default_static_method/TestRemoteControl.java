package p03.default_static_method;

// default method와 static method를 Interface에서 추가한 이유
// 1. 기존 Interface 설계에서 새로운 기능 추가 목적
// -> 기존 고객은 기존의 interface 설계 내역대로 사용 가능
// -> 새로운 기능을 요구하는 고객에 대해서는 interface에 default와 static method 제공
public class TestRemoteControl {

	public static void main(String[] args) {

		RemoteControl rc;
		
		rc = new Television(); // promotion
		
		rc.turnOn();
		rc.setVolume(7);
		rc.setMute(true);
		rc.turnOff();
		RemoteControl.changeBattery();
		
		System.out.println();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(false);
		rc.turnOn();
	}

}
