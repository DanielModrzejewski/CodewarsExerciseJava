package Exercise.n6kyu;

//Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.
//
//        Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
//
//        If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.
//        Examples
//
//        "is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
//        "4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
//        ""  -->  ""

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Order {
    public static String order(String words) {
        return Stream.of(words.split(" ")).sorted((s1, s2) -> getNumberFromString(s1) - getNumberFromString(s2)).collect(Collectors.joining(" "));
    }
    private static int getNumberFromString(String word){
        return word.chars().filter(Character::isDigit).map(i -> (int) i).findFirst().getAsInt();
    }
}
