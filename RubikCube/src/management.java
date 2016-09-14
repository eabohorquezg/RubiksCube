/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnDresLoPz
 */
public class management {
    
    static RubiksCube moveCube(Long node, RubiksCube cube){
        long module = node%18;
        long tmp = 0;
        if (module == 0) tmp=16;
        else if (module == 1) tmp=17;
        else tmp = module-2;
        
        //System.out.println("move: "+tmp);
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
    
    static RubiksCube moveCube(int tmp, RubiksCube cube){
        //System.out.println("move: "+tmp);
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
