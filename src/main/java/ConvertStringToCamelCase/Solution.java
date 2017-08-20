package src.main.java.ConvertStringToCamelCase;

/**
 * Created by Jordan on 8/20/2017.
 */
public class Solution {

    static String toCamelCase(String s){

        if (s.isEmpty() || s == null || s.length()<1) return "";

        // separate each word in string
        String[] parts = null;

        if (s.contains("-")) parts = s.split("-");
        else if (s.contains("_")) parts = s.split("_");

        // Capitalize each word
        if (Character.isUpperCase(parts[0].charAt(0))) {             // If first letter is uppercase keep it
            for (int i = 0; i < parts.length; i++) {
                String string = parts[i].substring(0,1).toUpperCase() + parts[i].substring(1);
                parts[i] = string;
            }
        } else if (!Character.isUpperCase(parts[0].charAt(0))) {     // if first world isn't uppercase leave it alone
            for (int i = 1; i < parts.length; i++) {
                String string = parts[i].substring(0,1).toUpperCase() + parts[i].substring(1);
                parts[i] = string;
            }
        }


        // Recombine edited words in to string
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(parts[0]);

        for (int i = 1; i < parts.length; i++) {
            // strBuilder.append("_");
            strBuilder.append(parts[i]);
        }
        String newString = strBuilder.toString();

        System.out.println(newString);
        return newString;
    }

    public static void main(String[] args) {
        Solution.toCamelCase("the-stealth-warrior");

        Solution.toCamelCase("The_Stealth_Warrior");
    }
}
