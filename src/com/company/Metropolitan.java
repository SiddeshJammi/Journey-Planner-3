package com.company;

public class Metropolitan implements Trains{
    String name;
    String color;
    boolean isOperational;

    public Metropolitan(){
        name = "Metropolitan line";
        color = "Maroon";
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
