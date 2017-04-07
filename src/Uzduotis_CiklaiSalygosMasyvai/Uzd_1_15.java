package Uzduotis_CiklaiSalygosMasyvai;

import java.util.Scanner;

/**
 * Created by Mindaugas on 2017-04-07.
 */
public class Uzd_1_15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite zodi");
        String zodis = scanner.nextLine();
        int raidKiekis = skaitikMet(zodis);
        System.out.println("a raidziu kiekis ivestame zodyje " + raidKiekis);

    }
    public static int skaitikMet(String zodis){
        if(zodis == null){
            return 0;
        }
        int skaitiklis = 0;
        String a = "a";
        String[] isskirstytasZodis = zodis.split("");
        for(int i=0; i<isskirstytasZodis.length; i++){
            if(isskirstytasZodis[i].equals(a)){
                skaitiklis++;
            }
        }
        return skaitiklis;
    }
}
