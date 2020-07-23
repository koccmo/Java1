package student_anvars_intezars.home_tasks.lesson_6.day_5;

import java.util.Arrays;

public class TicTacToeTest {

    public static void main(String[] args) {

        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.firstWinPositionHorizontalTest();
        ticTacToeTest.secondWinPositionHorizontalTest();
        ticTacToeTest.thirdWinPositionHorizontalTest();
        ticTacToeTest.firstWinPositionVerticalTest();
        ticTacToeTest.secondWinPositionVerticalTest();
        ticTacToeTest.thirdWinPositionalVerticalTest();
    }

    public void firstWinPositionHorizontalTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{1,1,1}, {0,0,0}, {0,0,0}};
        boolean result = ticTacToe.isWinPositionForHorizontals(field,1);
        if (result) {
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
        if (result) {
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
        if (result) {
            System.out.println("Test third line for horizontal win = OK");
        }
        else {
            System.out.println("Test third line for horizontal win = FAIL");
        }
    }

    public void firstWinPositionVerticalTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{1,0,0}, {1,0,0}, {1,0,0}};
        boolean result = ticTacToe.isWinPositionForVerticals(field,1);
        if (result) {
            System.out.println("Test first line for vertical win = OK");
        }
        else {
            System.out.println("Test first line for vertical win = FAIL");
        }
    }

    public void secondWinPositionVerticalTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{0,1,0}, {0,1,0}, {0,1,0}};
        boolean result = ticTacToe.isWinPositionForVerticals(field,1);
        if (result) {
            System.out.println("Test second line for vertical win = OK");
        }
        else {
            System.out.println("Test second line for vertical win = FAIL");
        }
    }

    public void thirdWinPositionalVerticalTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = {{0,0,1}, {0,0,1}, {0,1,1}};
        boolean result = ticTacToe.isWinPositionForVerticals(field,1);
        if (result) {
            System.out.println("Test for third vertical win = OK");
        }
        else {
            System.out.println("Test for third vertical win = FAIL");
        }
    }
}
