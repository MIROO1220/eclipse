package edu.kh.inheritance.model.vo;

public /*final*/ class Parent { // 부모 클래스
	// Object 상속 중
	
	// ** final 클래스 **
	// -> 마지막 클래스라는 의미로 "더 이상 상속 불가"를 뜻함
	
	public /*final*/ void method() {
		
		// ** final 메소드 **
		// -> 마지막 메소드라는 의미로 "더 이상 오버라이딩(재정의) 불가"를 뜻함
		System.out.println( "테스트용 메소드" );
	}

}
