package student_valerija_ionova.lesson_9.level_x.super_task_1;

class FourInRowTest {

    public static void main(String [] args){

        FourInRowTest test = new FourInRowTest();

        /*test.testCoordinatesNotInFieldFalse();
        test.testCoordinatesNotInFieldTrue();

        test.testWinHorizontalFalse();
        test.testWinHorizontalTrue();
        test.testWinHorizontalTrue2();

        test.testWinVerticalTrue();
        test.testWinVerticalFalse();

        test.testWinDiagonal1True();
        test.testWinDiagonal1False();

        test.testWinDiagonal2False();
        test.testWinDiagonal2True();*/

    }

    void checkResult(String name, boolean testResult){
        if (testResult){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    /*void testCoordinatesNotInFieldFalse(){
        PlayersMove fourInRow = new PlayersMove();

        checkResult("testCoordinatesNotInField", !fourInRow.coordinatesNotInField(1));
    }

    void testCoordinatesNotInFieldTrue(){
        PlayersMove fourInRow = new PlayersMove();

        checkResult("testCoordinatesNotInFieldTrue", fourInRow.coordinatesNotInField(7));
    }*/

    /*void testWinHorizontalFalse(){
        VictoryConditions victoryConditions = new VictoryConditions();
        int[][] field = {{0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 3, 3, 3, 0, 0, 0},
                {0, 0, 0, 3, 3, 0, 0},
                {0, 0, 3, 0, 0, 0, 0},
                {0, 0, 3, 8, 8, 8, 8}};


        checkResult("testWinHorizontalFalse", !victoryConditions.winHorizontal(field, 3));
    }

    void testWinHorizontalTrue(){
        VictoryConditions victoryConditions = new VictoryConditions();

        int[][] field = {{0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 3, 3, 3, 0, 0, 0},
                {0, 0, 0, 3, 3, 0, 0},
                {0, 0, 3, 0, 0, 0, 0},
                {0, 0, 3, 8, 8, 8, 8}};

        checkResult("testWinHorizontalTrue", victoryConditions.winHorizontal(field, 8));
    }

    void testWinHorizontalTrue2(){

        VictoryConditions victoryConditions = new VictoryConditions();

        int[][] field = {{0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 3, 3, 3, 0, 0, 0},
                {0, 0, 0, 3, 3, 0, 0},
                {0, 0, 3, 0, 0, 0, 0},
                {0, 0, 8, 8, 8, 8, 0}};

        checkResult("testWinHorizontalTrue2", victoryConditions.winHorizontal(field, 8));
    }

    void testWinVerticalTrue(){

        VictoryConditions victoryConditions = new VictoryConditions();

        int[][] field = {{3, 0, 0, 0, 0, 0, 0},
                {3, 0, 0, 0, 0, 0, 0},
                {3, 3, 3, 3, 0, 0, 0},
                {3, 0, 0, 3, 3, 0, 0},
                {0, 0, 3, 0, 0, 0, 0},
                {0, 0, 8, 8, 8, 8, 0}};

        checkResult("testWinVerticalTrue", victoryConditions.winVertical(field, 3));
    }

    void testWinVerticalFalse(){

        VictoryConditions victoryConditions = new VictoryConditions();

        int[][] field = {{3, 0, 0, 0, 0, 0, 0},
                {3, 0, 0, 0, 0, 0, 0},
                {8, 3, 3, 8, 0, 0, 0},
                {3, 0, 0, 3, 3, 0, 0},
                {0, 0, 3, 0, 0, 0, 0},
                {0, 0, 8, 8, 8, 8, 0}};

        checkResult("testWinVerticalFalse", !victoryConditions.winVertical(field, 3));
    }

    void testWinDiagonal1True(){

        VictoryConditions victoryConditions = new VictoryConditions();

        int[][] field = {{8, 0, 0, 0, 0, 3, 0},
                {0, 3, 0, 0, 0, 0, 0},
                {0, 0, 3, 0, 0, 0, 0},
                {0, 0, 0, 3, 0, 8, 0},
                {0, 0, 8, 0, 3, 0, 0},
                {0, 3, 0, 0, 0, 0, 0}};

        checkResult("testWinDiagonal1True", victoryConditions.winDiagonal1(field, 3));
    }

    void testWinDiagonal1False(){

        VictoryConditions victoryConditions = new VictoryConditions();

        int[][] field = {{8, 0, 0, 0, 0, 3, 0},
                {0, 3, 0, 0, 0, 0, 0},
                {0, 0, 8, 0, 0, 0, 0},
                {0, 0, 0, 3, 0, 8, 0},
                {0, 0, 8, 0, 3, 0, 0},
                {0, 3, 0, 0, 0, 8, 0}};

        checkResult("testWinDiagonal1False", !victoryConditions.winDiagonal1(field, 3));
    }

    void testWinDiagonal2False(){

        VictoryConditions victoryConditions = new VictoryConditions();

        int[][] field = {{8, 0, 0, 0, 0, 3, 0},
                {0, 3, 0, 0, 0, 0, 0},
                {0, 0, 8, 0, 0, 0, 0},
                {0, 0, 0, 3, 0, 8, 0},
                {0, 0, 8, 0, 3, 0, 0},
                {0, 3, 0, 0, 0, 8, 0}};

        checkResult("testWinDiagonal2False", !victoryConditions.winDiagonal2(field, 3));
    }

    void testWinDiagonal2True(){

        VictoryConditions victoryConditions = new VictoryConditions();

        int[][] field = {{8, 0, 0, 0, 0, 3, 0},
                {0, 3, 0, 0, 0, 0, 0},
                {0, 0, 8, 0, 3, 0, 0},
                {0, 0, 0, 3, 0, 8, 0},
                {0, 0, 3, 0, 3, 0, 0},
                {0, 3, 0, 0, 0, 8, 0}};

        checkResult("testWinDiagonal2True", victoryConditions.winDiagonal2(field, 3));
    }*/

}
