package com.company;


public class Bakerloo implements Trains {

    private String name;
    private String color;
    private boolean isOperational;

    public Bakerloo(){  
        name = "Bakerloo line";
        color = "Brown";
        isOperational = true;
    }

    @Override
    public String returnName(){
        return name;
    }

    @Override
    public String returnColor(){
        return color;
    }

    @Override
    public void changeStatus() {
        isOperational = !isOperational;
    }
}
