package javaExercises.chapter1.Mostenire;

public class BMW extends Autovehicul{
    public void gear(){
        System.out.println("Cutia este automata");
    }
    public void marca(){
        System.out.println("Marca este BMW");
    }

    @Override
    public void accelerare() {
        System.out.println("Nu am putere la BMW");
    }
}
