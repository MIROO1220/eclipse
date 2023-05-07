package sh.java.exception;

import javax.print.attribute.standard.NumberOfDocuments;

public class NoGoodScoreException extends RuntimeException {
	// Exception으로 상속 받으면 checked exception이기때문에 반드시 예외처리해야하기때문에 오류가 생김
	// 아님 throws NoGoodScoreException로 던지기 -> 예외처리의무를 던진것
	public NoGoodScoreException() {}
	
}
