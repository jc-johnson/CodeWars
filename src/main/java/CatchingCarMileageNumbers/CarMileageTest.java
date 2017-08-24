package src.main.java.CatchingCarMileageNumbers;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jordan on 8/23/2017.
 */
public class CarMileageTest {
    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @Test
    public void testEveryDigitIsSame() {
        assertEquals(false, CarMileage.everyDigitIsTheSame(101010));
        assertEquals(true, CarMileage.everyDigitIsTheSame(111));
        assertEquals(true, CarMileage.everyDigitIsTheSame(0));
    }



}