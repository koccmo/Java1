package student_roberts_kupcs.lesson_6.homework.level_5;

//Дано поле игры крестики нолики размерностью три на три клетки.
//Поле представлено двумерным массивом целых чисел, где:
//-1 - это пустая клетка,
//0 - это клетка в которую сделал ход первый игрок,
//1 - это клетка в которую сделал ход второй игрок.
//
//Создайте класс TicTacToe и в этом классе реализуйте
//метод для определения является ли данная позиция
//победной по горизонталям для указанного игрока.
//
//Метод должен иметь следующую сигнатуру:
//public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck).
//
//Поле передаётся в этот метод как первый параметр int[][] field.
//Знак игрока (0 или 1) передаётся вторым параметром: int playerToCheck.
//
//Метод должет вернуть:
// - true если в одной из горизонталей есть три подряд клетки
//   занятые знаком указанного игрока (int playerToCheck),
// - false иначе.
//
//Создать класс TicTacToeTest
//и написать тесты для разработанного метода.

class TicTacToe {
    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if ((field[i][0] == playerToCheck) && (field[i][1] == playerToCheck) && (field[i][2] == playerToCheck)) {
                return true;
            }
        }
        return false;
    }

}
