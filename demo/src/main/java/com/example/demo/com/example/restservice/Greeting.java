package com.example.demo.com.example.restservice;

/**
 * @Description:
 * @Author: ZhangCong
 * @Date: 2020/5/4 21:36
 */
public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}