package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Student implements HomeworkObservable {
    private final String name;
    private final List<Mentor> mentors;
    private final List<String> homeworks;

    public Student(String name) {
        this.name = name;
        this.mentors = new ArrayList<>();
        this.homeworks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Mentor> getMentors() {
        return mentors;
    }

    public List<String> getHomeworks() {
        return homeworks;
    }

    public void addHomework(String homework) {
        homeworks.add(homework);
        notifyHomework();
    }

    @Override
    public void registerMentor(Mentor mentor) {
        mentors.add(mentor);
    }

    @Override
    public void notifyHomework() {
        for(Mentor mentor: mentors) {
            mentor.update(this);
        }
    }

    @Override
    public void removeMentor(Mentor mentor) {
        mentors.remove(mentor);
    }
}
