package student_alexey_tretyakov.lesson_13.homework.level_3.task_10_18;

import org.junit.Test;

import static org.junit.Assert.*;
/*
Правило 1:
Любая живая клетка с меньше чем двумя живыми соседями умирает в следующем поколении.
Правило 2:
Любая живая клетка с больше чем тремя живыми соседями умирает в следующем поколении.
Правило 3:
Любая живая клетка с двумя или тремя живыми соседями остаётся живой в следующем поколении.
Правило 4:
Любая мёртвая клетка с тремя живыми соседями становится живой в следующем поколении.
 */

public class GameOfLifeNextGenerationCalculatorTest {

    GameOfLifeNextGenerationCalculator gameOfLifeNextGenerationCalculator = new GameOfLifeNextGenerationCalculator();
    boolean [][] currentGeneration =
            {{true, false, false, true, false, false, false},
            {false, false, true, false, true, true, false},
            {false, true, false, false, true, true, false},
            {false, false, true, false, false, true, false},
            {false, true, false, false, true, false, true},
            {false, false, true, false, false, true, false}};

    @Test
    public void rule1LessThenTwoLiveAround(){
        boolean[][] testGeneration = gameOfLifeNextGenerationCalculator.calculate( currentGeneration );
        assertTrue(testGeneration[1][2]);
    }
    @Test
    public void rule2MoreThen3LiveAround(){
        boolean[][] testGeneration = gameOfLifeNextGenerationCalculator.calculate( currentGeneration );
        assertFalse(testGeneration[2][5]);
    }
    @Test
    public void rule3MoreThen2OrLess3LiveAround(){
        boolean[][] testGeneration = gameOfLifeNextGenerationCalculator.calculate( currentGeneration );
        assertTrue(testGeneration[2][1]);
    }
    @Test
    public void rule3MoreThen2OrLess3LiveAroundV2(){
        boolean[][] testGeneration = gameOfLifeNextGenerationCalculator.calculate( currentGeneration );
        assertTrue(testGeneration[0][4]);
    }
    @Test
    public void rule3MoreThen2OrLess3LiveAroundV3(){
        boolean[][] testGeneration = gameOfLifeNextGenerationCalculator.calculate( currentGeneration );
        assertTrue(testGeneration[5][6]);
    }
    @Test
    public void rule4MoreThen3LiveAround(){
        boolean[][] testGeneration = gameOfLifeNextGenerationCalculator.calculate( currentGeneration );
        assertTrue(testGeneration[4][2]);
    }


}