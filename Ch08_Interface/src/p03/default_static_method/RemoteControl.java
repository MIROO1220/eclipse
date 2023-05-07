package p03.default_static_method;

// Interface
// - public이 기본 type
// - field : 상수만 존재 (원칙적으로 변수 선언 불가)
// - method : public abstract 포함
public interface RemoteControl {
	
	// public static final int MAX_VOLUME = 10;
	int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// abstract method
	public abstract void turnOff();
	void turnOn();
	public void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	static void changeBattery() {
		System.out.println("건전지를 교체합니다.");
	}

}
