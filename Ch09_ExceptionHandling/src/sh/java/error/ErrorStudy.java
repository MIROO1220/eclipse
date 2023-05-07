package sh.java.error;

/**
 * java doc 프로그램 문서화 가능한 주석
 * 
 * Error
 * - 프로그램 수행시에 치명적 상황이 발생한 것 Error클래스를 사용해 표현.
 * - 예외처리로는 해결이 되지 않음.
 * - 소스코드를 수정 또는 환경에 대한 처리가 필요
 * - VirtualMachineError, OutOfMemoryError, StackOverflowError...
 * 
 * */
public class ErrorStudy {

	public static void main(String[] args) {
		System.out.println("---- 시작 ----");
		
		ErrorStudy study = new ErrorStudy();
//		study.test1();
		study.test2();
		
		System.out.println("---- 끝 ----");
	}
	
	/**
	 * StackOverflowError
	 * - 할당받은 stack 메모리를 모두 소진한 경우
	 * */
	public void test2() {
		System.out.println("test2 호출!!");
		test2();
	}
	
	/**
	 * OutOfMemoryError
	 * - 할당받은 heap 메모리를 모두 소진한 경우
	 * */
	public void test1() {
		// java.lang.OutOfMemoryError: Requested array size exceeds VM limit
		long[] arr = new long[Integer.MAX_VALUE];
	}

}
