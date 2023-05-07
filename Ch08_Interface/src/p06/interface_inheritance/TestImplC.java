package p06.interface_inheritance;

public class TestImplC {

	public static void main(String[] args) {

		ImplC implC = new ImplC();
		implC.methodA();
		implC.methodB();
		implC.methodC();
		
		InterfaceA ia = implC; // InterfaceA 부모로 형변환 (promotion)
		ia.methodA();
//		ia.methodB();
//		ia.methodC();
		
		InterfaceB ib = implC;
		ib.methodB();
		
		InterfaceC ic = implC;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
