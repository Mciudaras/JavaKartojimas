package Uzduotis_CiklaiSalygosMasyvai;

import java.util.Scanner;

/**
 * Created by Mindaugas on 2017-04-10.
 */
public class Uzd_1_24 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite pirma skaiciu");
        float skaic1 = scanner.nextFloat();
        System.out.println("Iveskite antra skaiciu");
        float skaic2 = scanner.nextFloat();
        float atsSum = sumMet(skaic1, skaic2);
        float atsSkirt = skirtMet(skaic1, skaic2);
        float atsSand =  sandMet(skaic1, skaic2);
        System.out.println("skaiciu suma " + atsSum);
        System.out.println("skaiciu skirtumas " + atsSkirt);
        System.out.println("skaiciu sandauga " + atsSand);
    }
    public static float sumMet(float numb1, float numb2){
        return numb1 + numb2;
    }
    public static float skirtMet(float numb1, float numb2){
        return numb1 - numb2;
    }
    public static float sandMet(float numb1, float numb2){
        return numb1 * numb2;
    }
}
