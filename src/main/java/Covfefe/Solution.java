package src.main.java.Covfefe;

/**
 * Created by Jordan on 6/4/2017.
 */
public class Solution {

    public static String covfefe(String string) {
        if (string.contains("coverage")) {
            // replace coverage with covfefe
            string = string.replace("coverage", "covfefe");
        } else {
            String newString = string + " covfefe";
            return newString;
        }
        return string;
    }

    public static void main(String[] args) {

        System.out.println(Solution.covfefe("coverage"));
        System.out.println(Solution.covfefe("nothing"));
    }
}
