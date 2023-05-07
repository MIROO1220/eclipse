package sh.java.io_byte;

import java.io.Serializable;

/**
 * Serializable 인터페이스는 몸통코드가 없는 마커 인터페이스이다. (규격만 제공)
 * -> 오버라이딩 할게 없음*/
public class User implements Serializable {
	
	private String username;
	private String password;
	private boolean married;
	
	public User() {}

	public User(String username, String password, boolean married) {
		super();
		this.username = username;
		this.password = password;
		this.married = married;
	}

	public String getUserName() {
		return username;
	}
	
	public void setUserName(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * booelan형의 getter는 is로 시작
	 * */
	public boolean isMarried() {
		return this.married;
	}
	
	public void setMarried(boolean married) {
		this.married = married;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
	
}
