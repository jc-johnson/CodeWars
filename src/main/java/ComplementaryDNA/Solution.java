package src.main.java.ComplementaryDNA;

/**
 * Created by Jordan on 6/9/2017.
 */
public class Solution {

    public static String makeComplement(String dna) {
        if (dna.isEmpty()) return "";

        char[] charArray = dna.toCharArray();
        StringBuilder compliment = new StringBuilder();

        for (int i = 0; i < dna.length(); i++) {

            switch (dna.charAt(i)) {
                case 'A':
                    compliment.append('T');
                    break;
                case 'T':
                    compliment.append('A');
                    break;
                case 'C':
                    compliment.append('G');
                    break;
                case 'G':
                    compliment.append('C');
                    break;
            }
        }

        return compliment.toString();
    }

    public static void main(String[] args) {
        String test = "ATTGC";
        String answer = Solution.makeComplement(test);
        System.out.println(answer);
    }
}
