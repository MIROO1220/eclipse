package com.sh.collections.list.book;

/**
 * 실제 책 데이터보관
 * - VO 클래스 Value Object
 * */
public class Book implements Comparable<Book> {
	
	private String no;
	private int category;
	private String title;
	private String author;
	
	public Book() {}
	
	public Book(String no, int category, String title, String author) {
		super();
		this.no = no;
		this.category = category;
		this.title = title;
		this.author = author;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [no=" + no + ", category=" + category + ", title=" + title + ", author=" + author + "]";
	}
	
	/**
	 * 기본정렬 : 책 제목
	 * */
	@Override
	public int compareTo(Book other) {
		return this.title.compareTo(other.title);
	}
	
}
