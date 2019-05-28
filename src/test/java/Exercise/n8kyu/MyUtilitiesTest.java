package Exercise.n8kyu;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyUtilitiesTest {

    @Test
    public void shouldReturnFalseIfNotNumber() {
        MyUtilities myUtilities = new MyUtilities();

        assertEquals(false, myUtilities.isDigit("d"));
        assertEquals(false, myUtilities.isDigit("1 - 1"));
        assertEquals(false, myUtilities.isDigit("1 5"));
        assertEquals(false, myUtilities.isDigit("7.8.7"));
    }

    @Test
    public void shouldReturnTrueIfNumber() {
        MyUtilities myUtilities = new MyUtilities();

        assertEquals(true, myUtilities.isDigit("1"));
        assertEquals(true, myUtilities.isDigit("1.4"));
        assertEquals(true, myUtilities.isDigit(" 1 "));
        assertEquals(true, myUtilities.isDigit(" 1.4 "));
        assertEquals(true, myUtilities.isDigit("5.78"));
    }
}