package edu.kh.oop.method.vo;

public class Member {

		//필드
	private String memberId; // 아이디
	private String memberPw; // 비밀번호
	private String memberName; // 이름
	private int memberAge; //나이
	
	// 기본 생성자
	public Member() {}
	
	//매개변수 생성자 (필드 모두 초기화 용)
	public Member(String memberId, String memberPw, String memberName, int memberAge) {
		// 오버로딩 적용(매개변수 개수 다름)
		
		// 전달 받은 값을 필드로 옮겨 담기
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
	}

	// 기능 (getter / setter)
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		// get + 필드명
		return memberName;
	}
	
	// 매개변수로 전달 받은 값을 memberName 필드에 대입
	// (매개변수 == 전달 받을 값을 지니고 있는 변수)
	public void setMemberName(String memberName) {
				// set + 필드명
		this.memberName = memberName;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}
	
	
	
	
	
}
