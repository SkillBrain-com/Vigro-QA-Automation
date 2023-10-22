package javaExercises.chapter1.chapter2;
import java.util.Scanner;

public class Tema3v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //How to swap two values without using 3rd variable : a and b will be read from keyboard

        System.out.print("Valoare a: ");
        int a = scanner.nextInt();

        System.out.print("Valoare b: ");
        int b = scanner.nextInt();

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("Schimbare :");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        scanner.close();
    }
}
