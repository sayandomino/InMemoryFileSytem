package com.example.springboot.dto;

public class FileUpdateRequest {
    private String content;
    private boolean isAppend;

    public FileUpdateRequest(String content, boolean isAppend) {
        this.content = content;
        this.isAppend = isAppend;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean getIsAppend() {
        return isAppend;
    }

    public void setIsAppend(boolean  isAppend) {
        this.isAppend = isAppend;
    }
}
