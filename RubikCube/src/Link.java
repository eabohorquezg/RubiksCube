/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Edwin
 */
public class Link {
    
    private long arrivalnode;
    private double weight;
 
    public Link( long arrivalnode, double weight )
    {
 	this.arrivalnode = arrivalnode;
 	this.weight = weight;
    }
 
    public Link( long arrivalnode )
    {
 	this.arrivalnode = arrivalnode;
 	weight = -1;
    }
 
    public long getArrivalnode() {
        return arrivalnode;
    }
    
    public double getWeight()
    {
 	return weight;
    }
    
    public void setWeight( double weight )
    {
 	this.weight = weight;
    }
  
}
