package student_valerija_ionova.lesson_13.level_3_junior;

import org.junit.Test;

import static org.junit.Assert.*;
//Task11 Правило 1: Любая живая клетка с меньше чем двумя живыми соседями умирает в следующем поколении.
//Правило 2: Любая живая клетка с больше чем тремя живыми соседями умирает в следующем поколении.

public class GameOfLifeNextGenerationCalculatorTest {

    GameOfLifeNextGenerationCalculator gameOfLifeNextGenerationCalculator = new GameOfLifeNextGenerationCalculator();

    boolean[][] currentGeneration = {{false, true, false, true, false},
                                     {false, false, false,true, false},
                                     {true, true, false, false, false},
                                     {true, true, false, false, false},
                                     {false, true, false, true, false}};

    @Test
    public void rule1FalseIfLessThanTwoAroundAreAlive1(){
        boolean [][] newGenerationField;
        newGenerationField = gameOfLifeNextGenerationCalculator.calculate(currentGeneration);
        assertEquals(false, newGenerationField[1][3]);
    }

    @Test
    public void rule1FalseIfLessThanTwoAroundAreAlive0(){
        boolean [][] newGenerationField;
        newGenerationField = gameOfLifeNextGenerationCalculator.calculate(currentGeneration);
        assertEquals(false, newGenerationField[4][3]);
    }

    @Test
    public void rule2FalseIfMoreThanThreeAroundAreAlive4(){
        boolean [][] newGenerationField;;
        newGenerationField = gameOfLifeNextGenerationCalculator.calculate(currentGeneration);
        assertEquals(false, newGenerationField[3][0]);
    }



}