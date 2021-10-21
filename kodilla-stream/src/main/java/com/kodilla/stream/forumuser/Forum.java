package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> theListOfUsers = new ArrayList<>();

    public Forum() {
        theListOfUsers.add(new ForumUser(1, "Maestro", 'M', LocalDate.of(1993,1,21), 0));
        theListOfUsers.add(new ForumUser(2, "Mary", 'F', LocalDate.of(2003,11,1), 1));
        theListOfUsers.add(new ForumUser(3, "Bobby Lee", 'M', LocalDate.of(1999,2,17), 1));
        theListOfUsers.add(new ForumUser(4, "UFO", 'M', LocalDate.of(1973,3,30), 10));
        theListOfUsers.add(new ForumUser(5, "Pierre de Moll", 'M', LocalDate.of(1985,4,5), 20));
        theListOfUsers.add(new ForumUser(6, "Max", 'M', LocalDate.of(2007,5,6), 0));
        theListOfUsers.add(new ForumUser(7, "Tommy Jackson", 'M', LocalDate.of(2005,6,9), 0));
        theListOfUsers.add(new ForumUser(8, "Chris O'Neil", 'M', LocalDate.of(1955,7,10), 0));
        theListOfUsers.add(new ForumUser(9, "Marty McMarthy", 'F', LocalDate.of(2001,8,25), 50));
        theListOfUsers.add(new ForumUser(10, "Boogie Woogie", 'F', LocalDate.of(2009,5,16), 32));
        theListOfUsers.add(new ForumUser(11, "A.K Johnson", 'M', LocalDate.of(1991,9,1), 4));
        theListOfUsers.add(new ForumUser(12, "Noname", 'F', LocalDate.of(2002,10,19), 0));
        theListOfUsers.add(new ForumUser(13, "Guess Who", 'F', LocalDate.of(1993,11,13), 0));
        theListOfUsers.add(new ForumUser(14, "Bully Back", 'M', LocalDate.of(1975,12,2), 0));
        theListOfUsers.add(new ForumUser(15, "XYZ", 'F', LocalDate.of(1989,1,26), 15));
        theListOfUsers.add(new ForumUser(16, "Alex", 'F', LocalDate.of(1988,12,8), 0));
    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(theListOfUsers);
    }
}
