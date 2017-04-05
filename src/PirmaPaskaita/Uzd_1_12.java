package PirmaPaskaita;

import java.util.Scanner;

/**
 * Created by Mindaugas on 2017-04-05.
 */
public class Uzd_1_12 {
    public static void main(String[] args){
        KMI kmi = new KMI();

    }
    public Uzd_1_12(float weight, float height) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite savo svori");
        weight = scanner.nextFloat();
        System.out.println("Iveskite savo ugi");
        height = scanner.nextFloat();
    }
}
