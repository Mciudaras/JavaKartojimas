package PirmaPaskaita;

import java.util.Scanner;

/**
 * Created by Mindaugas on 2017-04-05.
 */
public class Uzd_1_5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert first number");
        int numbFirst = scanner.nextInt();
        float numbFirstFloat = scanner.nextFloat();
        System.out.println("Please insert second number");
        int numbSecond = scanner.nextInt();
        float numbSecondFloat = scanner.nextFloat();
        int sum = sumMet(numbFirst, numbSecond);
        float sumfloat = sumMet(numbFirstFloat, numbSecondFloat);
        int sub = subMet(numbFirst, numbSecond);
        float subfloat = subMet(numbFirstFloat, numbSecondFloat);
        System.out.println("Sum = " + sum);
        System.out.println("Sum = " + sumfloat);
        System.out.println("Subtraction = " + sub);
        System.out.println("Subtraction = " + subfloat);
    }
    public static int sumMet(int var1, int var2){
        return var1 + var2;
    }
    public static float sumMet(float var1, float var2){
        return var1 + var2;
    }
    public static int subMet(int var1, int var2){
        return var1 - var2;
    }
    public static float subMet(float var1, float var2){
        return var1- var2;
    }
}
