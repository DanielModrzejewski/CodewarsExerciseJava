package Exercise.n6kyu;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrderTest {

    @Test
    public void orderShouldCorrectSortedWords() {
        Order order = new Order();
        String wordIn = "is2 Thi1s T4est 3a";
        String correctOut = "Thi1s is2 3a T4est";

        assertEquals(correctOut, order.order(wordIn));
    }
}