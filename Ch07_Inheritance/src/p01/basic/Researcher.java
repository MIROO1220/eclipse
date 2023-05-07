package p01.basic;

public class Researcher extends Person {
	
	public Researcher() {
		System.out.println("Researcher 생성자 호출");
	}
	
	void research() {
		System.out.println(name + "는 연구를 합니다.");
	}

}
