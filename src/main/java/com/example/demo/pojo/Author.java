package com.example.demo.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "t_author")
public class Author {
    private Long id;
    private String realName;
    private String nickName;

    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}