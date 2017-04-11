package Uzduotis_CiklaiSalygosMasyvai;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Mindaugas on 2017-04-10.
 */
public class Uzd_1_22 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("text_2.txt"));
        int zodzKiekis = zodziuSkait(scanner);
        System.out.println("Tekste yra " + zodzKiekis + " zodziai/iu");
    }
    public static int zodziuSkait(Scanner scanner) {
        int skait=0;
        while (scanner.hasNext()) {
            String zodis = scanner.next();
            skait++;
        }
        return skait;
    }
}
