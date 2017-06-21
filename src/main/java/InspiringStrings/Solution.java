package src.main.java.InspiringStrings;

/**
 * Created by Jordan on 6/21/2017.
 */
public class Solution {

    public static String longestWord(String wordString) {
        // Give me back the longest word!

        String[] words = wordString.split(" ");
        int length = 0;
        int index = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= length) {
                length = words[i].length();
                index = i;
            }
        }
        return words[index];

    }
}
