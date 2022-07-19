package com.company;

public class Central implements Trains {
    String name;
    String color;
    boolean isOperational;
    public Central(){
        name = "Central Line";
        color = "Red";
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
