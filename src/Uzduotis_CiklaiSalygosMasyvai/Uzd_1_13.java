package Uzduotis_CiklaiSalygosMasyvai;

import java.util.Scanner;

/**
 * Created by Mindaugas on 2017-04-07.
 */
public class Uzd_1_13 {
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
        int minMasNumb = maxMet(skaicMas);
        System.out.println("Maziausias ivesto masyvo skaicius lygus " + minMasNumb);
    }
    public static int maxMet(int[] mas){
        int min = mas[0];
        for(int i=0; i<mas.length; i++){
            if(mas[i]<min){
                min=mas[i];
            }
        }
        return min;
    }
}
