package PirmaPaskaita;

import java.util.Scanner;

/**
 * Created by Mindaugas on 2017-04-05.
 */
public class Uzd_1_13_14_15_16 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Uzd_1_13
        System.out.println("Iveskite skaiciu");
        int numb = scanner.nextInt();
        int numbKvad = Skaiciavimai.numbKvadMet(numb);
        System.out.println("Ivesto skaiciaus kvadratas lygus " + numbKvad);
        //Uzd_1_14
        System.out.println("Iveskite staciakampio krastines ilgi");
        int pirmaKrast = scanner.nextInt();
        System.out.println("Iveskite kitos staciakampio krastines ilgi");
        int antraKrast = scanner.nextInt();
        int stacPlotas = Skaiciavimai.stacPlotMet(pirmaKrast, antraKrast);
        System.out.println("Ivesto staciakampio plotas lygus " + stacPlotas);
        //Uzd_1_15
        System.out.println("Iveskite staciojo trikampio krastines ilgi");
        int pirmaTrikKrast = scanner.nextInt();
        System.out.println("Iveskite kita staciojo trikampio krastines ilgi");
        int antraTrikKrast = scanner.nextInt();
        int trikPlotas = Skaiciavimai.trikPlotMet(pirmaTrikKrast, antraTrikKrast);
        System.out.println("Ivesto staciojo trikampio plotas lygus " + trikPlotas);
        //Uzd_1_16
        System.out.println("Iveskite apskritimo spindulio ilgi");
        double spindulys = scanner.nextInt();
        double apskPlotas = Skaiciavimai.apskPlotMet(spindulys);
        System.out.println("Ivesto apskritimo plotas lygus " + apskPlotas);
    }
}
