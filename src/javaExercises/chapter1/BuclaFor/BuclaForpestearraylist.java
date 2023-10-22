package javaExercises.chapter1.BuclaFor;

import javaExercises.chapter1.Array.Array;

import java.util.ArrayList;

public class BuclaForpestearraylist {
    public static void main(String[] args){
        /*for (int i = 0; i < 4; i++){
            System.out.print("Valoarea variabilei i este:" + i);
        }*/
        Integer[] numere = {21 , 3 , 4 , 65 , 34};
        for (int i = 0; i < numere.length; i++){
            System.out.println("Elementul" + i + "este egal cu" + numere[i]);
        }

        ArrayList<String> list = new ArrayList<>();
        list.add("mere");
        list.add("pere");
        list.add("prune");
        list.add("lamai");

        for(int i = 0; i < list.size(); i++) {
            System.out.println("Elementul la indicele: " + i + " este egal cu: " + list.get(i));
        }


    }
}
