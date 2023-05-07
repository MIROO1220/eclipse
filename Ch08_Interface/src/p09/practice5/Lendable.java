package p09.practice5;

public interface Lendable {
	
	void checkOut(String borrower, String date); // 대출
	void checkIn(); // 반납

}
