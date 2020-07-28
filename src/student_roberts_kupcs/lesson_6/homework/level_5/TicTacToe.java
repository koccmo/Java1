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

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int j = 0; j < field.length; j++) {
            if ((field[0][j] == playerToCheck) && (field[1][j] == playerToCheck) && (field[2][j] == playerToCheck)) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        if ((field[0][0] == playerToCheck) && (field[1][1] == playerToCheck) && (field[2][2] == playerToCheck)) {
            return true;
        } else if ((field[0][2] == playerToCheck) && (field[1][1] == playerToCheck) && (field[2][0] == playerToCheck)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();  // зачем создавать тут инстанцию?
        if (ticTacToe.isWinPositionForHorizontals(field, playerToCheck)) {
            return true;
        } else if (ticTacToe.isWinPositionForVerticals(field, playerToCheck)) {
            return true;
        } else if (ticTacToe.isWinPositionForDiagonals(field, playerToCheck)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isDrawPosition(int[][] field) {
        TicTacToe ticTacToe = new TicTacToe();  // зачем создавать тут инстанцию?

		// Эту вложенность if + for читать почти не возможно!
        if ((!ticTacToe.isWinPositionForVerticals(field, 1)) && (ticTacToe.isWinPositionForVerticals(field, 0))) {
            if ((!ticTacToe.isWinPositionForHorizontals(field, 1)) && (ticTacToe.isWinPositionForHorizontals(field, 0))) {
                if ((!ticTacToe.isWinPositionForDiagonals(field, 1)) && (ticTacToe.isWinPositionForDiagonals(field, 0))) {
                    for (int i = 0; i < field.length; i++) {
                        for (int j = 0; j < field.length; j++) {
                            if (field[i][j] != -1) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }


}
