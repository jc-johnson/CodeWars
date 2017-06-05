package src.main.java.Covfefe;

import org.junit.Assert;
import src.main.java.Covfefe.Solution;

import static org.junit.Assert.*;

/**
 * Created by Jordan on 6/4/2017.
 */
public class SolutionTest {
    @org.junit.Test
    public void covfefe() throws Exception {
        Assert.assertEquals("covfefe", Solution.covfefe("coverage"));
        assertEquals("covfefe", Solution.covfefe("coverage"));
        assertEquals("covfefe covfefe", Solution.covfefe("coverage coverage"));
        assertEquals("nothing covfefe", Solution.covfefe("nothing"));
        assertEquals( "double space  covfefe" ,Solution.covfefe("double space "));
        assertEquals("covfefe covfefe", Solution.covfefe("covfefe"));
    }

}