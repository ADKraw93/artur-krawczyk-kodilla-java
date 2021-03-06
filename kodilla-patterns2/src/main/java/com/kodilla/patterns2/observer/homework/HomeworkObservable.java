package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.Observer;

public interface HomeworkObservable {
    void registerMentor(Mentor mentor);
    void notifyHomework();
    void removeMentor(Mentor mentor);
}
