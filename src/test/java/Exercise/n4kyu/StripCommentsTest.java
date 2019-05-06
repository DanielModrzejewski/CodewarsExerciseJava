package Exercise.n4kyu;

import org.junit.Test;

import static org.junit.Assert.*;

public class StripCommentsTest {

    @Test
    public void stripCommentsTest() {
        //given
        String text = "apples, pears # and bananas\n" + "grapes\n" + "bananas !apples";
        String[] commentSymbols = {"#", "!"};
        long repetNumber = 5;
        StripComments repeater = new StripComments();
        //when
        String answer = StripComments.stripComments(text, commentSymbols);
        //then
        assertEquals("apples, pears\n" + "grapes\n" + "bananas", answer);
    }

    @Test
    public void stripCommentsTest2() {
        //given
        String text = "a #b\nc\nd $e f g";
        String[] commentSymbols = {"#", "$"};
        StripComments repeater = new StripComments();
        //when
        String answer = StripComments.stripComments(text, commentSymbols);
        //then
        assertEquals("a\nc\nd", answer);
    }

    @Test
    public void stripCommentsTest3() {
        //given
        String text = "#";
        String[] commentSymbols = {"#", "$"};
        StripComments repeater = new StripComments();
        //when
        String answer = StripComments.stripComments(text, commentSymbols);
        //then
        assertEquals("", answer);
    }
}