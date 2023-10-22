package javaExercises.chapter1.chapter2;
import java.util.Scanner;

public class Tema3v3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //How to swap two values using 3rd variable : a and b will be read from keyboard

        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();

        System.out.print("Enter value for b: ");
        int b = scanner.nextInt();

        int c = a;
        a = b;
        b = c;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        scanner.close();

    }
}
