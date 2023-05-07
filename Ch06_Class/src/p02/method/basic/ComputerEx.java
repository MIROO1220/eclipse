package p02.method.basic;

public class ComputerEx {

	public static void main(String[] args) {
		
		Computer myCom = new Computer();
		
		int[] values = {1,2,3};
		
		int result = myCom.sum1(values);
		System.out.println("result : " + result);

		result = myCom.sum1(new int[] {1,2,3,4,5});
		System.out.println("result : " + result);
		
		result = myCom.sum2(1,2,3);
		System.out.println("result : " + result);
		
		result = myCom.sum2(values);
		System.out.println("result : " + result);
		
		result = myCom.sum2(1,2,3,4,5);
		System.out.println("result : " + result);
		
		result = myCom.sum2(new int[] {1,2,3,4,5,6});
		System.out.println("result : " + result);
	}

}
