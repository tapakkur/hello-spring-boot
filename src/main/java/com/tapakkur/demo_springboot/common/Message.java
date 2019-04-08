package com.tapakkur.demo_springboot.common;

import org.springframework.stereotype.Component;

/**
 * @author tapakkur
 * @ProjectName hello-spring-boot
 * @Date 2019/4/7 12:23
 */

@Component
public class Message {

    private String title;
    private String content;

    public Message(){
        //
    }

    public Message(String title, String content){
        this.title = title;
        this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "the message title is :" + this.title +
                "the message content is :" + this.content;
    }
}
