package p06.interface_inheritance;

public class ImplC implements InterfaceC {

	@Override
	public void methodA() {
		System.out.println("methodA 실행");
	}

	@Override
	public void methodB() {
		System.out.println("methodB 실행");
	}

	@Override
	public void methodC() {
		System.out.println("methodC 실행");
	}

}
