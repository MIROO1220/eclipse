package p07.polymorphism2;

// polymorphism 사용 목적
// - source coding 양이 적어지고 간결해짐
// - 새로운 자식 class를 만들 필요가 있으면 자식 class의 인스턴스 등 만 간단하게 source code의 일부 수정하면
//	 나머지 전체 소스코드 재사용 (reuse)
// - 기존 자식 class를 삭제(교체)하는 것도 쉽게 가능
public class TestMethodOverride {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[5];
		
		shapes[0] = new Shape();
		shapes[1] = new Line(); // promotion
		shapes[2] = new Line(); // promotion
		shapes[3] = new Circle(); // promotion
		shapes[4] = new Oval(); // promotion
		
		for(int i=0; i<shapes.length; i++) {
			shapes[i].paint(); // override method 호출
		}
		
	}

}
