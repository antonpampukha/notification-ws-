package com.websocket.back.controller;


import com.websocket.back.entity.Post;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class NotificationController {

    @MessageMapping("/new-post")
    @SendTo("/topic/notifications")
    public String sendNotification(Post post) {
        return "New post: " + post.getTitle() + " in Group--1";
    }
}

