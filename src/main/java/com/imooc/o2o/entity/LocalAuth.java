package com.imooc.o2o.entity;

import java.util.Date;

public class LocalAuth {
    private Long LocalAuthId;
    private  String userName;
    private String  password;
    private Date createTime;
    private Date lastEditTime;
    private PersonInfo personInfo;

    public LocalAuth() {

    }

    public Long getLocalAuthId() {
        return LocalAuthId;
    }

    public void setLocalAuthId(Long localAuthId) {
        LocalAuthId = localAuthId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }

    @Override
    public String toString() {
        return "LocalAuth{" +
                "LocalAuthId=" + LocalAuthId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", createTime=" + createTime +
                ", lastEditTime=" + lastEditTime +
                ", personInfo=" + personInfo +
                '}';
    }
}
