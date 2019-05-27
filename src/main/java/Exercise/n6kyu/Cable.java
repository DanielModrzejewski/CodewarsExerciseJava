package Exercise.n6kyu;

//The goal is to calculate the length of a cable.
//
//        The cable will be symbolized with a combination of the following characters: -, _, =.
//
//        Each character has a different length: - is of length 1, _ of length 2 and = of length 3.
//
//        Sometimes the cable is making a loop. This will be symbolized with brackets.
//
//When you have reached a closing bracket ), you have to go back to the corresponding opening bracket and count the length again -> this represents a loop.
//
//        For example:
//
//        Cable.calculateLength("----"); // => 4
//        Cable.calculateLength("_(-_)"); // => 8 --> _-_-_
//        Cable.calculateLength("_(-(_))="); // => 15 --> _(-__)= --> _-__-__=
//
//        If a cable is broken, meaning number of ( is not equal to number of ), you must throw a BracketException of type RuntimeException that you must implement yourself.
//
//        If the cable has a node, meaning a different character is detected on the input string, throw a NodeException of type RuntimeException (implement it as well)
//
//        If a cable is both broken and contains nodes then it should throw the exception that can be first detected and confirmed.
//
//        Good luck and keep an eye on the performance of your code - suboptimal solutions may time out in the Submit tests ;)

import java.math.BigInteger;

public class Cable {

    static int iterator = 0;

    public static BigInteger calculateLength(String cable){
        iterator = 0;
        return calculateloopLength(cable.toCharArray(), false) ;
    }

    public static BigInteger calculateloopLength(char[] cableChar, boolean openLoop) {
        BigInteger counter = BigInteger.ZERO;
        for (; iterator<cableChar.length ; iterator++) {
            switch (cableChar[iterator]) {
                case '-': {
                    counter=counter.add(BigInteger.ONE);
                    break;
                }
                case '_': {
                    counter=counter.add(BigInteger.valueOf(2));
                    break;
                }
                case '=': {
                    counter=counter.add(BigInteger.valueOf(3));
                    break;
                }
                case '(': {
                    iterator ++;
                    counter=counter.add(calculateloopLength(cableChar, true));
                    break;
                }
                case ')': {
                    if (openLoop == false) {
                        throw new BracketException();
                    } else {
                        return counter.multiply(BigInteger.valueOf(2));
                    }
                }
                default: throw new NodeException();
            }
        }
        if (openLoop==true){
            throw new BracketException();
        }
        return counter;
    }

}
class BracketException extends RuntimeException {
    public BracketException() {
        printStackTrace();
    }
}

class NodeException extends RuntimeException {
    public NodeException() {
        printStackTrace();
    }
}
