package p01.basic4;

public class TestStudent {

	public static void main(String[] args) {

		Student s = new Student();
		
		System.out.println("name : " + s.name);
		System.out.println("age : " + s.age);
		System.out.println("컴퓨터 전공여부 : " + s.isComputerMajor);
		System.out.println("성별 : " + s.gender);
		
	}

}
