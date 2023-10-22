package javaExercises.chapter1.car;

public class Masina {

    public static int rezervorMotorina = 100;
    public int rezervorBenzina = 100;

    public static void main(String[] args) {
        BoardWitness lightIndicator = new BoardWitness();
        Ecu powerEngine = new Ecu();
        InstrumentCluster bord = new InstrumentCluster();

        lightIndicator.masinaMiscareVarStatic();
        System.out.println(" modificare lightIndicator " + Masina.rezervorMotorina);

        bord.masinaMiscareVarStatic();
        System.out.println(" modificare bord " + Masina.rezervorMotorina);

        powerEngine.masinaMiscareVarNonStatic();
        System.out.println(" modificare powerEngine " + powerEngine.valRezervorBenzina());

        System.out.println(" Afisare rezervor benzina din InstrumentCluster. " + bord.valRezervorBenzina());

    }


}
