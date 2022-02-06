package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    /*@Bean
    @Scope("prototype")*/
    @Autowired
    @Qualifier("theList")
    TaskList theList;
    /*@Autowired
    @Qualifier("inProgressList")
    TaskList inProgressList;
    @Autowired
    @Qualifier("doneList")
    TaskList doneList;*/

    @Bean("theList")
    public TaskList getTheList() { return new TaskList();}

    @Bean
    public Board getBoard(){
        return new Board(theList, theList, theList);
    }

    /*@Bean("toDoList")
    @Scope("prototype")
    public TaskList getToDoList(){
        return new TaskList();
    }

    @Bean("inProgressList")
    @Scope("prototype")
    public TaskList getInProgressList(){
        return new TaskList();
    }

    @Bean("doneList")
    @Scope("prototype")
    public TaskList getDoneList(){
        return new TaskList();
    }*/
}
