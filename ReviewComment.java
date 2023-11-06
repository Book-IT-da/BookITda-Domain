/**
 * 책 리뷰에 대한 댓글
 */
import java.util.*;

public class ReviewComment {
	private int reviewCommentId;	// 리뷰 댓글 구분 id
	private String nickname; // 작성자(닉네임 사용)
	private String commentContent;	// 리뷰 댓글 내용
	private Date createDate;	// 래뷰 댓글 작성 날짜

	public ReviewComment() { }
	
	public ReviewComment(int reviewCommentId, String nickname, 
			String commentContent, Date createDate) {
		this.reviewCommentId = reviewCommentId;
		this.nickname = nickname;
		this.commentContent = commentContent;
		this.createDate = createDate;
	}

	public int getReviewCommentId() {
		return reviewCommentId;
	}

	public void setReviewCommentId(int reviewCommentId) {
		this.reviewCommentId = reviewCommentId;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
