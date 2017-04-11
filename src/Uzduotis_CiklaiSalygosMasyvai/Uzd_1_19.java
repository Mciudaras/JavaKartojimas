package Uzduotis_CiklaiSalygosMasyvai;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Mindaugas on 2017-04-10.
 */
public class Uzd_1_19 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scanner = new Scanner(new File("vardai.txt"));
        while(scanner.hasNextLine()){
            String vardas = scanner.nextLine();
            char pirmRaid = vardas.charAt(0);
            char A = 'A';
            if(A == pirmRaid){
                System.out.println(vardas);
            }
        }
    }
}
