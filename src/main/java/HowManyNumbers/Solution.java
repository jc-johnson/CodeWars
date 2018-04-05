package src.main.java.HowManyNumbers;

public class Solution {


    public static int sel_number(int upperLimit, int maxDifference) {

        int digit = 0;
        int n = 1;
        int j = n + 1;

        while(digit < upperLimit){

            StringBuilder stringBuilder = new StringBuilder();
            if(j - n <= maxDifference) {
                stringBuilder.append(n);
                stringBuilder.append(j);
                String intString = stringBuilder.toString();
                digit = Integer.parseInt(intString);
                System.out.println(digit);
            }

            j++;

            if (j >= 10) {
                n++;
                j = n + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        sel_number(30, 2);
    }
}
