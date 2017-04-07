package Uzduotis_CiklaiSalygosMasyvai;

import java.util.Scanner;

/**
 * Created by Mindaugas on 2017-04-07.
 */
public class Uzd_1_10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skaiciu");
        int sum = 0;
            int n = scanner.nextInt();
            if(n<1){
                System.out.println("Ivestas skaicius mazesnis nei 1, ivestas skaicius turi buti didesnis arba lygus 1");
                return;
            }
            int i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }
            System.out.println("Skaiciu suma nuo vieno iki ivesto skaiciaus lygi " +sum);
        }
}

