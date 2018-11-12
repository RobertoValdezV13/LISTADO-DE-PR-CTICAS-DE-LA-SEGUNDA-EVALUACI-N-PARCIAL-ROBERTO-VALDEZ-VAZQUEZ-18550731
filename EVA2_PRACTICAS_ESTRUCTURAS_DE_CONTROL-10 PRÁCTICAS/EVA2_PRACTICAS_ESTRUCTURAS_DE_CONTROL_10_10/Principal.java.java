
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roberto Valdez Vazquez-18550731
 *
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Ingresa A");
        int A = input.nextInt();
        System.out.println("Ingresa B");
        int B = input.nextInt(); 
        System.out.println("Ingresa C");
        int C = input.nextInt();
        // usar el discriminante y determinar
        // el trinomio
        int iDisc = (B + B) + (4 * A *C);
        // bandera
        boolean bBande = false;
        if(iDisc > 0) { //positivo
            System.out.println("Trinomio Ax^2");
        }
        else if(iDisc == 0) { 
            System.out.println("T.C.P");   
        } 
        else{
            bBande = false;
            System.out.println("Sin solucion");
            } 
        if (bBande){
          double dX1 , dX2;
          double dRaiz = Math.sqrt(iDisc);
          dX1 = (- B + dRaiz) / (2 * A);
          dX2 = (- B - dRaiz) / (2 * A);
            System.out.println("X1 = " + dX1);
            System.out.println("X2 = " + dX2);

        }
    } 
}
