
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
    private static final int NUM_LEVELS = 9;//15;
    private static final int NUM_MOV = 18;
    private static final long NUM_NODES = (long)((Math.pow(NUM_MOV, NUM_LEVELS)-1)/(NUM_MOV-1));
    private static final long TOTAL = (long)((Math.pow(NUM_MOV, NUM_LEVELS+1)-1)/(NUM_MOV-1));
        
    public static void main(String []args)
    {
      System.out.println("Iniciio: "+ new GregorianCalendar().getTime());  
      System.out.println("--------------------------------------");
      Graph_A g = new Graph_A();
      System.out.println("nodos del grafo : "+TOTAL);
      //g.bfs(1L, new ToolsCube_A().RandomCube(NUM_LEVELS), TOTAL);
      g.dfs(1L, new ToolsCube_A().RandomCube(NUM_LEVELS), TOTAL,NUM_LEVELS);
      //g.dfs(1L, new ToolsCube_A().moveL(new ToolsCube_A().originalCube()), TOTAL,NUM_LEVELS);
      System.out.println("Final: "+ new GregorianCalendar().getTime());
      //g.bfs(1L, new RubiksCube().moveL().moveL(), TOTAL);
    }
    
    //    public static void main(String []args)
//    {    
//       System.out.println("Time "+ new GregorianCalendar().getTime()); 
//       Graph g = new Graph();
//       //hacer metodo para desarmar cubo
//       g.makeNode(1L, new RubiksCube().RandomCube(3));//se crea el nodo raiz con cubo desarmado 
//       g.createGraph(NUM_NODES);
//       System.out.println("nodos del grafo : "+TOTAL);
//       //g.printGraph();
//       System.out.println("Inicio Busqueda");
//       System.out.println("Time "+ new GregorianCalendar().getTime());
//       //g.dfs(g.getNode(1L)); 
//       g.bfs(g.getNode(1L)); 
//       //g.dfsRecursive(g.getNode(1L));
//       //g.Astar(new RubiksCube().RandomCube(5));
//       System.out.println("termine");
//       System.out.println("Time "+ new GregorianCalendar().getTime()); 
//       
//    }
       
}
