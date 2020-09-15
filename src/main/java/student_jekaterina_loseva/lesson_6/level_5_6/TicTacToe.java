package student_jekaterina_loseva.lesson_6.level_5_6;

import java.util.Scanner;

public class TicTacToe {

    /*----------------- Task 19 -------------------------*/
    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int[] value : field) {
            if (value[0] == playerToCheck && value[1] == playerToCheck &&
                    value[2] == playerToCheck) {
                return true;
            }
        }
        return false;
    }

    /*----------------- Task 20 -------------------------*/
    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (field[0][i] == playerToCheck && field[1][i] == playerToCheck &&
                    field[2][i] == playerToCheck) {
                return true;
            }
        }
        return false;
    }

    /*----------------------- Task 21 -------------------------*/
    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        return (field[0][0] == playerToCheck && field[1][1] == playerToCheck &&
                field[2][2] == playerToCheck) ||
                (field[2][0] == playerToCheck && field[1][1] == playerToCheck &&
                        field[0][2] == playerToCheck);
    }

    /*----------------------- Task 22 -------------------------*/
    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return isWinPositionForHorizontals(field, playerToCheck) ||
                isWinPositionForVerticals(field, playerToCheck) ||
                        isWinPositionForDiagonals(field, playerToCheck);

    }

    /*----------------------- Task 23 -------------------------*/
    public boolean isDrawPosition(int[][] field) {
        return !isWinPosition(field, 0) && (!isWinPosition(field, 1)) &&
                !fieldCheck(field);
    }

    public boolean fieldCheck(int[][] field) {
        for (int[] value : field) {
            for (int j = 0; j < field.length; j++) {
                if (value[j] == -1) {
                    return true;
                }
            }
        }
        return false;
    }

    /*----------------------- Task 24 -------------------------*/
    public int[][] createField() {
        return new int[][] {
            {-1, -1, -1},
            {-1, -1, -1},
            {-1, -1, -1}
        };
    }

    /*----------------------- Task 25 -------------------------*/
    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter 2 coordinates from 0 to 2: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        Move move = new Move(x, y);
        move.getX();
        move.getY();
        return move;
    }

    /*----------------------- Task 26 -------------------------*/
    public void printFieldToConsole(int[][] field) {
        for (int[] value : field) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(value[j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /*----------------------- Task 27 -------------------------*/
    public void play() {
        int[][] field = createField();
        while(true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isWinPosition(field, 1)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);
            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;
            printFieldToConsole(field);
            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isWinPosition(field, 0)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

}
