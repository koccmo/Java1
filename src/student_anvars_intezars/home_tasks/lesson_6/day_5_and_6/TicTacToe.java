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
        Move move = new Move(x,y);
        return move;
    }

    public void printFieldToConsole(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

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
            if (isDrawPosition(field)) {
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
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }
}



