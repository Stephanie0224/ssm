package com.soecode.lyf.entity;

/**
 * Created by 耿志飞 on 2018/12/6 0006.
 */
public class User {
    private Integer id;

    private String phoneNum;

    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
