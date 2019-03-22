package com.Lipt0n.test.Beans;

public class UserToken {

    private String token;
    private int userId;

    public UserToken() {
    }

    public UserToken(String token, int userId) {
        this.token = token;
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
