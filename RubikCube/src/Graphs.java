
import java.util.Hashtable;
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
public class Graphs {
    
    
    public void bfs (long position, RubiksCube problem, long NodesLevels){
        Queue<RubiksCube> quedeBFS = new LinkedList<RubiksCube>();
        //problem.printArrayCube();
        quedeBFS.add(problem);
        long iter = 2;
        long cursor = 0;
        //cursor<=NodesLevels &&
        
        while( cursor < NodesLevels && !quedeBFS.isEmpty()){
            RubiksCube rc = quedeBFS.remove();
            cursor++;
            if(rc.isOrdered()){
                System.out.println("Solucion en el nodo: "+cursor);
                path(cursor);
                break;
            }
            
            if(iter != position){                
                for (int i = 0; i < 18; i++) {
                    //System.out.println("i: "+iter);
                    quedeBFS.add(rc.moveCube(iter));
                    iter++;
                }
            }                       
        }
        System.out.println("");
        System.out.println("--------------------------------------");
    }
   
    
    public Long positionNode(Long node, int move){
        //System.out.println("pos: "+((18*(node-1))+2+move)+" - "+move);
        return ((18*(node-1))+2+move);
    }
    
    public void path(long numberNode){
        String pathNode = Long.toString(numberNode)+" ";
        while (numberNode>1){
            long module = numberNode%18;
            long tmp = 0;
            if (module == 0) tmp=16;
            else if (module == 1) tmp=17;
            else tmp = module-2;
            
            long tmpvalue = ((numberNode -2 -tmp)/18)+1;
            numberNode = tmpvalue;
            pathNode += nameMove((int)tmp)+Long.toString(tmpvalue)+" ";           
        }
        System.out.println("Solución: "+pathNode);
    }
    
    public String nameMove(int numberMove){
        switch (numberMove){
                case 0: return "L ";
                case 1: return "LP ";
                case 2: return "B "; 
                case 3: return "BP ";
                case 4: return "D ";
                case 5: return "DP ";
                case 6: return "E ";
                case 7: return "EP ";
                case 8: return "F ";
                case 9: return "FP ";
                case 10: return "M ";
                case 11: return "MP ";
                case 12: return "R ";
                case 13: return "RP "; 
                case 14: return "S "; 
                case 15: return "SP ";
                case 16: return "U "; 
                case 17: return "UP ";
            }
        return null;
    }
}
