package edu.kh.darr.model.vo;

public class Member {

	// 필드(== 멤버 변수)
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	private String region; // 지역(서울, 경기, 충북 ...)
	
	// 생성자
	public Member() {} // [접근제한자][클래스명] > 반환형은 쓰지 않는다.
	
	public Member(String memberId, String memberPw, String memberName, 
			int memberAge, String region) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
		this.region = region;
		
	}
		
	
	
	// 메소드
	// getter / setter
	
	public String getMemberId() {
		return memberId;
	}
	
	public void setMemberId(String memberId) {
		this.memberId = memberId;
		return;
		// 모든 메소드는 종료 시 호출한 곳으로 돌아가는
		// return 구문이 작성 되어야만 하지만
		// 단, void일 경우 생략 가능하다.
		// > 생략 시 컴파일러가 자동으로 추가해준다.
	}
	
	public String getMemberPw() {
		return memberPw;
	}
	
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	
	
	
}
