package src.main.java.PascalsTriangleTwo;

import java.util.Arrays;

/**
 * Created by Jordan on 6/28/2017.
 */
public class Solution {

    public static int[][] pascal(int number) {

        int[][] finalArray = new int[number][];
        int[] array = {1};

        finalArray[0] = array;

        for (int i = 0; i < number-1  ; i++) {
            int[] tempArray = generateArray(finalArray[i]);
            finalArray[i+1] = tempArray;
        }

        return finalArray;
    }

    public static int[] generateArray(int[] array) {
        if (array.length == 1) {
            int[] tempArray = {1, 1};
            return tempArray;
        }

        // get array length
        int[] tempArray = new int[array.length+1];
        tempArray[0] = 1;
        tempArray[tempArray.length-1] = 1;
        for (int i = 1; i <= tempArray.length-2 ; i++) {
            tempArray[i] = array[i] + array[i-1];
        }

        return tempArray;
    }

    public static void main(String[] args) {
        /*
        int[] array = {1};
        System.out.println(Arrays.toString(Solution.generateArray(array)));

        int[] array2 = {1, 1};
        System.out.println(Arrays.toString(Solution.generateArray(array2)));

        int[] array3 = {1, 2, 1};
        System.out.println(Arrays.toString(Solution.generateArray(array3)));
        */

        System.out.println(Arrays.deepToString(Solution.pascal(5)));
    }
}
