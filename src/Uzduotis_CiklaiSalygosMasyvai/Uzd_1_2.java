package Uzduotis_CiklaiSalygosMasyvai;

import java.util.Scanner;

/**
 * Created by Mindaugas on 2017-04-06.
 */
public class Uzd_1_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite zodi");
        String pabaiga = "pabaiga";
        while(true){
            String zodis = scanner.nextLine();
            System.out.println(zodis);
            if(zodis.equals(pabaiga)){
                break;
            }
            System.out.println("Iveskite kita zodi");
        }
    }
}
