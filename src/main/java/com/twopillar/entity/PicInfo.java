package com.twopillar.entity;

public class PicInfo {
    private String id;

    private Integer userInfoId;

    private Integer replyInfoId;

    private String url;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(Integer userInfoId) {
        this.userInfoId = userInfoId;
    }

    public Integer getReplyInfoId() {
        return replyInfoId;
    }

    public void setReplyInfoId(Integer replyInfoId) {
        this.replyInfoId = replyInfoId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}