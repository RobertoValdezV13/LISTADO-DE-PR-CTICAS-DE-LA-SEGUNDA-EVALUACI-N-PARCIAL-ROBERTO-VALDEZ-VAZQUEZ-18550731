
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roberto Valdez Vazquez-18550731
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int iNumAlea =(int) (Math.random()*10) +1;
        for(int i=0; i<8; i++){
            System.out.println("Adivina el numero");
            int iNum = input.nextInt();
            if(iNum == iNumAlea){
                System.out.println("Felicidades, Ganaste");
                break;
            }
        }
    } 
    
}
