package p01.basic;

public class Professor extends Researcher {
	
	public Professor() {
		System.out.println("Professor 생성자 호출");
	}
	
	void teach() {
		System.out.println(name + "는 가르킵니다.");
	}

}
