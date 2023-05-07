package sh.java.exception;

/**
 * 커스텀예외클래스 만들기
 * - 비지니스로직의 흐름을 잘 설명할 수 있는 클래스명을 사용한다.
 * 
 * - checked exception으로 만들려면, extends Exception
 * 	-> 예외처리 흐름 작성까지 강제화하려는 경우
 * - unchecked exception으로 만들려면, extends RuntimeException
 * 
 * 생성자, 초기화블럭은 상속x, 자식클래스에서 매번 작성해야한다.
 * */
public class UnderAgeException extends RuntimeException {
	
	public UnderAgeException() {}
	
	public UnderAgeException(String message) {
		super(message);
	}
}
