package sh.java.io_byte;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 파일을 대상으로 하는 기본스트림
 * - FileInputStream
 * - FileOutputStream
 * 
 * 성능향상을 목적으로 하는 바이트기반 보조스트림
 * - BufferedInputStream
 * - BufferedOutputStream
 * 
 * 입출력스트림은 사용 후에 반드시 반환(메모리)해야한다.
 * - close 호출
 * */
public class FileInputOutputStreamStudy {

	public static void main(String[] args) {
		FileInputOutputStreamStudy study = new FileInputOutputStreamStudy();
		study.test1();
//		study.test2();
//		study.test3();
	}

	/**
	 * 보조스트림을 통한 성능개선
	 * 
	 * 보조스트림 변수 = new 보조스트림(new 기본스트림(대상));
	 * */
	private void test3() {
		try(
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("praying_cat.jpg"));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("cat_copy.jpg"));
		){
			int len = 0; // 읽어온 데이터의 크기
			byte[] bytes = new byte[8192]; // 8192 -> 8kb 기본값
			while((len = bis.read(bytes)) != -1) {
				System.out.println(len);
				bos.write(bytes, 0, len); // bytes배열에서 0 ~ len번지에 내용을 출력
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}


	/**
	 * try...with...resource
	 * - resource구문에 선언된 스트림객체는 자동으로 반환된다. close작성 안해도 됨.
	 * */
	private void test2() {
		try(
			FileInputStream fis = new FileInputStream("helloworld.txt");
			FileOutputStream fos = new FileOutputStream("copy2.txt");
		){
			int data = 0;
			// InputStream#read는 byte단위로 값을 읽어 정수(int)로 반환한다.
			// 더이상 읽어올 값이 없는 경우 -1을 반환
			while((data = fis.read()) != -1) {
				System.out.println(data + " " + (char)data); // 콘솔에 출력
				fos.write(data); // 파일에 출력
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	
	private void test1() {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			
			fis = new FileInputStream("helloworld.txt"); // 프로젝트 루트디렉토리 하위의 helloworld.txt를 찾음
			fos = new FileOutputStream("copy.txt"); // 출력스트림에 전달한 파일이 존재하지 않으면, 파일을 새로 생성
			
			int data = 0;
			// InputStream#read는 byte단위로 값을 읽어 정수(int)로 반환한다.
			// 더이상 읽어올 값이 없는 경우 -1을 반환
			while((data = fis.read()) != -1) {
				System.out.println(data + " " + (char)data); // 콘솔에 출력                      
				fos.write(data); // 파일에 출력
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
