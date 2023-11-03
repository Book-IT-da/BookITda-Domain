//책 언어
import java.util.List;

public class Language {
	int languageId;		// 책 언어 구분 id
	String languageName;	// 언어 이름
	private List<Book> books; // 해당 언어가 사용된 책들을 books에 모아둔다.
	
	public Language() { }
	
	public Language(int languageId, String languageName) {
		this.languageId = languageId;
		this.languageName = languageName;
	}
	
	public int getLanguageId() {
		return languageId;
	}
	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}
	public String getLanguageName() {
		return languageName;
	}
	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}
}
