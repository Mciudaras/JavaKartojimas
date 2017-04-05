package PirmaPaskaita;

import java.util.Scanner;

/**
 * Created by Mindaugas on 2017-04-04.
 */
public class Uzd_1_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert word");
        String word = scanner.nextLine();
        int wordLenght = word.length();
        System.out.println("Inserted word lenght is " + wordLenght);
    }
}
