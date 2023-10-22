package javaExercises.chapter1.ListaClass;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClass {

    public static void main(String[] args) {
        LinkedListClass obiect = new LinkedListClass();
        obiect.adaugareInLista("ana");
        obiect.adaugareInLista("maria");
        obiect.adaugareInLista("ioana");
    }

    LinkedList<String> lista;

    public LinkedListClass(){
        lista = new LinkedList<>();
    }
    public LinkedList<String> adaugareInLista(String obiect){
        lista.add(obiect);
        return lista;
    }
    public void iterareinLista_ForSimplu(){
        for (int i = 0 ; i< lista.size(); i++){
            System.out.println(lista.get(i));
        }
        public void iterareinLista_ForEach(){
            for(String element : lista){
                System.out.println(element);
            }
            public void
        }

    }
}
