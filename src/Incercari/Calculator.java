package Incercari;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Sa facem un calculator!");
        System.out.println("Introduceti primul numar fractionar:");

        Scanner scanner = new Scanner(System.in);
        double numar1 = scanner.nextDouble();

        System.out.println("Introduceti al 2-lea numar fractionar:");
        double numar2 = scanner.nextDouble();

        double inmultireResult = inmultire(numar1, numar2);
        double adaugareResult = adaugare(numar1, numar2);
        double scadereResult = scadere(numar1, numar2);
        double impartireResult = impartire(numar1, numar2);
        int modulResult = modul((int) numar1, (int) numar2);

        double random  = genereazaNumarRandom(scadereResult , inmultireResult);

        System.out.println("Rezultatele sunt:");
        System.out.println("Inmultire: " + inmultireResult);
        System.out.println("Adaugare: " + adaugareResult);
        System.out.println("Scadere: " + scadereResult);
        System.out.println("Impartire: " + impartireResult);
        System.out.println("Modul: " + modulResult);
        System.out.println("Numarul random generat intre" + scadereResult + "si" + inmultireResult + "este:" + random);
    }

    public static double inmultire(double nr1, double nr2) {
        return nr1 * nr2;
    }

    public static double adaugare(double numar1, double numar2) {
        return numar1 + numar2;
    }

    public static double scadere(double numar1, double numar2) {
        return numar1 - numar2;
    }

    public static double impartire(double numar1, double numar2) {
        return numar1 / numar2;
    }

    public static int modul(int nr1, int nr2) {
        return nr1 % nr2;
    }
    public static double genereazaNumarRandom(double minim, double maxim){
        return Math.random()*(maxim - minim) + minim;
    }
}
