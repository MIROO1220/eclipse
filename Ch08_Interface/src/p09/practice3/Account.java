package p09.practice3;

public class Account {
	
	String accountNo; // 계좌번호
	String ownerName; // 예금주 이름
	public int balance; // 잔액
	
	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	public void deposit(int amount) { // 예금
		this.balance += amount;
	}
	
	public int withdraw(int amount) throws Exception { // 인출
		if(balance<amount) { // 잔액이 요구금액보다 적으면 Exception 발생
			throw new Exception("잔액이 부족합니다.");
		}else {
			return this.balance -= amount;
		}
	}

}
