package com.websocket.back.utility;

import com.websocket.back.entity.User;

public class UserMock {
    static private User user1;
    static private User user2;

    public static User getUser1(){
        return User.builder().Id(1).Name("User--1").build();
    }
    public static User getUser2(){
        return User.builder().Id(2).Name("User--2").build();
    }

}
