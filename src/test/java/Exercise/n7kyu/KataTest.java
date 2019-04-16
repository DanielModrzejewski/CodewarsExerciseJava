package Exercise.n7kyu;

import org.junit.Test;

import static org.junit.Assert.*;

public class KataTest {

    @Test
    public void dativeShouldReturnOriginalWord() {
        String word = "brb";
        Kata kata = new Kata();

        assertEquals(kata.dative(word), "brb");
    }

    @Test
    public void dativeShouldReturnWordnak() {
        String word = "ablak";
        Kata kata = new Kata();

        assertEquals(kata.dative(word), "ablaknak");
    }

    @Test
    public void dativeShouldReturnWordnek() {
        String word = "szék";
        Kata kata = new Kata();

        assertEquals(kata.dative(word), "széknek");
    }
}