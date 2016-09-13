
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
public class Test {
 
     public static void main(String []args){
       
        RubiksCube cube = new RubiksCube();
        cube.moveL().printArrayCube();
        System.out.println("");
        cube.printArrayCube();
        System.out.println("--------------");
        cube.printArrayCube();
        cube.moveL();
        System.out.println("");
        cube.printArrayCube();
        System.out.println("");
        cube.moveLprime();
        cube.printArrayCube();
        System.out.println(""); 
        Graph g = new Graph();
        RubiksCube rc = new RubiksCube();
        RubiksCube rc1 = new RubiksCube();
        rc1.moveL();
        g.makeNode(1L,rc);
//        g.makeNode(2L,rc1);
        g.makeNode(3L,rc);
        g.makelink(1L, g.makeNode(2L,rc1), 0);
        g.makelink(1L, 3L, 1);
        g.makelink(2L, 3L, 1);
        System.out.println("EDWIN");
        g.getNode(1L).getCube().printArrayCube();
        System.out.println("EDWIN");
        RubiksCube ed = g.getNode(1L).getCube();
        ed.moveL().printArrayCube();
        System.out.println("EDWIN");
        g.getNode(1L).getCube().printArrayCube();
        System.out.println("EDWIN");
        System.out.println("Grafo: ");
        g.printGraph();
        System.out.println("");
        System.out.println("Nodos : ");
        Enumeration<Long> nodes = g.nodes.keys();
        while(nodes.hasMoreElements()){
            System.out.println(nodes.nextElement());
        }
        System.out.println(" Enlaces "+g.getEdges());
        System.out.println(" 1 esta enlazado con :  ");
        for ( Link l : g.getNode(1L).getLinks() ){
            System.out.println(l.getArrivalnode()+" ");
        }
        System.out.println(" num de enlaces de 1: "+g.getNode(1L).getNumLinks());
        System.out.println("cubo de 1");
        g.getNode(1L).getCube().printArrayCube();
        System.out.println("");
        System.out.println("cubo de 2");
        g.getNode(2L).getCube().printArrayCube();
        System.out.println("");
        System.out.println("cubo de 3");
        g.getNode(3L).getCube().printArrayCube();
        System.out.println("");
        if( g.getNode(1L).equals(g.getNode(3L)) )
             System.out.println("iguales");
    }
     
}
