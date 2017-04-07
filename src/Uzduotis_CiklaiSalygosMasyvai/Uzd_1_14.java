package Uzduotis_CiklaiSalygosMasyvai;

/**
 * Created by Mindaugas on 2017-04-07.
 */
public class Uzd_1_14 {
    public static void main(String[] args) {
        int[] skaicMas = {1, 2, 3, 4, 5};
        int[] apsSkaicMas = new int[skaicMas.length];
        apsSkaicMas = masMet(skaicMas);
        for (int i=0; i<apsSkaicMas.length; i++) {
            System.out.println("Apsuktas masyvas " + apsSkaicMas[i]);
        }
    }
    public static int[] masMet(int[] mas){
        int[] mas2 = new int[mas.length];
        for (int i=0; i<mas.length; i++){
            mas2[i]=mas[mas.length-i-1];
        }
        return mas2;
    }
}
