package PirmaPaskaita;

import java.util.Scanner;

/**
 * Created by Mindaugas on 2017-04-05.
 */
public class Uzd_1_7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your weight");
        float weight = scanner.nextFloat();
        System.out.println("Please insert your height");
        float height = scanner.nextFloat();
        float KMI = KMI_Met(weight, height);
        System.out.println("KMI = " + KMI);

    }
    public static float KMI_Met(float weight, float height){
        return weight / (height * height);
    }
}
