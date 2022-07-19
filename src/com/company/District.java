package com.company;

public class District implements Trains{
    String name;
    String color;
    boolean isOperational;

    public District(){
        name = "District line";
        color = "Green";
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
