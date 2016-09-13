
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Edwin 
 */
public class Node 
{        
    private long id;
    private RubiksCube cube;
    private ArrayList<Link> links;
    private int numlinks;
    private boolean visited;
 
    public Node( long id, RubiksCube cube )
    {    
        this.id = id;
        this.cube = cube;
	links = new ArrayList<Link>();
        numlinks = 0;
        visited = false;
    }
    
    public ArrayList<Link> getLinks()
    {
        return links;
    }
 
    public int getNumLinks()
    {
 	return numlinks;
    }
 
    public long getId()
    {
 	return id;
    }
 
    public RubiksCube getCube()
    {
        return cube;
    }
    
    public boolean getVisited()
    {
        return visited;
    }
    
    public void setVisited( boolean value )
    {
        this.visited = value;
    }
    
    public void makelink( long id, double weight )
    {
        if ( numlinks == 0 )
 	{
            links.add(new Link( id, weight ));
            numlinks++;
 	}
        else
        {
            int position = existLink(id);
            if ( position == -1 )
            {
 		links.add(new Link(id,weight));
 		numlinks++;
            }
        }
    }
 
    public int existLink( long id )
    {
        for (int i = 0; i < links.size(); i++)
 	{
            if ( links.get(i).getArrivalnode() == id )
                return i;
        }
 	return -1;
    }
     
}
