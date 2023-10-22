package javaExercises.chapter1.Mostenire;

public class ConfigurareVehicul {

    public static void main(String[] args) {
        BMW bmw = new BMW();
        Mercedes mercedes = new Mercedes();
        Dacia dacia = new Dacia();
        bmw.accelerare();
        bmw.franare();
        bmw.marca();
        mercedes.pornireMotor();
        mercedes.tipMotor();
        mercedes.franare();
        dacia.franare();
        dacia.oprireMotor();
        dacia.model();

    }
}
