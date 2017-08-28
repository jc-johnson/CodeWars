package src.main.java.CatchingCarMileageNumbers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jordan on 8/22/2017.
 */
public class CarMileage {

    private static final int INTERESTING = 2;
    private static final int NEXT_TWO_MILES = 1;
    private static final int NOT_INTERESTING = 0;

    public static int isInteresting(int number, int[] awesomePhrases) {

        if (awesomePhrases == null || awesomePhrases.length == 0) {
            return -1;
        }

        if (numberIsInteresting(number, awesomePhrases)) return INTERESTING;
        else if (isInNextTwoMiles(number, awesomePhrases)) return NEXT_TWO_MILES;
        else return NOT_INTERESTING;

    }

    public static boolean numberIsInteresting(int number, int[] awesomePhrases) {

        if (awesomePhrases == null || awesomePhrases.length == 0) {
            // throw new DataInputException();
        }

        if (number >= 0 && number <= 1000000000) {
            if(numberLength(number) > 3) {
                if (everyDigitIsTheSame(number))return true;
                if (digitIsIncrementing(number) || digitIsDecrementing(number)) return true;
                if (digitIsPalinDrome(number)) return true;
                if (digitIsInAwesomePhrases(number, awesomePhrases)) return true;
            }
        } else {
            // throw new InputOutOfBoundsException();
        }
        return false;
    }

    public static boolean everyDigitIsTheSame(int number) {

        String numberString = String.valueOf(number);

        char numberDigit = numberString.charAt(0);

        final char ZERO = '0';
        final String ZER0_VALUE = "10";


        for (int i = 1; i < numberString.length(); i++) {
            if (numberString.charAt(i) == 0) {

            }

            if (numberString.charAt(i) != numberDigit) {
                return false;
            }
        }

        return true;
    }

    public static boolean digitIsIncrementing(int number) {

        // if number contains 0
            // if subarray before 0 is incrementing

            // if subarray after 0 is incrementing



        String numberString = String.valueOf(number);

        // base case
        if (numberString.length() == 1) return true;

        if (numberString.contains(Character.toString('0'))) {
            int indexOfZero = numberString.indexOf('0'); // index of first 0

            // '0' should never be first digit
            /*
            // '0' is first digit
            if (indexOfZero == 0) {

                // see if digits to the right of 0 are in order

                // create new digit string
                int numberSubstring = Integer.parseInt(numberString.substring(indexOfZero));

                // if digits to right of 0 are incrementing then whole digit isn't incrementing1
                if (digitIsIncrementing(numberSubstring)) {
                    return false;
                }
            }*/

            // '0' is last digit
            if (indexOfZero == numberString.length()-1) {
                int numberSubstring = Integer.parseInt(numberString.substring(0, indexOfZero));
                if (digitIsIncrementing(numberSubstring)) {
                    return true;
                }
            }

            // '0' is in middle
            if (indexOfZero > 0) {
                if (everyDigitIsTheSame(number)) return true;
                else return false;
            }

            return false;

        }

        for (int i = 1; i < numberString.length(); i++) {
            if (numberString.charAt(i) < numberString.charAt(i-1)) {
                return false;
            }
        }

        return true;
    }

    public static boolean digitIsDecrementing(int number) {

        // if number contains 0
            // if subarray before 0 is decrementing

            // if subarray after 0 is decrementing


        String numberString = String.valueOf(number);

        // base case
        if (numberString.length() == 1) return true;

        if (numberString.contains(Character.toString('0'))) {
            int indexOfZero = numberString.indexOf('0'); // index of first 0 -- should never be first digit

            // '0' is last digit
            if (indexOfZero == numberString.length()-1) {
                int numberSubstring = Integer.parseInt(numberString.substring(0, indexOfZero));
                if (digitIsDecrementing(numberSubstring)) {
                    return false;
                }
            }

            // '0' is in middle
            if (indexOfZero > 0) {
                if (everyDigitIsTheSame(number)) return true;
                else return false;
            }

            return false;
        }

        if (numberString.contains(Character.toString('0'))) {
            int indexOfZero = numberString.indexOf('0'); // index of first 0

        }

        // general case to test proper order of digits
        for (int i = 1; i < numberString.length(); i++) {
            if (numberString.charAt(i) > numberString.charAt(i-1)) {
                return false;
            }
        }

        return true;
    }

    public static boolean digitIsPalinDrome(int number) {

        String numberString = String.valueOf(number);

        if (numberString.length() % 2 == 0) {
            int j = numberString.length()-1;
            for (int i = 0; i < numberString.length()/2; i++) {
                if (numberString.charAt(i) != numberString.charAt(j)) {
                    return false;
                }
                j--;
            }
        }

        if (numberString.length() % 3 == 0) {
            int j = numberString.length()-1;
            for (int i = 0; i < numberString.length()/2; i++) {
                if (numberString.charAt(i) != numberString.charAt(j)) {
                    return false;
                }
                j--;
            }
        }

        return true;
    }

    public static boolean digitIsInAwesomePhrases(int number, int[] phrases) {

        List<String> awesomePhrasesList = new ArrayList<>();

        for (int i = 0; i < phrases.length; i++) {
            String phrasesNumber = String.valueOf(phrases[i]);
            awesomePhrasesList.add(phrasesNumber);
        }

        String numberString = String.valueOf(number);

        if (awesomePhrasesList.contains(numberString)) return true;

        return false;
    }

    private static boolean isInNextTwoMiles(int number, int[] phrases) {

        // if next two numbers higher or lower are interesting
        if (numberIsInteresting(number++, phrases) || numberIsInteresting(number+2, phrases))
            return true;
        return false;
    }

    private static boolean numberIsNotInteresting(int number) {

        return false;

    }

    public static int numberLength(int number) {

        String numberString = String.valueOf(number);
        return numberString.length();
    }

    public static void main(String[] args) {

    }

}