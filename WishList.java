// 찜기능 관리

import java.util.List;

public class WishList {
	private String bookTitle; // 찜한 책 제목
	private String bookAuthor; // 찜한 책 작가
	private List<Book> interestbooks; //관심있는 책들을 InterestBooks에 모아둔다.
	
	public WishList() { }
	
	public WishList(String bookTitle, String bookAuthor) {
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
	}
	
	public String getBookTitle() {
		return bookTitle;
	}
	
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	
	public String getBookAuthor() {
		return bookAuthor;
	}
	
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

}
