package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Bean("theList")
    @Scope("prototype")
    public TaskList getTheList() { return new TaskList();}

    @Bean
    public Board getBoard(@Qualifier("theList") final TaskList toDoList,
                          @Qualifier("theList") final TaskList inProgressList,
                          @Qualifier("theList") final TaskList doneList){
        return new Board(toDoList, inProgressList, doneList);
    }

}
