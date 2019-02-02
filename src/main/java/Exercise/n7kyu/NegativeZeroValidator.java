package Exercise.n7kyu;

//There exist two zeroes: +0 (or just 0) and -0.
//
//        Write a function that returns true if the input number is -0 and false otherwise (True and False for Python).

public class NegativeZeroValidator {

    public static boolean isNegativeZero(Float n) {
        return n.equals(-0f);
    }
}

