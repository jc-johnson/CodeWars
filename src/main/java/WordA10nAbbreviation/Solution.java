package src.main.java.WordA10nAbbreviation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Jordan on 6/10/2017.
 */
public class Solution {

    public String abbreviate(String string) {

        if (string.isEmpty()) return "";

        String[] words = string.split("-");
        String[] abbreviatedWords = new String[words.length];
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < abbreviatedWords.length; i++) {
            abbreviatedWords[i] = getAbbreviation(string);
            stringBuilder.append(abbreviatedWords[i]);
        }

        return stringBuilder.toString();
    }

    public String getAbbreviation(String string) {

        int charNumber = string.length();
        char firstChar = string.charAt(0);
        char lastChar = string.charAt(charNumber-1);
        int removedCharacters = charNumber - 2;
        String removedCharactersString = String.valueOf(removedCharacters);

        return firstChar + removedCharactersString + lastChar;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.abbreviate("internationalization"));

        System.out.println(solution.abbreviate("elephant-rides are really fun!"));

    }
}
