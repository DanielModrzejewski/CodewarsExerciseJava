package Exercise.n4kyu;

//Complete the solution so that it strips all text that follows any of a set of comment markers passed in. Any whitespace at the end of the line should also be stripped out.
//
//        Example:
//
//        Given an input string of:
//
//        apples, pears # and bananas
//        grapes
//        bananas !apples
//
//        The output expected would be:
//
//        apples, pears
//        grapes
//        bananas
//
//        The code would be called like so:
//
//        var result = solution("apples, pears # and bananas\ngrapes\nbananas !apples", ["#", "!"])
//// result should == "apples, pears\ngrapes\nbananas"


import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StripComments {
    public static String stripComments(String text, String[] commentSymbols) {
        if (text.length()==0 || commentSymbols.length == 0) {
            return text;
        }
        return Stream.of(text.split("\n")).map(i -> RemoveComment(i, commentSymbols)).collect(Collectors.joining("\n"));
    }
    private static String RemoveComment(String text, String[] commentSymbols){
        if (text.length()==0 || commentSymbols.length == 0) {
            return text;
        }
        String regex = "\\s+$";
        for (String commentSymbol: commentSymbols) {
            if (text.split("[" + commentSymbol + "]").length == 0) {
                text = "";
            } else {
                text = text.split("[" + commentSymbol + "]")[0];
            }
        }
        return text.replaceAll(regex, "");
    }
}
