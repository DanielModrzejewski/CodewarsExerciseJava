package Exercise.n7kyu;

import org.junit.Test;

import static org.junit.Assert.*;

public class Kata2Test {

    @Test
    public void solutionShouldReturnTrue() {
        Kata2 kata2 = new Kata2();
        String word = "ktypta";
        String sufix = "pta";

        assertTrue(kata2.solution(word,sufix));
    }

    @Test
    public void solutionShouldReturnFalse() {
        Kata2 kata2 = new Kata2();
        String word = "ktypta";
        String sufix = "ypt";

        assertFalse(kata2.solution(word,sufix));
    }
}