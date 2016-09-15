/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AndresL
 */
public class ToolsCube_A {
    
    public ToolsCube_A(){
    
    }
    
    public byte[] RandomCube(int level){
        String pathNewCube = "";
        byte[] cube = originalCube();
        for (int i = 0; i < level; i++) {
            int indexrandom = (int)(Math.random()*18);
            switch (indexrandom){
                case 0: cube = moveL(cube); pathNewCube+="L "; break;
                case 1: cube = moveLprime(cube); pathNewCube+="LP "; break;
                case 2: cube = moveB(cube); pathNewCube+="B "; break;
                case 3: cube = moveBprime(cube); pathNewCube+="BP "; break;
                case 4: cube = moveD(cube); pathNewCube+="D "; break;
                case 5: cube = moveDprime(cube); pathNewCube+="DP "; break;
                case 6: cube = moveE(cube); pathNewCube+="E "; break;
                case 7: cube = moveEprime(cube); pathNewCube+="EP "; break;
                case 8: cube = moveF(cube); pathNewCube+="F "; break;
                case 9: cube = moveFprime(cube); pathNewCube+="FP "; break;
                case 10: cube = moveM(cube); pathNewCube+="M "; break;
                case 11: cube = moveMprime(cube); pathNewCube+="MP "; break;
                case 12: cube = moveR(cube); pathNewCube+="R "; break;
                case 13: cube = moveRprime(cube); pathNewCube+="RP "; break;
                case 14: cube = moveS(cube); pathNewCube+="S "; break;
                case 15: cube = moveSprime(cube); pathNewCube+="SP "; break;
                case 16: cube = moveU(cube); pathNewCube+="U "; break;
                case 17: cube = moveUprime(cube); pathNewCube+="UP "; break;
            }
            
        }       
        System.out.println("Camino random: "+pathNewCube);  
        //cube.printArrayCube();
        return cube;
    }
        
    
    public void printArrayCube(byte[] cubeArray)
    {
        for (int i = 0; i < cubeArray.length; i++) {
            System.out.print(cubeArray[i]+" ");
        }
        System.out.println("");
    }
    
    public byte[] moveL(byte[] cubeArray) 
    {        
        byte []newcubearray = cubeArray.clone(); 
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
        return newcubearray; 
    }
    
    public byte[] moveLprime(byte[] cubeArray)
    { 
        byte []newcubearray = cubeArray.clone(); 
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
        return newcubearray;
    } 
    
    public byte[] moveR(byte[] cubeArray)
    { 
        byte []newcubearray = cubeArray.clone();  
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
        return newcubearray;
    }
    
    public byte[] moveRprime(byte[] cubeArray)
    { 
        byte []newcubearray = cubeArray.clone(); 
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
        return newcubearray;
    }
    
    public byte[] moveU(byte[] cubeArray)
    { 
        byte []newcubearray = cubeArray.clone();  
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
        return newcubearray;
    }
    
    public byte[] moveUprime(byte[] cubeArray)
    { 
        byte []newcubearray = cubeArray.clone();  
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
        return newcubearray;
    }
    
    public byte[] moveD(byte[] cubeArray)
    { 
        byte []newcubearray = cubeArray.clone(); 
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
        return newcubearray;
    }
    
    public byte[] moveDprime(byte[] cubeArray)
    { 
        byte []newcubearray = cubeArray.clone(); 
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
        return newcubearray;
    }
    
    public byte[] moveF(byte[] cubeArray)
    { 
        byte []newcubearray = cubeArray.clone(); 
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
        return newcubearray;
    }
    
    public byte[] moveFprime(byte[] cubeArray)
    { 
        byte []newcubearray = cubeArray.clone(); 
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
        return newcubearray;
    }
    
    public byte[] moveB(byte[] cubeArray)
    { 
        byte []newcubearray = cubeArray.clone(); 
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
        return newcubearray;
    }
    
    public byte[] moveBprime(byte[] cubeArray)
    { 
        byte []newcubearray = cubeArray.clone(); 
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
        return newcubearray;
    }
    
