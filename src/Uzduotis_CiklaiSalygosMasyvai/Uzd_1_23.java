package Uzduotis_CiklaiSalygosMasyvai;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Mindaugas on 2017-04-10.
 */
public class Uzd_1_23 {
    public static void main(String[] args)throws FileNotFoundException{
        Scanner scanner = new Scanner(new File("vardai.txt"));
        textAtvaizdMet(scanner);
    }
    public static void textAtvaizdMet(Scanner scanner){
        while(scanner.hasNextLine()){
            String zodis = scanner.nextLine();
            System.out.println(zodis);
        }
    }
}
