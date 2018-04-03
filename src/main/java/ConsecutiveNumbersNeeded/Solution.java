package src.main.java.ConsecutiveNumbersNeeded;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static List<Integer> consecutiveNumbers(int[] array) {

        Arrays.sort(array);

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < array.length - 1; i++) {

            int k = array[i] + 1;
            int next = array[i+1];

            if (k < next) {
                while (k < next) {
                    list.add(k);
                    k++;
                }
            }
        }

        System.out.println(list);
        return list;
    }

    public static void main(String[] args) {
        int[] array = {4, 8, 6};
        consecutiveNumbers(array);

        int[] array2 = {1, 8, 9, 12};
        consecutiveNumbers(array2);
    }
}
