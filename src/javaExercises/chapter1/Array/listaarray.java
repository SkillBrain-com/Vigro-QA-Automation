package javaExercises.chapter1.Array;

import java.util.ArrayList;

public class listaarray {
    public static void main(String[] args){
        String[] studenti = new String[10];
        studenti[0]  = "Andrei";
        studenti[1] = "Rares";
        /*System.out.println(studenti[0]);
        System.out.println(studenti[1]);
        System.out.println(studenti[2]);*/
        String[] fructe = {"mere", "pere", "banane"};


        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> inturi = new ArrayList<>();

        list.add("mere");
        list.add("pere");
        System.out.println(list);

        System.out.println(list.get(0));
        System.out.println(list.get(1));

        list.set(0, "banane");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);
        System.out.println(list.get(0));

        list.add("ananas");
        list.add("avocado");

        System.out.println(list.get(2));

        System.out.println(list.size());

        list.clear();
        System.out.println("Dupa ce am sters toate elementele:");
        System.out.print(list);
        System.out.println(list.size());

    }
}
