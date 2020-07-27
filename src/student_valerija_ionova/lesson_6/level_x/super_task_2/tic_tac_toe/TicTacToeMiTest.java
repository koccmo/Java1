package student_valerija_ionova.lesson_6.level_x.super_task_2.tic_tac_toe;

import java.util.Arrays;

class TicTacToeMiTest {

    public static void main(String[] args){
            TicTacToeMiTest ticTacToeMiTest = new TicTacToeMiTest();

        ticTacToeMiTest.testPerspectiveLineHorizontalTrue2Line();
        ticTacToeMiTest.testPerspectiveLineHorizontalFalse2Line();
        ticTacToeMiTest.testPerspectiveLineHorizontalTrue1Line();
        ticTacToeMiTest.testPerspectiveLineHorizontalFalse1Line();

        ticTacToeMiTest.testPerspectiveLineVerticalFalse1Column();
        ticTacToeMiTest.testPerspectiveLineVerticalFalse2Column();
        ticTacToeMiTest.testPerspectiveLineVerticalTrue1Column();
        ticTacToeMiTest.testPerspectiveLineVerticalTrue2Column();

        ticTacToeMiTest.testIfPartOfDiagonal1True();
        ticTacToeMiTest.testIfPartOfDiagonal1False();
        ticTacToeMiTest.testIfPartOfDiagonal2False();
        ticTacToeMiTest.testIfPartOfDiagonal2True();

        ticTacToeMiTest.testPerspectiveDiagonal1True();
        ticTacToeMiTest.testPerspectiveDiagonal1False();
        ticTacToeMiTest.testPerspectiveDiagonal2True();
        ticTacToeMiTest.testPerspectiveDiagonal2False();

        ticTacToeMiTest.testPerspectiveMoveTrueFirstInLine();
        ticTacToeMiTest.testPerspectiveMoveTrueSecondInLine();
        ticTacToeMiTest.testPerspectiveMoveFalseSecondInLine();

        }

        public void checkBoolean(String name, boolean methodsResult, boolean expectedResult){
            if (methodsResult == expectedResult){
                System.out.println(name+" OK");
            }else{
                System.out.println(name+" FAIL");
            }
        }

