package Uzduotis_CiklaiSalygosMasyvai;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Mindaugas on 2017-04-10.
 */
public class Uzd_1_21 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scanner = new Scanner(new File("text_2.txt"));
        String ieskomasZodis = "labas";
        boolean arRastasIeskZodis = zodziuPaieska(scanner, ieskomasZodis);
        System.out.println("Ar yra ieskomas zodis? " + arRastasIeskZodis);
        }
        public static boolean zodziuPaieska(Scanner scanner, String ieskomasZodis) {
            while (scanner.hasNext()) {
                String zodis = scanner.next();
                if (zodis.equals(ieskomasZodis)) {
                    return true;
                }
            }
                return false;
        }
    }
