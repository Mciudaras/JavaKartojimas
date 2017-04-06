package Uzduotis_CiklaiSalygosMasyvai;

import java.util.Scanner;

/**
 * Created by Mindaugas on 2017-04-06.
 */
public class Uzd_1_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skaiciu");
        int sum = 0;
        while(true){
            int skaic = scanner.nextInt();
            sum+=skaic;
            if(skaic==0){
                System.out.println("Ivestu skaiciu suma " + sum);
                break;
            }
            System.out.println("Iveskite kita skaiciu");
        }
    }
}
