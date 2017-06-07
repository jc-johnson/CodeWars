package src.main.java.BubblesortOnce;

import java.util.Arrays;

/**
 * Created by Jordan on 6/4/2017.
 */
public class BubbleSortOnce {


    public static Integer[] sort(Integer[] integerArray) {
        // test
        for (int i = 0; i < integerArray.length; i++) {
            for (int j = 0; j < i; j++) {
                if (integerArray[i] < integerArray[j]) {
                    swap(integerArray, i, j);
                }
            }
        }
        return integerArray;
    }

    public static void swap(Integer[] integerArray, Integer index1, Integer index2) {
        Integer temp = integerArray[index1];
        integerArray[index1] = integerArray[index2];
        integerArray[index2] = temp;
    }

    public static void main(String[] args) {
        Integer[] test = {9,7,5,3,1,2,4,6,8};
        test = sort(test);
        System.out.println(Arrays.toString(test));

    }
}
