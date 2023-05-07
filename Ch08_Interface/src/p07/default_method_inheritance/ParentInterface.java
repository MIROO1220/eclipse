package p07.default_method_inheritance;

public interface ParentInterface {
	
	void method1();
	
	default void method2() {
		System.out.println("ParentInterface - default method2 실행");
	}

}
