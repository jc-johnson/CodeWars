package src.main.java.EvilAutocorrectPrank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Jordan on 6/20/2017.
 */
public class Solution {

    public static String autocorrect(String input) {
        // your code here

        String inputString = input;// input.toLowerCase();

        String reg =  "(?<![a-z0-9])you+(?![a-z0-9])";
        String reg2 = "(?<![a-z0-9])u+(?![a-z0-9])";
        String reg3 = "(?<![a-z0-9])You+(?![a-z0-9])";

        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(inputString);
        if (matcher.find()) {
            return matcher.replaceAll("your sister");
            // return inputString.replaceAll("you+\\W", "your sister");
        }

        pattern = Pattern.compile(reg3);
        matcher = pattern.matcher(inputString);
        if (matcher.find()) {
            return matcher.replaceAll("your sister");
            // return inputString.replaceAll("you+\\W", "your sister");
        }


        pattern = Pattern.compile(reg2);
        matcher = pattern.matcher(inputString);
        if (matcher.find()) {
            return matcher.replaceAll("your sister");
        }

        return input; // "corrected" input
    }

    public static void main(String[] args) {
        String string = "Youtube";
        System.out.println(Solution.autocorrect(string));

        String string2 = "YOUUUUUU";
        System.out.println(Solution.autocorrect(string2));

        String string3 = "I miss you!";
        System.out.println(Solution.autocorrect(string3));

        String string4 = "u want to go to the movies?";
        System.out.println(Solution.autocorrect(string4));

        String string5 = "I want to film the bayou with you and put it on youtube";
        System.out.println(Solution.autocorrect(string5));

        String string6 = "You should come over Friday night";
        System.out.println(Solution.autocorrect(string6));

        String string7 = "You u youville utube you youyouyou uuu raiyou united youuuu u you";
        System.out.println(Solution.autocorrect(string7));
    }
}
