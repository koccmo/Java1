package student_igors_bartkevics.lesson_13.homework.level_3_junior;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameOfLifeNextGenerationCalculatorTest {

    GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();

    //Правило 1:
    //Любая живая клетка с меньше чем двумя живыми соседями умирает в следующем поколении.
    @Test
    public void shouldReturnDeadCellAccordingToRule1() {
        boolean[][] field = new boolean[10][10];
        field[2][2] = true; //cell
        field[1][2] = true; //neighbour
        boolean[][]nextGenerationField = calculator.calculate(field);

        assertFalse(nextGenerationField[2][2]);
    }

    @Test
    public void shouldReturnLiveCellAccordingToRule1() {
        boolean[][] field = new boolean[10][10];
        field[2][2] = true; //cell
        field[1][2] = true; //neighbour
        field[1][1] = true; //neighbour
        boolean[][]nextGenerationField = calculator.calculate(field);

        assertTrue(nextGenerationField[2][2]);
    }

    @Test
    public void shouldReturnLiveCellAccordingToRule1MilestonePosition() {
        boolean[][] field = new boolean[10][10];
        field[0][0] = true; //cell
        field[1][0] = true; //neighbour
        field[1][1] = true; //neighbour
        boolean[][]nextGenerationField = calculator.calculate(field);

        assertTrue(nextGenerationField[0][0]);
    }

    @Test
    public void shouldReturnDeadCellAccordingToRule1MilestonePosition00() {
        boolean[][] field = new boolean[10][10];
        field[0][0] = true; //cell
        field[1][1] = true; //neighbour
        boolean[][] nextGenerationField = calculator.calculate(field);

        assertFalse(nextGenerationField[0][0]);
    }

    @Test
    public void shouldReturnLiveCellAccordingToRule1MilestonePosition00() {
        boolean[][] field = new boolean[10][10];
        field[0][0] = true; //cell
        field[1][1] = true; //neighbour
        field[0][1] = true; //neighbour
        boolean[][] nextGenerationField = calculator.calculate(field);

        assertTrue(nextGenerationField[0][0]);
    }

    @Test
    public void shouldReturnDeadCellAccordingToRule1MilestonePosition99() {
        boolean[][] field = new boolean[10][10];
        field[9][9] = true; //cell
        field[8][8] = true; //neighbour
        boolean[][] nextGenerationField = calculator.calculate(field);

        assertFalse(nextGenerationField[9][9]);
    }

    @Test
    public void shouldReturnLiveCellAccordingToRule1MilestonePosition99() {
        boolean[][] field = new boolean[10][10];
        field[9][9] = true; //cell
        field[8][8] = true; //neighbour
        field[9][8] = true; //neighbour
        boolean[][] nextGenerationField = calculator.calculate(field);

        assertTrue(nextGenerationField[9][9]);
    }

    //Правило 2:
    //Любая живая клетка с больше чем тремя живыми соседями умирает в следующем поколении.
    @Test
    public void shouldReturnDeadCellAccordingToRule2() {
        boolean[][] field = new boolean[10][10];
        field[2][2] = true; //cell
        field[1][1] = true; //neighbour
        field[1][2] = true; //neighbour
        field[1][3] = true; //neighbour
        field[3][1] = true; //neighbour
        boolean[][]nextGenerationField = calculator.calculate(field);

        assertFalse(nextGenerationField[2][2]);
    }
}