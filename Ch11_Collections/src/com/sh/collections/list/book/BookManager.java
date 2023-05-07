package com.sh.collections.list.book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * - 책데이터 관리 List<Book>
 * - 책추가/수정/정렬 기능
 * */
public class BookManager {
	private static final int CATEGORY_인문 = 1;
	private static final int CATEGORY_자연과학 = 2;
	private static final int CATEGORY_의료 = 3;
	private static final int CATEGORY_기타 = 4;
	
	Scanner sc = new Scanner(System.in);
	
	private List<Book> books = new ArrayList<>();
	{
		// 정수기입보다 카테고리 상수를 사용하면 가독성을 좋게 할 수 있다.
		books.add(new Book("200", CATEGORY_자연과학, "나미야 잡화점의 기적", "히가시노 게이고"));
        books.add(new Book("100", CATEGORY_의료, "파리의 아파트", "기욤 뮈소"));
        books.add(new Book("400", CATEGORY_인문, "ABCDE", "도레미"));
        books.add(new Book("300", CATEGORY_자연과학, "미중전쟁", "김진명"));
        books.add(new Book("500", CATEGORY_인문, "JAVA 삽질하기", "김동현"));
	}
	
	public void printBook(List<Book> books) {
		if(books == null)
			books = this.books;
		
		if(books.isEmpty()) {
			System.out.println("----------------------------------------------");
			System.out.println("관리하는 도서가 존재하지 않습니다.");
			System.out.println("----------------------------------------------");
		}else {
			System.out.println("----------------------------------------------");
			System.out.println("no\tcategory\ttitle\t\tauthor");
			System.out.println("----------------------------------------------");
			for(Book book : books) {
				System.out.printf("%s\t%s\t%s\t\t%s\n", book.getNo(), book.getCategory(), book.getTitle(), book.getAuthor());
			}
			System.out.println("----------------------------------------------");
		}
	}
	
	/**
	 * Object#clone 객체를 복제
	 * - 복제하고자 하는 클래스에서 오버라이딩이후 사용할 수 있다. (protected -> public)
	 * - 반환타입이 Object이므로 downcasting후 사용할 것.
	 * */
	public void sortBook(Comparator<Book> comparator) {
		ArrayList<Book> _books = (ArrayList<Book>) this.books; // ArrayList#clone을 사용하기 위한 downcasting (원본보존을 위해)
		List<Book> copy = (List<Book>) _books.clone();
		copy.sort(comparator); // null이면 기본정렬, comparator가 존재하면 기타정렬 // 저장된 순서 날라감!
		printBook(copy);
	}

	
	/**
	 * 사용자에게 책번호 입력 -> books에서 해당책 조회 -> 해당책이 존재하면 삭제
	 * */
	public void deleteBook() {
		System.out.println("<삭제할 도서를 입력하세요.>");
		System.out.print("삭제할 도서번호 입력 : ");
		String no = sc.nextLine();
		
//		boolean flag = false;
//		
//		for(int i=0; i<books.size(); i++) {
//			
//			if(no.equals(books.get(i).getNo())) {
//				books.remove(i);
//				System.out.println("해당 도서가 삭제되었습니다.");
//				flag = true;
//			}
//		}
//		if(!flag) {
//			System.out.println("해당 도서가 존재하지 않습니다.");
//		}
		Book delBook = null;
		for(int i=0; i<books.size(); i++) {
			Book book = books.get(i);
			if(book.getNo().equals(no)) {
				delBook = book; // 반복문안에서 바로 지우면 반복을 뛰어 넘는경우가 있어서
				break;
			}
		}
		
		if(delBook == null) {
			System.out.println("해당 책이 존재하지 않습니다.");
		}else {
			books.remove(delBook); // 인덱스 또는 해당 요소로 삭제
			System.out.println("해당 책을 삭제했습니다.");
		}
	}

	
	/**
	 * 사용자 검색한 제목 입력 -> books에 조회 -> 결과 출력
	 * - n개의 검색결과
	 * - 0개
	 * */
	public void searchBook() {
		// n개의 검색결과를 담을 수 있는 List생성
		List<Book> results = new ArrayList<>();
		
		System.out.println("<검색할 도서를 입력하세요.>");
		System.out.print("검색할 도서 제목 입력 : ");
		String title = sc.nextLine();

//		boolean flag = false;
//		
//		for(int i=0; i<books.size(); i++) {
//			
//			if(books.get(i).getTitle().contains(title)) {
//				System.out.println(books.get(i).getTitle());
//				flag = true;
//			}
//		}
//		if(!flag) {
//			System.out.println("해당 도서가 존재하지 않습니다.");
//		}
		
		for(int i=0; i<books.size(); i++) {
			Book book = books.get(i);
			if(book.getTitle().indexOf(title)>-1) {
				results.add(book);
			}
		}
		printBook(results);
	}

	
	/**
	 * 사용자 책정보 입력 -> Book객체 -> books 추가
	 * */
	public void addBook() {
		System.out.println("<책정보를 입력하세요.>");
		System.out.print("도서 번호 입력 : ");
		String no = sc.nextLine();
		System.out.print("카테고리 입력(1.인문 2.자연과학 3.의료 4.기타) : ");
		int category = sc.nextInt();
		sc.nextLine(); // 개행 날리기용
		System.out.print("도서 제목 입력 : ");
		String title = sc.nextLine();
		System.out.print("도서 저자 입력 : ");
		String author = sc.nextLine();
		
		Book book = new Book(no, category, title, author);
		books.add(book);
		System.out.println("<도서를 저장했습니다.>");
		
	}

}
