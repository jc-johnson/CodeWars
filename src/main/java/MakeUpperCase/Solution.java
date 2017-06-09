package src.main.java.MakeUpperCase;

/**
 * Created by Jordan on 6/9/2017.
 */
public class Solution {
    public static String MakeUpperCase(String str){
        char[] newStringArray = str.toCharArray();
        for (int i = 0; i < newStringArray.length; i++) {
            newStringArray[i] = Character.toUpperCase(newStringArray[i]);
        }
        String newString = new String(newStringArray);
        return newString;
    }

    public static void main(String[] args) {
        String testString = "test";
        String newString = Solution.MakeUpperCase(testString);
        System.out.println(newString);
    }

}
