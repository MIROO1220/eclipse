package edu.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.Student;
import edu.kh.oop.cls.model.vo.User;
// import edu.kh.oop.cls.model.co.TestVo;

public class ClsService /*extends Student*/ {
						// 부모 Student를 상속 받음
	public void ex1() {
		
		// 클래스 접근 제한자 확인하기
		Student std = new Student();
		// public class인 Student는 import가능
		
		// Testvo test = new TestVo();
		// (default) class인 TestVo는 import 불가 (다른 패키지)
		
		System.out.println( "다른 패키지" );
		// 다른 패키지에서도 접근 가능한 public만 에러X
		
		// System.out.println( std.v1 );
		// System.out.println( std.v2 );
		// System.out.println( std.v3 );
		// System.out.println( std.v4 );
		
		// 상속 관계에서 직접 접근 가능
		// System.out.println( v1 );
		// System.out.println( v2 ); // protected 직접 접근 가능
		// System.out.println( v3 );
		// System.out.println( v4 );
	}
	
	public void ex2() {
		
		// static 필드 확인 예제
		
		// 학생 객체 2개 생성
		
		Student std1 = new Student();
		Student std2 = new Student();
		
		// 학생 객체에 name 세팅
		
		std1.setName( "한미루" );
		std2.setName( "도레미" );
		
		// 정보 출력
		System.out.println( std1.schoolName );
		System.out.println( std1.getName() );
		
		System.out.println( std2.schoolName );
		System.out.println( std2.getName() );
		
		// schoolName 변경
		std1.schoolName = "KH정보교육원";
		System.out.println( "변경 후 std1 : " + std1.schoolName );
		System.out.println( "std2 : " + std2.schoolName ); // KH고등학교 (X) -> KH정보교육원
		
		// std3 생성
		Student std3 = new Student();
		System.out.println( "std3 : " + std3.schoolName );
		
		System.out.println( std3.getName() );
		
		// schoolName에 노란줄이 뜨는 이유 -> 제대로 작성하지 않아서
		
		// *** static이 붙은 필드(변수)는 클래스명.변수명으로 사용함 ***
		Student.schoolName = "kh";
		System.out.println( "Student.schoolName : " + Student.schoolName );
		
		/* static
		 * 
		 * 1) 공유 메모리 영역 (또는 정적 메모리 영역) 이라고 함
		 * 
		 * why? 프로그램 시작 시 static이 붙은 코드들이 모두
		 * static 영역에 생성되고,
		 * 프로그램이 종료될 때 까지 사라지지 않음 (정적)
		 * 그리고 static 영역에 생성된 변수는 어디서든지 공유할 수 있다. (공유)
		 * 
		 * 2) 사용 방법 : 클래스명.변수명
		 * 
		 * */
		
	}
	
	public void ex3() {
		// 생성자 확인 테스트
		
		// Student 객체를 기본 생성자를 이용해 생성하고 이를 참조하는 참조변수 s1에 대입
		Student s1 = new Student();
						// 기본 생성자
		
		// User 기본 생성자를 이용해서 객체 생성
		User user1 = new User();
		
		// User 객체 필드 초기화 확인
		System.out.println( user1.getUserId() );
		System.out.println( user1.getUserPw() );
		System.out.println( user1.getUserName() );
		System.out.println( user1.getUserAge() );
		System.out.println( user1.getUserGender() );
		
		// User 기본 생성자를 이용해서 객체 생성
		User user2 = new User();
		
		// User 객체 필드 초기화 확인
		System.out.println( user2.getUserId() );
		System.out.println( user2.getUserPw() );
		System.out.println( user2.getUserName() );
		System.out.println( user2.getUserAge() );
		System.out.println( user2.getUserGender() );
		
		// 문제점 : user1이 참조하고 있는 User객체와
		//		  user2가 참조하고 있는 User객체의 필드 값이 모두 동일함
		//        why? 같은 기본 생성자로 User 객체를 생성했기 때문에
		
		System.out.println("-----------------------------------------");
		// 해결방법 1 : setter를 이용해서 새로운 값을 대입
		user2.setUserId( "user97" );
		user2.setUserPw( "pass97" );
		user2.setUserName( "한미루" );
		user2.setUserAge( 27 );
		user2.setUserGender( '여' );
		
		System.out.println( user2.getUserId() );
		System.out.println( user2.getUserPw() );
		System.out.println( user2.getUserName() );
		System.out.println( user2.getUserAge() );
		System.out.println( user2.getUserGender() );
		
		// 해결방법2 : 매개변수 생성자를 이용해서
		//		    객체가 생성될 때 부터 다른값으로 필드를 초기화
		User user3 = new User( "test4", "pass444" ); // 매개변수 생성자
							// 생성자 수행 시 전달할 값을 작성(순서 꼭 지켜야됨!)
		
							// 생성된 User 객체의 필드에 "tes4", "pass444" 초기화됨
		
		System.out.println( user3.getUserId() );
		System.out.println( user3.getUserPw() );
		
	}
	
	public void ex4() { // 매개변수 생성자 예제
		
		User user1 = new User(); // 기본 생성자
		User user2 = new User( "user02", "pass02" ); // 매개변수 2개 생성자
		User user3 = new User( "user03", "pass03", "한미루", 27, '여' ); // 매개변수 5개 생성자
		User user4 = new User( "user04", "pass04", "서강준", 30, '남' ); // 매개변수 5개 생성자
		User user5 = new User( "user05", "pass05", "장원영", 22, '여' ); // 매개변수 5개 생성자
		
		System.out.printf( "user1 : %s / %s / %s / %d / %c\n",
								   user1.getUserId(), user1.getUserPw(), user1.getUserName(), user1.getUserAge(), user1.getUserGender() );
		System.out.printf( "user2 : %s / %s / %s / %d / %c\n",
								   user2.getUserId(), user2.getUserPw(), user2.getUserName(), user2.getUserAge(), user2.getUserGender() );
		System.out.printf( "user3 : %s / %s / %s / %d / %c\n",
							       user3.getUserId(), user3.getUserPw(), user3.getUserName(), user3.getUserAge(), user3.getUserGender() );
		System.out.printf( "user4 : %s / %s / %s / %d / %c\n",
								   user4.getUserId(), user4.getUserPw(), user4.getUserName(), user4.getUserAge(), user4.getUserGender() );
		System.out.printf( "user5 : %s / %s / %s / %d / %c\n",
								   user5.getUserId(), user5.getUserPw(), user5.getUserName(), user5.getUserAge(), user5.getUserGender() );
		
	}

}


























