package p02.anonymous_instance;

// Interface의 구현체(자식 class)를 변경하면 기존 class에서 새로운 class로 변경하는 효과가 발생
public class TestRemoteControl {

	public static void main(String[] args) {

		RemoteControl rc = new RemoteControl() {
			int volume;
			
			@Override
			public void turnOn() {
				System.out.println("Anonymous(익명) 객체 - 전원 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Anonymous(익명) 객체 - 전원 끕니다.");
				
			}
			
			@Override
			public void setVolume(int volume) {
				this.volume = volume;
				System.out.println("Anonymous(익명) 객체 - volume : " + this.volume);
			}
		};
		
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}

}
