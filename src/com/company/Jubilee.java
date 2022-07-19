package com.company;

public class Jubilee implements Trains{
    String name;
    String color;
    boolean isOperational;

    public Jubilee(){
        name = "Jubilee line";
        color = "Gray";
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
