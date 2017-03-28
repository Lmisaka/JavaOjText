package com.ssm.domain.user;

public class User {
    private String username;

    private String password;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", statis=" + statis +
                '}';
    }

    private Integer statis;

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

    public Integer getStatis() {
        return statis;
    }

    public void setStatis(Integer statis) {
        this.statis = statis;
    }
}