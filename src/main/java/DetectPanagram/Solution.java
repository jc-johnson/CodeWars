package src.main.java.DetectPanagram;

/**
 * Created by Jordan on 9/10/2017.
 */
public class Solution {

    public boolean check(String sentence) {

        if (sentence == "") return false;

        String localSentence = sentence.toLowerCase();

        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for (char c : alphabet) {
            if (!localSentence.contains(Character.toString(c))) {
                return false;
            }
        }
        return true;
    }
}
