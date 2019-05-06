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


import java.util.ArrayList;

public class NextBiggerNumber {
    public static long nextBiggerNumber(long n) {
        char[] digits = Long.toString(n).toCharArray();
        long returnNumber = -1;
        char theBigestDigit = digits[digits.length-1];
        for (int i = digits.length-1; i>0 ; i--){

        }
        return returnNumber;
    }
}
