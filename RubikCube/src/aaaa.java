
import java.util.LinkedList;
import java.util.Queue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnDresLoPz
 */
public class aaaa {
    public static void main(String []args)
    {
       Queue<RubiksCube> quedeBFS = new LinkedList<RubiksCube>();
       quedeBFS.add(new RubiksCube());
       
       RubiksCube mk = quedeBFS.remove();
       mk.printArrayCube();
       
       quedeBFS.add(mk.moveL());
       quedeBFS.add(mk.moveB());
       
       mk = quedeBFS.remove();
       mk.printArrayCube();
       quedeBFS.add(mk.moveL());
       quedeBFS.add(mk.moveB());
       
       mk = quedeBFS.remove();
       mk.printArrayCube();
       
       mk = quedeBFS.remove();
       mk.printArrayCube();
       
       
               
       
    }
}
