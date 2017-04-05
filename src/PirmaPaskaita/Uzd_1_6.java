package PirmaPaskaita;

import java.util.Scanner;

/**
 * Created by Mindaugas on 2017-04-05.
 */
public class Uzd_1_6 {
    public static void main(String[] main){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your weight");
        float weight = scanner.nextFloat();
        System.out.println("Please insert your height");
        float height = scanner.nextFloat();
        float KMI = weight / (height * height);
        System.out.println("KMI = " + KMI);
    }
}
