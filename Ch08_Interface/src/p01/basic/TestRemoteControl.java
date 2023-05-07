package p01.basic;

// Interface의 구현체(자식 class)를 변경하면 기존 class에서 새로운 class로 변경하는 효과가 발생
public class TestRemoteControl {

	public static void main(String[] args) {

		RemoteControl rc;
		
//		rc = new Television(); // promotion
		rc = new Audio();
		
		rc.turnOn(); // override => polymorphism
		rc.setVolume(7);
		rc.turnOff();
		
	}

}
