/*
В классе TicTacToe реализуйте метод:

public int[][] createField().

Метод должен создавать двумерный массив целых чисел
и вставлять в каждую ячейку массива -1 (признак пустой клетки).

В классе TicTacToeTest написать тесты для разработанного метода.
 */
package student_igors_bartkevics.lesson_6.homework.level_6.task_24;

public class TicTacToe {

    public int[][] createField() {
        int[][] field = new int[3][3];
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                field[row][column] = -1;
            }
        }
        return field;
    }

    public boolean isDrawPosition(int[][] field) {
        TicTacToe ticTacToe = new TicTacToe();

        return ticTacToe.isFieldFilled(field) && !ticTacToe.isWinPosition(field, 1) &&
                !ticTacToe.isWinPosition(field, 0);
    }

    public boolean isFieldFilled(int[][] field) {
        boolean result = true;
        for (int[] rows : field) {
            for (int intValue : rows) {
                if (intValue == -1) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        return ticTacToe.isWinPositionForHorizontals(field, playerToCheck) ||
                ticTacToe.isWinPositionForVerticals(field, playerToCheck) ||
                ticTacToe.isWinPositionForDiagonals(field, playerToCheck);
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        boolean result = false;
            if ((field[1][1] == playerToCheck) &&
                    (((field[1][1] == field[0][0]) && (field[1][1] == field[2][2])) ||
                    ((field[1][1] == field[2][0]) && (field[1][1] == field[0][2])))) {
                result = true;
            }
        return result;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        boolean result = false;
        for (int j = 0; j < field[0].length; j++) {
            if ((field[0][j] == field[1][j]) && (field[1][j] == field[2][j]) && (field[2][j] == playerToCheck)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        boolean result = false;
        for (int[] ints : field) {
            if ((ints[0] == ints[1]) && (ints[1] == ints[2]) && (ints[2] == playerToCheck)) {
                result = true;
                break;
            }
        }
        return result;
    }

}
