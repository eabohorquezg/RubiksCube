
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnDresLoPz
 */
public class Graph_A {
    
    
    public void bfs (long position, byte[] problem, long NodesLevels){
        Queue<byte[]> quedeBFS = new LinkedList<>();
        ToolsCube_A tools = new ToolsCube_A();
        byte[] original = tools.originalCube();
        //problem.printArrayCube();
        quedeBFS.add(problem);
        long iter = 2;
        long cursor = 0;
        //cursor<=NodesLevels &&
        byte[] rc;
        while( cursor < NodesLevels && !quedeBFS.isEmpty()){
            rc = quedeBFS.remove();
            cursor++;
            if(Arrays.equals(original, rc)){
                System.out.println("Solucion en el nodo: "+cursor);
                path(cursor);
                break;
            }            
            if(iter != position){                
                for (int i = 0; i < 18; i++) {
                    //System.out.println("i: "+iter);
                    quedeBFS.add(tools.moveCube(iter,rc));
                    iter++;
                }
            }
            
            if (cursor % 100000 == 0) {
                try {
                    System.out.printf("Outer loop at %d%n", cursor);
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Graph_A.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
        System.out.println("");
        System.out.println("--------------------------------------");
    }
   
    public void dfs (long position, byte[] problem, long NodesLevels, int level){
        
        Stack stack = new Stack();
        ToolsCube_A tools = new ToolsCube_A();
        byte[] original = tools.originalCube();
        //System.out.print("problem: ");
        //tools.printArrayCube(problem);
        stack.push(problem);
        
        byte[] tmp;
        
        long cursor = 0;
        int countlevel = 0;
        long padre = 1;
        byte hijos = 0;
        long positionmove = 1;
        
        while (cursor < NodesLevels && !stack.isEmpty()){
            tmp = (byte[]) stack.pop();
            //tools.printArrayCube(tmp);
            if(Arrays.equals(original, tmp)){
                System.out.println("Solucion en el nodo: "+cursor);
                path(positionmove);
                break;
            }
            //System.out.println(countlevel);
            if(countlevel < level){
                countlevel++;
                for (int i = 17; i >= 0; i--) {
                    //System.out.println("i: "+i);
                    stack.push(tools.moveCube(i,tmp));
                }
                padre=positionmove;
                positionmove = positionNode(padre, 0);                
                //System.out.println("hijo: "+positionmove+" padre: "+padre+" -- "+stack.size());
                
            }
            else if (hijos==17){
                countlevel--;
                hijos=0;
                while (positionNode(fatherNode(padre), 17) == padre){
                    //System.out.println("p:: "+padre+" - "+fatherNode(padre)+"-"+positionNode(fatherNode(padre), 17) );
                    padre = fatherNode(padre);
                    countlevel--;
                }                
                padre =padre+1;
                positionmove=padre;
                //System.out.println("new padre "+fatherNode(padre));
                
            }
            else{
                hijos++;
                positionmove = positionNode(padre, hijos);
                //System.out.println("hijo: "+positionmove+" padre: "+padre);
            }
            cursor++;            
        }
        System.out.println("CO: "+cursor);
    }
    
    public Long positionNode(Long node, int move){
        //System.out.println("pos: "+((18*(node-1))+2+move)+" - "+move);
        return ((18*(node-1))+2+move);
    }
    
    public Long fatherNode(Long node){
        //System.out.println("pos: "+((18*(node-1))+2+move)+" - "+move);
        long module = node%18;
        long tmp = 0;
        if (module == 0) tmp=16;
        else if (module == 1) tmp=17;
        else tmp = module-2;
        
        return ((node -2 -tmp)/18)+1;
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
