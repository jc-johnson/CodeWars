package src.main.java.ChildrenAndCandies;

import java.util.Arrays;

/**
 * Created by Jordan on 6/8/2017.
 */
public class Solution {

    public static int[] distributionOfCandy(int[] array) {

        //coding and coding..
        int[] candies = array;

        // TODO: make distribution simultaneous
        while (!Solution.distributionComplete(candies)) {
            for (int i = 0; i < candies.length; i++) {
                System.out.println(candies[i] + " ");
                while (!(candies[i] % 2 == 0)) {
                    candies[i] += 1;
                }
                int half = candies[i]/2;

                System.out.println("half: " + half);

                // give half of candies to next kid to right
                if (i < candies.length-1)
                    candies[i+1] += half;
                else
                    array[0] += half;
            }
            System.out.println(Arrays.toString(candies));
        }

        return candies;
    }

    public static boolean distributionComplete(int[] array) {

        for (int i = 1; i < array.length; i++) {
            if (array[i-1] != array[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] array2 = {1, 1, 1, 1, 1,};

        Solution.distributionOfCandy(array);

        // System.out.println(Solution.distributionComplete(array));
        // System.out.println(Solution.distributionComplete(array2));
    }
}
