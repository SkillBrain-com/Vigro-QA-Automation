package javaExercises.chapter1;

import java.util.Scanner;

public class TemaSkillbrainex7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti aici un numar:");

        int a = scanner.nextInt();
        double b = a - 12.3;
        double c = a * -3.2;
        double d = a / 4;
        int e = a % 6;

        System.out.println("Rezultatul sumei cu 5 va fi:" + (a+5));
        System.out.println("Rezultatul scaderii cu 12.3 va fi:" + b);
        System.out.println("Rezultatul inmultirii cu -3.2 va fi:" + c);
        System.out.println("Rezultatul impartirii cu 4 va fi:" + d);
        System.out.println("Rezultatul modulului cu 6 va fi:" + e);

        scanner.close();
    }
}
