package Uzduotis_CiklaiSalygosMasyvai;

import java.util.Scanner;

/**
 * Created by Mindaugas on 2017-04-06.
 */
public class Uzd_1_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skaiciu");
        int skaic = scanner.nextInt();
        int tikrinimas = skaic % 2;
        if(tikrinimas == 0){
            System.out.println("Ivestas skaicius yra lyginis");
        }
        else System.out.println("Ivestas skaicius yra nelyginis");
    }
}
