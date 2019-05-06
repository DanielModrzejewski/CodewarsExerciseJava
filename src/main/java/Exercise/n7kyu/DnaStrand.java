package Exercise.n7kyu;

//Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions" for the development and functioning of living organisms.
//
//        If you want to know more http://en.wikipedia.org/wiki/DNA
//
//        In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". You have function with one side of the DNA (string, except for Haskell); you need to get the other complementary side. DNA strand is never empty or there is no DNA at all (again, except for Haskell).
//
//        More similar exercise are found here http://rosalind.info/problems/list-view/ (source)
//        DnaStrand.makeComplement("ATTGC") // return "TAACG"
//
//        DnaStrand.makeComplement("GTAT") // return "CATA"

import java.util.stream.Collectors;

public class DnaStrand {
    public static String makeComplement(String dna) {
        return dna.chars().mapToObj(c -> (char) c).map(i -> complements(i)).map(String::valueOf).collect(Collectors.joining());
    }
    public static char complements (char symbol){
        switch (symbol) {
            case 'A': return 'T';
            case 'T': return 'A';
            case 'C': return 'G';
            case 'G': return 'C';
        }
        return symbol;
    }
}
