package PirmaPaskaita;

import java.util.Scanner;

/**
 * Created by Mindaugas on 2017-04-04.
 */
public class Uzd_1_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert first number");
        int numberFirst = scanner.nextInt();
        System.out.println("Insert second number");
        int nuberSecond = scanner.nextInt();
        int sum = sumMet(numberFirst, nuberSecond);
        int sub = subMet(numberFirst, nuberSecond);
        System.out.println("Inserted number sum is " + sum);
        System.out.println("Inserted number subtraction is " + sub);

    }
    public static int sumMet(int var1, int var2){
        return var1 + var2;
    }
    public static int subMet(int var1, int var2){
        return var1 - var2;
    }
}
