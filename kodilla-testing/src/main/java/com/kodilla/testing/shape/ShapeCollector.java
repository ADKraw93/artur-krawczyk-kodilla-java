package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    List<Shape> list = new ArrayList<>();

    public void addFigure(Shape shape){
        list.add(shape);
    }

    public void removeFigure(Shape shape){
        for(int i=0; i<list.size(); i++){
            if(list.get(i).equals(shape)){
                list.remove(i);
            }
        }
    }

    public Shape getFigure(int n){
        return list.get(n);
    }

    public String showFigures(){
        String text = "";
        for(int i=0; i<list.size(); i++){
            //first case if list is empty
            if(list.isEmpty()){text = "";}

            if(i==0){
                text = list.get(i).getShapeName();
            } else {
                text = text + ", " + list.get(i).getShapeName();
            }
        }
        return text;
    }

    public List<Shape> getList() {
        return list;
    }
}
