package Exercise.n6kyu;

//Kata Task
//
//        In this Kata you will write a method to return what you really meant to say by negating certain words (adding or removing n't)
//
//        The words to be negated are drawn from this pool:
//
//        are - aren't
//        can - can't
//        could - couldn't
//        did - didn't
//        do - don't
//        had - hadn't
//        has - hasn't
//        have - haven't
//        is - isn't
//        might - mightn't
//        must - mustn't
//        should - shouldn't
//        was - wasn't
//        were - weren't
//        would - wouldn't
//
//        Input
//
//        words - these are the words your brain has trouble with (contains only lower case positive form of the word)
//
//        speech - what your mouth said
//
//        Output
//
//        What you meant to say. This is the speech sentence, but with any of the words (both positive and negative forms) negated
//
//        Notes
//
//        Case rules
//        when changing negative to positive the replacement word must be same case as the original
//        when changing positive to negative use n't (except if the original word (plus any 've part) was entirely uppercase, then use N'T)
//
//        Beware of the word can
//
//        Beware of punctuation
//
//        Beware of variations with an 've suffix, such as should've, would've, could've, etc  // todo
//
//        Examples
//
//        words = ["can", "do", "have", "was", "would"]
//
//        speech
//        I do like pizza. ==> I don't like pizza.
//        I haven't seen you wearing that hat before. ==> I have seen you wearing that hat before.
//        I could see why you would say that. ==> I could see why you wouldn't say that.
//        I didn't say it! It wasn't me! ==> I didn't say it! It was me!
//        YES, WE CAN ==> YES, WE CAN'T
//        Wouldn't you believe it? I can't! ==> Would you believe it? I can!
//        I must be more careful in future. ==> I must be more careful in future.
//        I don't see why it WOULD be them ==> I do see why it WOULDN'T be them

import java.util.*;
import java.util.stream.Collectors;

public class Dinglemouse {

    public static String speechCorrection(final Set<String> words, final String speech) {
        return Arrays.stream(speech.split(" ")).map(s -> s = correctIfIsInWords(s, words)).collect(Collectors.joining(" "));
    }
    private static String correctIfIsInWords (String speachWord, Set<String> words) {

        String regex = ".*\\W";
        String suffix = "";
        while (speachWord.matches(regex)) {
            suffix = speachWord.substring(speachWord.length()-1) + suffix;
            speachWord = speachWord.substring(0,speachWord.length()-1);
        }
        if (speachWord.matches(".*'ve")) {
            suffix = speachWord.substring(speachWord.length()-3) + suffix;
            speachWord = speachWord.substring(0,speachWord.length()-3);
        }

        if (words.contains(speachWord)) {
            if (speachWord.toLowerCase().endsWith("n")) {
                return speachWord + "'t" + suffix;
            } else {
                return speachWord + "n't" + suffix;
            }
        } else if (words.stream().map(w -> w.toUpperCase()).collect(Collectors.toSet()).contains(speachWord)){
            if (speachWord.toLowerCase().endsWith("n")) {
                return speachWord + "'T" + suffix;
            } else {
                return speachWord + "N'T" + suffix;
            }
        } else if (words.contains(speachWord.toLowerCase())){
            if (speachWord.toLowerCase().endsWith("n")) {
                return speachWord + "'t" + suffix;
            } else {
                return speachWord + "n't" + suffix;
            }
        } else if (words.stream().map(w -> w = w + "n't").collect(Collectors.toSet()).contains(speachWord.toLowerCase())) {
                return speachWord.substring(0, speachWord.length()-3) + suffix;
        } else if (words.stream().map(w -> w = w.endsWith("n")? w + "'t": w).collect(Collectors.toSet()).contains(speachWord.toLowerCase())) {
            return speachWord.substring(0, speachWord.length()-2) + suffix;
        }
        return speachWord + suffix;
    }

}