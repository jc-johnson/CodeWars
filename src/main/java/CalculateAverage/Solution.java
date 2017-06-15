package src.main.java.CalculateAverage;

/**
 * Created by Jordan on 6/14/2017.
 */
public class Solution {

    public static double findAverage(int[] array){

        double sum = 0;
        for(int i : array) {
            sum += i;
        }

        return sum / array.length;
    }
}
