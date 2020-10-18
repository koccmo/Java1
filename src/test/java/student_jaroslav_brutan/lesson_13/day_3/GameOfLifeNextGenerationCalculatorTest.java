package student_jaroslav_brutan.lesson_13.day_3;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameOfLifeNextGenerationCalculatorTest {

    GameOfLifeNextGenerationCalculator gameOfLifeNextGenerationCalculator = new GameOfLifeNextGenerationCalculator();
    boolean[][] currentGeneration =
            {{true, false, true, false, true},
                    {false, false, true, false, true},
                    {true, true, false, true, false},
                    {false, false, false, true, false},
                    {false, true, true, false, false},
                    {false, false, true, true, false}
            };

    @Test
    public void rule1LessThenTwoLiveAround() {
        boolean[][] testGeneration = gameOfLifeNextGenerationCalculator.calculate(currentGeneration);
        assertTrue(testGeneration[1][2]);
    }


    @Test
    public void rule2MoreThenThreeLiveAround() {
        boolean[][] testGeneration = gameOfLifeNextGenerationCalculator.calculate(currentGeneration);
        assertFalse(testGeneration[2][4]);
    }

    /*@Test
    public void rule3MoreThan20Less3LiveAround(){
        boolean[][] testGeneration = gameOfLifeNextGenerationCalculator.calculate(currentGeneration);
        assertTrue(testGeneration[0][4]);
    }*/

    @Test
    public void rule4MoreThen3LiveAround(){
        boolean[][] testGeneration = gameOfLifeNextGenerationCalculator.calculate(currentGeneration);
        assertTrue(testGeneration[4][2]);
    }
}