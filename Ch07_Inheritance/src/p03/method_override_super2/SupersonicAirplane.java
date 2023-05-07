package p03.method_override_super2;

public class SupersonicAirplane extends Airplane {
	
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		
		// 기본 : 부모 method인 super.fly() 사용하여 코딩
		// 자식 메소드에서는 기타 추가하고 싶은 기능을 코딩
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		}else {
			super.fly();
		}
	}

}
