package p04.final_method;

// Cannot override the final method from Car
// -> 부모 class에서 final로 선언된 메소드는 자식 class에서 override 사용 불가
public class SuperCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
	}
	
//	public void stop() {
//		
//	}
	
}
