package Uzduotis_CiklaiSalygosMasyvai;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Spliterator;

/**
 * Created by Mindaugas on 2017-04-07.
 */
public class Uzd_1_9_v2 {
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Skaiciu veiksmas skaicius");
            String skaiciai = scanner.nextLine();
            String[] isskirstytiSkaiciai = skaiciai.split(" ");
            int skaic1 = 0;
            int skaic2 = 0;
            try{
                skaic1 = Integer.parseInt(isskirstytiSkaiciai[0]);
                skaic2 = Integer.parseInt(isskirstytiSkaiciai[2]);
            }catch (NumberFormatException e){
                System.out.println("juk prasiau ivesti tik skaiciu");
                return;
            }
            String opNumb = isskirstytiSkaiciai[1];
            switch (opNumb) {
                case "+":
                    int suma = sumMet(skaic1, skaic2);
                    System.out.println("Suma lygi " + suma);
                    break;
                case "-":
                    int skirtumas = skirtMet(skaic1, skaic2);
                    System.out.println("Skirtumas lygus " + skirtumas);
                    break;
                case "*":
                    int sandauga = sandMet(skaic1, skaic2);
                    System.out.println("Sandauga lygi " + sandauga);
                   break;
                default:
                    System.out.println("Blogas veiksmas");
                    break;
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
