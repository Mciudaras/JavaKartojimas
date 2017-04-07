package Uzduotis_CiklaiSalygosMasyvai;

import java.util.Scanner;

/**
 * Created by Mindaugas on 2017-04-07.
 */
public class Uzd_1_11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skaiciu");
        int n = scanner.nextInt();
        if(n<1){
            System.out.println("Ivestas skaicius mazesnis nei 1, ivestas skaicius turi buti didesnis arba lygus 1");
            return;
        }
        System.out.println("Pasirinkite veiksma, kuri norite atlikti");
        System.out.println("1 skaiciuoja skaiciu suma");
        System.out.println("2 skaiciuoja skaiciu sandauga");
        int opNumb = scanner.nextInt();
        switch (opNumb){
            case 1:
                int sum = sumMet(n);
                System.out.println("Skaiciu suma lygi " + sum);
                break;
            case 2:
                int sand = sandMet(n);
                System.out.println("Skaiciu sandauga lygi " + sand);
                break;
        }
    }
    public static int sumMet(int numb){
        int sum = 0;
        int i = 1;
        while(i<=numb){
            sum+=i;
            i++;
        }
        return sum;
    }
    public static int sandMet(int numb){
        int sand = 1;
        int i = 1;
        while(i<=numb){
            sand*=i;
            i++;
        }
        return sand;
    }
}
