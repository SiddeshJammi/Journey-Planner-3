package com.company;

public class StopLogic {
    private static Gengraph graph;
    private StopMapper s;
    public StopLogic(){
        graph = new Gengraph();
        s = new StopMapper();
    }
    private void constructGraph(){
        graph.addEdge(0,1);
    }


}
