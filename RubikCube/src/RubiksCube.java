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
        
        //NEW CODE <-- Rotate face LEFT
        v1 = cubeArray[9];
        cubeArray[9] = cubeArray[15];
        cubeArray[15] = cubeArray[17];
        cubeArray[17] = cubeArray[11];
        cubeArray[11] = v1;

        v1 = cubeArray[10];
        cubeArray[10] = cubeArray[12];
        cubeArray[12] = cubeArray[16];
        cubeArray[16] = cubeArray[14];
        cubeArray[14] = v1;        
        return new RubiksCube(cubeArray);
    }
    
    public RubiksCube moveLprime() 
    { 
        byte v1=cubeArray[0], v2=cubeArray[3], v3=cubeArray[6];
        
        cubeArray[0] = cubeArray[18];
        cubeArray[3] = cubeArray[21];
        cubeArray[6] = cubeArray[24];
        
        cubeArray[18] = cubeArray[45];
        cubeArray[21] = cubeArray[48];
        cubeArray[24] = cubeArray[51];
        
        cubeArray[45] = cubeArray[44];
        cubeArray[48] = cubeArray[41];
        cubeArray[51] = cubeArray[38];
        
        cubeArray[44] = v1;
        cubeArray[41] = v2;
        cubeArray[38] = v3;               
        
        //NEW CODE <-- Rotate face LEFT
        v1 = cubeArray[9];
        cubeArray[9] = cubeArray[11];
        cubeArray[11] = cubeArray[17];
        cubeArray[17] = cubeArray[15];
        cubeArray[15] = v1;

        v1 = cubeArray[10];
        cubeArray[10] = cubeArray[14];
        cubeArray[14] = cubeArray[16];
        cubeArray[16] = cubeArray[12];
        cubeArray[12] = v1;        
        return new RubiksCube(cubeArray);
    }
    
    public RubiksCube moveR()
    {
        byte v1=cubeArray[2], v2=cubeArray[5], v3=cubeArray[8];
        
        cubeArray[2] = cubeArray[20];
        cubeArray[5] = cubeArray[23];
        cubeArray[8] = cubeArray[26];
        
        cubeArray[20] = cubeArray[47];
        cubeArray[23] = cubeArray[50];
        cubeArray[26] = cubeArray[53];
        
        cubeArray[47] = cubeArray[42];
        cubeArray[50] = cubeArray[39];
        cubeArray[53] = cubeArray[36];
        
        cubeArray[42] = v1;
        cubeArray[39] = v2;
        cubeArray[36] = v3;               
        
        //NEW CODE <-- Rotate face Right
        v1 = cubeArray[27];
        cubeArray[27] = cubeArray[33];
        cubeArray[33] = cubeArray[35];
        cubeArray[35] = cubeArray[29];
        cubeArray[29] = v1;

        v1 = cubeArray[28];
        cubeArray[28] = cubeArray[30];
        cubeArray[30] = cubeArray[34];
        cubeArray[34] = cubeArray[32];
        cubeArray[32] = v1;        
        return new RubiksCube(cubeArray);
    }
    
    public RubiksCube moveRprime()
    {
        byte v1=cubeArray[2], v2=cubeArray[5], v3=cubeArray[8];
        
        cubeArray[2] = cubeArray[42];
        cubeArray[5] = cubeArray[39];
        cubeArray[8] = cubeArray[36];
        
        cubeArray[42] = cubeArray[47];
        cubeArray[39] = cubeArray[50];
        cubeArray[36] = cubeArray[53];
        
        cubeArray[47] = cubeArray[20];
        cubeArray[50] = cubeArray[23];
        cubeArray[53] = cubeArray[26];
        
        cubeArray[20] = v1;
        cubeArray[23] = v2;
        cubeArray[26] = v3;         
        
        //NEW CODE <-- Rotate face Right
        v1 = cubeArray[27];
        cubeArray[27] = cubeArray[29];
        cubeArray[29] = cubeArray[35];
        cubeArray[35] = cubeArray[33];
        cubeArray[33] = v1;

        v1 = cubeArray[28];
        cubeArray[28] = cubeArray[32];
        cubeArray[32] = cubeArray[34];
        cubeArray[34] = cubeArray[30];
        cubeArray[30] = v1;  
        
        return new RubiksCube(cubeArray);
    }
    
    public RubiksCube moveU()
    {
        byte v1=cubeArray[9], v2=cubeArray[10], v3=cubeArray[11];
        
        cubeArray[9] = cubeArray[18];
        cubeArray[10] = cubeArray[19];
        cubeArray[11] = cubeArray[20];
        
        cubeArray[18] = cubeArray[27];
        cubeArray[19] = cubeArray[28];
        cubeArray[20] = cubeArray[29];
        
        cubeArray[27] = cubeArray[36];
        cubeArray[28] = cubeArray[37];
        cubeArray[29] = cubeArray[38];
        
        cubeArray[36] = v1;
        cubeArray[37] = v2;
        cubeArray[38] = v3;         
        
        //NEW CODE <-- Rotate face UP
        v1 = cubeArray[0];
        cubeArray[0] = cubeArray[6];
        cubeArray[6] = cubeArray[8];
        cubeArray[8] = cubeArray[2];
        cubeArray[2] = v1;

        v1 = cubeArray[1];
        cubeArray[1] = cubeArray[3];
        cubeArray[3] = cubeArray[7];
        cubeArray[7] = cubeArray[5];
        cubeArray[5] = v1;
        return new RubiksCube(cubeArray);
    }
    
    public RubiksCube moveUprime()
    {
        byte v1=cubeArray[9], v2=cubeArray[10], v3=cubeArray[11];
        
        cubeArray[9] = cubeArray[36];
        cubeArray[10] = cubeArray[37];
        cubeArray[11] = cubeArray[38];
        
        cubeArray[36] = cubeArray[27];
        cubeArray[37] = cubeArray[28];
        cubeArray[38] = cubeArray[29];
        
        cubeArray[27] = cubeArray[18];
        cubeArray[28] = cubeArray[19];
        cubeArray[29] = cubeArray[20];
        
        cubeArray[18] = v1;
        cubeArray[19] = v2;
        cubeArray[20] = v3;         
        
        //NEW CODE <-- Rotate face UP
        v1 = cubeArray[0];
        cubeArray[0] = cubeArray[2];
        cubeArray[2] = cubeArray[8];
        cubeArray[8] = cubeArray[6];
        cubeArray[6] = v1;

        v1 = cubeArray[1];
        cubeArray[1] = cubeArray[5];
        cubeArray[5] = cubeArray[7];
        cubeArray[7] = cubeArray[3];
        cubeArray[3] = v1;        
        return new RubiksCube(cubeArray);
    }
    
    public RubiksCube moveD()
    {
        byte v1=cubeArray[15], v2=cubeArray[16], v3=cubeArray[17];
        
        cubeArray[15] = cubeArray[42];
        cubeArray[16] = cubeArray[43];
        cubeArray[17] = cubeArray[44];
        
        cubeArray[42] = cubeArray[33];
        cubeArray[43] = cubeArray[34];
        cubeArray[44] = cubeArray[35];
        
        cubeArray[33] = cubeArray[24];
        cubeArray[34] = cubeArray[25];
        cubeArray[35] = cubeArray[26];
        
        cubeArray[24] = v1;
        cubeArray[25] = v2;
        cubeArray[26] = v3;         
        
        //NEW CODE <-- Rotate face DOWN
        v1 = cubeArray[45];
        cubeArray[45] = cubeArray[51];
        cubeArray[51] = cubeArray[53];
        cubeArray[53] = cubeArray[47];
        cubeArray[47] = v1;

        v1 = cubeArray[46];
        cubeArray[46] = cubeArray[48];
        cubeArray[48] = cubeArray[52];
        cubeArray[52] = cubeArray[50];
        cubeArray[50] = v1;
        return new RubiksCube(cubeArray);
    }
    
    public RubiksCube moveDprime()
    {
        byte v1=cubeArray[15], v2=cubeArray[16], v3=cubeArray[17];
        
        cubeArray[15] = cubeArray[24];
        cubeArray[16] = cubeArray[25];
        cubeArray[17] = cubeArray[26];
        
        cubeArray[24] = cubeArray[33];
        cubeArray[25] = cubeArray[34];
        cubeArray[26] = cubeArray[35];
        
        cubeArray[33] = cubeArray[42];
        cubeArray[34] = cubeArray[43];
        cubeArray[35] = cubeArray[44];
        
        cubeArray[42] = v1;
        cubeArray[43] = v2;
        cubeArray[44] = v3;         
        
        //NEW CODE <-- Rotate face DOWN
        v1 = cubeArray[45];
        cubeArray[45] = cubeArray[47];
        cubeArray[47] = cubeArray[53];
        cubeArray[53] = cubeArray[51];
        cubeArray[51] = v1;

        v1 = cubeArray[46];
        cubeArray[46] = cubeArray[50];
        cubeArray[50] = cubeArray[52];
        cubeArray[52] = cubeArray[48];
        cubeArray[48] = v1;
        return new RubiksCube(cubeArray);
    }
    
    public RubiksCube moveF()
    {
        byte v1=cubeArray[6], v2=cubeArray[7], v3=cubeArray[8];
        
        cubeArray[6] = cubeArray[17];
        cubeArray[7] = cubeArray[14];
        cubeArray[8] = cubeArray[11];
        
        cubeArray[17] = cubeArray[47];
        cubeArray[14] = cubeArray[46];
        cubeArray[11] = cubeArray[45];
        
        cubeArray[47] = cubeArray[27];
        cubeArray[46] = cubeArray[30];
        cubeArray[45] = cubeArray[33];
        
        cubeArray[27] = v1;
        cubeArray[30] = v2;
        cubeArray[33] = v3;         
        
        //NEW CODE <-- Rotate face Front
        v1 = cubeArray[18];
        cubeArray[18] = cubeArray[24];
        cubeArray[24] = cubeArray[26];
        cubeArray[26] = cubeArray[20];
        cubeArray[20] = v1;

        v1 = cubeArray[19];
        cubeArray[19] = cubeArray[21];
        cubeArray[21] = cubeArray[25];
        cubeArray[25] = cubeArray[23];
        cubeArray[23] = v1;
        return new RubiksCube(cubeArray);
    }
    
    public RubiksCube moveFprime()
    {
        byte v1=cubeArray[6], v2=cubeArray[7], v3=cubeArray[8];
        
        cubeArray[6] = cubeArray[27];
        cubeArray[7] = cubeArray[30];
        cubeArray[8] = cubeArray[33];
        
        cubeArray[27] = cubeArray[47];
        cubeArray[30] = cubeArray[46];
        cubeArray[33] = cubeArray[45];
        
        cubeArray[47] = cubeArray[17];
        cubeArray[46] = cubeArray[14];
        cubeArray[45] = cubeArray[11];
        
        cubeArray[17] = v1;
        cubeArray[14] = v2;
        cubeArray[11] = v3;         
        
        //NEW CODE <-- Rotate face Front
        v1 = cubeArray[18];
        cubeArray[18] = cubeArray[20];
        cubeArray[20] = cubeArray[26];
        cubeArray[26] = cubeArray[24];
        cubeArray[24] = v1;

        v1 = cubeArray[19];
        cubeArray[19] = cubeArray[23];
        cubeArray[23] = cubeArray[25];
        cubeArray[25] = cubeArray[21];
        cubeArray[21] = v1;
        return new RubiksCube(cubeArray);
    }
    
    public RubiksCube moveB()
    {
        byte v1=cubeArray[0], v2=cubeArray[1], v3=cubeArray[2];
        
        cubeArray[0] = cubeArray[29];
        cubeArray[1] = cubeArray[32];
        cubeArray[2] = cubeArray[35];
        
        cubeArray[29] = cubeArray[53];
        cubeArray[32] = cubeArray[52];
        cubeArray[35] = cubeArray[51];
        
        cubeArray[53] = cubeArray[15];
        cubeArray[52] = cubeArray[12];
        cubeArray[51] = cubeArray[9];
        
        cubeArray[15] = v1;
        cubeArray[12] = v2;
        cubeArray[9] = v3;         
        
        //NEW CODE <-- Rotate face Back
        v1 = cubeArray[36];
        cubeArray[36] = cubeArray[42];
        cubeArray[42] = cubeArray[44];
        cubeArray[44] = cubeArray[38];
        cubeArray[38] = v1;

        v1 = cubeArray[37];
        cubeArray[37] = cubeArray[39];
        cubeArray[39] = cubeArray[43];
        cubeArray[43] = cubeArray[41];
        cubeArray[41] = v1;
        return new RubiksCube(cubeArray);
    }
    
    public RubiksCube moveBprime()
    {
        byte v1=cubeArray[0], v2=cubeArray[1], v3=cubeArray[2];
        
        cubeArray[0] = cubeArray[15];
        cubeArray[1] = cubeArray[12];
        cubeArray[2] = cubeArray[9];
        
        cubeArray[15] = cubeArray[53];
        cubeArray[12] = cubeArray[52];
        cubeArray[9] = cubeArray[51];
        
        cubeArray[53] = cubeArray[29];
        cubeArray[52] = cubeArray[32];
        cubeArray[51] = cubeArray[35];
        
        cubeArray[29] = v1;
        cubeArray[32] = v2;
        cubeArray[35] = v3;         
        
        //NEW CODE <-- Rotate face Back
        v1 = cubeArray[36];
        cubeArray[36] = cubeArray[38];
        cubeArray[38] = cubeArray[44];
        cubeArray[44] = cubeArray[42];
        cubeArray[42] = v1;

        v1 = cubeArray[37];
        cubeArray[37] = cubeArray[41];
        cubeArray[41] = cubeArray[43];
        cubeArray[43] = cubeArray[39];
        cubeArray[39] = v1;
        return new RubiksCube(cubeArray);
    }
    
    public RubiksCube moveM()
    {
        byte v1=cubeArray[1], v2=cubeArray[4], v3=cubeArray[7];
        
        cubeArray[1] = cubeArray[43];
        cubeArray[4] = cubeArray[40];
        cubeArray[7] = cubeArray[37];
        
        cubeArray[43] = cubeArray[46];
        cubeArray[40] = cubeArray[49];
        cubeArray[37] = cubeArray[52];
        
        cubeArray[46] = cubeArray[19];
        cubeArray[49] = cubeArray[22];
        cubeArray[52] = cubeArray[25];
        
        cubeArray[19] = v1;
        cubeArray[22] = v2;
        cubeArray[25] = v3;         
        return new RubiksCube(cubeArray);
    }
    
    public RubiksCube moveMprime()
    {
        byte v1=cubeArray[1], v2=cubeArray[4], v3=cubeArray[7];
        
        cubeArray[1] = cubeArray[19];
        cubeArray[4] = cubeArray[22];
        cubeArray[7] = cubeArray[25];
        
        cubeArray[19] = cubeArray[46];
        cubeArray[22] = cubeArray[49];
        cubeArray[25] = cubeArray[52];
        
        cubeArray[46] = cubeArray[43];
        cubeArray[49] = cubeArray[40];
        cubeArray[52] = cubeArray[37];
        
        cubeArray[43] = v1;
        cubeArray[40] = v2;
        cubeArray[37] = v3; 
        return new RubiksCube(cubeArray);
    }
    
    public RubiksCube moveE()
    {
        byte v1=cubeArray[12], v2=cubeArray[13], v3=cubeArray[14];
        
        cubeArray[12] = cubeArray[39];
        cubeArray[13] = cubeArray[40];
        cubeArray[14] = cubeArray[41];
        
        cubeArray[39] = cubeArray[30];
        cubeArray[40] = cubeArray[31];
        cubeArray[41] = cubeArray[32];
        
        cubeArray[30] = cubeArray[21];
        cubeArray[31] = cubeArray[22];
        cubeArray[32] = cubeArray[23];
        
        cubeArray[21] = v1;
        cubeArray[22] = v2;
        cubeArray[23] = v3; 
        return new RubiksCube(cubeArray);
    }
    
    public RubiksCube moveEprime()
    {
        byte v1=cubeArray[12], v2=cubeArray[13], v3=cubeArray[14];
        
        cubeArray[12] = cubeArray[21];
        cubeArray[13] = cubeArray[22];
        cubeArray[14] = cubeArray[23];
        
        cubeArray[21] = cubeArray[30];
        cubeArray[22] = cubeArray[31];
        cubeArray[23] = cubeArray[32];
        
        cubeArray[30] = cubeArray[39];
        cubeArray[31] = cubeArray[40];
        cubeArray[32] = cubeArray[41];
        
        cubeArray[39] = v1;
        cubeArray[40] = v2;
        cubeArray[41] = v3;
        return new RubiksCube(cubeArray);
    }
    
    public RubiksCube moveS()
    {
        byte v1=cubeArray[3], v2=cubeArray[4], v3=cubeArray[5];
        
        cubeArray[3] = cubeArray[16];
        cubeArray[4] = cubeArray[13];
        cubeArray[5] = cubeArray[10];
        
        cubeArray[16] = cubeArray[50];
        cubeArray[13] = cubeArray[49];
        cubeArray[10] = cubeArray[48];
        
        cubeArray[50] = cubeArray[28];
        cubeArray[49] = cubeArray[31];
        cubeArray[48] = cubeArray[34];
        
        cubeArray[28] = v1;
        cubeArray[31] = v2;
        cubeArray[34] = v3;
        return new RubiksCube(cubeArray);
    }
    
    public RubiksCube moveSprime()
    {
        byte v1=cubeArray[3], v2=cubeArray[4], v3=cubeArray[5];
        
        cubeArray[3] = cubeArray[28];
        cubeArray[4] = cubeArray[31];
        cubeArray[5] = cubeArray[34];
        
        cubeArray[28] = cubeArray[50];
        cubeArray[31] = cubeArray[49];
        cubeArray[34] = cubeArray[48];
        
        cubeArray[50] = cubeArray[16];
        cubeArray[49] = cubeArray[13];
        cubeArray[48] = cubeArray[10];
        
        cubeArray[16] = v1;
        cubeArray[13] = v2;
        cubeArray[10] = v3;
        return new RubiksCube(cubeArray);
    }
    
}
