package src.main.java.SpellingBee;

/**
 * Created by Jordan on 6/5/2017.
 */
public class Solution {

    public static Integer parse2dArray(char[][] array){
        // if array is empty or null
        if (array == null) return 0;

        // test -
        Integer count = 0;
        String bee = "bee";

        char[][] tempArray = array;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                // if 2 spaces to the right are free -- check to the right
                if (j < array[i].length-2) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(array[i][j]);
                    stringBuilder.append(array[i][j+1]);
                    stringBuilder.append(array[i][j+2]);
                    String currentString = stringBuilder.toString();
                    if (currentString.equals(bee)) count += 1;
                }
                // check to the left
                if (j > 1) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(array[i][j]);
                    stringBuilder.append(array[i][j-1]);
                    stringBuilder.append(array[i][j-2]);
                    String currentString = stringBuilder.toString();
                    if (currentString.equals(bee)) count += 1;

                }
                // check above
                if (i > 1) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(array[i][j]);
                    stringBuilder.append(array[i-1][j]);
                    stringBuilder.append(array[i-2][j]);
                    String currentString = stringBuilder.toString();
                    if (currentString.equals(bee)) count += 1;
                }
                // check below
                if (i < array.length - 2) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(array[i][j]);
                    stringBuilder.append(array[i+1][j]);
                    stringBuilder.append(array[i+2][j]);
                    String currentString = stringBuilder.toString();
                    if (currentString.equals(bee)) count += 1;
                }

            }
        }
        return count;
    }

    // for each cell in 2d array

        // if iterator is free 2 spaces to right
            // compose string made of current cell + two cells to right
                // if string equals "bee"
                    // count++
        // if iterator is free 2 spaces to left
            // compose string made of current cell + two cells to left
                // if string equals "bee"
                    // count++
        // if iterator is free 2 spaces down
            // compose string made of current cell + two cells to left
                // if string equals "bee"
                    // count++

        // if iterator is free 2 spaces up
            // compose string made of current cell + two cells to left
                // if string equals "bee"
                    // count++

    public static void print2dArray(char[][] array) {
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        char[][] testArray = {{'b','e','e'}, {'b','e','e'}, {'.','.','.'}};
        Integer count = Solution.parse2dArray(testArray);
        System.out.println(count);

        char[][] testArray2 = {{'b','e','e','b'},{'.','b','e','e'},{'.','.','.','e'}};
        Integer count2 = Solution.parse2dArray(testArray2);
        System.out.println(count2);


        char[][] array = {{'a','b','c'}, {'e','f','g','z'}, {'h','i','j'}};
        Solution.print2dArray(array);

        // 2d array tests
        System.out.println("Array length " + array.length);
        System.out.println("array[0].length " + array[0].length);
        System.out.println("array[1].length " + array[1].length);
    }
}


