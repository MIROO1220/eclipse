package p02.method.basic;

public class IncrementValue {

	public static void main(String[] args) {
		int n = 1;
		
		System.out.println("increment method 호출 전의 n : " + n);
		increment(n);
		System.out.println("increment method 호출 후의 n : " + n);
		
		System.out.println("newIncrement method 호출 전의 n : " + n);
		n = newIncrement(n);
		System.out.println("newIncrement method 호출 후의 n : " + n);
	}
	
	public static void increment(int n) {
		n++;
		System.out.println("increment method내의 n : " + n);
	}
	
	public static int newIncrement(int n) {
		n++;
		System.out.println("newIncrement method내의 n : " + n);
		return n;
	}
	
}
