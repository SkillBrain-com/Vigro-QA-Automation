package javaExercises.chapter1.chapter2;

public class IF {
    public static void main(String[] args){

            String ziua = "duminica";
            if(ziua == "sambata"){
                System.out.println("Azi este sambata");
            } else if (ziua=="duminica"){
                System.out.println("Azi este duminica");
            } else {
                System.out.println("A trecut weekendul");
            }

            switch(ziua){
            case "sambata": {
                System.out.println("Ziua este sambata - switch");

            } case "duminica":{
                System.out.println("Ziua duminica - switch");
                break;
            } default: {
                System.out.println("Nu este weekend - switch");
            }
        }

        }
    }
