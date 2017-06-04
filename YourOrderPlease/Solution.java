package YourOrderPlease;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by Jordan on 4/24/2017.
 */
public class Solution {

    private List<String> wordList = new ArrayList<>();


    public void compute(String string) {
        getWords(string);
        printWordList();
        sortList();
        printWordList();

    }

    // get all words from the input string
    public void getWords(String string) {

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
    }

    public void printWordList() {
        System.out.println("Current Word List: ");
        for (String word : this.wordList) {
            System.out.println(word);
        }
    }

    public void sortList() {
        for (int i = 0; i < wordList.size() ; i++) {
            for (int j = 0; j < i; j++) {
                Integer wordListI = extractNumber(wordList.get(i));
                Integer wordListJ = extractNumber(wordList.get(j));
                if (wordListI < wordListJ) {
                    swap(wordList, i, j);
                }
            }
        }
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

    public void swap(List<String> stringList, Integer index, Integer indexTwo) {
        String[] stringArray = new String[stringList.size()];
        stringList.toArray(stringArray);

        String temp = stringArray[index];
        stringArray[index] = stringArray[indexTwo];
        stringArray[indexTwo] = temp;


        wordList = Arrays.asList(stringArray);

    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // test string to int
        // int test = solution.extractNumber("1000");
        // System.out.println(test);

        //solution.compute("is2 Thi1s T4est 3a");
        solution.compute("Do100nt for2get 3the s1alt");


        /** swap works **/
        // test for swap
        // String[] stringArray = {"This", "is", "a", "test"};
        // solution.swap(stringArray, 2, 3);
        // System.out.println(Arrays.toString(stringArray));


    }
}
