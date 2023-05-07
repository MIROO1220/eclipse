package p09.access_modifier.pkg1;

// access modifier (접근 제한자)
// - 종류 : private, default, public, protected(상속)
//	 기본 : default access modifier
// - 사용하는 곳 : field, constructor, method, class이름에서도 사용
public class A {
	
	int a = 10; // default access modifier
	public int b = 20; // public access modifier
	private int c = 30; // private access modifier
	String d;
	
	// default constructor (public access modifier)
	public A() {}
	
	// constructor (default access modifier)
	A(int a) {}
	
	// constructor (private access modifier)
	private A(String d) {}
	
	public void printPublic() {
		System.out.println("public method");
	}
	
	void printDefault() {
		System.out.println("default method");
	}
	
	private void printPrivate() {
		System.out.println("private method");
	}
}
