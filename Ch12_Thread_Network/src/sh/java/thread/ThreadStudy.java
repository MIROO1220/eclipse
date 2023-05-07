package sh.java.thread;

import java.util.Scanner;

/**
 * program - 저장장치에 보관된 상태의 프로그램
 * process - 실행중인 프로그램. pid를 부여받고, os에 의해 제어된다.
 * thread - process 하위의 실제 작업단위
 * */
public class ThreadStudy {

	public static void main(String[] args) {
		ThreadStudy study = new ThreadStudy();
//		study.test1();
//		study.test2();
//		study.test3();
//		study.test4();
//		study.test5();
		study.test6();
		System.out.println("---- " + Thread.currentThread().getName() + " 종료 ----");
	}


	/**
	 * 데몬 쓰레드 daemon thread
	 * - 백그라운드 쓰레드
	 * - 일반쓰레드가 종료되면 따라서 자동종료하는 쓰레드
	 * */
	private void test6() {
		Thread thread = new Thread(new CountDown(10));
		thread.setDaemon(true);
		thread.start(); 
		
		System.out.println("10초안에 아무글자 + 엔터를 누르세요.");
		new Scanner(System.in).next();
	}


	/**
	 * @실습문제 : 카운트다운쓰레드 만들기
	 * - 초수 지정가능해야함.
	 * - new CountDown(10)
	 * */
	private void test5() {
		new Thread(new CountDown(5), "카운드다운 알바").start();
	}
	
	static void delay(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	static class CountDown implements Runnable {
		private int second;
		
		public CountDown(int second) {
			this.second = second;
		}
		
		@Override
		public void run() {
			for(int i=second; i>0; i--) {
				System.out.println(i);
				delay(1000); // 예외처리가 되었기 때문에 간결히 호출가능!
			}
			System.out.println(Thread.currentThread().getName() + "종료!");
		}
		
	}

	
	/**
	 * 쓰레드 상태제어 - sleep
	 * */
	private void test4() {
		for(int i=0; i<10; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000); // 현재쓰레드는 1초동안 일시정지
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}

	
	/**
	 * 쓰레드 생성하는 방법 2 - Runnable 구현
	 * - 쓰레드의 순번을 제어할 수 없다.
	 * - 우선순위 부여정도는 가능.
	 * */
	private void test3() {
		Runnable run1 = new BarThread('*');
		Runnable run2 = new BarThread('$');
		Thread th1 = new Thread(run1);
		Thread th2 = new Thread(run2);
		th1.setName("일꾼1");
		th2.setName("일꾼2");
		
		th1.setPriority(Thread.MAX_PRIORITY); // 10
		th2.setPriority(Thread.MIN_PRIORITY); // 1
		
		th1.start();
		th2.start();
	}
	
	static class BarThread implements Runnable {
		private char ch;
		public BarThread(char ch) {
			this.ch = ch;
		}
		
		@Override
		public void run() {
			new ThreadStudy().print(ch);
			System.out.print("<" + Thread.currentThread().getName() + " 종료>");
		}
	}

	
	/**
	 * 쓰레드 생성하는 방법 1 - Thread 상속
	 * */
	private void test2() {
		Thread th1 = new FooThread('+');
		Thread th2 = new FooThread('|');
		th1.start(); // 새로운 callstack에 Thread#run을 호출
		th2.start();
	}
	
	static class FooThread extends Thread{
		private char ch;
		public FooThread(char ch) {
			this.ch = ch;
		}
		/**
		 * 쓰레드가 할일 정의
		 * */
		@Override
		public void run() {
			new ThreadStudy().print(ch);
		}
	}

	
	/**
	 * 메인쓰레드
	 * */
	private void test1() {
		print('+');
		print('|');
	}
	
	public void print(char ch) {
		for(int i=0; i<100; i++) {
			System.out.print(ch);
		}
	}
}
