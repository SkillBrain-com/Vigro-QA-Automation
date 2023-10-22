package javaExercises.chapter1;
import java.util.Scanner;

public class Tema3v5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valoare: ");
        int n = scanner.nextInt();

        long factorial = calculfactorial(n);

        System.out.println("Factorial de " + n + " este: " + factorial);

        scanner.close();
    }

    static long calculfactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long result = 1;
            for (int i = n; i >= 2; i--) {
                result *= i;
            }
            return result;
        }
    }
}