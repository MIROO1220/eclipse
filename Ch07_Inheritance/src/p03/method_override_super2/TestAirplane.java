package p03.method_override_super2;

public class TestAirplane {

	public static void main(String[] args) {
		
		SupersonicAirplane s = new SupersonicAirplane();
		
		s.takeOff();
		s.fly();
		
		s.flyMode = SupersonicAirplane.SUPERSONIC;
		s.fly();
		
		s.flyMode = SupersonicAirplane.NORMAL;
		s.fly();
		
		s.land();
	}

}
