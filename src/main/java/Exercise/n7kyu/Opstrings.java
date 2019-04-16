package Exercise.n7kyu;

// This kata is the first of a sequence of four about "Squared Strings".

// You are given a string of n lines, each substring being n characters long: For example:

// s = "abcd\nefgh\nijkl\nmnop"

// We will study some transformations of this square of strings.

//     Vertical mirror: vert_mirror (or vertMirror or vert-mirror)

//     vert_mirror(s) => "dcba\nhgfe\nlkji\nponm"

//     Horizontal mirror: hor_mirror (or horMirror or hor-mirror)

//     hor_mirror(s) => "mnop\nijkl\nefgh\nabcd"

// or printed:

// vertical mirror   |horizontal mirror
// abcd --> dcba     |abcd --> mnop
// efgh     hgfe     |efgh     ijkl
// ijkl     lkji     |ijkl     efgh
// mnop     ponm     |mnop     abcd

// #Task:

//     Write these two functions

// and

//     high-order function oper(fct, s) where
//         fct is the function of one variable f to apply to the string s (fct will be one of vertMirror, horMirror)

// #Examples:

// s = "abcd\nefgh\nijkl\nmnop"
// oper(vert_mirror, s) => "dcba\nhgfe\nlkji\nponm"
// oper(hor_mirror, s) => "mnop\nijkl\nefgh\nabcd"

import java.util.function.Function;

class Opstrings {

    public static String vertMirror (String strng) {
        String[] strings = strng.split("\n");
        StringBuilder sb = new StringBuilder();
        for (int i =0 ; i<strings.length; i++) {
            sb.setLength(0);
            sb.append(strings[i]);
            strings[i]=sb.reverse().toString();
        }
        return String.join("\n", strings);
    }
    public static String horMirror (String strng) {
        String[] strings = strng.split("\n");
        String pom;
        for (int i =0 ; i<strings.length/2; i++) {
            pom = strings[i];
            strings[i] = strings[strings.length-1-i];
            strings[strings.length-1-i] = pom;
        }
        return String.join("\n", strings);
    }
    public static String oper(Function<String, String> func, String s) {
        return func.apply(s);
    }
}
