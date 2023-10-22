package javaExercises.chapter1.chapter2;
import java.util.Scanner;

public class Tema3 {
    public static void main(String[] args){
        //Convert Fahrenheit to Celsius. Read the temperature from keyboard.Formula: (F-32)*5/9 = C
        System.out.println("Ex: 1");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("Temperature in Celsius: " + celsius);

        scanner.close();

    }
}
