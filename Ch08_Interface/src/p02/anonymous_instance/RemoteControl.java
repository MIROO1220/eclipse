package p02.anonymous_instance;

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

}
// interface : abstract class의 다른 이름
// => 추상메소드만 존재
// => 무조건 자식 클래스를 만들고, override 해주기
