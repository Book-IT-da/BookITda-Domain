/**
 * 책에 대한 리뷰
 */
public class Review {
	private int reviewId;	// 리뷰 구분 id
	private String nickname; // 작성자(닉네임 사용)
	private int stars; 	// 별점
	private String level;	// 난이도 (초급 : 중급 : 고급)
	private String purpose;	// 독서 목적
	private String recommend_object;	// 추천 대상
	private String keyword;	// 책 키워드 
	private String onelineReview;	// 한줄평
	private String multilineReview;	// 상세 리뷰

	public Review() { }
	
	public Review(int reviewId, String nickname, int stars, 
			String level, String purpose, String recommend_object, 
			String keyword, String onelineReview, String multilineReview) {
		this.reviewId = reviewId;
		this.nickname = nickname;
		this.stars = stars;
		this.level = level;
		this.purpose = purpose;
		this.recommend_object = recommend_object;
		this.keyword = keyword;
		this.onelineReview = onelineReview;
		this.multilineReview = multilineReview;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}
	
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getRecommendObject() {
		return recommend_object;
	}

	public void setRecommendObject(String recommend_object) {
		this.recommend_object = recommend_object;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	public String getOnelineReview() {
		return onelineReview;
	}

	public void setOnelineReview(String onelineReview) {
		this.onelineReview = onelineReview;
	}
	
	public String getMultilineReview() {
		return multilineReview;
	}

	public void setMultilineReview(String multilineReview) {
		this.multilineReview = multilineReview;
	}
}