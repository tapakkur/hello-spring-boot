package com.tapakkur.demo_springboot.controller;

import com.tapakkur.demo_springboot.common.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tapakkur
 * @ProjectName hello-spring-boot
 * @Date 2019/4/7 12:29
 */

@RestController
public class MessageController {

    @Autowired
    private Message message;

    private static String title = "hello world";
    private static String content = "nice to meet you ,world!";

    @RequestMapping(value = "setMessage/", method = RequestMethod.POST)
    public void setMessage(
            @RequestParam(value = "title") String title,
            @RequestParam(value = "content") String content
    ){
        message.setTitle(title);
        message.setContent(content);
    }

    @RequestMapping(value = "/getMessage" ,method = RequestMethod.GET)
    public Message getMessage(){
        return new Message(title,content);
    }
}
