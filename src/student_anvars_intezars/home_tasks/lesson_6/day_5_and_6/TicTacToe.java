package student_anvars_intezars.home_tasks.lesson_6.day_5_and_6;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < 3; i++) {
            if ((field[i][0] == playerToCheck) && (field[i][1] == playerToCheck) && (field[i][2] == playerToCheck)) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < 3; i++) {
            if ((field[0][i] == playerToCheck) && (field[1][i] == playerToCheck) && (field[2][i] == playerToCheck)) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((field[i][0]) == playerToCheck == (field[1][j] == playerToCheck) && (field[i][2] == playerToCheck) || (field[i][2] == playerToCheck) && (field[1][j] == playerToCheck) && field[i][0] == playerToCheck) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        if (isWinPositionForHorizontals(field, playerToCheck)) {
            return true;
        } else if (isWinPositionForVerticals(field, playerToCheck)) {
            return true;
        } else if (isWinPositionForDiagonals(field, playerToCheck)) {
            return true;
        }
        return false;
    }

    public boolean isFullField(int[][] field) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((field[i][0] != -1) && (field[i][1] != -1 ) && (field[i][2] != -1) && (field[0][j] != -1) && (field[1][j] != -1) && (field[2][j] != -1 )){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isDrawPosition(int[][] field) {
        if(isFullField(field)) {
            if (isWinPosition(field,1));
        }
        return false;
    }

    public int[][] createField() {
        return new int[][]{{-1,-1,-1},{-1,-1,-1},{-1,-1,-1}};
    }

    public Move getNextMove() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two coordinates of squares of the field");
        int x = sc.nextInt();
        int y = sc.nextInt();
        Move move = new Move();
        move.getX();
        move.getY();
        return move;
    }
}


