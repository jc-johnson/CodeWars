package src.main.java.EvilAutocorrectPrank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Jordan on 6/20/2017.
 */
public class Solution {

    public static String autocorrect(String input) {
        // your code here

        String inputString = input.toLowerCase();

        String reg =  "you+";
        String reg2 = "u+";

        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(inputString);
        if (matcher.find()) {
            return matcher.replaceAll("your sister");
            // return inputString.replaceAll("you+\\W", "your sister");
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

    }
}
