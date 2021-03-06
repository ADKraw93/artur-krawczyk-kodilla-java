package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task){
        tasks.add(task);
    }

    public String readTasks(){
        return tasks.toString();
    }

    public List<String> getTasks() {
        return tasks;
    }
}
