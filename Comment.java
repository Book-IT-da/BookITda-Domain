/**
 * 책 리뷰에 대한 댓글
 */
import java.util.*;

public class Comment {
	private int commentId;	// 리뷰 댓글 구분 id
	private String nickname; // 작성자(닉네임 사용)
	private String rContent;	// 리뷰 댓글 내용
	private Date createDate;	// 래뷰 댓글 작성 날짜

	public Comment() { }
	
	public Comment(int commentId, String nickname, 
			String rContent, Date createDate) {
		this.commentId = commentId;
		this.nickname = nickname;
		this.rContent = rContent;
		this.createDate = createDate;
	}

	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getRContent() {
		return rContent;
	}

	public void setRContent(String rContent) {
		this.rContent = rContent;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
