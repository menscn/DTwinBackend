package com.msc.DTwinBackend.entity.pojo;

/**
 * @author mSc
 * @version 1.0
 * @Package com.msc.DTwinBackend.entity.pojo
 * @Description:
 */
public class MsgContent2 {
    private String id;
    private String content;

    @Override
    public String toString() {
        return "[ id = " + id + "; " + " content = " + content + " ]";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
