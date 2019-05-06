package Exercise.n6kyu;

import org.junit.Test;

import static org.junit.Assert.*;

public class WhoLikesItTest {

    @Test
    public void whoLikesItEmptyTest() {
        //given
        WhoLikesIt whoLikesItTest = new WhoLikesIt();
        //when
        String answer = whoLikesItTest.whoLikesIt();
        //then
        assertEquals("no one likes this", answer);
    }

    @Test
    public void whoLikesItOneLikeTest() {
        //given
        WhoLikesIt whoLikesItTest = new WhoLikesIt();
        //when
        String answer = whoLikesItTest.whoLikesIt("Peter");
        //then
        assertEquals("Peter likes this", answer);
    }

    @Test
    public void whoLikesItTwoLikeTest() {
        //given
        WhoLikesIt whoLikesItTest = new WhoLikesIt();
        //when
        String answer = whoLikesItTest.whoLikesIt("Jacob", "Alex");
        //then
        assertEquals("Jacob and Alex like this", answer);
    }

    @Test
    public void whoLikesItTreLikeTest() {
        //given
        WhoLikesIt whoLikesItTest = new WhoLikesIt();
        //when
        String answer = whoLikesItTest.whoLikesIt("Max", "John", "Mark");
        //then
        assertEquals("Max, John and Mark like this", answer);
    }

    @Test
    public void whoLikesItFourLikeTest() {
        //given
        WhoLikesIt whoLikesItTest = new WhoLikesIt();
        //when
        String answer = whoLikesItTest.whoLikesIt("Alex", "Jacob", "Mark", "Max");
        //then
        assertEquals("Alex, Jacob and 2 others like this", answer);
    }
}