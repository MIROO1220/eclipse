package p01.basic;

// StudentWorker는 Person의 손자이고 Student의 자식
// 손자는 부모, 할아버지, ... 조상들 모두의 field, method 사용 가능
public class StudentWorker extends Student {
	
	int arb; // 아르바이트해서 번 돈
	
	public StudentWorker() {
		System.out.println("StudentWorker 생성자 호출");
	}
	
	void work() {
		study();
		walk();
		System.out.println(name + "는 공부하면서 일 합니다.");
	}

}
