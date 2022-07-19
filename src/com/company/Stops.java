package com.company;

import java.util.ArrayList;

public class Stops {
    private String name;
    private boolean isOpen;
    private String[] lines;
    private boolean isConnector;

    public Stops(String name, String[] lines, boolean isConnector){
        this.name = name;
        isOpen = true;
        this.lines = lines;
        this.isConnector = isConnector;
    }

    public String returnName(){
        return name;
    }

    public void changeStatus(){
        isOpen = !isOpen;
    }


    public String[] returnLines(){
        return lines;
    }

    public boolean isConnector(){
        return isConnector;
    }
}
