package Exercise.n7kyu;

//Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).
//
//        Examples:
//
//        solution('abc', 'bc') // returns true
//        solution('abc', 'd') // returns false


public class Kata2 {
    public static boolean solution(String str, String ending) {
//        return str.matches("(.*)" + ending);
        return str.endsWith(ending);
    }
}
