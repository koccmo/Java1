package roman.lesson_6.homework.day_7.superTask_1.superTask_2;

public class GameBoard {
    public static void main(String[] args) {
        GameBoard board = new GameBoard();
        int[][] field = board.createGameBoard();
        board.printArray(field);
        System.out.println(board.checkBoardFilled());
        System.out.println(board.checkWinInHorizontal(field, 0));
        System.out.println(board.checkWinInDiagonal(field, 1));

    }
    private int[][] field;
    public GameBoard() {this.field = createGameBoard();}

    public boolean checkToDraw(int[][] field) {
        boolean check = checkBoardFilled() & !checkToWin(field, 0) & !checkToWin(field, 1);
        return check;
    }

    public boolean checkToWin(int[][] field, int playerNumber) {
        boolean check = checkWinInHorizontal(field, playerNumber)
                & checkWinInVertical(field, playerNumber)
                & checkWinInDiagonal(field, playerNumber);
        return check;
    }

    public boolean checkWinInDiagonal(int[][] field, int playerNumber){
        boolean check = playerNumber == field[1][1] & ((field[0][0] == field[1][1] & field[1][1] == field[2][2])
                || (field[0][2] == field[1][1] & field[1][1] == field[2][0]));
        return check;
    }

    public boolean checkWinInVertical(int[][] field, int playerNumber) {
        boolean check = false;
        for (int i = 0; i < field.length; i++) {
            if (field[0][i] == field[1][i] & field[1][i] == field[2][i] & field[2][i] == playerNumber) {
                check = true;
                break;
            }
        }
        return check;
    }

    public boolean checkWinInHorizontal(int[][] field, int playerNumber) {
        boolean check = false;
        for (int[] ints : field) {
            if (ints[0] == ints[1] & ints[1] == ints[2] & ints[2] == playerNumber) {
                check = true;
                break;
            }
        }
        return check;
    }

    public int[][] createGameBoard () {
        int[][] field = new int[3][3];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = -1;
            }
        }
        return field;
    }

    public void printArray(int[][] array) {
        for (int[] row : array) {
            for (int intValue : row) {
                System.out.print(intValue + "");
            }
            System.out.println("");
        }
    }

    public boolean checkBoardFilled() {
        boolean check = true;
        for (int[] row : field) {
            for (int intValue : row) {
                if (intValue == -1) {
                    check = false;
                    break;
                }
            }
        }
        return check;
    }

}
