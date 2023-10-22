package javaExercises.chapter1.chapter2;
import java.util.Scanner;

public class Tema3v4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valoare a: ");
        int a = scanner.nextInt();

        System.out.print("Valoare b: ");
        int b = scanner.nextInt();

        if ((a & 1) == 0) {
            System.out.println(a + " impar");
        } else {
            System.out.println(a + " par");
        }

        if ((b & 1) == 0) {
            System.out.println(b + " impar");
        } else {
            System.out.println(b + " par");
        }

        scanner.close();
    }
}
