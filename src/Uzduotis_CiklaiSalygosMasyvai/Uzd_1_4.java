package Uzduotis_CiklaiSalygosMasyvai;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Mindaugas on 2017-04-06.
 */
public class Uzd_1_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skaiciu");
        int sum = 0;
        int skaic = 0;
        while(true){

            try {
                skaic = scanner.nextInt();
                if(skaic==0){
                    System.out.println("Ivestu skaiciu suma " + sum);
                    break;
                }
                sum+=skaic;
                System.out.println("Iveskite kita skaiciu");
            }catch (InputMismatchException e){
                System.out.println("Ivedete bloga skaiciu, iveskite tik skaiciu");
                scanner.nextLine();
            }
        }
    }
}
