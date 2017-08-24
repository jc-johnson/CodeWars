package src.main.java.CatchingCarMileageNumbers;

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
        else if (isInNextTwoMiles(number)) return NEXT_TWO_MILES;
        else if (numberIsNotInteresting(number)) return NOT_INTERESTING;
        else return -1;

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

        for (int i = 1; i < numberString.length(); i++) {
            if (numberString.charAt(i) != numberDigit) {
                return false;
            }
        }

        return true;
    }

    private static boolean digitIsIncrementing(int number) {
        return false;
    }

    private static boolean digitIsDecrementing(int number) {
        return false;
    }

    private static boolean digitIsPalinDrome(int number) {
        return false;
    }

    private static boolean digitIsInAwesomePhrases(int number, int[] phrases) {
        return false;
    }

    private static boolean isInNextTwoMiles(int number) {


        return false;
    }

    private static boolean numberIsNotInteresting(int number) {

        return false;

    }

    public static int numberLength(int number) {

        return 0;
    }

    public static void main(String[] args) {

    }

}