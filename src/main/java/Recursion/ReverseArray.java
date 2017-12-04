package src.main.java.Recursion;

import java.util.Arrays;

public class ReverseArray {

    public static void reverse(int[] array) {

        System.out.println("Reversing Array: " + Arrays.toString(array));
        reverse(array, 0, array.length-1);
    }

    public static void reverse(int[] array, int index1, int index2) {

        if (array.length == 1) return;

        if (array.length == 2) {
            swap(array, index1, index2);
            return;
        }

        swap(array, index1, index2);
        System.out.println("Updated Array: " + Arrays.toString(array));

        // array length is even
        if (array.length % 2 == 0) {
            // base case
            if (index1 == (array.length/2)-1 && index2 == array.length/2) {
                return;
            }
            index1++;
            index2--;
            reverse(array, index1++, index2--);
        }

        // array length is odd
        else {
            // base case
            if (index1 == (array.length/2)-1 && index2 == (array.length/2)+1) {
                return;
            }
            index1++;
            index2--;
            reverse(array, index1, index2);
        }

        System.out.println(Arrays.toString(array));
    }

    public static void swap(int[] array, int index1, int index2) {

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        reverse(array);

        int[] array2 = {1, 2, 3, 4};
        reverse(array2);
    }
}
