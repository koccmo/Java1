package student_valerija_ionova.lesson_9.level_x.super_task_1.v_1;

public class FourInRowTest {

    public static void main(String [] args){

        FourInRowTest test = new FourInRowTest();

        test.testCoordinatesNotInFieldFalse();
        test.testCoordinatesNotInFieldTrue();

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

    void testCoordinatesNotInFieldFalse(){
        FourInRow fourInRow = new FourInRow();

        checkResult("testCoordinatesNotInField", fourInRow.coordinatesNotInField(1) == false);
    }

    void testCoordinatesNotInFieldTrue(){
        FourInRow fourInRow = new FourInRow();

        checkResult("testCoordinatesNotInFieldTrue", fourInRow.coordinatesNotInField(7) == true);
    }

    void testWinHorizontalFalse(){
        int[][] field = {{0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 3, 3, 3, 0, 0, 0},
                {0, 0, 0, 3, 3, 0, 0},
                {0, 0, 3, 0, 0, 0, 0},
                {0, 0, 3, 8, 8, 8, 8}};

        FourInRow fourInRow = new FourInRow();
        checkResult("testWinHorizontalFalse", fourInRow.winHorizontal(field, 3) == false);
    }

    void testWinHorizontalTrue(){
        int[][] field = {{0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 3, 3, 3, 0, 0, 0},
                {0, 0, 0, 3, 3, 0, 0},
                {0, 0, 3, 0, 0, 0, 0},
                {0, 0, 3, 8, 8, 8, 8}};

        FourInRow fourInRow = new FourInRow();
        checkResult("testWinHorizontalTrue", fourInRow.winHorizontal(field, 8) == true);
    }

    void testWinHorizontalTrue2(){
        int[][] field = {{0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 3, 3, 3, 0, 0, 0},
                {0, 0, 0, 3, 3, 0, 0},
                {0, 0, 3, 0, 0, 0, 0},
                {0, 0, 8, 8, 8, 8, 0}};

        FourInRow fourInRow = new FourInRow();
        checkResult("testWinHorizontalTrue2", fourInRow.winHorizontal(field, 8) == true);
    }

    void testWinVerticalTrue(){
        int[][] field = {{3, 0, 0, 0, 0, 0, 0},
                {3, 0, 0, 0, 0, 0, 0},
                {3, 3, 3, 3, 0, 0, 0},
                {3, 0, 0, 3, 3, 0, 0},
                {0, 0, 3, 0, 0, 0, 0},
                {0, 0, 8, 8, 8, 8, 0}};

        FourInRow fourInRow = new FourInRow();
        checkResult("testWinVerticalTrue", fourInRow.winVertical(field, 3) == true);
    }

    void testWinVerticalFalse(){
        int[][] field = {{3, 0, 0, 0, 0, 0, 0},
                {3, 0, 0, 0, 0, 0, 0},
                {8, 3, 3, 8, 0, 0, 0},
                {3, 0, 0, 3, 3, 0, 0},
                {0, 0, 3, 0, 0, 0, 0},
                {0, 0, 8, 8, 8, 8, 0}};

        FourInRow fourInRow = new FourInRow();
        checkResult("testWinVerticalFalse", fourInRow.winVertical(field, 3) == false);
    }

    void testWinDiagonal1True(){
        int[][] field = {{8, 0, 0, 0, 0, 3, 0},
                {0, 3, 0, 0, 0, 0, 0},
                {0, 0, 3, 0, 0, 0, 0},
                {0, 0, 0, 3, 0, 8, 0},
                {0, 0, 8, 0, 3, 0, 0},
                {0, 3, 0, 0, 0, 0, 0}};

        FourInRow fourInRow = new FourInRow();
        checkResult("testWinDiagonal1True", fourInRow.winDiagonal1(field, 3) == true);
    }

    void testWinDiagonal1False(){
        int[][] field = {{8, 0, 0, 0, 0, 3, 0},
                {0, 3, 0, 0, 0, 0, 0},
                {0, 0, 8, 0, 0, 0, 0},
                {0, 0, 0, 3, 0, 8, 0},
                {0, 0, 8, 0, 3, 0, 0},
                {0, 3, 0, 0, 0, 8, 0}};

        FourInRow fourInRow = new FourInRow();
        checkResult("testWinDiagonal1False", fourInRow.winDiagonal1(field, 3) == false);
    }

    void testWinDiagonal2False(){
        int[][] field = {{8, 0, 0, 0, 0, 3, 0},
                {0, 3, 0, 0, 0, 0, 0},
                {0, 0, 8, 0, 0, 0, 0},
                {0, 0, 0, 3, 0, 8, 0},
                {0, 0, 8, 0, 3, 0, 0},
                {0, 3, 0, 0, 0, 8, 0}};

        FourInRow fourInRow = new FourInRow();
        checkResult("testWinDiagonal2False", fourInRow.winDiagonal2(field, 3) == false);
    }

    void testWinDiagonal2True(){
        int[][] field = {{8, 0, 0, 0, 0, 3, 0},
                {0, 3, 0, 0, 0, 0, 0},
                {0, 0, 8, 0, 3, 0, 0},
                {0, 0, 0, 3, 0, 8, 0},
                {0, 0, 3, 0, 3, 0, 0},
                {0, 3, 0, 0, 0, 8, 0}};

        FourInRow fourInRow = new FourInRow();
        checkResult("testWinDiagonal2True", fourInRow.winDiagonal2(field, 3) == true);
    }

}
