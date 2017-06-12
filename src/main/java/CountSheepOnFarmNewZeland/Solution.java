package src.main.java.CountSheepOnFarmNewZeland;

/**
 * Created by Jordan on 6/12/2017.
 */
public class Solution {

    public static int lostSheeps(int[] fridayNightCounting, int[] saturdayNightCounting, int sheepsTotal) {

        int sum = 0;
        for (int i = 0; i < fridayNightCounting.length; i++) {
            sum += fridayNightCounting[i];
        }

        for (int i = 0; i < saturdayNightCounting.length; i++) {
            sum += saturdayNightCounting[i];
        }

        return sheepsTotal - sum;
    }
}
