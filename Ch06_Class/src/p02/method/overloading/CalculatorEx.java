package p02.method.overloading;

public class CalculatorEx {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		double result = 0;
	
		result = calc.areaReactangle(10);
		System.out.println("정사각형 넓이 : " + result); // println -> String
		System.out.println(result); // println -> double // => println메소드 내부적으로 오버로딩 되어있음
		
		result = calc.areaReactangle(10, 20);
		System.out.println("직사각형 넓이 : " + result);
	}

}
