package sh.java_char;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * 문자기반의 입출력 스트림
 * - 텍스트파일을 읽거나 쓸때 사용하는 스트림 클래스
 * - 기본 스트림은 FileReader, FileWriter
 * - 보조 스트림은 BufferedReader, BufferedWriter
 * */
public class FileReaderWriterStudy {
	
	public static void main(String[] args) {
		FileReaderWriterStudy study = new FileReaderWriterStudy();
//		study.test1();
		study.test1();
	}

	/**
	 * 보조스트림 변수명 = new 보조스트림(new 기본스트림(대상))
	 * */
	private void test2() {
		try(
			BufferedReader br = new BufferedReader(new FileReader("helloworld.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("hiworld2.txt", true)); // false면 덮어쓰기 true면 이어쓰기
																			// boolean append
		){
			String line = null;
			// BufferedReader#readLine은 개행문자까지 읽어서 개행문자를 제외하고 반환
			while((line = br.readLine()) != null) {
				System.out.println(line);
				bw.write(line); // 개행빼고 나옴
				bw.write("\r\n"); // 윈도우의 개행문자\r\n(13 10), 리눅스/맥의 개행문자 \n(10)
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private void test1() {
		try(
			FileReader fr = new FileReader("helloworld.txt");
			FileWriter fw = new FileWriter("hiworld.txt");
		) {
			int data = 0;
			while((data = fr.read()) != -1) {
				System.out.println(data + " " + (char)data); // 한글 안깨짐
				fw.write(data); // 한글자씩 출력
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
