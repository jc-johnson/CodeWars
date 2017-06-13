package src.main.java.DynamicProgramming;

/**
 * Created by Jordan on 6/12/2017.
 */
public class Fibonacci {

    // non memoization
    int fib(int n) {
        if (n <= 0) return 0;
        else if (n == 1) return 1;
        else return fib(n-1) + fib(n-2);
    }

    // memoization
    int fib(int n, int[] memo) {

        if (n <= 0) return 0;
        else if (n == 1) return 1;
        // no value in table for n yet
        else if (memo[n] == 0) {
            memo[n] = fib(n-1, memo) + fib(n-2, memo);
        }
        return memo[n];
    }

    public static void main(String[] args) {

    }
}
