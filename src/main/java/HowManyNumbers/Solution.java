package src.main.java.HowManyNumbers;

import java.util.ArrayList;
import java.util.List;

public class Solution {


    public static int sel_number(int upperLimit, int maxDifference) {

        int digit = 0;
        int n = 1;
        int j = n + 1;
        List<Integer> numberList = new ArrayList<>();

        while(digit < upperLimit){

            StringBuilder stringBuilder = new StringBuilder();
            if( j - n <= maxDifference) {
                stringBuilder.append(n);
                stringBuilder.append(j);
                String intString = stringBuilder.toString();
                digit = Integer.parseInt(intString);
                System.out.println(digit);
                if (digit < upperLimit) {
                    numberList.add(digit);
                }
            }

            j++;

            if (j >= 10) {
                n++;
                j = n + 1;
            }
        }
        System.out.println("Number list size: " + numberList.size());
        return numberList.size();
    }

    public static void main(String[] args) {
        sel_number(50, 5);
    }
}
