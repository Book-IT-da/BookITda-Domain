// Q&A 게시판 관리
public class Question {
	private int bId; // Q&A 게시판 항목 번호
	private String title; // 제목
	private String type; // 질문 글 유형
	private String nickname; // 작성자(닉네임 사용)
	private String date; // 글 작성한 시간
	private int views; // 조회수
	private String questionContent; // 질문 글 내용
	
	public Question() { }
	
	public Question(int bId, String title, String type, String nickname, 
			String date, int views, String questionContent) {
		this.bId = bId;
		this.title = title;
		this.type = type;
		this.nickname = nickname;
		this.date = date;
		this.views = views;
		this.questionContent = questionContent;
	}
	 
	public int getBId() {
		return bId;
	}

	public void setBId(int bId) {
		this.bId = bId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public String getQuestionContent() {
		return questionContent;
	}

	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
	}

}
