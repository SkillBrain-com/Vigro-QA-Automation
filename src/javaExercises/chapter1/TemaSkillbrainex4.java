package javaExercises.chapter1;

import java.util.Scanner;

public class TemaSkillbrainex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Aici puteți scrie o propoziție:");

        String prop = scanner.nextLine();

        System.out.println("Propoziția introdusă este: " + prop);

        scanner.close();
    }
}