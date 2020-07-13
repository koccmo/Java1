/*
Дано поле игры крестики нолики размерностью три на три клетки.
Поле представлено двумерным массивом целых чисел, где:
-1 - это пустая клетка,
0 - это клетка в которую сделал ход первый игрок,
1 - это клетка в которую сделал ход второй игрок.

Создайте класс TicTacToe и в этом классе реализуйте
метод для определения является ли данная позиция
победной по горизонталям для указанного игрока.

Метод должен иметь следующую сигнатуру:
public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck).

Поле передаётся в этот метод как первый параметр int[][] field.
Знак игрока (0 или 1) передаётся вторым параметром: int playerToCheck.

Метод должет вернуть:
 - true если в одной из горизонталей есть три подряд клетки
   занятые знаком указанного игрока (int playerToCheck),
 - false иначе.

Создать класс TicTacToeTest
и написать тесты для разработанного метода.
 */
package student_igors_bartkevics.lesson_6.homework.level_5.task_19;

public class TicTacToeTest {

    public static void main(String[] args) {

        TicTacToeTest test = new TicTacToeTest();
        test.winPositionForHorizontals();

    }

    TicTacToe ticTacToe = new TicTacToe();

    public void winPositionForHorizontals() {
        int[][] field = {   {1,  0, 1},
                            {0,  0, 0},
                            {1, -1, 1}};
        checkResult(ticTacToe.isWinPositionForHorizontals(field, 0), "Win position for horizontals");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

}
