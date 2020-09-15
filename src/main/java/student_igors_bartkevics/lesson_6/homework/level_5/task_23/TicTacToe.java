/*
В классе TicTacToe реализуйте
метод для определения является ли данная позиция ничейной.

Подсказка: ничейной позиция является тогда, когда
позиция не победна ни для одного из игроков и нет ни
одной пустой клетки (клетки в которой стоит -1).

Метод должен иметь следующую сигнатуру:
public boolean isDrawPosition(int[][] field).

Поле передаётся в этот метод как первый параметр int[][] field.

Метод должет вернуть:
 - true если позиция ничейна,
 - false иначе.

В классе TicTacToeTest написать тесты для разработанного метода.
 */
package student_igors_bartkevics.lesson_6.homework.level_5.task_23;

public class TicTacToe {

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
