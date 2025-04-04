package com.websocket.back.utility;

import com.websocket.back.entity.Post;
import com.websocket.back.entity.User;

public class PostMock {
    static private Post post1;
    static private Post post2;

    public static Post getPost1(){
        return Post.builder().title("Post--1").build();
    }
    public static Post getPost2(){
        return Post.builder().title("Post--2").build();
    }
}
