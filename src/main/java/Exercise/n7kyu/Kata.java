package Exercise.n7kyu;

//Your goal is to create a function dative() (Dative() in C#) which returns the valid form of a valid Hungarian word w in dative case i. e. append the correct suffix nek or nak to the word w based on vowel harmony rules.
//        Vowel Harmony Rules (simplified)
//
//        When the last vowel in the word is
//
//        a front vowel (e, é, i, í, ö, ő, ü, ű) the suffix is -nek
//        a back vowel (a, á, o, ó, u, ú) the suffix is -nak
//
//        Examples:
//
//        Kata.dative("ablak") == "ablaknak"
//        Kata.dative("szék") == "széknek"
//        Kata.dative("otthon") == "otthonnak"
//
//        Preconditions:
//
//        To keep it simple: All words end with a consonant :)
//        All strings are unicode strings.
//        There are no grammatical exceptions in the tests.

public class Kata {
    public static String dative(String word) {
        final char[] frontVowel = {'e', 'é', 'i', 'í', 'ö', 'ő', 'ü', 'ű'};
        final char[] backVowel = {'a', 'á', 'o', 'ó', 'u', 'ú'};

        for (int i = word.length()-1; i>=0; i--) {
            for (int j = 0; j < frontVowel.length; j++) {
                if (word.charAt(i) == frontVowel[j]) {
                    return word + "nek";
                }
            }
            for (int j = 0; j < backVowel.length; j++) {
                if (word.charAt(i) == backVowel[j]) {
                    return word + "nak";
                }
            }
        }
        return word;
    }
}
