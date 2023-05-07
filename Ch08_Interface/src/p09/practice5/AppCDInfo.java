package p09.practice5;

import javax.swing.text.AbstractDocument.BranchElement;

public class AppCDInfo extends CDInfo implements Lendable {
	

	String borrower;
	String checkOutDate;
	byte state;
	
	public AppCDInfo(String title) {
		super(title);
	}
	
	@Override
	public void checkOut(String borrower, String date) {
		if(state!=0) {
			return;
		}
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = 1;
		System.out.println("* " + title + " 이(가) 대출되었습니다.");
		System.out.println("대출인 : " + borrower);
		System.out.println("대출일 : " + date + "\n");
	}

	@Override
	public void checkIn() {
		this.borrower = null;
		this.checkOutDate = null;
		this.state = 0;
		System.out.println("* " + title + " 이(가) 반납되었습니다.");
	}

}
