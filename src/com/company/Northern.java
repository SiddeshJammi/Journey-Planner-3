package com.company;

public class Northern implements Trains{
    String name;
    String color;
    boolean isOperational;

    public Northern(){
        name = "Northern line";
        color = "Black";
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
