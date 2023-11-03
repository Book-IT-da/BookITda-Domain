//책 카테고리

import java.util.List;

public class Category {
	int categoryId;		// 카테고리 구분 Id
	String categoryName;	// 카테고리 이름
	private List<Book> books; //카테고리에 속한 책들을 books에 모아둔다.

	public Category() { }
	
	public Category(int categoryId, String categoryName) {
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}
	
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
}
