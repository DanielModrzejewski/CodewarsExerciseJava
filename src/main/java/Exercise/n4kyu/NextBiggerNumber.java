package Exercise.n4kyu;

//You have to create a function that takes a positive integer number and returns the next bigger number formed by the same digits:
//
//        12 ==> 21
//        513 ==> 531
//        2017 ==> 2071
//
//        If no bigger number can be composed using those digits, return -1:
//
//        9 ==> -1
//        111 ==> -1
//        531 ==> -1

import java.util.Arrays;

public class NextBiggerNumber {

    public static long nextBiggerNumber(long n) {
        char[] s = String.valueOf(n).toCharArray();
        for (int i = s.length - 2; i >= 0; i--) {
            for (int j = s.length - 1; j > i; j--) {
                if (s[i] < s[j]) {
                    char tmp = s[i];
                    s[i] = s[j];
                    s[j] = tmp;
                    Arrays.sort(s, i + 1, s.length);
                    return Long.valueOf(String.valueOf(s));
                }
            }
        }
        return -1;
    }
}
