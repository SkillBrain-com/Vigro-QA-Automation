package javaExercises.chapter1.colectii;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExercices {
    /* Write a Java program to create an array list, add
    some colors (strings) and print out the collection
    */
    ArrayList<String> colors;
    public ArrayListExercices(){
        colors = new ArrayList<>();
    }
    public ArrayList<String> listofcolors (String color){
    colors.add(color);
    return colors;
    }

    public void iterateThroughList(){
        for (int i = colors.size()-1; i >= 0; i-- ){
            System.out.println("Iterare cu For:" + colors.get(i));
        }
    }

    public void iterateList(){
        Iterator<String> iterator = colors.iterator();
        while(iterator.hasNext()){
            System.out.println("Iterare cu Iterator :" + iterator.next());
        }
    }

    public void IterateForeach(){
        for (String element1 : colors){
            System.out.println("Iterare cu Foreach:" + element1);
        }
    }

    public void emptyArray(){
        colors.clear();
    }





    public static void main(String[] args) {
        ArrayListExercices obj1 = new ArrayListExercices();
        obj1.listofcolors("red");
        obj1.listofcolors("yellow");
        obj1.listofcolors("blue");
        System.out.println(obj1.colors);
        obj1.iterateThroughList();
        obj1.iterateList();
        obj1.IterateForeach();
        obj1.emptyArray();

    }

}

