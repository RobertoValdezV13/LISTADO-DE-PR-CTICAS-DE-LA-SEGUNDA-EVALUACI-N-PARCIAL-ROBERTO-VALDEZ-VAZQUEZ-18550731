import java.util.*;

public class Principal {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Inserta un numero de mes");
        int iNum;
        
        iNumero = input.nextInt();
        if (iNum == 12) {
            System.out.println("Diciembre");
        } else {
            if (iNum == 11) {
                System.out.println("Noviembre");
            } else {
                if (iNum == 10) {
                    System.out.println("Octubre");
                } else {
                    if (iNum == 9) {
                        System.out.println("Septiembre");
                    } else {
                        if (iNum == 8) {
                            System.out.println("Agosto");
                        } else {
                            if (iNum == 7) {
                                System.out.println("Julio");
                            } else {
                                if (iNum == 6) {
                                    System.out.println("Junio");
                                } else {
                                    if (iNum == 5) {
                                        System.out.println("Mayo");
                                    } else {
                                        if (iNum == 4) {
                                            System.out.println("Abril");
                                        } else {
                                            if (iNum == 3) {
                                                System.out.println("Marzo");
                                            } else {
                                                if (iNum == 2) {
                                                    System.out.println("Febrero");
                                                } else {
                                                    if (iNum == 1) {
                                                        System.out.println("Enero");
                                                    } else {
                                                        if (iNum > 12) {
                                                            System.out.println("Numero fuera de rango");
                                                        } else {
                                                            if (iNum < 1) {
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
