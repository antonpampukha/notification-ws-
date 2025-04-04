package com.websocket.back.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Group {
    Integer Id;
    String title;
    List<User> followedMembers;
    List<Post> postList;
}
