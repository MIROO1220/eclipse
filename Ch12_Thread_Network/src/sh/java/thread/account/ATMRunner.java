package sh.java.thread.account;

/**
 * - 공유자원 : 멀티쓰레드 환경에서 각 쓰레드가 공통으로 참조하는 객체
 * - 동기화 Synchronization : 멀티쓰레드에서 공유자원을 사용하는 순서를 정해줘야 문제가 발생하지 않는다.
 * - 임계영역 Critical Section : 한번에 하나의 쓰레드만 사용하는 공유자원. Lock을 획득한 쓰레드만 접근이 가능하다.
 * 
 * - 동기화처리1 - synchronized 메소드로 작성 (해당객체가 임계영역으로 설정됨)
 * - 동기화처리2 - synchronized 블럭 작성 (임계영역으로 객체를 지정). 효율적인 방법
 * */
public class ATMRunner {

	public static void main(String[] args) {
		Account acc = new Account(1000); // 1000원이 입금되어 있는 계좌
		
		Thread th1 = new Thread(new ATM(acc), "ATM1");
		Thread th2 = new Thread(new ATM(acc), "ATM2");
		th1.start();
		th2.start();
	}

}
