//@author Roberto Valdez Vazquez-18550731

import java.util.*;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingresa un numero de mes");
        int iNumero;
        
        iNumero = input.nextInt();
        if (iNumero == 12) {
            System.out.println("Diciembre");
        } else {
            if (iNumero == 11) {
                System.out.println("Noviembre");
            } else {
                if (iNumero == 10) {
                    System.out.println("Octubre");
                } else {
                    if (iNumero == 9) {
                        System.out.println("Septiembre");
                    } else {
                        if (iNumero == 8) {
                            System.out.println("Agosto");
                        } else {
                            if (iNumero == 7) {
                                System.out.println("Julio");
                            } else {
                                if (iNumero == 6) {
                                    System.out.println("Junio");
                                } else {
                                    if (iNumero == 5) {
                                        System.out.println("Mayo");
                                    } else {
                                        if (iNumero == 4) {
                                            System.out.println("Abril");
                                        } else {
                                            if (iNumero == 3) {
                                                System.out.println("Marzo");
                                            } else {
                                                if (iNumero == 2) {
                                                    System.out.println("Febrero");
                                                } else {
                                                    if (iNumero == 1) {
                                                        System.out.println("Enero");
                                                    } else {
                                                        if (iNumero > 12) {
                                                            System.out.println("Numero fuera de rango");
                                                        } else {
                                                            if (iNumero < 1) {
                                                                System.out.println("Numero fuera de rango");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
