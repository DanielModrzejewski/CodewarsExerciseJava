package Exercise.n7kyu;

import org.junit.Assert;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class DnaStrandTest {

    @Test
    public void makeComplementTest1() {
        //Given
        DnaStrand dnaStrand = new DnaStrand();
        String dna = "ATTGC";
        String complementDna = "TAACG";
        //When
        String answer = dnaStrand.makeComplement(dna);
        //Then
        Assert.assertEquals(answer, complementDna);
        assertThat(answer).isEqualTo(complementDna);
    }
}