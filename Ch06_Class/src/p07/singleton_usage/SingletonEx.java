package p07.singleton_usage;

import java.util.Calendar;

public class SingletonEx {

	public static void main(String[] args) {

		// The constructor Singleton() is not visible
		// 이유 : Singleton constructor를 private으로 선언하여, class 외부에서 new로 인스턴스 생성 불가
//		Singleton s1 = new Singleton();  
		
		// Singleton class내부에서 만든 instance를 getInstance() 메소드를 통해 사용
		Singleton s1 = Singleton.getInstance();
		s1.printHello();
		
		Singleton s2 = Singleton.getInstance();
		s1.printHello();
		
		System.out.println("s1 힙메모리 주소 : " + System.identityHashCode(s1)); // s1 힙메모리 주소 : 1586600255
		System.out.println("s2 힙메모리 주소 : " + System.identityHashCode(s2)); // s2 힙메모리 주소 : 1586600255
		// 인스턴스 한개만 만들어서 사용해라
		
		// Calendar class는 날짜 정보를 제공하는 것이 목적 : new로 인스턴스를 1개만 만들어서 사용
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; // MONTH : 0~11
		int date = cal.get(Calendar.DATE);
		
		System.out.println("Year : " + year + ", Month : " + month + ", Date : " + date);
	}

}










