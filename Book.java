import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * 책 정보 관리
 */
public class Book {
	private String ISBN;		// 책 고유번호
	private String title;	// 책 제목
	private String author;	// 책 저자
	private String publisher;	// 책 출판사
	private String publicationDate;	// 책 출판일자
	private byte[] cover;	//책 표지
	private String bookInfo;	// 책 정보
	private String bookIndex;	// 책 목록
	private String authorInfo;	// 책 저자 정보
	private String[] keywords;	// 책 키워드
	private double averageStar;	// 책 총 평점
	private List<Review> reviews;  //리뷰들을 reviews에 모아둔다.

	public Book() { }
	
	public Book(String ISBN, String title, String author, 
			 String publisher, String publicationDate, byte[] cover, 
			String bookInfo, String bookIndex, String authorInfo, 
			String[] keywords, double averageStar) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.publicationDate = publicationDate;
		this.cover = cover;
		this.ISBN = ISBN;
		this.bookInfo = bookInfo;
		this.bookIndex = bookIndex;
		this.authorInfo = authorInfo;
		this.keywords = keywords;
		if(Double.toString(averageStar)==null) {
			this.averageStar=0;
		}
		else {
			this.averageStar=averageStar;
		}
	}

	
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	
	public String getISBN() {
		return ISBN;
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

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}
	
	public byte[] getCover() {
		return cover;
	}

	public void setCover(byte[] cover) {
		this.cover = cover;
	}
	
	public String getBookInfo() {
		return bookInfo;
	}

	public void setBookInfo(String bookInfo) {
		this.bookInfo = bookInfo;
	}
	
	public String getBookIndex() {
		return bookIndex;
	}

	public void setBookIndex(String bookIndex) {
		this.bookIndex = bookIndex;
	}
	
	public String getAuthorInfo() {
		return authorInfo;
	}

	public void setAuthorInfo(String authorInfo) {
		this.authorInfo = authorInfo;
	}
	
	public String[] getKeywords() {
		return keywords;
	}

	public void setKeywords(String[] keywords) {
		this.keywords = keywords;
	}
	
	public Double getAverageStar() {
		return averageStar;
	}
	
	//평점 계산 후 저장 , 리뷰가 갱신될 때마다 호출되어야 함.
	public void setAverageStar() {
		Iterator<Review> iterator= reviews.iterator();
		int total=0;
		int count=0;
		
		while(iterator.hasNext()) {
			total += iterator.next().getStars();
			count++;
		}
		averageStar = total / count;
	}
	
	
	//검색 후 검색결과에 나오는 책 정보
	//표지는 따로 return해야 함.
	 Map<String, String> getSummary() {
		Map<String, String> summary = new HashMap<>();
		summary.put("title", title);
		summary.put("author",author);
		summary.put("publisher", publisher);
		
		return summary;
	}
	 
	 //검색 결과 후 책을 클릭했을 때 책 정보가 자세하게 나오기 위해 호출됨.
	 //표지는 따로 return 해야 함 .
	 Map<String, String> getDetail() {
		Map<String, String> detail = new HashMap<>();
		detail.put("title", title);
		detail.put("ISBN", ISBN);
		detail.put("author",author);
		detail.put("publisher", publisher);
		detail.put("publicationDate", publicationDate);
		detail.put("bookInfo", bookInfo);
		detail.put("bookIndex", bookIndex);
		detail.put("AuthorInfo", authorInfo);
		
		return detail;
	}
}
