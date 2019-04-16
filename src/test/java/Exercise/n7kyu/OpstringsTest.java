package Exercise.n7kyu;

import org.junit.Test;

import static org.junit.Assert.*;

public class OpstringsTest {

    @Test
    public void vertMirrorTest() {
        Opstrings opstrings = new Opstrings();
        String s = "abcd\nefgh\nijkl\nmnop";
        assertEquals(Opstrings.vertMirror(s),"dcba\nhgfe\nlkji\nponm");
    }

    @Test
    public void horMirrorTest() {
        Opstrings opstrings = new Opstrings();
        String s = "abcd\nefgh\nijkl\nmnop";
        assertEquals(Opstrings.horMirror(s),"mnop\nijkl\nefgh\nabcd");
    }
}