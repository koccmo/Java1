package student_dmitrijs_jasvins.lesson_6.day_5;

import java.util.Scanner;

class TicTacToe {
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

    public boolean isWinningPosition(int[][] field, int playerToCheck) {
        return isWinPositionForHorizontals(field, playerToCheck)
                || isWinPositionForVerticals(field, playerToCheck)
                || isWinPositionForDiagonals(field, playerToCheck);
    }

    public boolean isDrawPosition(int[][] field) {
        return !hasEmptyField(field)
                && !isWinningPosition(field, 0)
                && !isWinningPosition(field, 1);
    }

    public boolean hasEmptyField(int[][] field) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[i][j] == -1) {
                    return true;
                }
            }
        }
        return false;
    }

    public int[][] createField() {
        return new int[][]{
                {-1, -1, -1},
                {-1, -1, -1},
                {-1, -1, -1}
        };
    }

    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X coordinate: ");
        int x = scanner.nextInt();
        System.out.println("Enter Y coordinate: ");
        int y = scanner.nextInt();
        return new Move(x, y);
    }

    public void printFieldToConsole(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == 0) {
                    System.out.print("X");
                } else if (field[i][j] == 1) {
                    System.out.print("O");
                } else {
                    System.out.print("??");
                }
            }
            System.out.println();
        }
        System.out.println("----------------");
    }

    public void play() {
        int[][] field = createField();
        while(true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
            if (isWinningPosition(field, 0)) {
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
            if (isWinningPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.play();
    }
}
