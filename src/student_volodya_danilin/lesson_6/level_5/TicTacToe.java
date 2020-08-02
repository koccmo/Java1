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
        System.out.print("\nPlayer 0 win? : ");
        System.out.print(ticTacToe.isWinPositionForHorizontals(this.gameField, 0));

        System.out.print("\nPlayer 1 win? : ");
        System.out.print(ticTacToe.isWinPositionForHorizontals(this.gameField, 1));




    }
}