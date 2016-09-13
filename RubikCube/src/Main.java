
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Enumeration;
import java.util.GregorianCalendar;

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
    private static final long NUM_LEVELS = 5;//15;
    private static final long NUM_MOV = 18;
    private static final long NUM_NODES = (long)((Math.pow(NUM_MOV, NUM_LEVELS)-1)/(NUM_MOV-1));
    private static final long TOTAL = (long)((Math.pow(NUM_MOV, NUM_LEVELS+1)-1)/(NUM_MOV-1));
    
    public static void main(String []args)
    {    
       System.out.println("Time "+ new GregorianCalendar().getTime()); 
       Graph g = new Graph();
       //hacer metodo para desarmar cubo
       //g.makeNode(1L, new RubiksCube().RandomCube(5));//se crea el nodo raiz con cubo desarmado 
       //g.createGraph(NUM_NODES);
       System.out.println("nodos del grafo : "+TOTAL);
       //g.printGraph();
       System.out.println("Inicio Busqueda");
       System.out.println("Time "+ new GregorianCalendar().getTime());
       //g.dfs(g.getNode(1L)); 
       //g.bfs(g.getNode(1L)); 
       //g.dfsRecursive(g.getNode(1L));
       g.Astar(new RubiksCube().RandomCube(5));
       System.out.println("termine");
       System.out.println("Time "+ new GregorianCalendar().getTime()); 
       
    }
    
}
