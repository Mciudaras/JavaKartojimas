package Uzduotis_CiklaiSalygosMasyvai;

import java.util.Scanner;

/**
 * Created by Mindaugas on 2017-04-06.
 */
public class Uzd_1_7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite ivedamu skaiciu kieki");
        int skaic;
        int skaicKiek = scanner.nextInt();
        int[] skaicMas = new int[skaicKiek];
        for(int i=0; i<skaicMas.length; i++){
            System.out.println("Iveskite skaiciu");
             skaic = scanner.nextInt();
             skaicMas[i]=skaic;
        }
        for(int i=0; i<skaicMas.length; i++){
            if(skaicMas[i]>100){
                System.out.println(skaicMas[i]);
            }
        }
    }
}
