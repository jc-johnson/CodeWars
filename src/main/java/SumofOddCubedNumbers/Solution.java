package src.main.java.SumofOddCubedNumbers;

/**
 * Created by Jordan on 6/7/2017.
 */
public class Solution {

    public static int cubeOdd(int arr[]) {

        Integer sum = 0;

        // cube all ints
        for (int i = 0; i < arr.length; i++) {
            Integer value = arr[i];
            arr[i] = value * value * value;
        }

        // add all odd values
        for (int j = 0; j < arr.length; j++) {
            if (!(arr[j] % 2 == 0)) {
                sum += arr[j];
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        System.out.println(Solution.cubeOdd(array));

    }
}
