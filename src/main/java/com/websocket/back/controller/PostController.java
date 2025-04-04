package com.websocket.back.controller;

import com.websocket.back.entity.Group;
import com.websocket.back.entity.Post;
import com.websocket.back.utility.GroupMock;
import lombok.AllArgsConstructor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/posts")
public class PostController {

    private final SimpMessagingTemplate messagingTemplate;

    @PostMapping("/create")
    public String createPost(@RequestBody Post post) {
        Group group = GroupMock.getGroup();
        group.getPostList().add(post);

        String notification = "New post: " + post.getTitle() + " in Group--1";
        System.out.println("Sending notification: " + notification);

        messagingTemplate.convertAndSend("/topic/notifications", notification);
        return "{ \"response\" : \"Post created\"}";
    }
}


