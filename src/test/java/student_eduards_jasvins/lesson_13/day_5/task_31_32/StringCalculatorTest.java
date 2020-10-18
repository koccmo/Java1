package student_eduards_jasvins.lesson_13.day_5.task_31_32;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    StringCalculator stringCalculator = new StringCalculator();


    @Test
    public void addZero() {
        int result = stringCalculator.addNumb("");
        assertEquals(0, result);
    }

    @Test
    public void addTwo() {
        int result = stringCalculator.addNumb("2");
        assertEquals(2, result);
    }

    @Test
    public void SumTwo() {
        int result = stringCalculator.addNumb("7,41");
        assertEquals(48, result);
    }


    @Test
    public void addSplit() {
        int result = stringCalculator.addNumb("1\n23,4");
        assertEquals(28, result);
    }

    @Test
    public void addSplitDiffSeparator() {
        int result = stringCalculator.addNumb("//[;][&]\\n13,4");
        assertEquals(17, result);
    }

    @Test
    public void addSplitDiffSeparatorV2() {
        int result = stringCalculator.addNumb("[;][&]\n1;2&3");
        assertEquals(6, result);
    }


    @Test
    public void addSumDigit() {
        int result = stringCalculator.addDigit("2");
        assertEquals(2, result);
    }

    @Test
    public void addSumDigitv2() {
        int result = stringCalculator.addDigit("6");
        assertEquals(6, result);
    }

    @Test
    public void addEmptyDigit() {
        int result = stringCalculator.addDigit("");
        assertEquals(0, result);
    }

    @Test
    public void addDigitSplitDiffSeparator() {
        int result = stringCalculator.addNumb("[;][&]\n1;2&3");
        assertEquals(6, result);
    }
}