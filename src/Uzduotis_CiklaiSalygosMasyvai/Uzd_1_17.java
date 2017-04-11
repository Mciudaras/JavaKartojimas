package Uzduotis_CiklaiSalygosMasyvai;

import java.util.Scanner;

/**
 * Created by Mindaugas on 2017-04-10.
 */
public class Uzd_1_17 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite polindroma");
        String zodis = scanner.nextLine();
        boolean arPolindromas = polindMet(zodis);
        System.out.println("Ar ivestas zodis yra polindromas? " + arPolindromas);
    }
    public static boolean polindMet(String zodis) {
        String zodisBeTarpu = zodis.replaceAll(" ", "");
        for(int i = 0; i<=(zodisBeTarpu.length()/2); i++){
        char simb1 = zodisBeTarpu.charAt(i);
        char simb2 = zodisBeTarpu.charAt(zodisBeTarpu.length()-i-1);
        if(simb1!=simb2){
            return false;
        }
    }
        return true;
    }
}
