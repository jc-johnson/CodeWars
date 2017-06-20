package src.main.java.DuckDuckGoose;

/**
 * Created by Jordan on 6/16/2017.
 */
public class Solution {

    public static String duckDuckGoose(String[] players, int goose) {
        // Note: Player objects have a String field called 'name'.

        // if (goose <= players.length - 1) return players[goose].name;

        int i = 1;
        int playerPointer = 0;
        String player = "";
        while (i <= goose) {
            if (i == players.length ) playerPointer = 0;
            player = players[playerPointer];
            playerPointer++;
            i++;
        }

        return player;
    }

    public static void main(String[] args) {
        String[] players = new String[] {"a", "b", "c",};

                //"d", "c", "e", "f", "g", "h", "z"};

        System.out.println(Solution.duckDuckGoose(players, 10));
    }
}
