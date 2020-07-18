/*
Создать простой искуственный интеллект (компьютерного игрока)
для игры в крестики нолики из day_5 и day_6.
Искусственный интеллект можно реализовать
так, что он будет выбирать рандомную пустую клетку
и ходить в неё. А можно научить компьютер распознавать
выигрышные комбинации в один ход и выигрывать, а
так же защищаться от проигрыша в один ход если это
возможно.
 */
package student_igors_bartkevics.lesson_6.homework.level_x.super_task_2;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

    public void play() {
        int[][] field = createField();
        printFieldToConsole(field);
        while(true) {
            //printFieldToConsole(field);
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

            //printFieldToConsole(field);
            //Move move1 = getAINextRandomMove(field);
            Move move1 = nextMoveOfAI(field);
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

    public void printFieldToConsole(int[][] field) {
        // распечатайте поле на консоль в читаемом формате
        for (int[] rows : field) {
            for (int intValue : rows) {
                System.out.print(intValue + "  ");
            }
            System.out.print("\n");
        }
    }

    public Move getAINextRandomMove(int[][] field) {
        Random random = new Random();
        int row;
        int column;
        if (!isFieldFilled(field)) {
            do {
                row = random.nextInt(3);
                column = random.nextInt(3);
            } while (field[row][column] != -1);
            return new Move(row, column);
        }
        else {
            System.out.println("Field is filled");
            return new Move(0, 0);
        }
    }

    public Move nextMoveOfAI(int[][] field) {
        Move move = getAINextRandomMove(field);
        if (isHorizontalChanceToWin(field,1)) {
            move = moveForHorizontalWin(field,1);
        }
        else if (isVerticalChanceToWin(field, 1)) {
            move = moveForVerticalWin(field, 1);
        }
        else if (isDiagonal_1_ChanceToWin(field,1)) {
            move = moveForDiagonal_1_Win(field,1);
        }
        else if (isDiagonal_2_ChanceToWin(field,1)) {
            move = moveForDiagonal_2_Win(field,1);
        }
        else if (isVerticalChanceToWin(field, 0)) {
            move = moveForVerticalBlock(field);
        }
        else if (isHorizontalChanceToWin(field,0)) {
            move = moveForHorizontalBlock(field);
        }
        else if (isDiagonal_1_ChanceToWin(field,0)){
            move = moveForDiagonal_1_Block(field);
        }
        else if (isDiagonal_2_ChanceToWin(field, 0)){
            move = moveForDiagonal_2_Block(field);
        }
        return move;
    }



    public Move moveForDiagonal_1_Block(int [][] field) {
        Move move = getAINextRandomMove(field);

        if ((field[0][0] == field[1][1]) && (field[1][1] == 0) && (field[2][2] == -1)) {
            move = new Move(2, 2);
        }
        else if ((field[0][0] == field[2][2]) && (field[2][2] == 0) && (field[1][1] == -1)) {
            move = new Move(1, 1);
        }
        else if ((field[1][1] == field[2][2]) && (field[2][2] == 0) && (field[0][0] == -1)) {
            move = new Move(0, 0);
        }

        return move;
    }

    public Move moveForDiagonal_2_Block(int [][] field) {
        Move move = getAINextRandomMove(field);

        if ((field[0][2] == field[1][1]) && (field[1][1] == 0) && (field[2][0] == -1)) {
            move = new Move(2, 0);
        }
        else if ((field[0][2] == field[2][0]) && (field[2][0] == 0) && (field[1][1] == -1)) {
            move = new Move(1, 1);
        }
        else if ((field[1][1] == field[2][0]) && (field[2][0] == 0) && (field[0][2] == -1)) {
            move = new Move(0, 2);
        }

        return move;
    }

    public Move moveForVerticalBlock(int [][] field) {
        Move move = getAINextRandomMove(field);
        for (int j = 0; j < field[0].length; j++) {
            if ((field[0][j] == field[1][j]) && (field[1][j] == 0) && (field[2][j] == -1)) {
                move = new Move(2, j);
                break;
            }
            if ((field[1][j] == field[2][j]) && (field[2][j] == 0) && (field[0][j] == -1)) {
                move = new Move(0, j);
                break;
            }
            if ((field[0][j] == field[2][j]) && (field[2][j] == 0) && (field[1][j] == -1)) {
                move = new Move(1, j);
                break;
            }
        }
        return move;
    }

    public Move moveForHorizontalBlock(int [][] field) {
        Move move = getAINextRandomMove(field);
        for (int i = 0; i < field[0].length; i++) {
            if ((field[i][0] == field[i][1]) && (field[i][1] == 0) && (field[i][2] == -1)) {
                move = new Move(i, 2);
                break;
            }
            if ((field[i][1] == field[i][2]) && (field[i][2] == 0) && (field[i][0] == -1)) {
                move = new Move(i, 0);
                break;
            }
            if ((field[i][0] == field[i][2]) && (field[i][2] == 0) && (field[i][1] == -1)) {
                move = new Move(i, 1);
                break;
            }
        }
        return move;
    }

    public Move moveForDiagonal_1_Win(int [][] field, int player) {
        Move move = getAINextRandomMove(field);

        if ((field[0][0] == field[1][1]) && (field[1][1] == player) && (field[2][2] == -1)) {
            move = new Move(2, 2);
        }
        else if ((field[0][0] == field[2][2]) && (field[2][2] == player) && (field[1][1] == -1)) {
            move = new Move(1, 1);
        }
        else if ((field[1][1] == field[2][2]) && (field[2][2] == player) && (field[0][0] == -1)) {
            move = new Move(0, 0);
        }

        return move;
    }

    public Move moveForDiagonal_2_Win(int [][] field, int player) {
        Move move = getAINextRandomMove(field);

        if ((field[0][2] == field[1][1]) && (field[1][1] == player) && (field[2][0] == -1)) {
            move = new Move(2, 0);
        }
        else if ((field[0][2] == field[2][0]) && (field[2][0] == player) && (field[1][1] == -1)) {
            move = new Move(1, 1);
        }
        else if ((field[1][1] == field[2][0]) && (field[2][0] == player) && (field[0][2] == -1)) {
            move = new Move(0, 2);
        }

        return move;
    }

    public Move moveForVerticalWin(int [][] field, int player) {
        Move move = getAINextRandomMove(field);
        for (int j = 0; j < field[0].length; j++) {
            if ((field[0][j] == field[1][j]) && (field[1][j] == player) && (field[2][j] == -1)) {
                move = new Move(2, j);
                break;
            }
            if ((field[1][j] == field[2][j]) && (field[2][j] == player) && (field[0][j] == -1)) {
                move = new Move(0, j);
                break;
            }
            if ((field[0][j] == field[2][j]) && (field[2][j] == player) && (field[1][j] == -1)) {
                move = new Move(1, j);
                break;
            }
        }
        return move;
    }

    public Move moveForHorizontalWin(int [][] field, int player) {
        Move move = getAINextRandomMove(field);
        for (int i = 0; i < field[0].length; i++) {
            if ((field[i][0] == field[i][1]) && (field[i][1] == player) && (field[i][2] == -1)) {
                move = new Move(i, 2);
                break;
            }
            if ((field[i][1] == field[i][2]) && (field[i][2] == player) && (field[i][0] == -1)) {
                move = new Move(i, 0);
                break;
            }
            if ((field[i][0] == field[i][2]) && (field[i][2] == player) && (field[i][1] == -1)) {
                move = new Move(i, 1);
                break;
            }
        }
        return move;
    }

    /*
    public boolean isChanceToWin(int [][] field, int playerToCheck) {
        boolean result = false;
        if ((isVerticalChanceToWin(field, playerToCheck)) ||
            isHorizontalChanceToWin(field,playerToCheck) ||
                isDiagonal_1_ChanceToWin(field,playerToCheck) ||
                isDiagonal_2_ChanceToWin(field, playerToCheck)){
            result = true;
        }
        return result;
    }
     */

    public boolean isDiagonal_1_ChanceToWin(int [][] field, int playerToCheck) {
        boolean result = false;
        if (((field[0][0] == field[1][1]) && (field[1][1] == playerToCheck) && (field[2][2] == -1)) ||
                ((field[0][0] == field[2][2]) && (field[2][2] == playerToCheck) && (field[1][1] == -1)) ||
                ((field[1][1] == field[2][2]) && (field[2][2] == playerToCheck) && (field[0][0] == -1))) {
            result = true;
        }
        return result;
    }

    public boolean isDiagonal_2_ChanceToWin(int [][] field, int playerToCheck) {
        boolean result = false;
        if (((field[0][2] == field[1][1]) && (field[1][1] == playerToCheck) && (field[2][0] == -1)) ||
                ((field[0][2] == field[2][0]) && (field[2][0] == playerToCheck) && (field[1][1] == -1)) ||
                ((field[1][1] == field[2][0]) && (field[2][0] == playerToCheck) && (field[0][2] == -1))) {
            result = true;
        }
        return result;
    }

    public boolean isVerticalChanceToWin(int [][] field, int playerToCheck) {
        boolean result = false;
        for (int j = 0; j < field[0].length; j++) {
            if ( ((field[0][j] == field[1][j]) && (field[1][j] == playerToCheck) && (field[2][j] == -1)) ||
               ((field[1][j] == field[2][j]) && (field[2][j] == playerToCheck) && (field[0][j] == -1)) ||
                    ((field[0][j] == field[2][j]) && (field[2][j] == playerToCheck) && (field[1][j] == -1)) ) {
                result = true;
                break;
            }
        }
        return result;
    }

    public boolean isHorizontalChanceToWin(int [][] field, int playerToCheck) {
        boolean result = false;
        for (int i = 0; i < field.length; i++) {
            if ( ((field[i][0] == field[i][1]) && (field[i][1] == playerToCheck) && (field[i][2] == -1)) ||
                    ((field[i][1] == field[i][2]) && (field[i][2] == playerToCheck) && (field[i][0] == -1)) ||
                    ((field[i][0] == field[i][2]) && (field[i][2] == playerToCheck) && (field[i][1] == -1)) ) {
                result = true;
                break;
            }
        }
        return result;
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
