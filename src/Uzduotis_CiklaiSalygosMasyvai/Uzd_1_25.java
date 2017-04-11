package Uzduotis_CiklaiSalygosMasyvai;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Mindaugas on 2017-04-10.
 */
public class Uzd_1_25 {

    private String name;

    public Uzd_1_25(String name){
        this.name=name;
    }

    public static void main(String[] args) throws FileNotFoundException{
        Scanner scanner = new Scanner(new File("vardai.txt"));
        List<String> listMas = textToListMet(scanner);
        listToScreenMet(listMas);
    }




    public static List<String> textToListMet(Scanner scanner){
        List<String> vardaiList = new ArrayList<>();
        while (scanner.hasNextLine()){
            String vardas = scanner.nextLine();
            vardaiList.add(vardas);
        }
        return vardaiList;
    }
    public static void listToScreenMet(List<String> list){
        System.out.println(list);
    }
}
