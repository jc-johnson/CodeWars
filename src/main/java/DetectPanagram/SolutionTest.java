package src.main.java.DetectPanagram;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jordan on 9/10/2017.
 */
public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void checkEmptyString() throws Exception {
        assertEquals(false, solution.check(""));
    }

    @Test
    public void checkFail() throws Exception{
        assertEquals(false, solution.check("You shall not pass!"));
    }

    @Test
    public void checkPass() throws Exception{
        assertEquals(true, solution.check("The quick brown fox jumps over the lazy dog."));
    }

}