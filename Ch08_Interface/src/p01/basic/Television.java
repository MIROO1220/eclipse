package p01.basic;

public class Television implements RemoteControl {
	
	int volume;

	@Override
	public void turnOff() {
		System.out.println("Television을 끕니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("Television을 킵니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 Television 볼륨 : " + this.volume);
	}

}
