
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
        Scanner Asterisco = new Scanner(System.in);
            System.out.println("Introduce la cantidad de asteriscos (N)");
            int ImpAsterisco = Asterisco.nextInt();
        
            System.out.print("N: ");
        for(int i = 0; i < ImpAsterisco; i++){
                System.out.print("*");
            
        }
    }
}

