/*
Создайте в классе TicTacToe метод:

public void printFieldToConsole(int[][] field) {
    // распечатайте поле на консоль в читаемом формате
}
 */
package student_igors_bartkevics.lesson_6.homework.level_6.task_26;

import java.util.Scanner;

public class TicTacToe {

    public void printFieldToConsole(int[][] field) {
        // распечатайте поле на консоль в читаемом формате
        for (int[] rows : field) {
            for (int intValue : rows) {
                System.out.print(intValue + "  ");
            }
            System.out.println("");
        }
    }

    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        // запросите у пользователя с консоли две координаты
        // клетки куда хочет походить игрок
        System.out.println("Enter X coordinate of cell you would like to go in:");
        int x = scanner.nextInt();
        System.out.println("Enter Y coordinate of cell you would like to go in:");
        int y = scanner.nextInt();
        // создайте экземпляр класса Move и передайте ему
        // в конструктор введённые пользователем координаты
        // верните созданный объект Move из метода.
        return new Move(x, y);
    }

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
