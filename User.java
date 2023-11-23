package service.dto;

public class User {
    private String userId;      // 아이디
    private String password;    // 비밀번호
    private String name;        // 이름
    private String nickname;    // 닉네임
    private String email;       // 이메일
    private int levelId;        
    private int categoryId1;    
    private int categoryId2; 
    private int categoryId3; 
    private int languageId1;
    private int languageId2;
    private int languageId3;
    
    public User() {
        super();
    }

    public User(String userId, String password, String name, String nickname, String email, int levelId,
            int categoryId1, int categoryId2, int categoryId3, int languageId1, int languageId2, int languageId3) {
        super();
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.nickname = nickname;
        this.email = email;
        this.levelId = levelId;
        this.categoryId1 = categoryId1;
        this.categoryId2 = categoryId2;
        this.categoryId3 = categoryId3;
        this.languageId1 = languageId1;
        this.languageId2 = languageId2;
        this.languageId3 = languageId3;
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLevelId() {
        return levelId;
    }

    public void setLevelId(int levelId) {
        this.levelId = levelId;
    }

    public int getCategoryId1() {
        return categoryId1;
    }

    public void setCategoryId1(int categoryId1) {
        this.categoryId1 = categoryId1;
    }

    public int getCategoryId2() {
        return categoryId2;
    }

    public void setCategoryId2(int categoryId2) {
        this.categoryId2 = categoryId2;
    }

    public int getCategoryId3() {
        return categoryId3;
    }

    public void setCategoryId3(int categoryId3) {
        this.categoryId3 = categoryId3;
    }

    public int getLanguageId1() {
        return languageId1;
    }

    public void setLanguageId1(int languageId1) {
        this.languageId1 = languageId1;
    }

    public int getLanguageId2() {
        return languageId2;
    }

    public void setLanguageId2(int languageId2) {
        this.languageId2 = languageId2;
    }

    public int getLanguageId3() {
        return languageId3;
    }

    public void setLanguageId3(int languageId3) {
        this.languageId3 = languageId3;
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", password=" + password + ", name=" + name + ", nickname=" + nickname
                + ", email=" + email + ", levelId=" + levelId + ", categoryId1=" + categoryId1 + ", categoryId2="
                + categoryId2 + ", categoryId3=" + categoryId3 + ", languageId1=" + languageId1 + ", languageId2="
                + languageId2 + ", languageId3=" + languageId3 + "]";
    }
}
