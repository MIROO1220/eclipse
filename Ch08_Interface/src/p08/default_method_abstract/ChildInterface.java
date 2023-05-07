package p08.default_method_abstract;

// ChildInterface는 부모인 ParentInterface의 default method를 abstract method로 변경 가능
public interface ChildInterface extends ParentInterface {
	
	void method3();
	
	@Override
	void method2(); // abstract method

}
