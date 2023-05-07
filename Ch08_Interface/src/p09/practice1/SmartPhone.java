package p09.practice1;

// SmartPhone
// 1. 부모인 PDA class를 상속받음
// 2. 부모 Interface인 MP3Interface, MobliePhoneInterface를 상속받음
public class SmartPhone extends PDA implements MP3Interface, MobliePhoneInterface {

	@Override
	public void sendCall() {
		System.out.println("따르릉 따르릉~~");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화 왔어용");
	}

	@Override
	public void sendSMS() {
		System.out.println("문자 보내용");
	}

	@Override
	public void receiveSMS() {
		System.out.println("문자 왔어용");
	}

	@Override
	public void play() {
		System.out.println("음악 플레이~!");
	}

	@Override
	public void stop() {
		System.out.println("음악 멈춰~!");
	}
	
	public void schedule() {
		System.out.println("일정 관리 합니다.");
	}

}