    public byte[] moveM(byte[] cubeArray)
    { 
        byte []newcubearray = cubeArray.clone(); 
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
        return newcubearray;
    }
    
    public byte[] moveMprime(byte[] cubeArray)
    { 
        byte []newcubearray = cubeArray.clone(); 
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
        return newcubearray;
    }
    
    public byte[] moveE(byte[] cubeArray)
    { 
        byte []newcubearray = cubeArray.clone(); 
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
        return newcubearray;
    }
    
    public byte[] moveEprime(byte[] cubeArray)
    { 
        byte []newcubearray = cubeArray.clone();  
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
        return newcubearray;
    }
    
    public byte[] moveS(byte[] cubeArray)
    { 
        byte []newcubearray = cubeArray.clone(); 
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
        return newcubearray;
    }
    
    public byte[] moveSprime(byte[] cubeArray)
    { 
        byte []newcubearray = cubeArray.clone(); 
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
        return newcubearray;
    } 
 
    public boolean isOrdered(byte[] cubeArray)
    {
        boolean resp = true;
        for (int i = 0; i < cubeArray.length; i++)
        {
            if( cubeArray[i] != (i+1) )
                return false;
        }
        return resp;
    }
    
    public byte[] moveCube(Long node, byte[] cubeArray){
        
        long module = node%18;
        long tmp = 0;
        if (module == 0) tmp=16;
        else if (module == 1) tmp=17;
        else tmp = module-2;
        
//        System.out.println("move "+tmp);
//        cube.printArrayCube();
        
        if (tmp==0) return moveL(cubeArray);
        if (tmp==1) return moveLprime(cubeArray);
        if (tmp==2) return moveB(cubeArray);
        if (tmp==3) return moveBprime(cubeArray);
        if (tmp==4) return moveD(cubeArray);
        if (tmp==5) return moveDprime(cubeArray);
        if (tmp==6) return moveE(cubeArray);
        if (tmp==7) return moveEprime(cubeArray);
        if (tmp==8) return moveF(cubeArray);
        if (tmp==9) return moveFprime(cubeArray);
        if (tmp==10) return moveM(cubeArray);
        if (tmp==11) return moveMprime(cubeArray);
        if (tmp==12) return moveR(cubeArray);
        if (tmp==13) return moveRprime(cubeArray);
        if (tmp==14) return moveS(cubeArray);
        if (tmp==15) return moveSprime(cubeArray);
        if (tmp==16) return moveU(cubeArray);
        if (tmp==17) return moveUprime(cubeArray);
        
        System.out.println("Error, Movimiento invalido: "+tmp);
        System.exit(0);
        return null;
    }
    
    public byte[] moveCube(int tmp, byte[] cubeArray){

//        System.out.println("move "+tmp);
//        cube.printArrayCube();
        
        if (tmp==0) return moveL(cubeArray);
        if (tmp==1) return moveLprime(cubeArray);
        if (tmp==2) return moveB(cubeArray);
        if (tmp==3) return moveBprime(cubeArray);
        if (tmp==4) return moveD(cubeArray);
        if (tmp==5) return moveDprime(cubeArray);
        if (tmp==6) return moveE(cubeArray);
        if (tmp==7) return moveEprime(cubeArray);
        if (tmp==8) return moveF(cubeArray);
        if (tmp==9) return moveFprime(cubeArray);
        if (tmp==10) return moveM(cubeArray);
        if (tmp==11) return moveMprime(cubeArray);
        if (tmp==12) return moveR(cubeArray);
        if (tmp==13) return moveRprime(cubeArray);
        if (tmp==14) return moveS(cubeArray);
        if (tmp==15) return moveSprime(cubeArray);
        if (tmp==16) return moveU(cubeArray);
        if (tmp==17) return moveUprime(cubeArray);
        
        System.out.println("Error, Movimiento invalido: "+tmp);
        System.exit(0);
        return null;
    }
    
    public byte[] originalCube(){
        byte[] cubeArray = new byte[54];
        for (byte i = 0; i < cubeArray.length; i++) {
             cubeArray[i] = (byte)(i+1);
        }
        return cubeArray;
    }
    
}
