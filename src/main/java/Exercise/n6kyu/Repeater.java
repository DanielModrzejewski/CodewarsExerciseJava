package Exercise.n6kyu;

//Write a function named repeater() that takes two arguments (a string and a number), and returns a new string where the input string is repeated that many times.
//        Example:
//
//        Repeater.repeat("a", 5)
//
//        should return
//
//        "aaaaa"

public class Repeater {
    public static String repeat(String string,long n){
        return n>1?string+repeat(string, n-1):string;
    }
}
