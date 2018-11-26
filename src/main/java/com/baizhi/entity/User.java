package com.baizhi.entity;

import java.util.Date;

public class User {
    private int id;
    private String email;
    private String nickname;
    private String password;
    private Date create_data;
    private String state;
    private String authority;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                ", create_data=" + create_data +
                ", state='" + state + '\'' +
                ", authority='" + authority + '\'' +
                '}';
    }

    public User() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreate_data() {
        return create_data;
    }

    public void setCreate_data(Date create_data) {
        this.create_data = create_data;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public User(int id, String email, String nickname, String password, Date create_data, String state, String authority) {
        this.id = id;
        this.email = email;
        this.nickname = nickname;
        this.password = password;
        this.create_data = create_data;
        this.state = state;
        this.authority = authority;
    }
}
