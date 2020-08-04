package student_volodya_danilin.lesson_6.level_5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    public int[][] createField(int rows, int cols) {
        return new int[rows][cols];
    }

    public int[][] prepareNewGameField(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (-1);
            }
        }
        return array;
    }

    public int[][] prepareFieldForTest(int[][] array) {
        Random playerMoves = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
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

        for (int i = 0; i < field.length; i++) {  //убывающая диагональ 0.0, 1.1, 2.2
            if (field[i][i] == playerToCheck) {
                winStreak++;
                if (winStreak == 3) {
                    result = true;
                    break;
                }
            }
        }

        winStreak = 0;
        int i;

        for (int j = 2; j >= 0; j--) {  //возрастающая диагональ 2.0, 1.1, 0.2
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
        boolean result = false;
        if (isWinPositionForHorizontals(field, playerToCheck) ||
            isWinPositionForVerticals(field, playerToCheck) ||
            isWinPositionForDiagonals(field, playerToCheck) &&
                (!fieldContainsEmptySpace(field))) {
                result = true;
        }
        return result;
    }

    public boolean isDrawPosition(int[][] field) {
        boolean result = false;
            if (!fieldContainsEmptySpace(field)) {
                if (isWinPosition(field, 0) == isWinPosition(field, 1)) {
                    result = true;
                }
            }
        return result;
    }

    public Move getNextMove() {
        Scanner inputNumber = new Scanner(System.in);

        System.out.print("Input row (x) : ");
        int x = inputNumber.nextInt();

        System.out.print("Input col (y) : ");
        int y = inputNumber.nextInt();

        Move result = new Move(x, y);

        return result;
    }



    public void play() {
        int[][] field = createField(3, 3);
        prepareNewGameField(field);
        while(true) {
            printFieldToConsole(field);
            System.out.println("Player 0 turn!");
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);

            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }


            printFieldToConsole(field);
            System.out.println("Player 1 turn!");
            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;
            printFieldToConsole(field);
            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }

    public boolean fieldContainsEmptySpace(int[][] field) { // должна ли игра продолжаться?
        boolean result = false;
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[0].length; j++) {
                    if (field[i][j] == (-1)) {
                        result = true;
                    }
                }
            }
        return result;
    }

    private void printFieldToConsole(int[][] field) {
        for (int[] fieldRow : field) {
            System.out.println(Arrays.toString(fieldRow));
        }
    }

}

class Move {
    private int x;
    private int y;

    Move(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Input x : ");
        return inputNumber.nextInt();
    }

    public int getY() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Input y : ");
        return inputNumber.nextInt();
    }
}

class PlayTicTacToe {
    public static void main(String[] Args) {
        TicTacToe game = new TicTacToe();
        game.play();
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
        this.gameField = ticTacToe.prepareFieldForTest(this.gameField);
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