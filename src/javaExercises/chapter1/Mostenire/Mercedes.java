package javaExercises.chapter1.Mostenire;

public class Mercedes extends Autovehicul{
    public void tipMotor() {
        System.out.println("Motorul este v8");
    }

    @Override
    public void pornireMotor() {
        System.out.println("Motorul porneste din butonul Start/Stop");
    }
}
