package src.main.java.CountTheDivisibleNumbers;

/**
 * Created by Jordan on 6/12/2017.
 */
public class Solution {

    public static int divisibleCount (int x, int y, int k) {

        // get smallest number greater than or equal to x divisible by k
        // get greatest number less than or equal to y divisible by k

        int low = getHigherDivisible(x, k);
        int high = getLowerDivisible(y, k);

        // subtract low from high
        // divide by k

        int totalDivisible = high - low;
        int total = totalDivisible / k;
        return total+1; // add one to include y in the count
    }

    public static int getHigherDivisible(int x, int k) {
        int temp = x;
        // find divisible number
        while (temp % k != 0) {
            temp++;
        }
        return temp;
    }

    public static int getLowerDivisible(int x, int k) {
        int temp = x;
        // find divisible number
        while (temp % k != 0) {
            temp--;
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(Solution.divisibleCount(6, 11, 2));
        System.out.println(Solution.divisibleCount(100, 300, 12));
    }
}
