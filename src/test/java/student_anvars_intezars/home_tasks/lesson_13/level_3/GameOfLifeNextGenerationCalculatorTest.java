package student_anvars_intezars.home_tasks.lesson_13.level_3;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameOfLifeNextGenerationCalculatorTest {

    @Test
    public void ifOneCellWithTwoNeighbourCellsDiesTest() {
        GameOfLifeNextGenerationCalculator gameOfLifeNextGenerationCalculator = new GameOfLifeNextGenerationCalculator();
        boolean[][] newArray = new boolean[10][10];
        newArray[0][0] = true;
        newArray[0][1] = true;
        newArray[0][2] = true;

        newArray[1][0] = false;
        newArray[1][1] = true;
        newArray[1][2] = false;

        newArray[2][0] = false;
        newArray[2][1] = true;
        newArray[2][2] = false;

        newArray[3][0] = false;
        newArray[3][1] = true;
        newArray[3][2] = false;

        newArray[4][0] = false;
        newArray[4][1] = true;
        newArray[4][2] = false;

        newArray[5][0] = false;
        newArray[5][1] = true;
        newArray[5][2] = false;

        newArray[6][0] = false;
        newArray[6][1] = true;
        newArray[6][2] = false;

        newArray[7][0] = false;
        newArray[7][1] = true;
        newArray[7][2] = false;

        newArray[8][0] = false;
        newArray[8][1] = true;
        newArray[8][2] = false;

        newArray[9][0] = false;
        newArray[9][1] = true;
        newArray[9][2] = false;

       //boolean[][] result = gameOfLifeNextGenerationCalculator.isOneCellHavingTwoLiveNeighbours(array);
        //assertTrue(String.valueOf(result),true);
    }



}