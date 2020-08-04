package student_roberts_kupcs.lesson_6.homework.level_5;

class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.testHorizontal();
        ticTacToeTest.testVertical();
        ticTacToeTest.testDiagonal();
        ticTacToeTest.testWinPosition();
        ticTacToeTest.testDrawPosition();
    }

    //task_19
    public void testHorizontal() {
        TicTacToe ticTacToe = new TicTacToe();

        int[][] field = {{1, 0, 0},
                {1, 1, 1},
                {0, 1, 0}};

        if (ticTacToe.isWinPositionForHorizontals(field, 1)) {
            System.out.println("Horizontal test is OK");
        } else {
            System.out.println("Horizontal test is FAIL");
        }
    }

    //task_20
    public void testVertical() {
        TicTacToe ticTacToe = new TicTacToe();

        int[][] field = {{0, 1, 1},
                {0, 1, 0},
                {0, 0, 1}};
        if (ticTacToe.isWinPositionForVerticals(field, 0)) {
            System.out.println("Vertical test is OK");
        } else {
            System.out.println("Vertical test is FAIL");
        }
    }

    //task_21
    public void testDiagonal() {
        TicTacToe ticTacToe = new TicTacToe();

        int[][] field = {{1, 0, 0},
                {1, 0, 0},
                {0, 1, 1}};
        if (ticTacToe.isWinPositionForDiagonals(field, 0)) {
            System.out.println("Diagonal test is OK");
        } else {
            System.out.println("Diagona; test is FAIL");
        }
    }

    //task_22
    public void testWinPosition() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{1, 0, 1}, {0, 1, 0}, {0, 0, 1}};
        if (ticTacToe.isWinPosition(field, 1)) {
            System.out.println("WinPosition test is OK");
        } else {
            System.out.println("WinPosition test is FAIL");
        }
    }

    public void testDrawPosition() {
        TicTacToe ticTacToe = new TicTacToe();

        int[][] field = {{0, 1, 1},
                {1, 0, 0},
                {1, 0, 1}};
        if (ticTacToe.isDrawPosition(field)) {
            System.out.println("Draw Position test is OK");
        } else {
            System.out.println("Draw Position test is FAIL");

        }
    }
}
