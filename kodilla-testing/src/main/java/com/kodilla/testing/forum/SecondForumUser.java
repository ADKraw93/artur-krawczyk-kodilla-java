package com.kodilla.testing.forum;

public record SecondForumUser(String userName, String realName) {
    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
