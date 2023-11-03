/**
 * 사용자 관리
 */
public class User {
	private String userId;	// 사용자 아이디
	private String password;	// 사용자 비밀번호
	private String name;	// 사용자 이름
	private String email;	// 사용자 이메일
	private String nickname;	// 사용자 닉네임
	private String itLevel;//사용자 it수준

	public User() { }
	
	public User(String userId, String password, String name, String email, String nickname, String itLevel) {
		this.userId = userId;
		this.password = password;
		this.name = name;
		this.email = email;
		this.nickname = nickname;
		this.itLevel = itLevel;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getItLevel() {
		return itLevel;
	}

	public void setItLevel(String itLevel) {
		this.itLevel = itLevel;
	}
	

}
