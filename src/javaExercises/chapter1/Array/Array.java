package javaExercises.chapter1.Array;

public class Array {
    public static void main(String[] args){
        String[] studenti;
        int numere[];

        studenti = new String[10];
        numere = new int[5];

        double[] duble = new double[7];

        studenti[0] = "Andrei";
        studenti[1] = "Ana";

        System.out.println(studenti[0]);
        System.out.println(studenti[1]);
        System.out.println(studenti[2]);

        System.out.println(numere[0]);

        String[] literal = {"Alex" , "mere", "topor"};
        System.out.println(literal[0]);
        System.out.println(literal[1]);
        System.out.println(literal[2]);

        System.out.println(literal[5]);


    }
}
