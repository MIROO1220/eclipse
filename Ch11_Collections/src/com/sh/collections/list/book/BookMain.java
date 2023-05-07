package com.sh.collections.list.book;

import java.util.Collections;
import java.util.Scanner;

/**
 * 실행메소드(main)
 * 사용자메뉴 호출
 * */
public class BookMain {
	private Scanner sc = new Scanner(System.in);
	private BookManager bookManager = new BookManager();

	public static void main(String[] args) {
		new BookMain().start();
		System.out.println("---- 이용해 주셔서 감사합니다. ----");
	}

	private void start() {
		String menu = "=======================\n"
				+ "1. 도서추가\n"
				+ "2. 도서검색(제목)\n"
				+ "3. 도서삭제\n"
				+ "4. 도서정렬후 조회\n"
				+ "5. 도서전체조회\n"
				+ "0. 끝내기\n"
				+ "=======================\n"
				+ "입력 : ";
		
		while(true) {
			System.out.print(menu);
			String choice = sc.next();
			
			switch(choice) {
			case "1": bookManager.addBook(); break; // 사용자 책정보를 책 객체로 변화후 BookManager#books에 추가
			case "2": bookManager.searchBook(); break; // 사용자의 책제목 검색어와 일치하는(일부일치)(String#??) 책 목록 출력
			case "3": bookManager.deleteBook(); break; // 해당 책번호로 책 삭제
			case "4": sortBook(); break;
			case "5": bookManager.printBook(null); break;
			case "0": return;
			default: System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

	private void sortBook() {
		String sortMenu = "-------------------\n"
				+ "1. 책제목오름차순\n"
				+ "2. 책제목내림차순\n"
				+ "3. 저자오름차순\n"
				+ "4. 저자내림차순\n"
				+ "0. 메인메뉴로 돌아가기\n"
				+ "-------------------\n"
				+ "입력 : ";
		while(true) {
			System.out.print(sortMenu);
			String choice = sc.next();
			switch(choice) {
			case "1" : bookManager.sortBook(null); break;
			case "2" : bookManager.sortBook(Collections.reverseOrder()); break;
			case "3" : bookManager.sortBook(new BookAuthorAsc()); break;
			case "4" : bookManager.sortBook(Collections.reverseOrder(new BookAuthorAsc())); break;
			case "0" : return;
			default: System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

}
