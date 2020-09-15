package student_valerija_ionova.lesson_9.level_x.super_task_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FourInRowTest {

    public static void main(String [] args){

        FourInRowTest test = new FourInRowTest();


        test.testWinHorizontalFalse();
        test.testWinHorizontalTrue();
        test.testWinHorizontalTrue2();

        test.testWinVerticalTrue();
        test.testWinVerticalFalse();

        test.testWinDiagonal1True();
        test.testWinDiagonal1False();

        test.testWinDiagonal2False();
        test.testWinDiagonal2True();

    }

    void checkResult(String name, boolean testResult){
        if (testResult){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    void testWinHorizontalFalse(){
        Field board = new Field();
        int[][] field = {{0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 3, 3, 3, 0, 0, 0},
                {0, 0, 0, 3, 3, 0, 0},
                {0, 0, 3, 0, 0, 0, 0},
                {0, 0, 3, 8, 8, 8, 8}};
        board.setField(field);

        checkResult("testWinHorizontalFalse", !board.win(3));
    }

    void testWinHorizontalTrue(){
        Field board = new Field();

        int[][] field = {{0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 3, 3, 3, 0, 0, 0},
                {0, 0, 0, 3, 3, 0, 0},
                {0, 0, 3, 0, 0, 0, 0},
                {0, 0, 3, 8, 8, 8, 8}};
        board.setField(field);
        checkResult("testWinHorizontalTrue", board.win(8));
    }

    void testWinHorizontalTrue2(){

        Field board = new Field();

        int[][] field = {{0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 3, 3, 3, 0, 0, 0},
                {0, 0, 0, 3, 3, 0, 0},
                {0, 0, 3, 0, 0, 0, 0},
                {0, 0, 8, 8, 8, 8, 0}};
        board.setField(field);
        checkResult("testWinHorizontalTrue2", board.win(8));
    }

    void testWinVerticalTrue(){

        Field board = new Field();

        int[][] field = {{3, 0, 0, 0, 0, 0, 0},
                {3, 0, 0, 0, 0, 0, 0},
                {3, 3, 3, 3, 0, 0, 0},
                {3, 0, 0, 3, 3, 0, 0},
                {0, 0, 3, 0, 0, 0, 0},
                {0, 0, 8, 8, 8, 8, 0}};
        board.setField(field);
        checkResult("testWinVerticalTrue", board.win(3));
    }

    void testWinVerticalFalse(){

        Field board = new Field();

        int[][] field = {{3, 0, 0, 0, 0, 0, 0},
                {3, 0, 0, 0, 0, 0, 0},
                {8, 3, 3, 8, 0, 0, 0},
                {3, 0, 0, 3, 3, 0, 0},
                {0, 0, 3, 0, 0, 0, 0},
                {0, 0, 8, 8, 8, 8, 0}};
        board.setField(field);
        checkResult("testWinVerticalFalse", !board.win(3));
    }

    void testWinDiagonal1True(){

        Field board = new Field();

        int[][] field = {{8, 0, 0, 0, 0, 3, 0},
                {0, 3, 0, 0, 0, 0, 0},
                {0, 0, 3, 0, 0, 0, 0},
                {0, 0, 0, 3, 0, 8, 0},
                {0, 0, 8, 0, 3, 0, 0},
                {0, 3, 0, 0, 0, 0, 0}};
        board.setField(field);
        checkResult("testWinDiagonal1True", board.win(3));
    }

    void testWinDiagonal1False(){

        Field board = new Field();

        int[][] field = {{8, 0, 0, 0, 0, 3, 0},
                {0, 3, 0, 0, 0, 0, 0},
                {0, 0, 8, 0, 0, 0, 0},
                {0, 0, 0, 3, 0, 8, 0},
                {0, 0, 8, 0, 3, 0, 0},
                {0, 3, 0, 0, 0, 8, 0}};
        board.setField(field);
        checkResult("testWinDiagonal1False", !board.win(3));
    }

    void testWinDiagonal2False(){

        Field board = new Field();

        int[][] field = {{8, 0, 0, 0, 0, 3, 0},
                {0, 3, 0, 0, 0, 0, 0},
                {0, 0, 8, 0, 0, 0, 0},
                {0, 0, 0, 3, 0, 8, 0},
                {0, 0, 8, 0, 3, 0, 0},
                {0, 3, 0, 0, 0, 8, 0}};
        board.setField(field);
        checkResult("testWinDiagonal2False", !board.win(3));
    }

    void testWinDiagonal2True(){

        Field board = new Field();

        int[][] field = {{8, 0, 0, 0, 0, 3, 0},
                {0, 3, 0, 0, 0, 0, 0},
                {0, 0, 8, 0, 3, 0, 0},
                {0, 0, 0, 3, 0, 8, 0},
                {0, 0, 3, 0, 3, 0, 0},
                {0, 3, 0, 0, 0, 8, 0}};
        board.setField(field);
        checkResult("testWinDiagonal2True", board.win( 3));
    }

}
