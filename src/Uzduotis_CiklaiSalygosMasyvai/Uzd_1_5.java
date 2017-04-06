package Uzduotis_CiklaiSalygosMasyvai;

import java.util.Scanner;

/**
 * Created by Mindaugas on 2017-04-06.
 */
public class Uzd_1_5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite 5 skaicius");
        int i=1;
        int sum = 0;
        int[] skaicMas = new int[5];
        while(i<=5){
               int skaic = scanner.nextInt();
               skaicMas[i-1] = skaic;
            sum+=skaic;
            i++;
        }
        for(i=0; i<skaicMas.length; i++){
            System.out.println("Ivesti skaiciai " + skaicMas[i]);
        }
        System.out.println("Ivestu skaiciu suma lygi " + sum);
    }
}
