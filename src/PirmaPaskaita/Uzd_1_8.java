package PirmaPaskaita;

import java.util.Scanner;

/**
 * Created by Mindaugas on 2017-04-05.
 */
public class Uzd_1_8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite nuvaziuota kelia [km]");
        float km = scanner.nextFloat();
        System.out.println("Iveskite sunaudotas kuro sanaudas");
        float kuras = scanner.nextFloat();
        float kuroVidurkis = (kuras * 100) / km;
        System.out.println("Automobilio vidutis kuro sunaudojimas " + kuroVidurkis + " [l/100 km]");
    }
}
