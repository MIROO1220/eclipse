package p09.practice3;

public class BonusPointAccount extends Account {
	
	int bonusPoint;
	
	public BonusPointAccount(String accountNo, String ownerName, int balance, int bonusPoint) {
		super(accountNo, ownerName, balance);
		this.bonusPoint = bonusPoint;
	}

	public void deposit(int amount) { // 예금 기능을 다시 구현하는 메소드
		balance += amount;
		super.deposit(amount); // super class의 deposit() 호출하여 계산
		bonusPoint += (int)(amount*0.001);
	}

}
