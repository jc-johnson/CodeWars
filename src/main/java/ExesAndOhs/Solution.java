package src.main.java.ExesAndOhs;

/**
 * Created by Jordan on 6/14/2017.
 */
public class Solution {

    public static boolean getXO (String str) {

        // Good Luck!!

        int numX = 0;
        int numO = 0;

        for (int i = 0; i < str.length(); i++) {
            switch(str.charAt(i)) {
                case 'x': numX += 1; break;
                case 'X': numX += 1; break;
                case 'o': numO += 1; break;
                case 'O': numO += 1; break;
                default: break;
            }
        }

        if (numX == numO) return true;
        else return false;

    }
}
