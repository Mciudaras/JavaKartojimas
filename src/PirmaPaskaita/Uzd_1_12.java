package PirmaPaskaita;

import java.util.Scanner;

/**
 * Created by Mindaugas on 2017-04-05.
 */
public class Uzd_1_12 {
    private static KMI kmi;

    public static void main(String[] args) {
        Uzd_1_12();
        System.out.println(kmi.KMI());
    }

    public static void Uzd_1_12() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite savo svori");
        float weight = scanner.nextFloat();
        System.out.println("Iveskite savo ugi");
        float height = scanner.nextFloat();
        kmi = new KMI(weight, height);

    }
}
