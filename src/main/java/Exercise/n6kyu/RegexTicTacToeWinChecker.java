package Exercise.n6kyu;

//Your function will receive a string of nine "X", "O", and/or "-" characters representing the state of a tic tac toe board, for example the string
//
//        "X-OXXXO-O"
//
//        would represent the board
//
//        X-O
//        XXX
//        O-O
//
//        where player X has won by getting three in a row horizontally on the middle row.
//
//        Your function needs to return True/true/TRUE (depending on the language you're using) if either the X or the O player has won the game by getting three in a row vertically, horizontally, or diagonally; or False/false/FALSE if there is no winner.
//
//        A few more examples:
//
//        "---------" - False - no one has even made a move yet!
//
//        "XOOOXXXXO" - False - no one got three in a row here.
//
//        "OXO-XOX-O" - True - player O won by getting three in a row vertically in the third column.
//
//        Note: Occasionally one of the random boards in the Test Suite will have two three-in-a-rows instead of one or none, and this still counts as a winning board. If the two three-in-a-rows belong to the same player, this just means that the second player played so badly that the first player's fifth and final move created two three-in-a-rows. If the two three-in-a-rows belong to different players, this just means that although one player won the game, afterward (as sometimes happens in real life) the other player made their mark in another square anyway, just because even though they already lost, they feel better doing that. :-)

//public class RegexTicTacToeWinChecker {
//    public static boolean regexTicTacToeWinChecker(String board) {
//        char[] boardChar = board.toCharArray();
//        return (regexTicTacToeWinCheckerVertical(boardChar)||regexTicTacToeWinCheckerHorizontal(boardChar)||regexTicTacToeWinCheckerDiagonally(boardChar));
//    }
//
//    private static boolean regexTicTacToeWinCheckerVertical(char[] boardChar) {
//        for (int i = 0; i < 9; i += 3) {
//            if (boardChar[i] != '-' && boardChar[i] == boardChar[i + 1] && boardChar[i] == boardChar[i + 2]) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    private static boolean regexTicTacToeWinCheckerHorizontal(char[] boardChar) {
//        for (int i = 0; i < 3; i += 1) {
//            if (boardChar[i] != '-' && boardChar[i] == boardChar[i + 3] && boardChar[i] == boardChar[i + 6]) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    private static boolean regexTicTacToeWinCheckerDiagonally(char[] boardChar) {
//        if (boardChar[0] != '-' && boardChar[0] == boardChar[4] && boardChar[0] == boardChar[8]) {
//            return true;
//        }
//        if (boardChar[2] != '-' && boardChar[2] == boardChar[4] && boardChar[2] == boardChar[6]) {
//            return true;
//        }
//        return false;
//    }
//}

public class RegexTicTacToeWinChecker {

    public static boolean regexTicTacToeWinChecker(String board) {
        boolean X = board.matches("XXX.{6}|...XXX...|.{6}XXX|X..X..X..|.X..X..X.|..X..X..X|X...X...X|..X.X.X..");
        boolean O = board.matches("OOO.{6}|...OOO...|.{6}OOO|O..O..O..|.O..O..O.|..O..O..O|O...O...O|..O.O.O..");
        return X||O;
    }

}
