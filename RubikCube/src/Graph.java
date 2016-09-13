
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Edwin
 */
public class Graph {

    ArrayList<Long> ids;
    ArrayList<Edge> edges;
    Hashtable<Long,Node> nodes;
 
    public Graph()
    {
 	ids = new ArrayList<Long>();
 	nodes = new Hashtable <Long,Node>();
 	edges = new ArrayList <Edge>();
    }
 
    public Long makeNode( Long id, RubiksCube cube )
    {
 	ids.add(id);
 	nodes.put(id,new Node(id, cube));
        return id;
    }
        
    public void makelink( Long initialnode,Long terminalnode,double weight)
    {
 	Edge newedge = new Edge(initialnode,terminalnode,weight);
 	int i= searchIndex(newedge.getWeight());
 	if( i == -1 )
            edges.add(newedge);
 	else
            edges.add(i,newedge);
 	nodes.get(initialnode).makelink(terminalnode,weight);//grafo dirigido
 	//nodes.get(terminalnode).makelink(initialnode,weight);
    }
        
    public int searchIndex( double weight )
    {
        for(int i=0;i<edges.size();i++)
 	{
            if( weight < edges.get(i).getWeight() )
 		return i;
 	}
 	return -1;
    }
    
    public Hashtable getNodes()
    {
 	return nodes;
    }
 	
    public ArrayList<Long> getIds()
    {
 	return ids;
    }
    
    public Node getNode( Long id )
    {
 	return (Node)nodes.get(id);
    }
 
    public ArrayList<Edge> getEdges() {
 	return edges;
    } 

    public void createGraph( Long num_nodes )
    {
        Long node = 1L;
        for(long i = 1; i <= num_nodes; i++) {
            makelink(i, makeNode(++node,getNode(i).getCube().moveL()), 0);
            makelink(i, makeNode(++node,getNode(i).getCube().moveLprime()), 0);
            makelink(i, makeNode(++node,getNode(i).getCube().moveB()), 0);
            makelink(i, makeNode(++node,getNode(i).getCube().moveBprime()), 0);
            makelink(i, makeNode(++node,getNode(i).getCube().moveD()), 0);
            makelink(i, makeNode(++node,getNode(i).getCube().moveDprime()), 0);
            makelink(i, makeNode(++node,getNode(i).getCube().moveE()), 0);
            makelink(i, makeNode(++node,getNode(i).getCube().moveEprime()), 0);
            makelink(i, makeNode(++node,getNode(i).getCube().moveF()), 0);
            makelink(i, makeNode(++node,getNode(i).getCube().moveFprime()), 0);
            makelink(i, makeNode(++node,getNode(i).getCube().moveM()), 0);
            makelink(i, makeNode(++node,getNode(i).getCube().moveMprime()), 0);
            makelink(i, makeNode(++node,getNode(i).getCube().moveR()), 0);
            makelink(i, makeNode(++node,getNode(i).getCube().moveRprime()), 0);
            makelink(i, makeNode(++node,getNode(i).getCube().moveS()), 0);
            makelink(i, makeNode(++node,getNode(i).getCube().moveSprime()), 0);
            makelink(i, makeNode(++node,getNode(i).getCube().moveU()), 0);
            makelink(i, makeNode(++node,getNode(i).getCube().moveUprime()), 0);
        }
    }
    
    public void printGraph(){
        System.out.print("{ ");
        int count;
        for ( Long node : getIds()) {
            System.out.print(node+":{");
            count=0;
            for ( Link l : getNode(node).getLinks() ){
                count++;
                if( getNode(node).getLinks().size() != count )
                    System.out.print(l.getArrivalnode()+",");
                else
                    System.out.print(l.getArrivalnode());
            }
            System.out.print("} ");
        }
        System.out.print("}");
    }
    
    public void bfs(Node root)
    {
        Queue<Node> queue = new LinkedList<Node>();
        root.setVisited(true);
        queue.add(root);
        while( !queue.isEmpty() )
        {
            Node r = (Node)queue.remove();
            if( r.getCube().isOrdered() ){
                path(r.getId());
                break;
            }
            //System.out.print(r.getId()+" ");
            for( Link n: r.getLinks() )
            {
                Node child = getNode(n.getArrivalnode());
                if( child.getVisited() == false )
                {
                    child.setVisited(true);
                    queue.add(child);
                }
            }
        }
    }
    
    public void dfsRecursive(Node root)
    {       
        System.out.print(root.getId()+" ");
        root.setVisited(true);
        for( Link n: root.getLinks() )
        {
            Node child = getNode(n.getArrivalnode());
            if( child.getVisited() == false )
                dfsRecursive(child);
        }
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
        System.out.println(pathNode);
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
    
    public void dfs(Node root)
    {   
        Stack stack = new Stack(); 
        root.setVisited(true);
        stack.push(root);
        while( !stack.isEmpty() )
        {
            Node r = (Node)stack.pop();    
            //System.out.print(r.getId()+" ");
            if( r.getCube().isOrdered() ){
                path(r.getId());
                //System.out.println("lo encontre en "+r.getId());
                break;
            }
            for( Link n: r.getLinks() )
            {
                Node child = getNode(n.getArrivalnode());
                if( child.getVisited() == false )
                {
                    child.setVisited(true);
                    stack.push(child);
                }
            }
        }
    }
    
    public void Astar(Node root)
    {   
        //VACIO

    }
    
}
