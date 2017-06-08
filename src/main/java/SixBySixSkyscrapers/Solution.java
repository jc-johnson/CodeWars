package src.main.java.SixBySixSkyscrapers;

/**
 * Created by Jordan on 6/8/2017.
 */
public class Solution {

    public static int[][] solvePuzzle(int[] clues) {

        int[] cluesCopy = new int[clues.length];

        for (int i = 0; i < clues.length; i++) {
            System.out.println("clues[i]: " + clues[i]);
            cluesCopy[i] = clues[i];
        }

        int[][] solutionArray = new int[6][6];



        // find unique floors


        return null;
    }
    
    public static boolean checkDuplicateFloors(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {

                int value = array[i][j];

                // check columns
                for (int k = 0; k < array[i].length ; k++) {
                    if (k == j) continue; // skip current cell
                    if (array[i][k] == value) return true;
                }
                
                // check rows
                for (int k = 0; k < array.length; k++) {
                    if (k == i) continue; // skip current cell
                    if (array[k][j] == value) return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[][] duplicateArray = {{1, 5, 0}, {2, 3, 4}, {5, 6, 7}};
        System.out.println(Solution.checkDuplicateFloors(duplicateArray));

        /*
        int[] clues = new int[]{ 3, 2, 2, 3, 2, 1,
                1, 2, 3, 3, 2, 2,
                5, 1, 2, 2, 4, 3,
                3, 2, 1, 2, 2, 4};
        Solution.solvePuzzle(clues);
        */
    }
}
