package com.company;

public class Picadilly implements Trains{
    String name;
    String color;
    boolean isOperational;

    public Picadilly(){
        name = "Picadilly line";
        color = "Blue";
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
