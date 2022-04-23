package com.kodilla.patterns2.observer.homework;

public class Mentor implements HomeworkObserver{
    private final String name;
    private int homeworkCount;

    public Mentor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHomeworkCount() {
        return homeworkCount;
    }

    @Override
    public void update(Student student) {
        System.out.println(name + ": " + student.getName() + " has sent a new homework." + "\n" +
                " (total: " + student.getHomeworks().size() + " homeworks)");
        homeworkCount++;
    }
}
