package Exercise.n6kyu;

import org.junit.Test;


import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CableTest {

    @Test
    public void shouldReturnCorrectAnswerWhenNoLoops() {
        String cableString = "----";
        BigInteger answer = Cable.calculateLength(cableString);
        assertEquals(BigInteger.valueOf(4), answer);
    }

    @Test
    public void shouldReturnCorrectAnswerWhenLoop() {
        String cableString = "_(-_)";
        BigInteger answer = Cable.calculateLength(cableString);
        assertEquals(BigInteger.valueOf(8), answer);
    }

    @Test
    public void shouldReturnCorrectAnswerWhenLoopInLoop() {
        String cableString = "_(-(_)=)";
        BigInteger answer = Cable.calculateLength(cableString);
        assertEquals(BigInteger.valueOf(18), answer);
    }

    @Test
    public void shouldReturnBracketExceptionForWrongNumberOfBrackets() {
        assertThrows(BracketException.class, () -> {
            Cable.calculateLength("_-(_))=");
        });
        assertThrows(BracketException.class, () -> {
            Cable.calculateLength("_(-(_)=");
        });
        assertThrows(BracketException.class, () -> {
            Cable.calculateLength("_(-(_))=(");
        });
    }
}