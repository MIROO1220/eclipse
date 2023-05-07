package sh.java.collections.map;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesStudy {

	public static void main(String[] args) {
		PropertiesStudy study = new PropertiesStudy();
//		study.test1();
		study.test2();
	}

	/**
	 * 별도의 파일로 관리되는 설정파일 읽어서 프로그램 실행하기
	 * - 프로그램과 설정정보는 각각 다른파일을 관리하는 것이 일반적이다.
	 */
	private void test2() {
		Properties prop = new Properties();
		try {
			prop.load(new FileReader("user_credentials.properties"));
			System.out.println("파일을 정상적으로 읽어왔습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		System.out.println(username);
		System.out.println(password);
	}

	/**
	 * Properties
	 * - K,V의 타입이 모두 String
	 * - 환경설정, 속성정보등을 관리하는데 최적화된 타입
	 * - 이전 버젼의 클래스이지만 현재도 자주 사용되고 있다.
	 */
	private void test1() {
		Properties prop = new Properties();
		// 요소추가
		prop.setProperty("username", "honggd");
		prop.setProperty("password", "1234");
		
		// 요소확인
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		
		// 파일 저장
		try {
			prop.store(new FileWriter("user_credentials.properties"), "User Credentials");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(prop);
		
	}

}
