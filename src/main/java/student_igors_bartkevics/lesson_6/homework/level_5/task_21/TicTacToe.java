/*
В классе TicTacToe реализуйте
метод для определения является ли данная позиция
победной по диагоналям для указанного игрока.

Метод должен иметь следующую сигнатуру:
public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck).

Поле передаётся в этот метод как первый параметр int[][] field.
Знак игрока (0 или 1) передаётся вторым параметром: int playerToCheck.

Метод должет вернуть:
 - true если в одной из диагоналей есть три подряд клетки
   занятые знаком указанного игрока (int playerToCheck),
 - false иначе.

В классе TicTacToeTest написать тесты для разработанного метода.
 */
package student_igors_bartkevics.lesson_6.homework.level_5.task_21;

public class TicTacToe {

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
