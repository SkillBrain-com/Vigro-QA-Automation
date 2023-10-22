package javaExercises.chapter1.BuclaWhile;

import java.util.Random;
import java.util.Scanner;

public class TheDungeon {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        //Avem variabile de jucator
        int sanatate = 100;
        int atacDeteriorare = 50;
        int potiuni = 3;
        int valoareRegenerarePotiune = 30;
        int sansaPotiune = 50; //procentaj


        //Avem si variabile inamic
        String[] inamici = {"Zombie", "Skeleton", "Warrior", "Assasin"};
        int maxSanatateInamic = 75;
        int inamicAtacDeteriorare = 25;

        boolean running = true;
        System.out.println("Welcome to the Dungeon!");

        GAME:
        while(running){
            System.out.println("-----------------------");

            int sanatateInamic = rand.nextInt(maxSanatateInamic);
            String inamic = inamici[rand.nextInt(inamici.length)];

            System.out.println("\t#" + inamic + " Be ready! The first enemy is near!");

            while (sanatateInamic > 0){
                System.out.println("Your health is: " + sanatate);
                System.out.println("The enemy health is: " + sanatateInamic);
                System.out.println("\t\n What is your choice?");
                System.out.println("\t1. Attack");
                System.out.println("\t2. Use potion");
                System.out.println("\t3. Run!");

                String input = in.nextLine();
                if (input.equals("1")){
                    //cod pt actiunea de a ataca
                    int deteriorareProdusa = rand.nextInt(atacDeteriorare);
                    int deteriorarePrimita = rand.nextInt(inamicAtacDeteriorare);

                    sanatateInamic -= deteriorareProdusa;
                    sanatate -= deteriorarePrimita;
                    System.out.println("\tYou hit the " + inamic + " with " + deteriorareProdusa + "damage");
                    System.out.println("\tYou received" + deteriorarePrimita + "damage");

                    if (sanatate < 1){
                        System.out.println("\tYou've been damaged too bad!You can cry like a baby!");
                        break;
                    }
                }else if (input.equals("2")){
                    //cod pt actiunea de a bea potiune
                    if (potiuni > 0){
                        sanatate += valoareRegenerarePotiune;
                        potiuni--;
                        System.out.println("\tYou used a potion. You healed " + valoareRegenerarePotiune + "\n\tNow you have" + sanatate + "health " + "\n\tPotions remains: " + potiuni);
                    }else{
                        System.out.println("\tYou have no potions! You need to defeat more enemies in order to be able to gain potions!");
                    }
                }else if(input.equals("3")){
                    //cod pt actiunea de a fugi
                    System.out.println("\tYou run from the enemy!");
                    continue GAME;
                }else {
                    //cod pt optiune invalida
                    System.out.println("\tInvalid command!");
                }

            }

            if (sanatate < 1){
                System.out.println("You've been defeted because you're weak!");
                break;
            }

            System.out.println("-----------------------");
            System.out.println(" # " + inamic + "was defetead!");
            System.out.println(" # You have " + sanatate + "health!");



        }


    }
}
