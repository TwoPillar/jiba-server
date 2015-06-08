package com.twopillar.entity;

public class ReplyInfo {
    private Integer id;

    private Integer themeInfoId;

    private Integer userInfoId;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getThemeInfoId() {
        return themeInfoId;
    }

    public void setThemeInfoId(Integer themeInfoId) {
        this.themeInfoId = themeInfoId;
    }

    public Integer getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(Integer userInfoId) {
        this.userInfoId = userInfoId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}