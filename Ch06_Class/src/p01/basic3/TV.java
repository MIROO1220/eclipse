package p01.basic3;

// 1. field값을 초기화할 수 있는 경우
// - class를 만들 때 기본 사양이 있는 경우

// 2. method를 통해 field값을 변경하는 경우
// - 고객(다른 개발자)이 잘못 사용하는 경우를 감안하여 코딩해야 함

// 3. default constructor뿐만 아니라 모든 constructor를 class 만들 때 만들지 않은 경우
//	  -> Java가 class로 compile할 때 자동으로 만들어 줌
//	  -> 단, default constructor이외에 다른 생성자를 만든 경우에는 Java가 default constructor를 자동으로 만들지 않음
public class TV {
	
	int channel = 1; // channel : 1 ~ 120
	int volumeLevel = 1; // volume : 1 ~ 7
	boolean on = false; // TV 전원 on/off
	
	// default 생성자
	public TV() {}
	
	public TV(int channel, int volumeLevel, boolean on) {
		super();
		this.channel = channel;
		this.volumeLevel = volumeLevel;
		this.on = on;
	}

	// TV 켜기
	public void turnOn() {
		this.on = true;
	}
	

	// TV 끄기
	public void turnOff() {
		this.on = false;
		this.channel = 1;
		this.volumeLevel = 1;
	}
	
	// setter method
	public void setChannel(int channel) {
		if((on==true) && (channel>=1) && (channel<=120)) {
			this.channel = channel;
		}else {
			System.out.println("올바른 채널이 아니어서 채널 변경이 안됩니다.");
		}
	}
	
	public void setVolume(int volumeLevel) {
		if((on==true) && (volumeLevel>=1) && (volumeLevel<=7)) {
			this.volumeLevel = volumeLevel;
		}else {
			System.out.println("올바른 볼륨이 아니어서 볼륨 변경이 안됩니다.");
		}
	}
	
	public void printTVInformation() {
		System.out.println("channel : " + channel + ", volume : " + volumeLevel);
	}
	
	public void channelUp() {
		if((on==true) && (channel<120)) {
			channel++;
		}
	}
	
	public void channelDown() {
		if((on==true) && (channel>1)) {
			channel--;
		}
	}
	
	public void volumeUp() {
		if((on==true) && (volumeLevel<7)) {
			volumeLevel++;
		}
	}
	
	public void volumeDowm() {
		if((on==true) && (volumeLevel>1)) {
			volumeLevel--;
		}
	}
	
}












