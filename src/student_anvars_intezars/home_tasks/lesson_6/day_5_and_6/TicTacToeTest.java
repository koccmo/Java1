package student_anvars_intezars.home_tasks.lesson_6.day_5_and_6;

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
        ticTacToeTest.firstWinPositionDiagonalTest();
        ticTacToeTest.secondWinPositionDiagonalTest();
        ticTacToeTest.firstIsWinPositionTest();
        ticTacToeTest.secondIsWinPositionTest();
        ticTacToeTest.thirdIsWinPositionTest();
        ticTacToeTest.fourthIsWinPositionTest();
        ticTacToeTest.fifthIsWinPositionTest();
        ticTacToeTest.sixthIsWinPositionTest();
        ticTacToeTest.seventhIsWinPositionTest();
        ticTacToeTest.eighthIsWinPositionTest();
        ticTacToeTest.isDrawPositionTest();
        ticTacToeTest.createFieldTest();
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
            System.out.println();
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
            System.out.println();
        }
        else {
            System.out.println("Test for third vertical win = FAIL");
        }
    }

    public void firstWinPositionDiagonalTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{1,0,0}, {0,1,0}, {0,0,1}};
        boolean result = ticTacToe.isWinPositionForDiagonals(field,1);
        if (result) {
            System.out.println("Test for first diagonal win = OK");
        }
        else {
            System.out.println("Test for first diagonal win = FAIL");
        }
    }

    public void secondWinPositionDiagonalTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{0,0,1},{0,1,0},{1,0,0}};
        boolean result = ticTacToe.isWinPositionForDiagonals(field,1);
        if (result) {
            System.out.println("Test for second diagonal win = OK");
            System.out.println();
        }
        else {
            System.out.println("Test for second diagonal win = FAIL");
        }
    }

    public void firstIsWinPositionTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{0,0,1},{0,1,0},{1,0,0}};
        boolean result = ticTacToe.isWinPosition(field,1);
        if (result) {
            System.out.println("Test for first wining position = OK");
        }
        else {
            System.out.println("Test for first wining position = FAIL");
        }
    }

    public void secondIsWinPositionTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{0,0,1},{0,1,0},{1,0,0}};
        boolean result = ticTacToe.isWinPosition(field,1);
        if (result) {
            System.out.println("Test for second wining position = OK");
        }
        else {
            System.out.println("Test for second wining position = FAIL");
        }
    }

    public void thirdIsWinPositionTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{1,1,1}, {0,0,0}, {0,0,0}};
        boolean result = ticTacToe.isWinPosition(field,1);
        if (result) {
            System.out.println("Test for third wining position = OK");
        }
        else {
            System.out.println("Test for third wining position = FAIL");
        }
    }

    public void fourthIsWinPositionTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{0,0,0}, {1,1,1}, {0,0,0}};
        boolean result = ticTacToe.isWinPosition(field,1);
        if (result) {
            System.out.println("Test for fourth wining position = OK");
        }
        else {
            System.out.println("Test for fourth wining position = FAIL");
        }
    }


    public void fifthIsWinPositionTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{0,0,0}, {0,0,0}, {1,1,1}};
        boolean result = ticTacToe.isWinPosition(field,1);
        if (result) {
            System.out.println("Test for fifth wining position = OK");
        }
        else {
            System.out.println("Test for fifth wining position = FAIL");
        }
    }

    public void sixthIsWinPositionTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{1,0,0}, {1,0,0}, {1,0,0}};
        boolean result = ticTacToe.isWinPosition(field,1);
        if (result) {
            System.out.println("Test for sixth wining position = OK");
        }
        else {
            System.out.println("Test for sixth wining position = FAIL");
        }
    }

    public void seventhIsWinPositionTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{0,1,0}, {0,1,0}, {0,1,0}};
        boolean result = ticTacToe.isWinPosition(field,1);
        if (result) {
            System.out.println("Test for seventh wining position = OK");
        }
        else {
            System.out.println("Test for seventh wining position = FAIL");
        }
    }

    public void eighthIsWinPositionTest () {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{0,0,1}, {0,0,1}, {0,1,1}};
        boolean result = ticTacToe.isWinPosition(field,1);
        if (result) {
            System.out.println("Test for eighth wining position = OK");
            System.out.println();
        }
        else {
            System.out.println("Test for eighth wining position = FAIL");
        }
    }

    public void isDrawPositionTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{0,1,0}, {1,0,0}, {1,0,1}};
        boolean result = ticTacToe.isDrawPosition(field);
        if (!result) {
            System.out.println("Test for draw = OK");
            System.out.println();
        }
        else {
            System.out.println("Test for draw = FAIL");
        }
    }

    public void createFieldTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] exampleField = {{-1,-1,-1},{-1,-1,-1},{-1,-1,-1}};
        int[][] field = ticTacToe.createField();
        if (Arrays.deepEquals(exampleField,field)) {
            System.out.println("Test for creating Field = OK");
        }
        else {
            System.out.println("Test for creating Field = FAIL");
        }

    }


}
