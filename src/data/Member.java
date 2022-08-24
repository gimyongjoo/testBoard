package data;

import java.time.LocalDateTime;

public class Member {

    private int id; // 회원의 번호를 저장 할 변수

    private String loginId;
    private String password;
    private String name;

    private LocalDateTime regDate;
    private LocalDateTime updateDate;

    public Member(int id, String loginId, String passward, String name){

        this.id = id;
        this.loginId = loginId;
        this.password = passward;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassward() {
        return password;
    }

    public void setPassward(String passward) {
        this.password = passward;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }
}
