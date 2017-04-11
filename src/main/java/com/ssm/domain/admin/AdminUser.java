package com.ssm.domain.admin;

/**
 * Created by OvO on 2017/3/25.
 */
public class AdminUser {
    private String adUsername;
    private String adPassword;

    public AdminUser() {
    }

    public AdminUser(String adUsername, String adPassword) {
        this.adUsername = adUsername;
        this.adPassword = adPassword;
    }

    @Override
    public String toString() {
        return "AdminUser{" +
                "adUsername='" + adUsername + '\'' +
                ", adPassword='" + adPassword + '\'' +
                '}';
    }

    public String getAdUsername() {
        return adUsername;
    }

    public void setAdUsername(String adUsername) {
        this.adUsername = adUsername;
    }

    public String getAdPassword() {
        return adPassword;
    }

    public void setAdPassword(String adPassword) {
        this.adPassword = adPassword;
    }
}
