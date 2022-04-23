package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTestSuite {

    @Test
    public void updateTest() {
        //Given
        Mentor mentorJohn = new Mentor("John Checkker");
        Mentor mentorSue = new Mentor("Sue Failyou");
        Student studentRicky = new Student("Ricky Dicky");
        Student studentJassmine = new Student("Jassmine Passme");
        Student studentWelb = new Student("Welb Pleasehelp");
        studentRicky.registerMentor(mentorJohn);
        studentJassmine.registerMentor(mentorSue);
        studentWelb.registerMentor(mentorJohn);
        studentWelb.registerMentor(mentorSue);
        //When
        studentRicky.addHomework("I did a math excercise.");
        studentJassmine.addHomework("I did an English homework.");
        studentWelb.addHomework("I tried to paint something.");
        studentRicky.addHomework("I did another math exercise.");
        studentWelb.addHomework("2 + 2 = 5? Is it ok?");
        //Then
        assertEquals(mentorJohn.getHomeworkCount(), 4);
        assertEquals(mentorSue.getHomeworkCount(), 3);
    }
}
