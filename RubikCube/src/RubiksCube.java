/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Edwin
 */
public class RubiksCube 
{
    private byte[] cubeArray;

    public RubiksCube( ) 
    {   //crea un cubo ordenado UP LEFT FRONT RIGHT BACK DOWN
        //UP:[1-9], LEFT:[10-18], FRONT:[19-27], RIGHT:[28-36], BACK:[37-45], DOWN:[46-54]
        cubeArray = new byte[54];
        for (byte i = 0; i < cubeArray.length; i++) {
             cubeArray[i] = (byte)(i+1);
        }
    }
    
    public RubiksCube( byte[] cubeArray ) 
    {
        this.cubeArray = cubeArray;
    }
    
    public byte[] getCubeArray() 
    {
        return cubeArray;
    }    
    
    public void printArrayCube()
    {
        for (int i = 0; i < cubeArray.length; i++) {
            System.out.print(cubeArray[i]+" ");
        }
    }
    
    public RubiksCube moveL() 
    {
        byte v1=cubeArray[0], v2=cubeArray[3], v3=cubeArray[6];
        cubeArray[0] = cubeArray[44];
        cubeArray[3] = cubeArray[41];
        cubeArray[6] = cubeArray[38];
        cubeArray[44] = cubeArray[45];
        cubeArray[41] = cubeArray[48];
        cubeArray[38] = cubeArray[51];
        cubeArray[45] = cubeArray[18];
        cubeArray[48] = cubeArray[21];
        cubeArray[51] = cubeArray[24];
        cubeArray[18] = v1;
        cubeArray[21] = v2;
        cubeArray[24] = v3;
        return new RubiksCube(cubeArray);
    }
    
    public RubiksCube moveLprime()
    { // wow !
        /*
        this.moveL();
        this.moveL();
        this.moveL();
        */
        //completar
        return new RubiksCube(cubeArray);
    }
    
    public RubiksCube moveR()
    {
        //completar
        return new RubiksCube(cubeArray);
    }
    
    public RubiksCube moveRprime()
    {
        //completar
        
        return new RubiksCube(cubeArray);
    }
    
    
    public RubiksCube moveU()
    {
        
        return new RubiksCube(cubeArray);
    }
    
    public RubiksCube moveUprime()
    {
        
        
        return new RubiksCube(cubeArray);
    }
    
    public RubiksCube moveD()
    {
        
        return new RubiksCube(cubeArray);
    }
    
    public RubiksCube moveDprime()
    {
        
        return new RubiksCube(cubeArray);
    }
    
    public RubiksCube moveF()
    {
        
        return new RubiksCube(cubeArray);
    }
    
    public RubiksCube moveFprime()
    {
        
        return new RubiksCube(cubeArray);
    }
    
    public RubiksCube moveB()
    {
        
        return new RubiksCube(cubeArray);
    }
    
    public RubiksCube moveBprime()
    {
        
        return new RubiksCube(cubeArray);
    }
    
    public RubiksCube moveM()
    {
        
        return new RubiksCube(cubeArray);
    }
    
    public RubiksCube moveMprime()
    {
        
        return new RubiksCube(cubeArray);
    }
    
    public RubiksCube moveE()
    {
        
        return new RubiksCube(cubeArray);
    }
    
    public RubiksCube moveEprime()
    {
        
        return new RubiksCube(cubeArray);
    }
    
    public RubiksCube moveS()
    {
        
        return new RubiksCube(cubeArray);
    }
    
    public RubiksCube moveSprime()
    {
        
        return new RubiksCube(cubeArray);
    }
    
}
