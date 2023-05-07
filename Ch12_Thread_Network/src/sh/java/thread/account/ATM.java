package sh.java.thread.account;

import java.util.Random;

public class ATM implements Runnable {
	private Account acc;
	
	public ATM(Account acc) {
		this.acc = acc;
	}

	@Override
	public void run() {
		
		while(this.acc.getBalance() > 0) {
			delay(1500);
			int money = (new Random().nextInt(3) + 1) * 100; // 100 | 200 | 300
			acc.withdraw(money);
		}
	}

	private void delay(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
