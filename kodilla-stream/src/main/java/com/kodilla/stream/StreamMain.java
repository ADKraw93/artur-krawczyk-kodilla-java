package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Forum theForum = new Forum();

        Map<Integer, ForumUser> mapOfUsers = theForum.getUserList().stream()
                .filter(user -> user.getSex()=='M')
                .filter(user -> user.getDateOfBirth().isBefore(LocalDate.of(2001, 10, 21))) //nie wiem jak po prostu odjąć 20 lat od obecnej daty
                .filter(user -> user.getNumberOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));

        mapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}