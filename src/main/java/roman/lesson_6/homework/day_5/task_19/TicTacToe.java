package roman.lesson_6.homework.day_5.task_19;

public class TicTacToe {
    public static void main(String[] args) {
        TicTacToe test = new TicTacToe();
        int [][] field = { {1, 1, 0}, {1, 1, 0}, {1, 0, 0} };
        test.printTicTacToeField(field);
        System.out.println(test.isWinPositionForHorizontals(field,1));
        System.out.println("");
        System.out.println(test.isWinPositionForVerticals(field, 1));
        System.out.println("");
        System.out.println(test.isWinPositionForDiagonals(field, 0));
        System.out.println("");
        System.out.println(test.isWinPosition(field, 1));
        System.out.println("");
        System.out.println(test.fieldFilled(field));
        System.out.println("");
        System.out.println(test.isDrawPosition(field));

    }

    public boolean isDrawPosition(int[][] field){
        TicTacToe ticTacToe = new TicTacToe();
        return ticTacToe.fieldFilled(field) && !ticTacToe.isWinPosition(field, 1)
                && !ticTacToe.isWinPosition(field, 0);
    }

    public boolean fieldFilled (int[][] field) {
        boolean result = true;
        for (int[] row : field) {
            for (int valueInt : row) {
                if (valueInt == -1) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        boolean check = false;
        for (int[] i : field) {
            if ((i[0] == i[1]) && (i[1] == i[2]) && (i[2] == playerToCheck)) {
                check = true;
                break;
            }
        }
        return check;
    }
    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        boolean check = false;
        for (int i = 0; i < field[0].length; i++) {
            if ((field[0][i] == field[1][i]) && (field[1][i] == field[2][i]) && (field[2][i] == playerToCheck) ) {
                check = true;
                break;
            }
        }
        return check;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        boolean check = false;
        if ((field[1][1] == playerToCheck) && (field[0][0] == field[1][1]) && (field[1][1] == field[2][2])
        || (field[0][2] == field[1][1]) && (field[1][1] == field[2][0])) {
            check = true;
        }
        return check;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
       TicTacToe ticTacToe = new TicTacToe();
       return ticTacToe.isWinPositionForHorizontals(field, playerToCheck) ||
               ticTacToe.isWinPositionForVerticals(field, playerToCheck) ||
               ticTacToe.isWinPositionForDiagonals(field, playerToCheck);
    }



    public int[][] creatingTicTacToeField(int arrayLengthInRow, int arrayLengthInColumn) {
        return new int[arrayLengthInRow][arrayLengthInColumn];}

    public void printTicTacToeField (int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }
    }


}

