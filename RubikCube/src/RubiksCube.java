
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    
    public RubiksCube RandomCube(long level){
        String pathNewCube = "";
        RubiksCube cube = new RubiksCube();
        for (int i = 0; i < level; i++) {
            int indexrandom = (int)(Math.random()*18);
            switch (indexrandom){
                case 0: cube = cube.moveL(); pathNewCube+="L "; break;
                case 1: cube = cube.moveLprime(); pathNewCube+="LP "; break;
                case 2: cube = cube.moveB(); pathNewCube+="B "; break;
                case 3: cube = cube.moveBprime(); pathNewCube+="BP "; break;
                case 4: cube = cube.moveD(); pathNewCube+="D "; break;
                case 5: cube = cube.moveDprime(); pathNewCube+="DP "; break;
                case 6: cube = cube.moveE(); pathNewCube+="E "; break;
                case 7: cube = cube.moveEprime(); pathNewCube+="EP "; break;
                case 8: cube = cube.moveF(); pathNewCube+="F "; break;
                case 9: cube = cube.moveFprime(); pathNewCube+="FP "; break;
                case 10: cube = cube.moveM(); pathNewCube+="M "; break;
                case 11: cube = cube.moveMprime(); pathNewCube+="MP "; break;
                case 12: cube = cube.moveR(); pathNewCube+="R "; break;
                case 13: cube = cube.moveRprime(); pathNewCube+="RP "; break;
                case 14: cube = cube.moveS(); pathNewCube+="S "; break;
                case 15: cube = cube.moveSprime(); pathNewCube+="SP "; break;
                case 16: cube = cube.moveU(); pathNewCube+="U "; break;
                case 17: cube = cube.moveUprime(); pathNewCube+="UP "; break;
            }
            
        }       
        System.out.println(pathNewCube);  
        //cube.printArrayCube();
        return cube;
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
        System.out.println("");
    }
    
    public RubiksCube moveL() 
    {        
        byte []newcubearray = this.getCubeArray().clone(); 
        byte v1=newcubearray[0], v2=newcubearray[3], v3=newcubearray[6];
        newcubearray[0] = newcubearray[44];
        newcubearray[3] = newcubearray[41];
        newcubearray[6] = newcubearray[38];
        newcubearray[44] = newcubearray[45];
        newcubearray[41] = newcubearray[48];
        newcubearray[38] = newcubearray[51];
        newcubearray[45] = newcubearray[18];
        newcubearray[48] = newcubearray[21];
        newcubearray[51] = newcubearray[24];
        newcubearray[18] = v1;
        newcubearray[21] = v2;
        newcubearray[24] = v3;
        //Rotate face LEFT
        v1 = newcubearray[9];
        newcubearray[9] = newcubearray[15];
        newcubearray[15] = newcubearray[17];
        newcubearray[17] = newcubearray[11];
        newcubearray[11] = v1;
        v1 = newcubearray[10];
        newcubearray[10] = newcubearray[12];
        newcubearray[12] = newcubearray[16];
        newcubearray[16] = newcubearray[14];
        newcubearray[14] = v1;  
        return new RubiksCube(newcubearray); 
    }
    
    public RubiksCube moveLprime()
    { 
        byte []newcubearray = this.getCubeArray().clone(); 
        byte v1=newcubearray[0], v2=newcubearray[3], v3=newcubearray[6];
        newcubearray[0] = newcubearray[18];
        newcubearray[3] = newcubearray[21];
        newcubearray[6] = newcubearray[24];
        newcubearray[18] = newcubearray[45];
        newcubearray[21] = newcubearray[48];
        newcubearray[24] = newcubearray[51];
        newcubearray[45] = newcubearray[44];
        newcubearray[48] = newcubearray[41];
        newcubearray[51] = newcubearray[38];
        newcubearray[44] = v1;
        newcubearray[41] = v2;
        newcubearray[38] = v3;               
        //NEW CODE <-- Rotate face LEFT
        v1 = newcubearray[9];
        newcubearray[9] = newcubearray[11];
        newcubearray[11] = newcubearray[17];
        newcubearray[17] = newcubearray[15];
        newcubearray[15] = v1;
        v1 = newcubearray[10];
        newcubearray[10] = newcubearray[14];
        newcubearray[14] = newcubearray[16];
        newcubearray[16] = newcubearray[12];
        newcubearray[12] = v1;        
        return new RubiksCube(newcubearray);
    } 
    
    public RubiksCube moveR()
    {
        byte []newcubearray = this.getCubeArray().clone(); 
        byte v1=newcubearray[2], v2=newcubearray[5], v3=newcubearray[8];
        newcubearray[2] = newcubearray[20];
        newcubearray[5] = newcubearray[23];
        newcubearray[8] = newcubearray[26];
        newcubearray[20] = newcubearray[47];
        newcubearray[23] = newcubearray[50];
        newcubearray[26] = newcubearray[53];
        newcubearray[47] = newcubearray[42];
        newcubearray[50] = newcubearray[39];
        newcubearray[53] = newcubearray[36];
        newcubearray[42] = v1;
        newcubearray[39] = v2;
        newcubearray[36] = v3;               
        //NEW CODE <-- Rotate face Right
        v1 = newcubearray[27];
        newcubearray[27] = newcubearray[33];
        newcubearray[33] = newcubearray[35];
        newcubearray[35] = newcubearray[29];
        newcubearray[29] = v1;
        v1 = newcubearray[28];
        newcubearray[28] = newcubearray[30];
        newcubearray[30] = newcubearray[34];
        newcubearray[34] = newcubearray[32];
        newcubearray[32] = v1;        
        return new RubiksCube(newcubearray);
    }
    
    public RubiksCube moveRprime()
    {
        byte []newcubearray = this.getCubeArray().clone(); 
        byte v1=newcubearray[2], v2=newcubearray[5], v3=newcubearray[8];
        newcubearray[2] = newcubearray[42];
        newcubearray[5] = newcubearray[39];
        newcubearray[8] = newcubearray[36];
        newcubearray[42] = newcubearray[47];
        newcubearray[39] = newcubearray[50];
        newcubearray[36] = newcubearray[53];
        newcubearray[47] = newcubearray[20];
        newcubearray[50] = newcubearray[23];
        newcubearray[53] = newcubearray[26];
        newcubearray[20] = v1;
        newcubearray[23] = v2;
        newcubearray[26] = v3;         
        //NEW CODE <-- Rotate face Right
        v1 = newcubearray[27];
        newcubearray[27] = newcubearray[29];
        newcubearray[29] = newcubearray[35];
        newcubearray[35] = newcubearray[33];
        newcubearray[33] = v1;
        v1 = newcubearray[28];
        newcubearray[28] = newcubearray[32];
        newcubearray[32] = newcubearray[34];
        newcubearray[34] = newcubearray[30];
        newcubearray[30] = v1;  
        return new RubiksCube(newcubearray);
    }
    
    public RubiksCube moveU()
    {
        byte []newcubearray = this.getCubeArray().clone(); 
        byte v1=newcubearray[9], v2=newcubearray[10], v3=newcubearray[11];
        
        newcubearray[9] = newcubearray[18];
        newcubearray[10] = newcubearray[19];
        newcubearray[11] = newcubearray[20];
        
        newcubearray[18] = newcubearray[27];
        newcubearray[19] = newcubearray[28];
        newcubearray[20] = newcubearray[29];
        
        newcubearray[27] = newcubearray[36];
        newcubearray[28] = newcubearray[37];
        newcubearray[29] = newcubearray[38];
        
        newcubearray[36] = v1;
        newcubearray[37] = v2;
        newcubearray[38] = v3;         
        
        //NEW CODE <-- Rotate face UP
        v1 = newcubearray[0];
        newcubearray[0] = newcubearray[6];
        newcubearray[6] = newcubearray[8];
        newcubearray[8] = newcubearray[2];
        newcubearray[2] = v1;

        v1 = newcubearray[1];
        newcubearray[1] = newcubearray[3];
        newcubearray[3] = newcubearray[7];
        newcubearray[7] = newcubearray[5];
        newcubearray[5] = v1;
        return new RubiksCube(newcubearray);
    }
    
    public RubiksCube moveUprime()
    {
        byte []newcubearray = this.getCubeArray().clone(); 
        byte v1=newcubearray[9], v2=newcubearray[10], v3=newcubearray[11];
        
        newcubearray[9] = newcubearray[36];
        newcubearray[10] = newcubearray[37];
        newcubearray[11] = newcubearray[38];
        
        newcubearray[36] = newcubearray[27];
        newcubearray[37] = newcubearray[28];
        newcubearray[38] = newcubearray[29];
        
        newcubearray[27] = newcubearray[18];
        newcubearray[28] = newcubearray[19];
        newcubearray[29] = newcubearray[20];
        
        newcubearray[18] = v1;
        newcubearray[19] = v2;
        newcubearray[20] = v3;         
        
        //NEW CODE <-- Rotate face UP
        v1 = newcubearray[0];
        newcubearray[0] = newcubearray[2];
        newcubearray[2] = newcubearray[8];
        newcubearray[8] = newcubearray[6];
        newcubearray[6] = v1;

        v1 = newcubearray[1];
        newcubearray[1] = newcubearray[5];
        newcubearray[5] = newcubearray[7];
        newcubearray[7] = newcubearray[3];
        newcubearray[3] = v1;        
        return new RubiksCube(newcubearray);
    }
    
    public RubiksCube moveD()
    {
        byte []newcubearray = this.getCubeArray().clone(); 
        byte v1=newcubearray[15], v2=newcubearray[16], v3=newcubearray[17];
        
        newcubearray[15] = newcubearray[42];
        newcubearray[16] = newcubearray[43];
        newcubearray[17] = newcubearray[44];
        
        newcubearray[42] = newcubearray[33];
        newcubearray[43] = newcubearray[34];
        newcubearray[44] = newcubearray[35];
        
        newcubearray[33] = newcubearray[24];
        newcubearray[34] = newcubearray[25];
        newcubearray[35] = newcubearray[26];
        
        newcubearray[24] = v1;
        newcubearray[25] = v2;
        newcubearray[26] = v3;         
        
        //NEW CODE <-- Rotate face DOWN
        v1 = newcubearray[45];
        newcubearray[45] = newcubearray[51];
        newcubearray[51] = newcubearray[53];
        newcubearray[53] = newcubearray[47];
        newcubearray[47] = v1;

        v1 = newcubearray[46];
        newcubearray[46] = newcubearray[48];
        newcubearray[48] = newcubearray[52];
        newcubearray[52] = newcubearray[50];
        newcubearray[50] = v1;
        return new RubiksCube(newcubearray);
    }
    
    public RubiksCube moveDprime()
    {
        byte []newcubearray = this.getCubeArray().clone(); 
        byte v1=newcubearray[15], v2=newcubearray[16], v3=newcubearray[17];
        
        newcubearray[15] = newcubearray[24];
        newcubearray[16] = newcubearray[25];
        newcubearray[17] = newcubearray[26];
        
        newcubearray[24] = newcubearray[33];
        newcubearray[25] = newcubearray[34];
        newcubearray[26] = newcubearray[35];
        
        newcubearray[33] = newcubearray[42];
        newcubearray[34] = newcubearray[43];
        newcubearray[35] = newcubearray[44];
        
        newcubearray[42] = v1;
        newcubearray[43] = v2;
        newcubearray[44] = v3;         
        
        //NEW CODE <-- Rotate face DOWN
        v1 = newcubearray[45];
        newcubearray[45] = newcubearray[47];
        newcubearray[47] = newcubearray[53];
        newcubearray[53] = newcubearray[51];
        newcubearray[51] = v1;

        v1 = newcubearray[46];
        newcubearray[46] = newcubearray[50];
        newcubearray[50] = newcubearray[52];
        newcubearray[52] = newcubearray[48];
        newcubearray[48] = v1;
        return new RubiksCube(newcubearray);
    }
    
    public RubiksCube moveF()
    {
        byte []newcubearray = this.getCubeArray().clone(); 
        byte v1=newcubearray[6], v2=newcubearray[7], v3=newcubearray[8];
        
        newcubearray[6] = newcubearray[17];
        newcubearray[7] = newcubearray[14];
        newcubearray[8] = newcubearray[11];
        
        newcubearray[17] = newcubearray[47];
        newcubearray[14] = newcubearray[46];
        newcubearray[11] = newcubearray[45];
        
        newcubearray[47] = newcubearray[27];
        newcubearray[46] = newcubearray[30];
        newcubearray[45] = newcubearray[33];
        
        newcubearray[27] = v1;
        newcubearray[30] = v2;
        newcubearray[33] = v3;         
        
        //NEW CODE <-- Rotate face Front
        v1 = newcubearray[18];
        newcubearray[18] = newcubearray[24];
        newcubearray[24] = newcubearray[26];
        newcubearray[26] = newcubearray[20];
        newcubearray[20] = v1;

        v1 = newcubearray[19];
        newcubearray[19] = newcubearray[21];
        newcubearray[21] = newcubearray[25];
        newcubearray[25] = newcubearray[23];
        newcubearray[23] = v1;
        return new RubiksCube(newcubearray);
    }
    
    public RubiksCube moveFprime()
    {
        byte []newcubearray = this.getCubeArray().clone(); 
        byte v1=newcubearray[6], v2=newcubearray[7], v3=newcubearray[8];
        
        newcubearray[6] = newcubearray[27];
        newcubearray[7] = newcubearray[30];
        newcubearray[8] = newcubearray[33];
        
        newcubearray[27] = newcubearray[47];
        newcubearray[30] = newcubearray[46];
        newcubearray[33] = newcubearray[45];
        
        newcubearray[47] = newcubearray[17];
        newcubearray[46] = newcubearray[14];
        newcubearray[45] = newcubearray[11];
        
        newcubearray[17] = v1;
        newcubearray[14] = v2;
        newcubearray[11] = v3;         
        
        //NEW CODE <-- Rotate face Front
        v1 = newcubearray[18];
        newcubearray[18] = newcubearray[20];
        newcubearray[20] = newcubearray[26];
        newcubearray[26] = newcubearray[24];
        newcubearray[24] = v1;

        v1 = newcubearray[19];
        newcubearray[19] = newcubearray[23];
        newcubearray[23] = newcubearray[25];
        newcubearray[25] = newcubearray[21];
        newcubearray[21] = v1;
        return new RubiksCube(newcubearray);
    }
    
    public RubiksCube moveB()
    {
        byte []newcubearray = this.getCubeArray().clone(); 
        byte v1=newcubearray[0], v2=newcubearray[1], v3=newcubearray[2];
        
        newcubearray[0] = newcubearray[29];
        newcubearray[1] = newcubearray[32];
        newcubearray[2] = newcubearray[35];
        
        newcubearray[29] = newcubearray[53];
        newcubearray[32] = newcubearray[52];
        newcubearray[35] = newcubearray[51];
        
        newcubearray[53] = newcubearray[15];
        newcubearray[52] = newcubearray[12];
        newcubearray[51] = newcubearray[9];
        
        newcubearray[15] = v1;
        newcubearray[12] = v2;
        newcubearray[9] = v3;         
        
        //NEW CODE <-- Rotate face Back
        v1 = newcubearray[36];
        newcubearray[36] = newcubearray[42];
        newcubearray[42] = newcubearray[44];
        newcubearray[44] = newcubearray[38];
        newcubearray[38] = v1;

        v1 = newcubearray[37];
        newcubearray[37] = newcubearray[39];
        newcubearray[39] = newcubearray[43];
        newcubearray[43] = newcubearray[41];
        newcubearray[41] = v1;
        return new RubiksCube(newcubearray);
    }
    
    public RubiksCube moveBprime()
    {
        byte []newcubearray = this.getCubeArray().clone(); 
        byte v1=newcubearray[0], v2=newcubearray[1], v3=newcubearray[2];
        
        newcubearray[0] = newcubearray[15];
        newcubearray[1] = newcubearray[12];
        newcubearray[2] = newcubearray[9];
        
        newcubearray[15] = newcubearray[53];
        newcubearray[12] = newcubearray[52];
        newcubearray[9] = newcubearray[51];
        
        newcubearray[53] = newcubearray[29];
        newcubearray[52] = newcubearray[32];
        newcubearray[51] = newcubearray[35];
        
        newcubearray[29] = v1;
        newcubearray[32] = v2;
        newcubearray[35] = v3;         
        
        //NEW CODE <-- Rotate face Back
        v1 = newcubearray[36];
        newcubearray[36] = newcubearray[38];
        newcubearray[38] = newcubearray[44];
        newcubearray[44] = newcubearray[42];
        newcubearray[42] = v1;

        v1 = newcubearray[37];
        newcubearray[37] = newcubearray[41];
        newcubearray[41] = newcubearray[43];
        newcubearray[43] = newcubearray[39];
        newcubearray[39] = v1;
        return new RubiksCube(newcubearray);
    }
    
    public RubiksCube moveM()
    {
        byte []newcubearray = this.getCubeArray().clone(); 
        byte v1=newcubearray[1], v2=newcubearray[4], v3=newcubearray[7];
        
        newcubearray[1] = newcubearray[43];
        newcubearray[4] = newcubearray[40];
        newcubearray[7] = newcubearray[37];
        
        newcubearray[43] = newcubearray[46];
        newcubearray[40] = newcubearray[49];
        newcubearray[37] = newcubearray[52];
        
        newcubearray[46] = newcubearray[19];
        newcubearray[49] = newcubearray[22];
        newcubearray[52] = newcubearray[25];
        
        newcubearray[19] = v1;
        newcubearray[22] = v2;
        newcubearray[25] = v3;         
        return new RubiksCube(newcubearray);
    }
    
    public RubiksCube moveMprime()
    {
        byte []newcubearray = this.getCubeArray().clone(); 
        byte v1=newcubearray[1], v2=newcubearray[4], v3=newcubearray[7];
        
        newcubearray[1] = newcubearray[19];
        newcubearray[4] = newcubearray[22];
        newcubearray[7] = newcubearray[25];
        
        newcubearray[19] = newcubearray[46];
        newcubearray[22] = newcubearray[49];
        newcubearray[25] = newcubearray[52];
        
        newcubearray[46] = newcubearray[43];
        newcubearray[49] = newcubearray[40];
        newcubearray[52] = newcubearray[37];
        
        newcubearray[43] = v1;
        newcubearray[40] = v2;
        newcubearray[37] = v3; 
        return new RubiksCube(newcubearray);
    }
    
    public RubiksCube moveE()
    {
        byte []newcubearray = this.getCubeArray().clone(); 
        byte v1=newcubearray[12], v2=newcubearray[13], v3=newcubearray[14];
        
        newcubearray[12] = newcubearray[39];
        newcubearray[13] = newcubearray[40];
        newcubearray[14] = newcubearray[41];
        
        newcubearray[39] = newcubearray[30];
        newcubearray[40] = newcubearray[31];
        newcubearray[41] = newcubearray[32];
        
        newcubearray[30] = newcubearray[21];
        newcubearray[31] = newcubearray[22];
        newcubearray[32] = newcubearray[23];
        
        newcubearray[21] = v1;
        newcubearray[22] = v2;
        newcubearray[23] = v3; 
        return new RubiksCube(newcubearray);
    }
    
    public RubiksCube moveEprime()
    {
        byte []newcubearray = this.getCubeArray().clone(); 
        byte v1=newcubearray[12], v2=newcubearray[13], v3=newcubearray[14];
        
        newcubearray[12] = newcubearray[21];
        newcubearray[13] = newcubearray[22];
        newcubearray[14] = newcubearray[23];
        
        newcubearray[21] = newcubearray[30];
        newcubearray[22] = newcubearray[31];
        newcubearray[23] = newcubearray[32];
        
        newcubearray[30] = newcubearray[39];
        newcubearray[31] = newcubearray[40];
        newcubearray[32] = newcubearray[41];
        
        newcubearray[39] = v1;
        newcubearray[40] = v2;
        newcubearray[41] = v3;
        return new RubiksCube(newcubearray);
    }
    
    public RubiksCube moveS()
    {
        byte []newcubearray = this.getCubeArray().clone(); 
        byte v1=newcubearray[3], v2=newcubearray[4], v3=newcubearray[5];
        
        newcubearray[3] = newcubearray[16];
        newcubearray[4] = newcubearray[13];
        newcubearray[5] = newcubearray[10];
        
        newcubearray[16] = newcubearray[50];
        newcubearray[13] = newcubearray[49];
        newcubearray[10] = newcubearray[48];
        
        newcubearray[50] = newcubearray[28];
        newcubearray[49] = newcubearray[31];
        newcubearray[48] = newcubearray[34];
        
        newcubearray[28] = v1;
        newcubearray[31] = v2;
        newcubearray[34] = v3;
        return new RubiksCube(newcubearray);
    }
    
    public RubiksCube moveSprime()
    {
        byte []newcubearray = this.getCubeArray().clone(); 
        byte v1=newcubearray[3], v2=newcubearray[4], v3=newcubearray[5];
        
        newcubearray[3] = newcubearray[28];
        newcubearray[4] = newcubearray[31];
        newcubearray[5] = newcubearray[34];
        
        newcubearray[28] = newcubearray[50];
        newcubearray[31] = newcubearray[49];
        newcubearray[34] = newcubearray[48];
        
        newcubearray[50] = newcubearray[16];
        newcubearray[49] = newcubearray[13];
        newcubearray[48] = newcubearray[10];
        
        newcubearray[16] = v1;
        newcubearray[13] = v2;
        newcubearray[10] = v3;
        return new RubiksCube(newcubearray);
    } 
 
    public boolean isOrdered()
    {
        boolean resp = true;
        for (int i = 0; i < this.getCubeArray().length; i++)
        {
            if( this.getCubeArray()[i] != (i+1) )
                return false;
        }
        return resp;
    }
    
    public RubiksCube moveCube(Long node){
        
        RubiksCube cube = this;
        long module = node%18;
        long tmp = 0;
        if (module == 0) tmp=16;
        else if (module == 1) tmp=17;
        else tmp = module-2;
        
//        System.out.println("move "+tmp);
//        cube.printArrayCube();
        
        if (tmp==0) return cube.moveL();
        if (tmp==1) return cube.moveLprime();
        if (tmp==2) return cube.moveB();
        if (tmp==3) return cube.moveBprime();
        if (tmp==4) return cube.moveD();
        if (tmp==5) return cube.moveDprime();
        if (tmp==6) return cube.moveE();
        if (tmp==7) return cube.moveEprime();
        if (tmp==8) return cube.moveF();
        if (tmp==9) return cube.moveFprime();
        if (tmp==10) return cube.moveM();
        if (tmp==11) return cube.moveMprime();
        if (tmp==12) return cube.moveR();
        if (tmp==13) return cube.moveRprime();
        if (tmp==14) return cube.moveS();
        if (tmp==15) return cube.moveSprime();
        if (tmp==16) return cube.moveU();
        if (tmp==17) return cube.moveUprime();
        
        System.out.println("Error, Movimiento invalido: "+tmp);
        System.exit(0);
        return null;
    }
        
}
