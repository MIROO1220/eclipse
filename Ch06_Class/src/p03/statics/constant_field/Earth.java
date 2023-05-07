package p03.statics.constant_field;

// field 선언
// 1. static 사용 : heap memory에 생성하지 않고, 메모리에 오직 1개만 생성하고 싶은 경우
// 2. final : field 선언할 때만 값을 설정할 수 있고, 나중에 해당 field값을 변경 못함
// 3. static + final => 상수 선언할 때 사용
// 4. 상수 이름은 항상 대문자로 사용
// 5. static으로 선언된 field들은 new로 인스턴스 만들지 않고 class이름으로 직접 사용 가능
public class Earth {
	
	static final double EARTH_RADIUS = 6400; // 6400km
	// 지구 표면적 : 4*pi*반지름*반지름
	static final double EARTH_SURFACE_AREA = 4*Math.PI*EARTH_RADIUS*EARTH_RADIUS;
	static double age = 50;

}
