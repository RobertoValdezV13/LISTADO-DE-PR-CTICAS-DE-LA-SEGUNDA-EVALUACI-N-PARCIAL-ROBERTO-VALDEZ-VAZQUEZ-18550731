//@author Roberto Valdez Vazquez-18550731

import java.util.*;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce la temperatura en grados (°C)");
        int iTemp;
        
        iTemperature = input.nextInt();
        if (iTemp < 0) {
            System.out.println("Freezing Weather");
        } else {
            if (iTemp >= 0 && iTemp <= 10) {
                System.out.println("Very Cold Weather");
            } else {
                if (iTemp >= 11 && iTemp <= 20) {
                    System.out.println("Cold Weather");
                } else {
                    if (iTemp >= 21 && iTemp <= 30) {
                        System.out.println("Normal in Temp");
                    } else {
                        if (iTemp >= 31 && iTemp <= 40) {
                            System.out.println("It's Hot");
                        } else {
                            if (iTemp >= 41) {
                                System.out.println("It's very Hot");
                            } else {
                                System.out.println("The Entered Value is not Recognized");
                            }
                        }
                    }
                }
            }
        }
    }
}
