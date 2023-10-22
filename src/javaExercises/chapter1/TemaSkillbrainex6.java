package javaExercises.chapter1;

import java.util.Scanner;

public class TemaSkillbrainex6 {
    public void metodanumere() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti aici primul numar:");
        int a = scanner.nextInt();

        System.out.println("Introduceti aici al 2-lea numar:");
        int b = scanner.nextInt();

        System.out.println("Ati introdus urmatoarele numere:");
        System.out.println("Primul numar: " + a);
        System.out.println("Al 2-lea numar: " + b);
        System.out.println("Va multumim!");

        scanner.close();
    }

    public static void main(String[] args) {
        TemaSkillbrainex6 c = new TemaSkillbrainex6(); // Adăugați parantezele aici
        c.metodanumere();
    }
}
