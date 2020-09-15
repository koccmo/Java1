package student_jaroslav_brutan.lesson_6.day_5;

import java.util.Scanner;

public class TicTacToe {

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < 3; i++) {
            if (field[i][0] == playerToCheck && field[i][1] == playerToCheck && field[i][2] == playerToCheck) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < 3; i++) {
            if (field[0][i] == playerToCheck && field[1][i] == playerToCheck && field[2][i] == playerToCheck) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        if (field[0][0] == playerToCheck && field[1][1] == playerToCheck && field[2][2] == playerToCheck) {
            return true;
        }
        if (field[2][0] == playerToCheck && field[1][1] == playerToCheck && field[0][2] == playerToCheck) {
            return true;
        }
        return false;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return (isWinPositionForVerticals(field, playerToCheck)) ||
                (isWinPositionForHorizontals(field, playerToCheck)) ||
                (isWinPositionForDiagonals(field, playerToCheck));
    }

    public boolean isFullField(int[][] field) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                if (field[i][j] != -1) {
                    return true;
                }
        }
        return false;
    }

    public boolean isDrawPosition(int[][] field) {
        if (isFullField(field)) {
            if (isWinPosition(field, 10)) ;
        }
        return false;
    }

    public int[][] createField() {
        int[][] playingField = new int[3][3];
        for (int i = 0; i < playingField.length; i++) {
            for (int j = 0; j < playingField.length; j++) {
                playingField[i][j] = -1;
            }
        } return playingField;
    }

    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x coordinate to know your field cell ");
        int x = scanner.nextInt();
        System.out.println("Enter y coordinate to know your field cell");
        int y = scanner.nextInt();
        Move move = new Move(x,y);
        return move;
    }

    public void printFieldToConsole(int[][] field){

    }
}
