package Exercise.n6kyu;

import org.junit.Test;

import static org.junit.Assert.*;

public class RegexTicTacToeWinCheckerTest {

    @Test
    public void regexTicTacToeWinCheckerTest() {
        //given
        String board = "OXO-XOX-O";
        RegexTicTacToeWinChecker regexTicTacToeWinChecker = new RegexTicTacToeWinChecker();
        //when
        Boolean win = RegexTicTacToeWinChecker.regexTicTacToeWinChecker(board);
        //then
        assertTrue(win);
    }

    @Test
    public void regexTicTacToeWinCheckerTest2() {
        //given
        String board = "XOOOXXXXO";
        RegexTicTacToeWinChecker regexTicTacToeWinChecker = new RegexTicTacToeWinChecker();
        //when
        Boolean win = RegexTicTacToeWinChecker.regexTicTacToeWinChecker(board);
        //then
        assertFalse(win);
    }

    @Test
    public void regexTicTacToeWinCheckerTest3() {
        //given
        String board = "---------";
        RegexTicTacToeWinChecker regexTicTacToeWinChecker = new RegexTicTacToeWinChecker();
        //when
        Boolean win = RegexTicTacToeWinChecker.regexTicTacToeWinChecker(board);
        //then
        assertFalse(win);
    }
}