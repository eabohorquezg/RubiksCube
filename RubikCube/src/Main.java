
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Edwin
 */
public class Main {  
    
    public static void main(String []args){
        
       long NUM_LEVELS = 2;//15;
       long NUM_MOV = 18;
       long NUM_NODES = (long)((Math.pow(NUM_MOV, NUM_LEVELS+1)-1)/(NUM_MOV-1));
       System.out.println("nodos del grafo : "+NUM_NODES);
       Graph g = new Graph();
       g.makeNode(1L, new RubiksCube());//se crea el nodo raiz
       g.createGraph(NUM_NODES);
       //g.printGraph();
       System.out.println("termine");
        
    }
    
}
