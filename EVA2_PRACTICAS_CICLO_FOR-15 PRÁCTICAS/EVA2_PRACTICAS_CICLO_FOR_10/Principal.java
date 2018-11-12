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
        int iNum;
        
        for (iNum = 1; iNum <= 100; iNum++) {
            System.out.print(iNum + "   ");
        }
        
        int iNumSumatoria;
            System.out.println();
            System.out.println();
            System.out.println("Resultado de la sumatoria: ");
        for (iNumSumatoria = 1; iNumSumatoria <= 100; iNumSumatoria++){
            System.out.print(iNumSumatoria + " + ");
        }
    }
}
