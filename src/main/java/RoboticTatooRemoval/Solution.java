package src.main.java.RoboticTatooRemoval;

import java.lang.reflect.Array;

/**
 * Created by Jordan on 6/9/2017.
 */
public class Solution {


    public static String[][] robot(String[][] skinScan) {
        if (skinScan == null) return null;

        for (int i = 0; i < skinScan.length; i++) {
            for (int j = 0; j < skinScan[i].length; j++) {
                if (skinScan[i][j].contains("X")) {
                  String newString = replace(skinScan[i][j], 'X', '*');
                  skinScan[i][j] = newString;
                }
            }
        }

        return skinScan;
    }

    public static String replace(String string, char character1, char character2) {
        if (string.isEmpty()) return "";

        char[] newStringArray = string.toCharArray();
        int replaceIndex = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == character1) {
                replaceIndex = i;
            }
        }

        newStringArray[replaceIndex] = character2;
        String newString = new String(newStringArray);


        return newString;
    }

    public static void main(String[] args) {
        String testString = "Happy";
        String newString = Solution.replace(testString, 'y', '*');
        System.out.println(newString);

        String testString2 = "X";
        String newString2 = Solution.replace(testString2, 'X', '*');
        System.out.println(newString2);
    }
}
