/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Edwin
 */
public class Edge {
    
    private long initialnode;
    private long terminalnode;
    private double weight;
 
    public Edge( long initialnode, long terminalnode, double weight )
    {
 	this.initialnode = initialnode;
 	this.terminalnode = terminalnode;
 	this.weight = weight;
    }
 
    public double getWeight()
    {
 	return weight;
    }
 
    public void setWeight( double weight )
    {
 	this.weight = weight;
    }
 
    public long getInitialnode()
    {
 	return initialnode;
    }
 
    public long getTerminalnode()
    {
 	return terminalnode;
    }
 
    @Override 
    public String toString()
    {
 	return "(" + initialnode + " -> " + terminalnode + ", " + weight + ")";
    }
    
}
