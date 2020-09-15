package student_eduards_jasvins.lesson_6.day_5_6;

public class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.isWinPositionHorizontal();
        ticTacToeTest.isWinPositionVertical();
        ticTacToeTest.isWinPositionDiagonals();
        ticTacToeTest.isWinPosition();
        ticTacToeTest.isDrawPosition();


    }

    private void isWinPositionHorizontal() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {
                {1, 0, 1},
                {1, 1, 1},
                {0, 1, 0}
        };
        boolean winPosition = ticTacToe.isWinPosition(field, 1);
        if(winPosition) {
            System.out.println("Test = OK");
        }else {
            System.out.println("Test = FAIL");
        }
    }

    private void isWinPositionVertical() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {
                {1, 0, 1},
                {1, 0, 0},
                {0, 0, 0}
        };
        boolean winPosition = ticTacToe.isWinPosition(field, 0);
        if(winPosition) {
            System.out.println("Test = OK");
        }else {
            System.out.println("Test = FAIL");
        }
    }

    private void isWinPositionDiagonals() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {
                {1, 0, 1},
                {1, 1, 0},
                {0, 0, 1}
        };
        boolean winPosition = ticTacToe.isWinPosition(field, 1);
        if(winPosition) {
            System.out.println("Test = OK");
        }else {
            System.out.println("Test = FAIL");
        }
    }

    private void isWinPosition() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {
                {1, 1, 1},
                {0, 0, 1},
                {1, 1, 0}
        };
        boolean winPosition = ticTacToe.isWinPosition(field, 1);
        if(winPosition) {
            System.out.println("Test = OK");
        }else {
            System.out.println("Test = FAIL");
        }
    }

    private void isDrawPosition() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {
                {1, 0, 0},
                {0, 0, 1},
                {1, 1, 0}
        };
        boolean drawPosition = ticTacToe.isDrawPosition(field);
        if(drawPosition) {
            System.out.println("Test = OK");
        }else {
            System.out.println("Test = FAIL");
        }
    }
}
