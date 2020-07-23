package student_anvars_intezars.home_tasks.lesson_6.day_5;

import java.util.Arrays;

public class TicTacToeTest {

    public static void main(String[] args) {

        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.firstWinPositionHorizontalTest();
        ticTacToeTest.secondWinPositionHorizontalTest();
        ticTacToeTest.thirdWinPositionHorizontalTest();
    }

    public void firstWinPositionHorizontalTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{1,1,1}, {0,0,0}, {0,0,0}};
        boolean result = ticTacToe.isWinPositionForHorizontals(field,1);
        if (result = true) {
            System.out.println("Test first line for horizontal win = OK");
        }
        else {
            System.out.println("Test first line for horizontal win = FAIL");
        }

    }

    public void secondWinPositionHorizontalTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{0,0,0}, {1,1,1}, {0,0,0}};
        boolean result = ticTacToe.isWinPositionForHorizontals(field,1);
        if (result = true) {
            System.out.println("Test second line for horizontal win = OK");
        }
        else {
            System.out.println("Test second line for horizontal win = FAIL");
        }
    }

    public void thirdWinPositionHorizontalTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{0,0,0}, {0,0,0}, {1,1,1}};
        boolean result = ticTacToe.isWinPositionForHorizontals(field,1);
        if (result = true) {
            System.out.println("Test third line for horizontal win = OK");
        }
        else {
            System.out.println("Test third line for horizontal win = FAIL");
        }
    }
}
