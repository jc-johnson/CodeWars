package src.main.java.HowManyNumbers;

public class Solution {


    public static int sel_number(int upperLimit, int maxDifference) {

        int digit = 0;
        while(digit < upperLimit){

            int n = 1;
            int j = n + 1;

            while(j < 10) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(n);
                stringBuilder.append(j);
                String intString = stringBuilder.toString();
                digit = Integer.parseInt(intString);
                System.out.println(digit);
                j++;
            }

            n++;

        }

        buildDigit();

        return 0;
    }

    private static int buildDigit(){


        return 0;
    }

    public static void main(String[] args) {
        sel_number(15, 0);
    }
}
