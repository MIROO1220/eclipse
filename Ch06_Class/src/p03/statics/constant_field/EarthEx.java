package p03.statics.constant_field;

public class EarthEx {

	public static void main(String[] args) {
		
		Earth earth = new Earth();
		
		System.out.println("지구 반지름 : " + earth.EARTH_RADIUS);
		System.out.println("지구 표면적 : " + earth.EARTH_SURFACE_AREA);
		
//		earth.EARTH_RADIUS = 2000; // The final field Earth.EARTH_RADIUS cannot be assigned -> 상수로 선언하면 값 변경 불가능
		System.out.println("지구 반지름 : " + Earth.EARTH_RADIUS); // static이기 때문에 인스턴스 안만들어도(만들어도됨) 사용 가능 -> 클래스이름으로 사용
		System.out.println("지구 표면적 : " + Earth.EARTH_SURFACE_AREA); // 힙메모리에 있지 않음!
		
		Earth.age = 50.2; // static은 수정 가능
		System.out.println("지구 나이 : " + Earth.age); // 여러개 만들어지지 않고 한개만 만들어짐!

	}

}
