
import java.util.ArrayList;
import java.util.Hashtable;

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
 
    public void makeNode( Long id, RubiksCube cube )
    {
 	ids.add(id);
 	nodes.put(id,new Node(id, cube));
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
    
}
