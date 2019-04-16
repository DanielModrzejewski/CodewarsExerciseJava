package Exercise.n6kyu;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeaterTest {

    @Test
    public void repeatTest1() {
        //given
        String word = "a";
        long repetNumber = 5;
        Repeater repeater = new Repeater();
        //when
        String answer = repeater.repeat(word,repetNumber);
        //then
        assertEquals("aaaaa", answer);
    }

    @Test
    public void repeatTest2() {
        //given
        String word = "abc";
        long repetNumber = 2;
        Repeater repeater = new Repeater();
        //when
        String answer = repeater.repeat(word,repetNumber);
        //then
        assertEquals("abcabc", answer);
    }
}