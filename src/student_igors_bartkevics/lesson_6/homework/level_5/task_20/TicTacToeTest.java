/*
В классе TicTacToe реализуйте
метод для определения является ли данная позиция
победной по вертикалям для указанного игрока.

Метод должен иметь следующую сигнатуру:
public boolean isWinPositionForVerticals(int[][] field, int playerToCheck).

Поле передаётся в этот метод как первый параметр int[][] field.
Знак игрока (0 или 1) передаётся вторым параметром: int playerToCheck.

Метод должет вернуть:
 - true если в одной из вертикалей есть три подряд клетки
   занятые знаком указанного игрока (int playerToCheck),
 - false иначе.

В классе TicTacToeTest написать тесты для разработанного метода.
 */
package student_igors_bartkevics.lesson_6.homework.level_5.task_20;

public class TicTacToeTest {

    public static void main(String[] args) {

        TicTacToeTest test = new TicTacToeTest();
        test.winPositionForHorizontals();
        test.winPositionForVerticals();
    }

    TicTacToe ticTacToe = new TicTacToe();

    public void winPositionForVerticals() {
        int[][] field = {    {1,  1, 0},
                             {0,  1, 0},
                             {1, -1, 0}};
        checkResult(ticTacToe.isWinPositionForVerticals(field, 0), "Win position for verticals");
    }

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
