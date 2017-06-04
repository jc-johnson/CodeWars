package YourOrderPlease;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Jordan on 4/24/2017.
 */
public class Solution {



    public static String compute(String string) {
        if (string.isEmpty()) return "";


        List<String> wordList = new ArrayList<>();
        wordList = getWords(string);
        printWordList(wordList);
        wordList = sortList(wordList);
        printWordList(wordList);
        String finalString = createFinalString(wordList);
        return finalString;

    }

    public static String createFinalString(List<String> wordList) { // List<String>
        StringBuilder sb = new StringBuilder();
        /*for (String string : wordList)
        {
            sb.append(string);
            sb.append(" ");
        }*/
        for (int i = 0; i < wordList.size(); i++) {
            if (i == wordList.size()-1) {
                String string = wordList.get(i);
                sb.append(string);
                break;
            }

            String string = wordList.get(i);
            sb.append(string);
            sb.append(" ");
        }
        System.out.println("Final String ");
        System.out.println(sb);
        return sb.toString();
    }

    // get all words from the input string
    public static List<String> getWords(String string) {

        List<String> wordList = new ArrayList<>();

        String inputString = string;
        System.out.println(inputString);

        System.out.println("All words in the string: ");
        Integer inputStringLength = inputString.split(" ").length;
        String[] stringArray = new String[inputStringLength];

        // get all the words in the string
        for (String temp : inputString.split(" ")) {
            // System.out.println( temp);
            wordList.add(temp);
        }

        return wordList;
    }

    public static void printWordList(List<String> wordList) { // List<String>
        System.out.println("Current Word List: ");
        for (String word : wordList) {
            System.out.println(word);
        }
    }

    public static List<String> sortList(List<String> wordList) { // List<String>
        for (int i = 0; i < wordList.size() ; i++) {
            for (int j = 0; j < i; j++) {
                Integer wordListI = extractNumber(wordList.get(i));
                Integer wordListJ = extractNumber(wordList.get(j));
                if (wordListI < wordListJ) {
                    wordList = swap(wordList, i, j);
                }
            }
        }
        return wordList;
    }

    private static Integer extractNumber(String string) {

        if (string == null || string.isEmpty()) return 0;

        StringBuilder stringBuilder = new StringBuilder();

        for (char c : string.toCharArray()) {
            if (Character.isDigit(c)) {
                stringBuilder.append(c);
            }
        }

        String ourString = stringBuilder.toString();
        Integer result = Integer.parseInt(ourString);
        System.out.println(ourString);

        return result;
    }

    public static List<String> swap(List<String> stringList, Integer index, Integer indexTwo) {
        String[] stringArray = new String[stringList.size()];
        stringList.toArray(stringArray);

        String temp = stringArray[index];
        stringArray[index] = stringArray[indexTwo];
        stringArray[indexTwo] = temp;

        List<String> workList = new ArrayList<>();
        workList = Arrays.asList(stringArray);
        return workList;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // test string to int
        // int test = solution.extractNumber("1000");
        // System.out.println(test);

        // solution.compute("is2 Thi1s T4est 3a");
        // solution.compute("Do100nt for2get 3the s1alt");
        // solution.compute("Hap7py g9o luc15ky bo2y");

        Solution.compute("Hap7py g9o luc15ky bo2y");

        /** swap works **/
        // test for swap
        // String[] stringArray = {"This", "is", "a", "test"};
        // solution.swap(stringArray, 2, 3);
        // System.out.println(Arrays.toString(stringArray));


    }
}
