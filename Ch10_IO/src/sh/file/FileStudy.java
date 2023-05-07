package sh.file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * java.io.File
 * - 입출력에 필요한 파일/디렉토리에 대한 정보를 가진 자바객체
 * - 파일에 대해 파일명, 경로, 존재여부, 크기등을 조회
 * - 디렉토리에 대해 존재여부, 파일열람 등을 제공
 * */
public class FileStudy {

	public static void main(String[] args) {

		FileStudy study = new FileStudy();
		study.test1();
//		study.test2();
//		study.test3();
//		study.test4();
//		study.test5();
	}

	
	private void test5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		
		File membersDir = new File("members");
		if(!membersDir.exists())
			membersDir.mkdir();
			System.out.println(membersDir + " 생성!");
		
		// 회원명 디렉토리 생성
		File nameDir = new File("members/" + name);
		if(!nameDir.exists())
			nameDir.mkdir();
			System.out.println(nameDir + " 생성!");
		
		// 회원.txt 파일 생성
//		File f = new File("members/" + name + "/" + name + ".txt");
		File f = new File(nameDir, name + ".txt");
		if(!f.exists())
			try {
				f.createNewFile();
				System.out.println(f + " 생성!");
			} catch (IOException e) {
				e.printStackTrace();
			}
	}


	/**
	 * @실습문제 - 회원이름을 입력받고, members디렉토리 하위에 회원명/회원명.txt 파일을 생성하세요.
	 * */
	private void test4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		
		File a = new File("members/" + name);
		if(a.exists()) {
			System.out.println("members 존재합니다.");
		} else {
			System.out.println("members가 존재하지않습니다.");
			a.mkdirs();
			
			File f = new File("members/" + name + "/" + name + ".txt");
			if(!f.exists())
				try {
					f.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}


	/**
	 * File#mkdir() 디렉토리 하나 만들때 사용
	 * File#mkdirs()
	 * */
	private void test3() {
		File a = new File("a");
		if(a.exists()) {
			System.out.println("a가 존재합니다.");
		} else {
			System.out.println("a가 존재하지 않습니다.");
			a.mkdir();
		}
		
		File y = new File("x/y");
		if(y.exists()) {
			System.out.println("x/y가 존재합니다.");
		} else {
			System.out.println("x/y가 존재하지 않습니다.");
			y.mkdirs(); // y의 부모x가 존재하지 않으면 x를 만들고, y를 생성
		}
	}
	
	
	/**
	 * 디렉토리제어
	 * */
	private void test2() {
		File dir = new File("C:\\Workspaces\\java_workspace\\Ch10_IO");
		System.out.println(dir.isDirectory());
		System.out.println(dir.exists());
		
		File[] files = dir.listFiles();
		for(int i=0; i<files.length; i++) {
			File f = files[i];
			if(f.isDirectory())
				System.out.println("[디렉토리]" + f.getName());
			else
				System.out.println(f.getName());
		}
	}


	/**
	 * 파일제어
	 * */
	private void test1() {
//		File f = new File("helloworld.txt"); // 상대경로 (현재디렉토리 또는 기준디렉토리(프로젝트 루트)에서 파일을 찾음)
		File f = new File("C:\\Workspaces\\java_workspace\\Ch10_IO\\helloworld.txt"); // 절대경로 (루트디렉토리부터 시작)
		System.out.println(f.getName());
		System.out.println(f.getParent());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.exists());
		System.out.println(f.isDirectory());
		
		if(!f.exists())
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
//		File dest = new File("안녕 미루.txt");
//		f.renameTo(dest);
	}

}
