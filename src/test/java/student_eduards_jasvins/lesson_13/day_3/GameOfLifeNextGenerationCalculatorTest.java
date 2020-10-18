package student_eduards_jasvins.lesson_13.day_3;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameOfLifeNextGenerationCalculatorTest {

    GameOfLifeNextGenerationCalculator gameOfLifeNextGenerationCalculator = new GameOfLifeNextGenerationCalculator();

    boolean[][] currentGeneration = {{true, false, false, true, false, false, false},
                                     {false, false, true, false, true, true, false},
                                     {false, true, false, false, true, true, false},
                                     {false, false, true, false, false, true, false},
                                     {false, true, false, false, true, false, true},
                                     {false, false, true, false, false, true, false}};

    @Test
    public void rule1LessThanTwoLive () {
        boolean[] [] current = gameOfLifeNextGenerationCalculator.calculate(currentGeneration);
        assertFalse(current[1][2]);
    }

    @Test
    public void rule2MoreThanThreeLive () {
        boolean[] [] current = gameOfLifeNextGenerationCalculator.calculate(currentGeneration);
        assertTrue(current[2][5]);
    }

    @Test
    public void rule3MoreThanTwoOrLessThreeLive () {
        boolean[] [] current = gameOfLifeNextGenerationCalculator.calculate(currentGeneration);
        assertFalse(current[2][1]);
    }

    @Test
    public void rule4MoreThanThreeLive () {
        boolean[] [] current = gameOfLifeNextGenerationCalculator.calculate(currentGeneration);
        assertTrue(current[4][2]);
    }

}