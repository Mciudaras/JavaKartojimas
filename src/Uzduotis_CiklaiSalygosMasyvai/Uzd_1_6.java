package Uzduotis_CiklaiSalygosMasyvai;

import java.util.Scanner;

/**
 * Created by Mindaugas on 2017-04-06.
 */
public class Uzd_1_6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite zodi");
        int i=1;
        String[] zodMas = new String[5];
        while (i<=5){
            String zodis = scanner.nextLine();
            zodMas[i-1]=zodis;
            System.out.println("Iveskite sekanti zodi");
            i++;
        }
        for(i=0; i<zodMas.length; i++){
            System.out.println(zodMas[i]);
        }
    }
}
