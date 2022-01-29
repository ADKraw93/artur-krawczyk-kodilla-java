package com.kodilla.spring.portfolio;

public class Board {
    TaskList toDoList;
    TaskList inProgressList;
    TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList){
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this. doneList = doneList;
    }

    public void addToDoTask(String task){
        toDoList.addTask(task);
    }

    public void addInProgressTask(String task){
        inProgressList.addTask(task);
    }

    public void addDoneTask(String task){
        doneList.addTask(task);
    }

    public void readToDoList(){
        System.out.println(toDoList.readTasks());
    }

    public void readInProgressList(){
        System.out.println(inProgressList.readTasks());
    }

    public void readDoneList(){
        System.out.println(doneList.readTasks());
    }
}
