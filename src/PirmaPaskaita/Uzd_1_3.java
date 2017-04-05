package PirmaPaskaita;

import java.util.Scanner;

/**
 * Created by Mindaugas on 2017-04-04.
 */
public class Uzd_1_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert first number");
        int numbFirst = scanner.nextInt();
        System.out.println("Please insert second number");
        int numbSecond = scanner.nextInt();
        int sum = numbFirst + numbSecond;
        System.out.println("Inserted number sum = " + sum);
        int sub = numbFirst - numbSecond;
        System.out.println("Inserted number subraction = " + sub);
    }
}
