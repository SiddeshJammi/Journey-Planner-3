package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Gengraph {
    private int  vertices;
    private LinkedList<Integer> adjList[];

    public Gengraph(){
        this.vertices = 272;
        adjList = new LinkedList[vertices];
        for(int i = 0;i<vertices;i++){
            adjList[i] = new LinkedList<>();
        }
    }

    public void  addEdge(int source, int destination){
        adjList[source].add(destination);
        adjList[destination].add(source);

    }

}
