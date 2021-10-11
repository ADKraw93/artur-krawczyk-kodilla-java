package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    //Nie było nic wspomniane, że potrzebujemy konstruktora i w sumie chyba nie potrzebujemy
    //Poniższą metodę możnaby zrobić jako static

    public List<Integer> exterminate(List<Integer> numbers){
        List<Integer> tempList = new ArrayList<Integer>();
        for(Integer number: numbers){
            if(number%2==0){
                tempList.add(number);
            }
        }
        return tempList;
    }
}
