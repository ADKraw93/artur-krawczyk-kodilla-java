package com.kodilla.good.patterns.challenges;

public class User {
    public final String userName;
    public final String userSurname;
    public final String userAdress;

    public User(String userName,
                String userSurname,
                String userAdress) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.userAdress = userAdress;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public String getUserAdress() {
        return userAdress;
    }
}
