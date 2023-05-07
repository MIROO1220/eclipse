package p07.singleton_usage;

// Singleton design pattern 사용 용도
// : new로 인스턴스를 1개만 만들어도 되는 경우
// Singleton 사용 방법
// 1) class내부에서 private static으로 선언된 field에 new로 인스턴스 생성
// 2) class 사용자는 public으로 선언된 getInstance() method를 통해 Calendar 인스턴스를 획득
// 3) class 사용자는 singleton class의 나머지 method들을 사용
public class Singleton {
	
	private static Singleton singleton = new Singleton(); // static method를 사용해야하기때문에 static field여야함
	
	// default constructor (private으로 선언됨)
	private Singleton() {}
	
	public static Singleton getInstance() {
		System.out.println("singleton class 힙메모리 주소 : " + System.identityHashCode(singleton));
		return singleton;
	}
	
	public void printHello() {
		System.out.println("Hello, singleton instance method");
	}

}
