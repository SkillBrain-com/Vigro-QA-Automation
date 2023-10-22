package javaExercises.chapter1.Mostenire;

public class Dacia extends Autovehicul{
    public void model() {
        System.out.println("Modelul este Logan");
    }

    public void tractiune() {
        System.out.println("Este tractiune fata");
    }

    @Override
    public void franare() {
        System.out.println("Am ramas fara frane");
    }
}
