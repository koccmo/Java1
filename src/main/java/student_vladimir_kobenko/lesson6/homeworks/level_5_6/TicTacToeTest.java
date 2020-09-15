package student_vladimir_kobenko.lesson6.homeworks.level_5_6;

public class TicTacToeTest {

           public static void main(String[] args) {
            TicTacToeTest ticTacToeTest = new TicTacToeTest();

            ticTacToeTest.isWinPositionForHorizontal_EmptyField_Test();
            ticTacToeTest.isWinPositionForHorizontal_win1_Test();
            ticTacToeTest.isWinPositionForHorizontal_win2_Test();
            ticTacToeTest.isWinPositionForVertical_EmptyField_Test();
            ticTacToeTest.isWinPositionForVerticals_win1_Test();
            ticTacToeTest.isWinPositionForVerticals_win2_Test();
            ticTacToeTest.isWinPositionForDiagonals_EmptyField_Test();
            ticTacToeTest.isWinPositionForDiagonals_Diagonal1_Win_Test();
            ticTacToeTest.isWinPositionForDiagonals_Diagonal2_Win_Test();
            ticTacToeTest.isWinPosition_Test_True();
            ticTacToeTest.isWinPosition_Test_False();
            ticTacToeTest.isDrawPosition_Test_True();
            ticTacToeTest.isDrawPosition_Test_EmptyFields();
            ticTacToeTest.isDrawPosition_Test_False();
            ticTacToeTest.createField_Test();
            System.out.println("TicTacToeTest : finished");
        }

        private TicTacToe ticTacToe;
        public TicTacToeTest() {
            this.ticTacToe = new TicTacToe();
        }

        public void isWinPositionForHorizontal_EmptyField_Test() {

            int[][] field = {{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
            boolean win;
            win = ticTacToe.isWinPositionForHorizontals(field, 1);
            if (win) {
                System.out.println("isWinPositionForHorizontal_EmptyField_Test : FAILED");
            }
        }

        public void isWinPositionForHorizontal_win1_Test() {

            int[][] field = {{-1, -1, -1}, {1, 1, 1}, {-1, -1, -1}};
            boolean win;
            win = ticTacToe.isWinPositionForHorizontals(field, 1);
            if (!win) {
                System.out.println("isWinPositionForHorizontal_win1 : FAILED");

            }
        }

        public void isWinPositionForHorizontal_win2_Test() {

            int[][] field = {{0, 0, 0}, {-1, -1, -1}, {-1, -1, -1}};
            boolean win;
            win = ticTacToe.isWinPositionForHorizontals(field, 0);
            if (!win) {
                System.out.println("isWinPositionForHorizontal_win2 : FAILED");

            }
        }

        public void  isWinPositionForVertical_EmptyField_Test() {

            int[][] field = {{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
            boolean win;
            win = ticTacToe.isWinPositionForVerticals(field, 0);
            if (win) {
                System.out.println("isWinPositionForVertical_EmptyField : FAILED");
            }
        }

        public void isWinPositionForVerticals_win1_Test() {

            int[][] field = {{-1, 0, -1}, {-1, 0, -1}, {-1, 0, -1}};
            boolean win;
            win = ticTacToe.isWinPositionForVerticals(field, 0);
            if (!win) {
                System.out.println("isWinPositionForVertical_win1_Test : FAILED");
            }
        }

        public void isWinPositionForVerticals_win2_Test() {

            int[][] field = {{-1, -1, 1}, {-1, -1, 1}, {-1, -1, 1}};
            boolean win;
            win = ticTacToe.isWinPositionForVerticals(field, 1);
            if (!win) {
                System.out.println("isWinPositionForVertical_win2_Test : FAILED");
            }
        }

        public void isWinPositionForDiagonals_EmptyField_Test() {

            int[][] field = {{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
            boolean win;
            win = ticTacToe.isWinPositionForDiagonals(field, 0);
            if (win) {
                System.out.println("isWinPositionForDiagonals_EmptyField_Test : FAILED");
            }
        }

        public void isWinPositionForDiagonals_Diagonal1_Win_Test() {

            int[][] field = {{ 1, -1, -1}, {-1,  1, -1}, {-1, -1,  1}};
            boolean win;
            win = ticTacToe.isWinPositionForDiagonals(field, 1);
            if (!win) {
                System.out.println("isWinPositionForDiagonals_Diagonal1_Win_Test : FAILED");
            }
        }

        public void isWinPositionForDiagonals_Diagonal2_Win_Test() {

            int[][] field = {{-1, -1,  1}, {-1,  1, -1}, { 1, -1, -1}};
            boolean win;
            win = ticTacToe.isWinPositionForDiagonals(field, 1);
            if (!win) {
                System.out.println("isWinPositionForDiagonals_Diagonal2_Win_Test : FAILED");
            }
        }

        public void isWinPosition_Test_True() {
            int[][] field = {{-1, 1, -1}, {-1, 1, -1}, {-1, 1, -1},};
            boolean win;
            win = ticTacToe.isWinPosition(field, 1);
            if (!win) {
                System.out.println("isWinPosition_Test_True : FAILED");
            }

        }
        public void isWinPosition_Test_False() {
            int[][] field = {{-1, 1, -1}, {-1, 1, -1}, {-1, 1, -1},};
            boolean win;
            win = ticTacToe.isWinPosition(field, 0);
            if (win) {
                System.out.println("isWinPosition_Test_False : FAILED");
            }

        }
        public void isDrawPosition_Test_True() {
            int[][] field = {{0, 0, 1},{1, 1, 0}, {0, 0, 1}};
            boolean draw;
            draw = ticTacToe.isDrawPosition(field);
            if(!draw) {
                System.out.println("isDrawPosition_Test_True : FAILED");
            }
        }
        public void isDrawPosition_Test_EmptyFields() {
            int[][] field = {{0, 0, -1},{1, -1, 0}, {0, 0, 1}};
            boolean draw;
            draw = ticTacToe.isDrawPosition(field);
            if(draw) {
                System.out.println("isDrawPosition_Test_EmptyFields : FAILED");
            }
        }
        public void isDrawPosition_Test_False() {
            int[][] field = {{0, 0, 0},{1, -1, 0}, {0, 0, 1}};
            boolean draw;
            draw = ticTacToe.isDrawPosition(field);
            if(draw) {
                System.out.println("isDrawPosition_Test_False : FAILED");
            }
        }
        public void createField_Test () {
            int[][] field = ticTacToe.createField();
            if(field.length != 3) {
                System.out.println("createField_Test : FAILED");
            }
        }
    }
