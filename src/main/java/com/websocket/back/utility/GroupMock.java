package com.websocket.back.utility;

import com.websocket.back.entity.Group;

import java.util.ArrayList;
import java.util.List;

public class GroupMock {
    static private Group group;

    public static Group getGroup(){
        return Group.builder()
                .Id(1)
                .title("Group--1")
                .followedMembers(List.of(UserMock.getUser1(), UserMock.getUser2()))
                .postList(new ArrayList<>(List.of(PostMock.getPost1(), PostMock.getPost2())))
                .build();
    }
}
