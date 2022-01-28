package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    String username;

    ForumUser () {
        this.username = "John Smith";
    }

    String getUsername(){
        return username;
    }
}
