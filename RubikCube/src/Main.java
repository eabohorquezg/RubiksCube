
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
    
    //condiciones iniciales (restricciones)
    private static final long NUM_LEVELS = 3;//15;
    private static final long NUM_MOV = 18;
    private static final long NUM_NODES = (long)((Math.pow(NUM_MOV, NUM_LEVELS)-1)/(NUM_MOV-1));
    private static final long TOTAL = (long)((Math.pow(NUM_MOV, NUM_LEVELS+1)-1)/(NUM_MOV-1));
    
    public static void main(String []args)
    {    
       System.out.println("nodos del grafo : "+TOTAL);
       Graph g = new Graph();
       //hacer metodo para desarmar cubo
       g.makeNode(1L, new RubiksCube().moveM().moveM().moveM());//se crea el nodo raiz con cubo desarmado 
       g.createGraph(NUM_NODES);
//       g.printGraph();
       g.dfs(g.getNode(1L)); 
       //g.bfs(g.getNode(1L)); 
       //g.dfsRecursive(g.getNode(1L)); 
       System.out.println("termine");  
       
    }
    
}
