package p02.method.basic;

public class Computer {
	
	public int sum1(int[] values) {
		
		int sum = 0;
		
		for(int i=0; i<values.length; i++) { // 배열로 넘김
			sum += values[i];
		}
		
		return sum;
	}
	
	public int sum2(int... values) { // 같은 배열이지만 매개변수로 넘김
		
		int sum = 0;
		
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		
		return sum;
	}

}
