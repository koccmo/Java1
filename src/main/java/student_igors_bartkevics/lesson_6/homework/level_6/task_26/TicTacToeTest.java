/*
Создайте в классе TicTacToe метод:

public void printFieldToConsole(int[][] field) {
    // распечатайте поле на консоль в читаемом формате
}
 */

package student_igors_bartkevics.lesson_6.homework.level_6.task_26;

import java.util.Arrays;

public class TicTacToeTest {

    public static void main(String[] args) {

        TicTacToeTest test = new TicTacToeTest();
        test.winPositionForHorizontals();
        test.winPositionForVerticals();
        test.winPositionForDiagonals();
        test.winPositionForPlayer();
        test.fieldIsFilled();
        test.drawPosition();
        test.createField();
    }

    TicTacToe ticTacToe = new TicTacToe();

    public void createField() {
        int[][] emptyField = {   {-1, -1, -1},
                                 {-1, -1, -1},    //empty field
                                 {-1, -1, -1}};

        int[][] notEmptyField = {   {-1, -1, -1},
                                    {-1,  0, -1},    // NOT empty field
                                    {-1, -1, -1}};

        int [][] field = ticTacToe.createField();
        boolean condition = Arrays.deepEquals(emptyField,field) &&
                           !Arrays.deepEquals(notEmptyField,field);
        checkResult(condition, "Create field");
    }

    public void drawPosition() {
        int[][] field1 = {   {-1,  1,  0},
                             { 1,  0,  0},    //not filled
                             { 1,  0,  1}};

        int[][] field2 = {   { 0,  1,  0},
                             { 1,  0,  0},    //draw position
                             { 1,  0,  1}};

        int[][] field3 = {   { 1,  1,  0},
                             { 1,  0,  0},    //filled and "0" won
                             { 0,  0,  1}};

        int[][] field4 = {   { 1,  1,  1},
                             { 1,  0,  0},    //filled and "1" won
                             { 0,  0,  1}};

        int[][] field5 = {   { 1,  1,  0},
                             { 1,  0,  0},    //not filled and "0" won
                             { 0, -1,  1}};

        int[][] field6 = {   { 1,  1,  0},
                             {-1,  1,  0},    //not filled and "1" won
                             { 0,  0,  1}};

        boolean condition =
                !ticTacToe.isDrawPosition(field1) &&
                ticTacToe.isDrawPosition(field2) &&
                !ticTacToe.isDrawPosition(field3) &&
                !ticTacToe.isDrawPosition(field4) &&
                !ticTacToe.isDrawPosition(field5) &&
                !ticTacToe.isDrawPosition(field6);


        checkResult(condition, "Draw position");
    }

    public void fieldIsFilled() {
        int[][] field = {    { 1,  1,  0},
                             { 1,  0,  0},
                             { 0,  0,  1}};

        boolean condition = ticTacToe.isFieldFilled(field);

        checkResult(condition, "Field is filled");
    }

    public void winPositionForPlayer() {
        int[][] field1 = {   { 1,  1,  1},
                             {-1,  0,  0},
                             { 0, -1, -1}};

        int[][] field2 = {   { 0,  0, 1},
                             { 1,  1, 1},
                             {-1, -1, 0}};

        int[][] field3 = {   {-1,  0, -1},
                             { 0, -1,  0},
                             { 1,  1,  1}};

        int[][] field4 = {    {0,  1, -1},
                              {0,  1,  1},
                              {0, -1, -1}};

        int[][] field5 = {    {1,   0, -1},
                              {1,   0,  1},
                              {-1,  0,  1}};

        int[][] field6 = {    {1,  1, 0},
                              {0,  1, 0},
                              {1, -1, 0}};

        int[][] field7 = {   { 0,  1,  1},
                             {-1,  0,  1},
                             { 1, -1,  0}};

        int[][] field8 = {   { 1,  1,  0},
                             {-1,  0,  1},
                             { 0, -1,  1}};

        boolean condition =
                ticTacToe.isWinPosition(field1, 1) &&
                ticTacToe.isWinPosition(field2, 1) &&
                ticTacToe.isWinPosition(field3, 1) &&
                ticTacToe.isWinPosition(field4, 0) &&
                ticTacToe.isWinPosition(field5, 0) &&
                ticTacToe.isWinPosition(field6, 0) &&
                ticTacToe.isWinPosition(field7, 0) &&
                ticTacToe.isWinPosition(field8, 0);
        checkResult(condition, "Win position");
    }

    public void winPositionForDiagonals() {

        int[][] field1 = {   { 0,  1,  1},
                             {-1,  0,  1},
                             { 1, -1,  0}};

        int[][] field2 = {   { 1,  1,  0},
                             {-1,  0,  1},
                             { 0, -1,  1}};

                boolean condition = ticTacToe.isWinPositionForDiagonals(field1, 0) && ticTacToe.isWinPositionForDiagonals(field2, 0);
        checkResult(condition, "Win position for diagonals");
    }

    public void winPositionForVerticals() {
        int[][] field1 = {    {0,  1, -1},
                              {0,  1,  1},
                              {0, -1, -1}};

        int[][] field2 = {    {1,   0, -1},
                              {1,   0,  1},
                              {-1,  0,  1}};

        int[][] field3 = {    {1,  1, 0},
                              {0,  1, 0},
                              {1, -1, 0}};

        boolean condition = ticTacToe.isWinPositionForVerticals(field1, 0) &&
                            ticTacToe.isWinPositionForVerticals(field2, 0) &&
                            ticTacToe.isWinPositionForVerticals(field3, 0);
        checkResult(condition, "Win position for verticals");
    }

    public void winPositionForHorizontals() {
        int[][] field1 = {   { 1,  1,  1},
                             {-1,  0,  0},
                             { 0, -1, -1}};

        int[][] field2 = {   { 0,  0, 1},
                             { 1,  1, 1},
                             {-1, -1, 0}};

        int[][] field3 = {   {-1,  0, -1},
                             { 0, -1,  0},
                             { 1,  1,  1}};

        boolean condition = ticTacToe.isWinPositionForHorizontals(field1, 1) &&
                            ticTacToe.isWinPositionForHorizontals(field2, 1) &&
                            ticTacToe.isWinPositionForHorizontals(field3, 1);

        checkResult((condition), "Win position for horizontals");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
}
