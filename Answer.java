// Q&A 게시판 답변 글 관리
public class Answer {
	private int cId; // 답변 글 번호
	private Question board; // Q&A 게시판 질문 글(QNA_Board) 참조
	private String nickname; // 작성자(닉네임 사용)
	private String date; // 글 작성한 시간
	private String answerComment; // 답변 글 내용
	
	public Answer() { }
	
	public Answer(int cId, Question board, String nickname,
			String date, String answerComment) {
		this.cId = cId;
		this.board = board;
		this.nickname = nickname;
		this.date = date;
		this.answerComment = answerComment;
	}
	
	public int getCId() {
		return cId;
	}
	
	public void setCId(int cId) {
		this.cId = cId; 
	}
	
	public Question getBoard() {
		return board;
	}
	
	public void setBoard(Question board) {
		this.board = board;
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
	
	public String getAnswerComment() {
		return answerComment;
	}
	
	public void setAnswerComment(String answerComment) {
		this.answerComment = answerComment;
	}

}
