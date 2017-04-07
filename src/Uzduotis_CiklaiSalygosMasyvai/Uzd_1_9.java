package Uzduotis_CiklaiSalygosMasyvai;

import java.util.Scanner;

/**
 * Created by Mindaugas on 2017-04-06.
 */
public class Uzd_1_9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i=0;
        while (true){
        System.out.println("Iveskite pirma skaiciu");
        int skaic1 = scanner.nextInt();
        System.out.println("Iveskite antra skaiciu");
        int skaic2 = scanner.nextInt();
        System.out.println("Iveskite operacija, kuria norite atlikti su skaiciais");
        System.out.println("Suma = 1");
        System.out.println("Skirtumas = 2");
        System.out.println("Sandauga = 3");
        int opNumb = scanner.nextInt();
        switch (opNumb) {
            case 1:
                int suma = sumMet(skaic1, skaic2);
                System.out.println("Suma lygi " + suma);
                System.out.println("Jei ivesti skaiciu 5, galesite kartoti, ivede bet koki skaiciu paigsite skaiciavima");
                i = scanner.nextInt();
               break;
            case 2:
                int skirtumas = skirtMet(skaic1, skaic2);
                System.out.println("Skirtumas lygus " + skirtumas);
                System.out.println("Jei ivesti skaiciu 5, galesite kartoti, ivede bet koki skaiciu paigsite skaiciavima");
                i = scanner.nextInt();
                 break;
            case 3:
                int sandauga = sandMet(skaic1, skaic2);
                System.out.println("Sandauga lygi " + sandauga);
                System.out.println("Jei ivesti skaiciu 5, galesite kartoti, ivede bet koki skaiciu paigsite skaiciavima");
                i = scanner.nextInt();
                break;
                }
                if(i!=5){
            break;
                }
        }
        }
    public static int sumMet(int numb1, int numb2){
        return numb1 + numb2;
    }
    public static int skirtMet(int numb1, int numb2){
        return numb1 - numb2;
    }
    public static int sandMet(int numb1, int numb2){
        return numb1 * numb2;
    }
}
