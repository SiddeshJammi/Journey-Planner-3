package com.company;

public class Circle implements Trains{

    String name;
    String color;
    boolean isOperational;

    public Circle(){
        name = "Circle line";
        color = "Yellow";
        isOperational = true;
    }

    @Override
    public String returnName() {
        return name;
    }

    @Override
    public String returnColor() {
        return color;
    }

    @Override
    public void changeStatus() {
        isOperational = !isOperational;
    }
}
