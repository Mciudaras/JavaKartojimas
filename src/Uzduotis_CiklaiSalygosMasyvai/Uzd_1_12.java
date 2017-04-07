package Uzduotis_CiklaiSalygosMasyvai;

import java.util.Scanner;

/**
 * Created by Mindaugas on 2017-04-07.
 */
public class Uzd_1_12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skaiciu masyva");
        System.out.println("Iveskite skaiciu masyvo ilgi");
        int masIlgis = scanner.nextInt();
        int[] skaicMas = new int[masIlgis];
        System.out.println("Iveskite pirma masyvo skaiciu");
        for (int i=0; i<skaicMas.length; i++){
            int skaic = scanner.nextInt();
            if(i<skaicMas.length-1) {
                System.out.println("Iveskite sekanti masyvo skaiciu");
            }
            skaicMas[i] = skaic;
        }
        int maxMasNumb = maxMet(skaicMas);
        System.out.println("Didziausias ivesto masyvo skaicius lygus " + maxMasNumb);
    }
    public static int maxMet(int[] mas){
        int max = 0;
        for(int i=0; i<mas.length; i++){
            if(mas[i]>max){
                max=mas[i];
            }
        }
        return max;
    }
}
