package com.company;

public class Hammersmith implements Trains{
    String name;
    String color;
    boolean isOperational;

    public Hammersmith(){
        name = "Hammersmith and City line";
        color = "Pinkish";
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
