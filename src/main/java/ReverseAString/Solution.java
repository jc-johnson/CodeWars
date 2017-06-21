package src.main.java.ReverseAString;

import java.util.Arrays;

/**
 * Created by Jordan on 6/20/2017.
 */
public class Solution {

    public static String stringReverse(String string){
        int i = string.length()-1;
        int j = 0;
        String finalString = string;
        int length = finalString.length();

        // even number of chars
        if (length % 2 == 0) {
            while (i >= length/2) {
                finalString = swap(finalString, i, j);
                i--;
                j++;
            }
            return finalString;
        }

        // odd number of chars
        else {
            while (i > length/2) {
                finalString = swap(finalString, i, j);
                i--;
                j++;
            }
            return finalString;
        }
    }

    public static String swap(String string, int charIndex1, int charIndex2){
        char[] array = string.toCharArray();

        char temp = string.charAt(charIndex1);
        array[charIndex1] = array[charIndex2];
        array[charIndex2] = temp;

        StringBuilder stringBuilder = new StringBuilder();
        for (char c : array) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();

    }

    public static void main(String[] args) {
        //System.out.println(swap("Happy", 2, 4));
        System.out.println(stringReverse("Happy").toString());
        System.out.println(stringReverse("Folliage"));
        System.out.println(stringReverse("hump"));
    }
}
