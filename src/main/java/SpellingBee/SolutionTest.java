package src.main.java.SpellingBee;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jordan on 6/5/2017.
 */
public class SolutionTest {
    @Test
    public void parse2dArray() throws Exception {
        char[][] array = {{'b','e','e','b'},{'.','b','e','e'},{'.','.','.','e'}};
        Assert.assertEquals(Integer.valueOf(4), Solution.parse2dArray(array));
    }

}