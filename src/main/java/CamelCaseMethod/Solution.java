package src.main.java.CamelCaseMethod;

import java.util.Arrays;

/**
 * Created by Jordan on 6/4/2017.
 */
public class Solution {

    public static String camelCase(final String string) {
        if (string.equals("") || string.isEmpty()) return "";

        String[] array = string.split(" ");
        for (int i = 0; i < array.length; i++) {
            char firstChar = array[i].charAt(0);
            char upperChar = Character.toUpperCase(firstChar);
            String subString = array[i].substring(1);

            String newString = "";
            newString = newString.concat(String.valueOf(upperChar));
            newString = newString.concat(subString);
            array[i] = newString;
        }


        String finalString = "";
        for (int i = 0; i < array.length; i++) {
            finalString = finalString.concat(array[i]);
        }

        return finalString;
    }

    public static void main(String[] args) {

        System.out.println(Solution.camelCase("test test test"));
        System.out.println(Solution.camelCase("test case"));
        System.out.println(Solution.camelCase("camel case method"));
        System.out.println(Solution.camelCase("say hello "));
        System.out.println(Solution.camelCase("a b cd"));
        System.out.println(Solution.camelCase(""));
    }
}
