package src.main.java.SpellingBee;

/**
 * Created by Jordan on 6/5/2017.
 */
public class Solution {

    public static void parse2dArray(char[][] array){
        Integer count = 0;
        String bee = "bee";

        char[][] tempArray = array;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length; j++) {

            }
        }
    }

    // for each cell in 2d array

        // if iterator is free 2 spaces to right
            // compose string made of current cell + two cells to right
                // if string equals "bee"
                    // count++
        // if iterator is free 2 spaces to left
            // compose string made of current cell + two cells to left
                // if string equals "bee"
                    // count++
        // if iterator is free 2 spaces down
            // compose string made of current cell + two cells to left
                // if string equals "bee"
                    // count++

        // if iterator is free 2 spaces up
            // compose string made of current cell + two cells to left
                // if string equals "bee"
                    // count++

    public static void print2dArray(char[][] array) {
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        char[][] array = {{'a','b','c'}, {'e','f','g'}, {'h','i','j'}};
        Solution.print2dArray(array);
    }
}


