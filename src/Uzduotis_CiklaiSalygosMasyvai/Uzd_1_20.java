package Uzduotis_CiklaiSalygosMasyvai;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by Mindaugas on 2017-04-10.
 */
public class Uzd_1_20 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scanner = new Scanner(new File("skaiciai.txt"));
        List<Integer> kintDidMas = new ArrayList<>();
        while( scanner.hasNextLine()){
            String skaicString = scanner.nextLine();
            int skaiciai = Integer.parseInt(skaicString);
            kintDidMas.add(skaiciai);
        }
        List<Integer> didejantisMasyvas = didMas(kintDidMas);
        atvaizdMas(didejantisMasyvas);
    }
    public static List<Integer> didMas(List<Integer> masList){
        Collections.sort(masList);
        return masList;
    }
    public static void atvaizdMas(List<Integer> masList){
      //  for(int i=0; i<masList.size(); i++){
            System.out.println(masList);
        //}
    }
}
