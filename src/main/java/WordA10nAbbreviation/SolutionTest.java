package src.main.java.WordA10nAbbreviation;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jordan on 6/10/2017.
 */
public class SolutionTest {


    @Test
    public void abbreviate() throws Exception {

        Solution solution = new Solution();

        Assert.assertEquals("i18n", solution.abbreviate("internationalization") );
    }

}