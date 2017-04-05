package PirmaPaskaita;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * Created by Mindaugas on 2017-04-05.
 */
public class Uzd_1_9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

       // Uzd_1_9 uzd19 = new Uzd_1_9();    // objekto sukurimas
       // uzd19.varMet(scanner);
        float kuroVid = varMet(scanner);
        System.out.println(kuroVid);


    }
    public static float varMet(Scanner scanner){
        System.out.println("Iveskite nuvaziuota kelia [km]");
        int var1 = scanner.nextInt();
        System.out.println("Iveskite sunaudotas kuro sanaudas");
        int var2 = scanner.nextInt();
        return vidMet(var1, var2);

    }
    public static float vidMet(float var1, float var2){
       return (var2 * 100) / var1;
    }
}
