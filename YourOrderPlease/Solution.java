package YourOrderPlease;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * Created by Jordan on 4/24/2017.
 */
public class Solution {

    private String inputString = "";
    private String currentWord = "";
    private double minimumInt = Double.POSITIVE_INFINITY;
    private ArrayList<String> wordList = new ArrayList<String>();
    private static PriorityQueue<String> solutionQueue = new PriorityQueue();

    public Solution() {

    }

    public void parseForWords(String string) {

        String inputString = string;
        System.out.println(inputString);

        System.out.println("All words in the string: ");
        // get all the words in the string
        for (String temp : inputString.split(" ")) {
            System.out.println( temp);
            wordList.add(temp);
        }

        // parse each word for the number it contains
        for (String word : wordList) {
            int currentInt = extractNumber(word);

            // If you find the word containing the lowest int add the word to queue
            if (currentInt < minimumInt) {
                minimumInt = currentInt;
                System.out.println("New minimum: " + minimumInt);
                // add to front of the queue
                solutionQueue.add(word);
                System.out.println("Word added to queue: " + word);
            }
        }

        printSolutionQueue();
    }

    public static void printSolutionQueue() {

        System.out.println(solutionQueue);
        for (Object string : solutionQueue) {
            System.out.println(string);
        }
    }


    public static int extractNumber(String string) {

        if (string == null || string.isEmpty()) return 0;

        StringBuilder stringBuilder = new StringBuilder();
        boolean found = false;

        for (char c : string.toCharArray()) {
            if (Character.isDigit(c)) {
                stringBuilder.append(c);
                found = true;
            } else if (found) {
                // Stop looping if yoru already found a digit
                break;
            }
        }

        String numberInString = stringBuilder.toString();
        int result = Integer.parseInt(numberInString);
        System.out.println(numberInString);

        return result;
    }


    // parse the string - need to clear out spaces in the string

        // loop:
            // look for the lowest number
            // grab the word that contains the lowest number
                // put it at the front of the queue

    // print the queue starting from the beginning


    public static void main(String[] args) {
        Solution solution = new Solution();

        // test string to int
        // int test = solution.extractNumber("1000");
        // System.out.println(test);


        // parseForWords();


    }
}
