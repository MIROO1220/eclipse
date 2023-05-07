package p03.method_override;

// Method Override : 부모와 동일한 method(signature가 동일, 이름과 parameter type 동일)를 자식 class에서 새로 만들고,
// 					 자식 class에서 이 메소드를 호출하면 자식에서 만든 method를 호출함
// @Override : Java에게 지금 만드는 method는 부모 class의 메소드를 override한다고 공식적으로 알림
// @ : annotation (명령어 같은 역할 수행)
public class Circle extends Shape {
	
	@Override
	public void draw() {
		System.out.println("Circle class - draw()");
	}
	
}
