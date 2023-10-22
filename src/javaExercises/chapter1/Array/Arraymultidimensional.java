package javaExercises.chapter1.Array;

public class Arraymultidimensional {
    public static void main(String[] args){
        String[][] bidimensional  = new String[3][6];
        String[][][] tridimensional = new String[2][3][1];

        bidimensional[0][0] = "curs";
        bidimensional[2][1] = "capitol";

        System.out.println(bidimensional[0][0]);
        System.out.println(bidimensional[2][1]);

        String[][] multidimensional = {
                {"laptop" , "masa"},
                {"tastatursa","casa"}};
        System.out.println(multidimensional[0][0]);
        System.out.println(multidimensional[0][1]);
        System.out.println(multidimensional[1][1]);

    }
}
