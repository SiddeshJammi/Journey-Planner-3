package com.company;
import java.util.HashMap;
public class StopMapper {

    private static HashMap<Integer,Stops> stopmap;

    public StopMapper(){
        stopmap = new HashMap<Integer,Stops>();
        addStops();
    }

    public void addStops(){
        Stops stop1 = new Stops("West Harrow", new String[]{"Metropolitan Line"},false);
        stopmap.put(0,stop1);
        Stops stop2 = new Stops("Harrow", new String[]{"Metropolitan Line"},false);
        stopmap.put(1,stop2);
    }

    public String getStop(int value){
        Stops stop = stopmap.get(value);
        return stop.returnName();
    }

    public String[] getLines(int value){
        Stops stop = stopmap.get(value);
        return stop.returnLines();
    }

    public boolean getConnector(int value){
        Stops stop = stopmap.get(value);
        return stop.isConnector();
    }
}
