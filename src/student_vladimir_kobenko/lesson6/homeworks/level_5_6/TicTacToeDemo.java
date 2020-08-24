package student_vladimir_kobenko.lesson6.homeworks.level_5_6;
import java.util.Scanner;
public class TicTacToeDemo {

public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {

  for (int y = 0; y < field.length; y++) {

                    int[] row = field[y];

                    boolean win = true;


                    for (int x = 0; x < row.length; x++) {
                        int cell = row[x];
                        if (cell != playerToCheck) {
                            win = false;
                            break;
                        }
                    }

                    if (win) {
                        return true;
                    }
                }
                return false;
            }

            public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {

                for (int x = 0; x < field.length; x++) {

                    boolean win = true;
                    for (int y = 0; y < field.length; y++) {
                        int cell = field[y][x];
                        if (cell != playerToCheck) {
                            win = false;
                            break;
                        }
                    }
                    if (win) {
                        return true;
                    }
                }

                return false;
            }
            public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {

                boolean win = true;

                for (int i = 0; i < field.length; i++) {

                    int cell = field[i][i];
                    if (cell != playerToCheck) {
                        win = false;
                        break;
                    }
                }
                if (win) {
                    return true;
                }

                win = true;

                for (int i = 0; i < field.length; i++) {

                    int cell = field[i][field.length - i - 1];
                    if (cell != playerToCheck) {
                        win = false;
                        break;
                    }
                }
                return win;
            }
            public boolean isWinPosition(int[][] field, int playerToCheck) {
                boolean win = (isWinPositionForHorizontals(field, playerToCheck) || isWinPositionForVerticals(field, playerToCheck) || isWinPositionForDiagonals(field, playerToCheck));
                return win;
            }

            public boolean isFullField (int[][] field) {
                for (int y = 0; y < field.length; y++) {
                    for (int x = 0; x < field.length; x++) {
                        if (field[y][x] == -1) {
                            return false;
                        }
                    }
                }
                return true;
            }

            public boolean isDrawPosition(int[][] field) {
                if(!isFullField(field)) {
                    return false;
                }
                else {
                    return (!isWinPosition(field,0) && !isWinPosition(field,1));
                }
            }

            public int[][] createField() {
                int[][] field = new int[3][3];
                for (int y = 0; y < field.length; y++) {
                    for (int x = 0; x < field.length; x++) {
                        field[y][x] = -1;
                    }
                }
                return field;
            }

            public Move getNextMove() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter X coordinate of cell you would like to go in:");
                int x = scanner.nextInt();
                System.out.println("Enter Y coordinate of cell you would like to go in:");
                int y = scanner.nextInt();
                return new Move(x, y);
            }
            public void printFieldToConsole(int[][] field) {

                for (int y = 0; y < field.length; y++) {

                    for (int x = 0; x < field.length; x++) {

                        switch (field[y][x]) {
                            case -1:
                                System.out.print(" ");
                                break;

                            case 0:
                                System.out.print("X");
                                break;

                            case 1:
                                System.out.print("O");
                                break;
                        }

                        if (x < field.length - 1) {
                            System.out.print("|");
                        }
                    }

                    System.out.println();
                    if (y < field.length - 1) {
                        System.out.println("-----");
                    }
                }
            }

            public void play() {
                int[][] field = createField();
                printFieldToConsole(field);
                while(true) {
                    Move move0 = getNextMove();
                    field[move0.getY()][move0.getX()] = 0;
                    printFieldToConsole(field);
                    if (isWinPosition(field, 0)) {
                        System.out.println("Player X WIN!");
                        break;
                    }
                    if (isDrawPosition(field)) {
                        System.out.println("DRAW!");
                        break;
                    }
                    Move move1 = getNextMove();
                    field[move1.getY()][move1.getX()] = 1;
                    printFieldToConsole(field);
                    if (isWinPosition(field, 1)) {
                        System.out.println("Player O WIN!");
                        break;
                    }
                    if (isDrawPosition(field)) {
                        System.out.println("DRAW!");
                        break;
                    }
                }
            }

        }
