package src.main.java.FirstNonConsecutive;

/**
 * Created by Jordan on 6/6/2017.
 */
public class Solution {

    static Integer find(final int[] array) {

        if (array == null || array.length == 0) return null;

        for (int i = 0; i < array.length-1; i++) {
            if (array[i+1] != array[i] + 1) {
                return array[i+1];
            }
        }

        return null;
    }

    public static void main(String[] args) {

        // test
        int[] array = {0,1,2,6};
        int[] array1 = {};
        int[] array2 = {1,2,3};
        System.out.println(find(array));
        System.out.println(find(array1));
        System.out.println(find(array2));
    }
}
