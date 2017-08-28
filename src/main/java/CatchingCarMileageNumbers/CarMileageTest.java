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

    @Test
    public void testDigitIsIncrementing() {
        assertEquals(false, CarMileage.digitIsIncrementing(12341));
        assertEquals(true, CarMileage.digitIsIncrementing(1234));
        // assertEquals(true, CarMileage.digitIsIncrementing(4321));
        assertEquals(false, CarMileage.digitIsIncrementing(0123));
        assertEquals(true, CarMileage.digitIsIncrementing(0));
        assertEquals(true, CarMileage.digitIsIncrementing(7890));
        assertEquals(true, CarMileage.digitIsIncrementing(120));
        assertEquals(false, CarMileage.digitIsIncrementing(12089));
    }

    @Test
    public void testDigitIsDecrementing() {
        assertEquals(false, CarMileage.digitIsDecrementing(1234));
        assertEquals(true, CarMileage.digitIsDecrementing(321));
        assertEquals(false, CarMileage.digitIsDecrementing(3210));
        assertEquals(false, CarMileage.digitIsDecrementing(3010));
    }

    @Test
    public void testDigitIsPalinDrome() {
        assertEquals(true, CarMileage.digitIsPalinDrome(121));
        assertEquals(false, CarMileage.digitIsPalinDrome(1234));
        assertEquals(true, CarMileage.digitIsPalinDrome(1234321));
    }

    @Test
    public void testDigitIsInAwesomePhrases() {
        assertEquals(true, CarMileage.digitIsInAwesomePhrases(121, new int[]{121, 111, 23, 5}));
        assertEquals(false, CarMileage.digitIsInAwesomePhrases(1, new int[]{2, 44, 3}));
    }

    @Test
    public void testNumberLength() {
        assertEquals(3, CarMileage.numberLength(123));
        assertEquals(4, CarMileage.numberLength(1222));
    }
}