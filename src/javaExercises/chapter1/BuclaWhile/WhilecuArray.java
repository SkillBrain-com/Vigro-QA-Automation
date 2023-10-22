package javaExercises.chapter1.BuclaWhile;

import java.util.ArrayList;

public class WhilecuArray {
    public static void main(String[] args) {
        double[] numere = {21.4, 43.6, 5, -15.4};

        int i = 0;
        while (i < numere.length) {
            System.out.println("Indexul este " + i + ", valoarea este " + numere[i]);
            i++;
        }
        ArrayList<Double> lista = new ArrayList<>();
        lista.add(23.4);
        lista.add(-12.3);
        lista.add(9d);

        int j = lista.size() - 1;
        while (j >= 0){
            System.out.println("Indexul este " + j + ", valoarea este " + lista.get(j));
            j--;

        }

    }
}
