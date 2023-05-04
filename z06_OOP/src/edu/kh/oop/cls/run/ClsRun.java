package edu.kh.oop.cls.run;

import edu.kh.oop.cls.model.service.ClsService;
import edu.kh.oop.cls.model.vo.Student;

public class ClsRun {

	public static void main(String[] args) {
		
//		Student std = new Student();
		
//		std.ex();

		ClsService service = new ClsService();
		
//		service.ex2(); // static 확인 예제 호출
//		service.ex3(); // 생성자 예제
		service.ex4(); // 매개변수 생성자 예제

	}

}
