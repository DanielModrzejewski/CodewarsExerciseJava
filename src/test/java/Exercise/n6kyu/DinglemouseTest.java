package Exercise.n6kyu;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


import static org.junit.Assert.*;

public class DinglemouseTest {

    @Test
    public void speechCorrectionTestWithPositiveLowerCaseSimpleWord() {
        //Given
        Dinglemouse dinglemouse = new Dinglemouse();
        String speach = "I do like pizza.";
        String expectedSpeach = "I don't like pizza.";
        Set<String> words = new HashSet<>(Arrays.asList("can", "do", "have", "was", "would"));
        //When
        String correctedSpeach = dinglemouse.speechCorrection(words,speach);
        //Then
        assertEquals(expectedSpeach,correctedSpeach);
    }

    @Test
    public void speechCorrectionTestWithPositiveUpperCaseSimpleWord() {
        //Given
        Dinglemouse dinglemouse = new Dinglemouse();
        String speach = "I DO like pizza.";
        String expectedSpeach = "I DON'T like pizza.";
        Set<String> words = new HashSet<>(Arrays.asList("can", "do", "have", "was", "would"));
        //When
        String correctedSpeach = dinglemouse.speechCorrection(words,speach);
        //Then
        assertEquals(expectedSpeach,correctedSpeach);
    }
    @Test
    public void speechCorrectionTestWithPositiveUpperAndLowerCaseSimpleWord() {
        //Given
        Dinglemouse dinglemouse = new Dinglemouse();
        String speach = "I dO like pizza.";
        String expectedSpeach = "I dOn't like pizza.";
        Set<String> words = new HashSet<>(Arrays.asList("can", "do", "have", "was", "would"));
        //When
        String correctedSpeach = dinglemouse.speechCorrection(words,speach);
        //Then
        assertEquals(expectedSpeach,correctedSpeach);
    }

    @Test
    public void speechCorrectionTestWithNegativeLowerCaseSimpleWord() {
        //Given
        Dinglemouse dinglemouse = new Dinglemouse();
        String speach = "I don't like pizza.";
        String expectedSpeach = "I do like pizza.";
        Set<String> words = new HashSet<>(Arrays.asList("can", "do", "have", "was", "would"));
        //When
        String correctedSpeach = dinglemouse.speechCorrection(words,speach);
        //Then
        assertEquals(expectedSpeach,correctedSpeach);
    }

    @Test
    public void speechCorrectionTestWithNegativeUpperCaseSimpleWord() {
        //Given
        Dinglemouse dinglemouse = new Dinglemouse();
        String speach = "I DON'T like pizza.";
        String expectedSpeach = "I DO like pizza.";
        Set<String> words = new HashSet<>(Arrays.asList("can", "do", "have", "was", "would"));
        //When
        String correctedSpeach = dinglemouse.speechCorrection(words,speach);
        //Then
        assertEquals(expectedSpeach,correctedSpeach);
    }

    @Test
    public void speechCorrectionTestWithNegativeLowerAndUpperCaseSimpleWord() {
        //Given
        Dinglemouse dinglemouse = new Dinglemouse();
        String speach = "I dOn'T like pizza.";
        String expectedSpeach = "I dO like pizza.";
        Set<String> words = new HashSet<>(Arrays.asList("can", "do", "have", "was", "would"));
        //When
        String correctedSpeach = dinglemouse.speechCorrection(words,speach);
        //Then
        assertEquals(expectedSpeach,correctedSpeach);
    }

}