package p01.basic;

// 1. 상속(Inheritance)
// - 자식 class는 부모의 field, method 모두 사용 가능
//	 (부모 위의 모든 조상에 속한 field, method들도 사용 가능)
public class TestInheritance {

	public static void main(String[] args) {

		Person p = new Person();
		p.name = "아담";
		p.speak();
		p.eat();
		p.sleep();
		p.walk();
		p.toString(); // toString : Object class의 method
		p.equals(null); // equals : Object class의 method
		
		Student s = new Student();
		s.name = "홍길동";
		s.age = 30;
		s.study();
		s.speak();
		s.eat();
		s.sleep();
		s.walk();
		
		StudentWorker sw = new StudentWorker();
		sw.name = "김학생워커";
		sw.work();
		sw.study();
		sw.speak();
		sw.eat();
		sw.sleep();
		sw.walk();
		
		Researcher r = new Researcher();
		r.name = "강연구원";
		r.research();
		r.speak();
		r.eat();
		r.sleep();
		r.walk();
//		r.work(); // Research와 Student는 관계 없음 (부모는 똑같지만 형제끼리 가질 수 없음)
		
		Professor pf = new Professor();
		pf.name = "안교수";
		pf.teach();
		pf.research();
		pf.speak();
		pf.eat();
		pf.sleep();
		pf.walk();
	}

}
