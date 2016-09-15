/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AndresL
 */
public class RubiksCube_A {
    
    private byte[] cubeArray;
    
    public RubiksCube_A( ) 
    {   //crea un cubo ordenado UP LEFT FRONT RIGHT BACK DOWN
        //UP:[1-9], LEFT:[10-18], FRONT:[19-27], RIGHT:[28-36], BACK:[37-45], DOWN:[46-54]
        cubeArray = new byte[54];
        for (byte i = 0; i < cubeArray.length; i++) {
             cubeArray[i] = (byte)(i+1);
        }
    }
    
    public RubiksCube_A( byte[] cubeArray ) 
    {
        this.cubeArray = cubeArray;
    }
    
    public byte[] getCubeArray() 
    {
        return cubeArray;
    }
}
