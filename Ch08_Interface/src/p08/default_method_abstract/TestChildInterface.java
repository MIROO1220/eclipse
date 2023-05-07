package p08.default_method_abstract;

// default method를 override한다는 의미
// : 기본 기능 대신에 사용자별로 원하는 기능으로 변경
public class TestChildInterface {

	public static void main(String[] args) {

		ChildInterface ci = new ChildInterface() {
			
			@Override
			public void method1() {
				System.out.println("method1 실행");
			}
			
			@Override
			public void method3() {
				System.out.println("method3 실행");
			}
			
			@Override
			public void method2() {
				System.out.println("method2 실행");
			}
		};
		ci.method1();
		ci.method2();
		ci.method3();
	}

}
