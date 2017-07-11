package src.main.java.BowlingPins;

import java.util.Arrays;

/**
 * Created by Jordan on 6/29/2017.
 */
public class Solution {
    // String pins = "I I I I\n I I I\n I I\n I\n";
    String[] pins = {"I", "I", "I", "I", "I", "I", "I", "I", "I", "I"};

    public String bowlingPins(int[] arr){
        //have fun ^.^

        for (int i = 0; i < arr.length; i++) {
            removePin(arr[i]);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : pins) {
            stringBuilder.append(string);
        }
        String pinString = stringBuilder.toString();



        String finalString = stringBuilder.substring(0,3) + "\n" + stringBuilder.substring(4, 6) +
                "\n" + stringBuilder.substring(7, 8) + "\n" + stringBuilder.substring(9) + "\n";

        return finalString;
    }

    public void removePin(int number) {
        pins[number-1] = "";
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] test = {1, 2, 3};


        System.out.println(solution.bowlingPins(test));

        System.out.println("I I I I\n I I I \n       \n       ");
    }
}
