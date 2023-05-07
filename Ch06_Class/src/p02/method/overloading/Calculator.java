package p02.method.overloading;

// method overloading
// - method 이름이 동일하더라도 parameter의 data type이 틀리거나, parameter 갯수가 틀릴 경우
//	 (== method signature가 다를경우)
//	 Java에서 자동으로 다른 method로 인식하여 실행함
public class Calculator {
	
	double area;
	
	// 정사각형 넓이
	double areaReactangle(double width) {
		return width*width;
	}
	
	// 직사각형 넓이
	double areaReactangle(double width, double height) {
		return width*height;
	}

}
