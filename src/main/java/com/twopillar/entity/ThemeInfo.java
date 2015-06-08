package com.twopillar.entity;

import java.util.Date;

public class ThemeInfo {
    private Integer id;

    private Integer userInfoId;

    private String themeName;

    private Boolean isStickyPost;

    private Date createTime;

    private String delete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(Integer userInfoId) {
        this.userInfoId = userInfoId;
    }

    public String getThemeName() {
        return themeName;
    }

    public void setThemeName(String themeName) {
        this.themeName = themeName == null ? null : themeName.trim();
    }

    public Boolean getIsStickyPost() {
        return isStickyPost;
    }

    public void setIsStickyPost(Boolean isStickyPost) {
        this.isStickyPost = isStickyPost;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDelete() {
        return delete;
    }

    public void setDelete(String delete) {
        this.delete = delete == null ? null : delete.trim();
    }
}