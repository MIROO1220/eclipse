package sh.java.io_byte;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 * 객체입출력스트림
 * - 입출력을 객체단위로 수행하는 스트림
 * - ObjectInputStrem#readObject
 * - ObjectOutputStrem#writeObject
 * - 입출력에 사용할 클래스는 java.io.Serializable 인터페이스를 구현해야 한다.
 * */
public class ObjectInputOutputStreamStudy { // 변수한번에 바꾸기 alt + shif + r

	public static void main(String[] args) {
		ObjectInputOutputStreamStudy study = new ObjectInputOutputStreamStudy();
		study.test1();
		study.test2();
//		study.test3();
//		study.test4();
	}

	
	/**
	 * @실습문제 : 사용자아이디를 입력받고 해당사용자의 정보를 출력
	 * - 해당정보가 존재하지 않으면, "회원가입을 먼저 하셔야 합니다." 출력
	 * */
	private void test4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("조회할 아이디 입력 : ");
		String id = sc.nextLine();
		
		File src = new File("users/" + id + ".dat");
		try(ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(src)))){
			User user = (User) ois.readObject(); // downcasting (명시적으로 작성)
			System.out.println("-------------------");
			System.out.println("     조회결과");
			System.out.println("-------------------");
			System.out.println("아이디 : " + user.getUserName());
			System.out.println("비밀번호 : " + user.getPassword());
			System.out.println("결혼여부 : " + user.isMarried());
		}catch(FileNotFoundException e) {
			System.out.println("회원가입을 먼저 하셔야 합니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}

}


	/**
	 * @실습문제 : 회원정보를 입력해서 각 회원파일에 저장하세요
	 * - 아이디 패스워드 결혼여부 -> User객체 -> 아이디.dat 파일에 저장(객체)
	 * - users/sinsa.dat
	 * */
	private void test3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 입력 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 입력 : ");
		String pw = sc.nextLine();
		
		System.out.print("결혼여부(y/n로 입력) : ");
		boolean married = sc.next().charAt(0) == 'y';
		
		// 아이디.dat파일 객체출력
		File usersDir = new File("users");
		if(!usersDir.exists())
			usersDir.mkdir();
		
		// 쓰기 ObjectOutputStream - BufferedOutputStream - FileOutputStream
		File dest = new File(usersDir, id+".dat");
		try(ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(dest)))){
			User user = new User(id, pw, married);
			oos.writeObject(user);
			System.out.println("사용자정보를 정상적으로 저장했습니다!");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
}

	/**
	 * 객체단위로 읽기
	 * */
	private void test2() {
		File f = new File("user.ser");
		try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)))) {
			User user = (User) ois.readObject();
			System.out.println(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
}


	/**
	 * 객체단위로 쓰기
	 * 보조스트림2 변수 = new 보조스트림2(new 보조스트림1(new 주스트림(대상)));
	 * */
	private void test1() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("user.ser")))) {
			User hongd = new User("honggd", "1234", true);
			oos.writeObject(hongd);
			System.out.println("User객체를 쓰기 완료!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
