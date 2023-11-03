/**
 * 책 리뷰에 대한 댓글
 */
public class ReviewComment {
	private int reviewCommentId;	// 리뷰 댓글 구분 id
	private String nickname; // 작성자(닉네임 사용)
	private String commentContent;	// 리뷰 댓글 내용

	public ReviewComment() { }
	
	public ReviewComment(int reviewCommentId, String nickname, String commentContent) {
		this.reviewCommentId = reviewCommentId;
		this.nickname = nickname;
		this.commentContent = commentContent;
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

}
