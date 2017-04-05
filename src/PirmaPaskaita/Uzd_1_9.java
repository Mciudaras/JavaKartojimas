package PirmaPaskaita;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * Created by Mindaugas on 2017-04-05.
 */
public class Uzd_1_9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Uzd_1_9 uzd19 = new Uzd_1_9();    // objekto sukurimas




    }
    public float varMet(Scanner scanner, float var1, float var2){
        System.out.println("Iveskite nuvaziuota kelia [km]");
        var1 = scanner.nextFloat();
        System.out.println("Iveskite sunaudotas kuro sanaudas");
        var2 = scanner.nextFloat();
        return 0;

    }
    public float vidMet(float var1, float var2){
       return (var2 * 100) / var1;
    }
}
