package student_aleksandra_maksimovic.lesson_13.level_3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameOfLifeNextGenerationCalculatorTest {

    GameOfLifeNextGenerationCalculator calculator;

    @Before
    public void init() {
        calculator = new GameOfLifeNextGenerationCalculator();
    }

    @Test
    public void test_1() {
        var field = new Field(new boolean[][] {
                { false, false, false },
                { false, false, false },
                { false, false, false }
        });

        var result = calculator.calculate(field);

        assertFalse(result.getCell(1, 1));
    }

    @Test
    public void test_2() {
        var field = new Field(new boolean[][] {
                { false, false, false },
                { false, true, false },
                { false, false, false }
        });

        var result = calculator.calculate(field);

        assertFalse(result.getCell(1, 1));
    }

    @Test
    public void test_3() {
        var field = new Field(new boolean[][] {
                { true, false, false },
                { false, true, false },
                { false, false, false }
        });

        var result = calculator.calculate(field);

        assertFalse(result.getCell(1, 1));
    }

    @Test
    public void test_4() {
        var field = new Field(new boolean[][] {
                { true, true, false },
                { false, true, false },
                { false, false, false }
        });

        var result = calculator.calculate(field);

        assertTrue(result.getCell(1, 1));
    }

    @Test
    public void test_5() {
        var field = new Field(new boolean[][] {
                { true, true, true },
                { false, true, false },
                { false, false, false }
        });

        var result = calculator.calculate(field);

        assertTrue(result.getCell(1, 1));
    }

    @Test
    public void test_6() {
        var field = new Field(new boolean[][] {
                { true, true, true },
                { true, true, false },
                { false, false, false }
        });

        var result = calculator.calculate(field);

        assertFalse(result.getCell(1, 1));
    }

    @Test
    public void test_7() {
        var field = new Field(new boolean[][] {
                { true, true, true },
                { true, true, true },
                { false, false, false }
        });

        var result = calculator.calculate(field);

        assertFalse(result.getCell(1, 1));
    }

    @Test
    public void test_8() {
        var field = new Field(new boolean[][] {
                { true, true, true },
                { true, true, true },
                { true, false, false }
        });

        var result = calculator.calculate(field);

        assertFalse(result.getCell(1, 1));
    }

    @Test
    public void test_9() {
        var field = new Field(new boolean[][] {
                { true, true, true },
                { true, true, true },
                { true, true, false }
        });

        var result = calculator.calculate(field);

        assertFalse(result.getCell(1, 1));
    }

    @Test
    public void test_10() {
        var field = new Field(new boolean[][] {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        });

        var result = calculator.calculate(field);

        assertFalse(result.getCell(1, 1));
    }

    @Test
    public void test_11() {
        var field = new Field(new boolean[][] {
                { true, false, false },
                { false, false, false },
                { false, false, false }
        });

        var result = calculator.calculate(field);

        assertFalse(result.getCell(1, 1));
    }

    @Test
    public void test_12() {
        var field = new Field(new boolean[][] {
                { true, true, false },
                { false, false, false },
                { false, false, false }
        });

        var result = calculator.calculate(field);

        assertFalse(result.getCell(1, 1));
    }

    @Test
    public void test_13() {
        var field = new Field(new boolean[][] {
                { true, true, true },
                { false, false, false },
                { false, false, false }
        });

        var result = calculator.calculate(field);

        assertTrue(result.getCell(1, 1));
    }

    @Test
    public void test_14() {
        var field = new Field(new boolean[][] {
                { true, true, true },
                { true, false, false },
                { false, false, false }
        });

        var result = calculator.calculate(field);

        assertFalse(result.getCell(1, 1));
    }

    @Test
    public void test_15() {
        var field = new Field(new boolean[][] {
                { true, true, true },
                { true, false, true },
                { false, false, false }
        });

        var result = calculator.calculate(field);

        assertFalse(result.getCell(1, 1));
    }

    @Test
    public void test_16() {
        var field = new Field(new boolean[][] {
                { true, true, true },
                { true, false, true },
                { true, false, false }
        });

        var result = calculator.calculate(field);

        assertFalse(result.getCell(1, 1));
    }

    @Test
    public void test_17() {
        var field = new Field(new boolean[][] {
                { true, true, true },
                { true, false, true },
                { true, true, false }
        });

        var result = calculator.calculate(field);

        assertFalse(result.getCell(1, 1));
    }

    @Test
    public void test_18() {
        var field = new Field(new boolean[][] {
                { true, true, true },
                { true, false, true },
                { true, true, true }
        });

        var result = calculator.calculate(field);

        assertFalse(result.getCell(1, 1));
    }


}