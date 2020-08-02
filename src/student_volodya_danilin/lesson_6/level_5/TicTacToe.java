package student_volodya_danilin.lesson_6.level_5;

import java.util.Arrays;
import java.util.Random;

public class TicTacToe {

    public int[][] createField(int rows, int cols) {
        return new int[rows][cols];
    }

    public int[][] prepareField(int[][] array) {
        Random playerMoves = new Random();

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                array[i][j] = playerMoves.nextInt(2);
            }
        }
        return array;
    }


    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        boolean result = false;
        int winStreak = 0;

        for (int[] ints : field) {
            for (int j = 0; j < field[0].length; j++) {
                if (ints[j] == playerToCheck) {
                    winStreak++;
                    if (winStreak == 3) {
                        result = true;
                        break;
                    }
                }
            }
            winStreak = 0;
        }

        return result;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        boolean result = false;
        int winStreak = 0;

        for (int i = 0; i < field[0].length; i++) {
            for (int[] ints : field) {
                if (ints[i] == playerToCheck) {
                    winStreak++;
                    if (winStreak == 3) {
                        result = true;
                        break;
                    }
                }
            }
            winStreak = 0;
        }
        return result;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        boolean result = false;
        int winStreak = 0;

        for (int i = 0; i < field.length; i++) {  //убывающая диагональ
            if (field [i][i] == playerToCheck) {
                winStreak++;
                if (winStreak == 3) {
                    result = true;
                    break;
                }
            }
        }

        winStreak = 0;
        int i;

            for (int j = 2; j >= 0; j--) {  //возрастающая диагональ
                i = 2 - j;
                //System.out.println(String.format("j : %d, i : %d, value : %d", j, i, field[j][i]));
                if (field[j][i] == playerToCheck) {
                    winStreak++;
                    if (winStreak == 3) {
                        result = true;
                    }
                }
            }

        return result;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        if (isWinPositionForHorizontals(field, playerToCheck)) return true;
        if (isWinPositionForVerticals(field, playerToCheck)) return true;
        if (isWinPositionForDiagonals(field, playerToCheck)) return true;
        else return false;
    }

    public boolean isDrawPosition(int[][] field) {
        return isWinPosition(field, 0) == isWinPosition(field, 1);
    }


}

class TicTacToeTest {

    private int[][] gameField;
    private TicTacToe ticTacToe;

    public static void main(String[] Args) {

        TicTacToeTest ticTacToeTest = new TicTacToeTest();

        ticTacToeTest.shouldCreateField();
        ticTacToeTest.shouldPrepareField();
        ticTacToeTest.shouldPrintField();
        ticTacToeTest.shouldCheckWinPositionHorizontal();
        ticTacToeTest.shouldCheckWinPositionVertical();
        ticTacToeTest.shouldCheckWinPositionDiagonal();

        ticTacToeTest.shouldCheckWinPosition();
        ticTacToeTest.shouldCheckDrawPosition();
    }

    void shouldPrintField() {
        for (int[] fieldRow : gameField) {
            System.out.println(Arrays.toString(fieldRow));
        }
    }


    void shouldCreateField() {
        this.ticTacToe = new TicTacToe();
        this.gameField = ticTacToe.createField(3, 3);
        }


    void shouldPrepareField() {
        this.gameField = ticTacToe.prepareField(this.gameField);
    }

    void shouldCheckWinPositionHorizontal() {
        System.out.print("\nPlayer 0 win horizontal? : ");
        System.out.print(ticTacToe.isWinPositionForHorizontals(this.gameField, 0));

        System.out.print("\nPlayer 1 win horizontal? : ");
        System.out.print(ticTacToe.isWinPositionForHorizontals(this.gameField, 1));

        System.out.println();
    }

    void shouldCheckWinPositionVertical() {
        System.out.print("\nPlayer 0 win vertical? : ");
        System.out.print(ticTacToe.isWinPositionForVerticals(this.gameField, 0));

        System.out.print("\nPlayer 1 win vertical? : ");
        System.out.print(ticTacToe.isWinPositionForVerticals(this.gameField, 1));

        System.out.println();
    }

    void shouldCheckWinPositionDiagonal() {
        System.out.print("\nPlayer 0 win diagonal? : ");
        System.out.print(ticTacToe.isWinPositionForDiagonals(this.gameField, 0));

        System.out.print("\nPlayer 1 win diagonal? : ");
        System.out.print(ticTacToe.isWinPositionForDiagonals(this.gameField, 1));

        System.out.println();
    }

    void shouldCheckWinPosition() {
        System.out.print("\nDid player 0 win? : ");
        System.out.print(ticTacToe.isWinPosition(this.gameField, 0));

        System.out.print("\nDid player 1 win? : ");
        System.out.print(ticTacToe.isWinPosition(gameField, 1));

        System.out.println();
    }

    void shouldCheckDrawPosition() {
        System.out.print("\nIs it a draw? : ");
        System.out.print(ticTacToe.isDrawPosition(this.gameField));
    }


}