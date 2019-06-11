package Exercise.n4kyu;

import org.junit.Test;

import static Exercise.n4kyu.NextBiggerNumber.nextBiggerNumber;
import static org.junit.Assert.*;

public class NextBiggerNumberTest {

    //        12 ==> 21
//        513 ==> 531
//        2017 ==> 2071
//
//        If no bigger number can be composed using those digits, return -1:
//
//        9 ==> -1
//        111 ==> -1
//        531 ==> -1

    @Test
    public void shouldReturnCorrestAnswerWhenIsBiggerNumber() {
        assertEquals(132, nextBiggerNumber(123));
        assertEquals(21, nextBiggerNumber(12));
        assertEquals(531, nextBiggerNumber(513));
        assertEquals(2071, nextBiggerNumber(2017));
    }

    @Test
    public void shouldReturnMinusOneWhenIsNoBiggerNumber() {
        assertEquals(-1, nextBiggerNumber(9));
        assertEquals(-1, nextBiggerNumber(111));
        assertEquals(-1, nextBiggerNumber(531));
    }
}