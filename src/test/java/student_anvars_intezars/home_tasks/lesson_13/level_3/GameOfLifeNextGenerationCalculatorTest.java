package student_anvars_intezars.home_tasks.lesson_13.level_3;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameOfLifeNextGenerationCalculatorTest {

    @Test
    public void ifOneCellWithTwoNeighbourCellsDiesTest() {
        GameOfLifeNextGenerationCalculator gameOfLifeNextGenerationCalculator = new GameOfLifeNextGenerationCalculator();
        boolean[][] newArray = new boolean[3][3];
        newArray[0][0] = true;
        newArray[0][1] = true;
        newArray[0][2] = true;

        newArray[1][0] = false;
        newArray[1][1] = true;
        newArray[1][2] = false;

        newArray[2][0] = false;
        newArray[2][1] = true;
        newArray[2][2] = false;
        boolean[][] result = gameOfLifeNextGenerationCalculator.calculate(newArray);
        assertTrue(String.valueOf(result),false);
    }



}