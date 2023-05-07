package p06.interface_inheritance;

// Interface 상속(Inheritance)
// 1. 여러개의 부모 인터페이스를 상속 가능 (class에서는 오직 1개의 부모 class만 상속 가능)
// 2. 상속할 때는 class처럼 extends 키워드 사용
public interface InterfaceC extends InterfaceA, InterfaceB {
	
	void methodC();

}
