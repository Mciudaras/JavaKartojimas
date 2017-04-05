package PirmaPaskaita;

import java.util.Scanner;

/**
 * Created by Mindaugas on 2017-04-05.
 */
public class Uzd_1_10 {
    public static void main(String[] args){
        Skaiciuotuvas skaiciuotuvas = new Skaiciuotuvas();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite pirma skaiciu");
        float numb1 = scanner.nextFloat();
        System.out.println("Iveskite antra skaiciu");
        float numb2 = scanner.nextFloat();
        System.out.println("Iveskite veiksmo nr, kuri norite atlikti, suma=1; skirtumas=2; sandauga=3");
        int veiksmas = scanner.nextInt();
        //switch (veiksmas){
          //  case 1 :
            //    skaiciuotuvas.sandMet();
              //  break;

                //default:
                  //  System.out.printf("nera");
                    //break;
       // }
        if(veiksmas==1){
            int i =(int)numb1;
            float sum=skaiciuotuvas.sumaMet((int)numb1, (int)numb2);
            System.out.println("ivestu skaiciu suma = " + sum );
        }
        else if (veiksmas==2){
            float skirt=skaiciuotuvas.skirtMet(numb1, numb2);
            System.out.println("ivestu skaiciu skirtumas = " + skirt );
        }
        else if (veiksmas==3){
            float sand=skaiciuotuvas.sandMet(numb1, numb2);
            System.out.println("ivestu skaiciu sandauga = " + sand );
        }
    }
}
