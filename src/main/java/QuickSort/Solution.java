package src.main.java.QuickSort;

import java.util.Arrays;

/**
 * Created by Jordan on 6/15/2017.
 */
public class Solution {

    private static int array[];


    public static int[] sort(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        return quickSort(array, 0, array.length-1);

    }

    private static int[] quickSort(int[] array, int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;

        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex + (higherIndex - lowerIndex)/2];

        // divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number form left side which
             * is greater than the pivot value, and also we will identify a number
             * from right side which is less then teh pivot value. Once the search
             * is done, then we exchange both numbers.
             */

            // find number on left side of array that is greater than pivot
            while (array[i] < pivot) {
                i++;
            }
            // find number on right side of array that is less than pivot
            while (array[j] > pivot) {
                j--;
            }

            // put values on correct side of the pivot
            if (i <= j) {
                array = swap(array, i, j);
                // move index to next position on both sides
                i++;
                j++;
            }

            // call quicksort method recursively
            if (lowerIndex < j)
                quickSort(array, lowerIndex, j);
            if (i < higherIndex)
                quickSort(array, i, higherIndex);

        }

        return array;

    }





    public static int[] swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 8, 4, 9, 6, 4, 2, 2, 2, 9};
        // System.out.println(Arrays.toString(swap(array, 1, array.length-1)));
        System.out.println(sort(array));

    }
}
