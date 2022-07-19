package com.company;

public class Victoria implements Trains{
    String name;
    String color;
    boolean isOperational;

    public Victoria(){
        name = "Victoria line";
        color = "Sky Blue";
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
