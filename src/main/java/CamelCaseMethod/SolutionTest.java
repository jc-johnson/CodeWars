package src.main.java.CamelCaseMethod;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jordan on 6/5/2017.
 */
public class SolutionTest {
    @Test
    public void camelCase() throws Exception {

        Assert.assertEquals("TestTestTest", Solution.camelCase("test test test"));
        Assert.assertEquals("FunGoodTime", Solution.camelCase("fun good time"));

    }

}