    public void checkInt(String name, int methodsResult, int expectedResult){
        if (methodsResult == expectedResult){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

        public void checkArray(String name, int [][] methodsResult, int[][] expectedResult){
            if (Arrays.equals(methodsResult, expectedResult)){
                System.out.println(name+" OK");
            }else{
                System.out.println(name+" FAIL");
            }
        }

    public void testPerspectiveMoveTrueSecondInLine(){
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = {{-1, -1, 1}, {1, 0, -1}, {0, -1, -1}};
        Move move = new Move(2, 2);
        checkBoolean("testPerspectiveMoveTrueSecondInLine", ticTacToe.ifPerspectiveMove(field, move), true);
    }

    public void testPerspectiveMoveTrueFirstInLine(){
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = {{0, -1, -1}, {-1, -1, -1}, {0, -1, -1}};
        Move move = new Move(1, 1);
        checkBoolean("testPerspectiveMoveTrueFirstInLine", ticTacToe.ifPerspectiveMove(field, move), true);
    }

    public void testPerspectiveMoveFalseSecondInLine(){
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = {{0, -1, 1}, {-1, 0, -1}, {-1, -1, -1}};
        Move move = new Move(0, 1);
        checkBoolean("testPerspectiveMoveFalseSecondInLine", ticTacToe.ifPerspectiveMove(field, move), false);
    }

    public void testPerspectiveDiagonal1True(){
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = {{-1, -1, -1}, {1, -1, -1}, {-1, -1, -1}};
        Move move = new Move(2, 2);
        checkBoolean("testPerspectiveDiagonal1True", ticTacToe.perspectiveDiagonal1(field, move), true);
    }

    public void testPerspectiveDiagonal1False(){
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = {{0, -1, -1}, {1, -1, 0}, {-1, -1, 1}};
        Move move = new Move(1, 1);
        checkBoolean("testPerspectiveDiagonal1False", ticTacToe.perspectiveDiagonal1(field, move), false);
    }

    public void testPerspectiveDiagonal2True(){
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = {{-1, -1, 1}, {1, -1, -1}, {-1, -1, -1}};
        Move move = new Move(1, 1);
        checkBoolean("testPerspectiveDiagonal2True", ticTacToe.perspectiveDiagonal2(field, move), true);
    }

    public void testPerspectiveDiagonal2False(){
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = {{-1, 0, -1}, {1, 0, 0}, {-1, -1, -1}};
        Move move = new Move(2, 0);
        checkBoolean("testPerspectiveDiagonal2False", ticTacToe.perspectiveDiagonal2(field, move), false);
    }


    public void testPerspectiveLineHorizontalTrue2Line(){
                TicTacToe ticTacToe = new TicTacToe();
                int [][] field = {{-1, -1, -1}, {1, -1, -1}, {-1, -1, -1}};
                Move move = new Move(1, 1);
                checkBoolean("testPerspectiveLineHorizontalTrue2Line", ticTacToe.perspectiveLineHorizontal(field, move), true);
        }

    public void testPerspectiveLineHorizontalFalse2Line(){
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = {{-1, -1, -1}, {1, -1, 0}, {-1, -1, -1}};
        Move move = new Move(1, 1);
        checkBoolean("testPerspectiveLineHorizontalFalse2Line", ticTacToe.perspectiveLineHorizontal(field, move), false);
    }

    public void testPerspectiveLineHorizontalTrue1Line(){
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = {{-1, -1, -1}, {1, -1, -1}, {-1, -1, -1}};
        Move move = new Move(0, 0);
        checkBoolean("testPerspectiveLineHorizontalTrue1Line", ticTacToe.perspectiveLineHorizontal(field, move), true);
    }

    public void testPerspectiveLineHorizontalFalse1Line(){
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = {{-1, 0, -1}, {1, -1, 0}, {-1, -1, -1}};
        Move move = new Move(0, 0);
        checkBoolean("testPerspectiveLineHorizontalFalse1Line", ticTacToe.perspectiveLineHorizontal(field, move), false);
    }

    public void testIfPartOfDiagonal1True(){
        TicTacToe ticTacToe = new TicTacToe();
        Move move = new Move(0, 0);
        checkInt("testIfPartOfDiagonal1True", ticTacToe.partOfDiagonal(move), 1);
    }

    public void testIfPartOfDiagonal1False(){
        TicTacToe ticTacToe = new TicTacToe();
        Move move = new Move(1, 0);
        checkInt("testIfPartOfDiagonal1False", ticTacToe.partOfDiagonal(move), 3);
    }

    public void testIfPartOfDiagonal2True(){
        TicTacToe ticTacToe = new TicTacToe();
        Move move = new Move(1, 1);
        checkInt("testIfPartOfDiagonal2True", ticTacToe.partOfDiagonal(move), 0);
    }

    public void testIfPartOfDiagonal2False(){
        TicTacToe ticTacToe = new TicTacToe();
        Move move = new Move(0, 1);
        checkInt("testIfPartOfDiagonal2False", ticTacToe.partOfDiagonal(move), 3);
    }

    public void testPerspectiveLineVerticalTrue2Column(){
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = {{-1, -1, -1}, {1, -1, -1}, {-1, -1, -1}};
        Move move = new Move(1, 1);
        checkBoolean("testPerspectiveLineVerticalTrue2Column", ticTacToe.perspectiveLineVertical(field, move), true);
    }

    public void testPerspectiveLineVerticalFalse2Column(){
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = {{-1, 0, -1}, {1, -1, 0}, {-1, -1, -1}};
        Move move = new Move(1, 1);
        checkBoolean("testPerspectiveLineVerticalFalse2Column", ticTacToe.perspectiveLineVertical(field, move), false);
    }

    public void testPerspectiveLineVerticalTrue1Column(){
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = {{-1, 1, -1}, {1, -1, -1}, {-1, -1, -1}};
        Move move = new Move(0, 0);
        checkBoolean("testPerspectiveLineVerticalTrue1Column", ticTacToe.perspectiveLineVertical(field, move), true);
    }

    public void testPerspectiveLineVerticalFalse1Column(){
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = {{-1, 0, -1}, {1, -1, 0}, {0, -1, -1}};
        Move move = new Move(0, 0);
        checkBoolean("testPerspectiveLineVerticalFalse1Column", ticTacToe.perspectiveLineVertical(field, move), false);
    }

}
