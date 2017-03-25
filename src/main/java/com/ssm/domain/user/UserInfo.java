package com.ssm.domain.user;

public class UserInfo {
    private String username;

    private String password;

    private Integer qqNumber;

    private Integer telNumber;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getQqNumber() {
        return qqNumber;
    }

    public void setQqNumber(Integer qqNumber) {
        this.qqNumber = qqNumber;
    }

    public Integer getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(Integer telNumber) {
        this.telNumber = telNumber;
    }
}