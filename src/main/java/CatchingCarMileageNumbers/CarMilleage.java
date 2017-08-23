package src.main.java.CatchingCarMileageNumbers;

/**
 * Created by Jordan on 8/22/2017.
 */
public class CarMileage {

    private static final int INTERESTING = 2;
    private static final int NEXT_TWO_MILES = 1;
    private static final int NOT_INTERESTING = 0;

    public static int isInteresting(int number, int[] awesomePhrases) {

        if (awesomePhrases == null || awesomePhrases.size() == 0) {
            return -1;
        }

        if (numberIsInteresting(number, awesomePhrases)) return INTERESTING;
        else if (isInNextTwoMiles(number)) return NEXT_TWO_MILES;
        else if (numberIsNotInteresting(number)) return NOT_INTERESTING;
        else return -1;

    }

    private static boolean numberIsInteresting(int number, int[] awesomePhrases) {

        if (awesomePhrases == null || awesomePhrases.size() == 0) {
            throw new DataInputException();
        }

        if (number >= 0 && number <= 1000000000) {
            if(numberLength(number) > 3) {
                if (everyDigitIsTheSame(number))return true;
                if (digitIsIncrementing(number) || digitIsDecrementing(number)) return true;
                if (digitIsPalinDrome(number)) return true;
                if (digitIsInAwesomePhrases(number)) return true;
            }
        } else {
            throw new InputOutOfBoundsException();
        }
        return false;
    }

    private static boolean everyDigitIsTheSame(int number) {

    }

    private static boolean digitIsIncrementing(int number) {

    }

    private static boolean digitIsDecrementing(int number) {

    }

    private static boolean digitIsPalinDrome(int number) {

    }

    private static boolean digitIsInAwesomePhrases(int number, int[] phrases) {

    }

    private static boolean isInNextTwoMiles(int number) {


        return false;
    }

    private static boolean numberIsNotInteresting(int number) {

        return false;

    }

}}