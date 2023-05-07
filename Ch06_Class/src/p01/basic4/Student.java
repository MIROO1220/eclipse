package p01.basic4;

// 초기값 설정없이 new Student()로 힙메모리에 인스턴스 생성하면 Java가 자동으로 모든 field들에 대하여 초기값을 설정해줌
// - int, short, byte, char, long : 0으로 초기화
// - boolean : false로 초기화
// - double, float : 0.0으로 초기화
// - String, 배열 등 참조객체 : null로 초기화
public class Student {
	
	String name;
	int age;
	boolean isComputerMajor;
	char gender;
	
	public Student() {}
	
}
