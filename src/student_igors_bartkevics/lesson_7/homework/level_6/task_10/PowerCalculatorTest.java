package student_igors_bartkevics.lesson_7.homework.level_6.task_10;

public class PowerCalculatorTest {

    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.positiveBasePositiveExponentTest();
        test.positiveBaseNegativeExponentTest();
        test.positiveBaseZeroExponentTest();
        test.negativeBasePositiveExponentTest();
        test.negativeBaseNegativeExponentTest();
        test.negativeBaseZeroExponentTest();
        test.zeroBaseZeroExponentTest();
    }

    PowerCalculator calculator = new PowerCalculator();


    public void positiveBasePositiveExponentTest() {
        boolean condition = (calculator.exponentiation(2, 4) == 16.0);
        checkResult(condition, "Positive base and positive exponent");
    }

    public void positiveBaseNegativeExponentTest() {
        boolean condition = (calculator.exponentiation(2, -4) == 0.0625);
        checkResult(condition, "Positive base and negative exponent");
    }

    public void positiveBaseZeroExponentTest() {
        boolean condition = (calculator.exponentiation(2, 0) == 1.0);
        checkResult(condition, "Positive base and zero exponent");
    }

    public void negativeBasePositiveExponentTest() {
        boolean condition = (calculator.exponentiation(-2, 3) == -8.0);
        checkResult(condition, "Negative base and positive exponent");
    }

    public void negativeBaseNegativeExponentTest() {
        boolean condition = (calculator.exponentiation(-2, -3) == -0.125);
        checkResult(condition, "Negative base and negative exponent");
    }

    public void negativeBaseZeroExponentTest() {
        boolean condition = (calculator.exponentiation(-2, 0) == 1.0);
        checkResult(condition, "Negative base and zero exponent");
    }

    public void zeroBaseZeroExponentTest() {
        boolean condition = (calculator.exponentiation(0, 0) == 1.0);
        checkResult(condition, "Zero base and zero exponent");
    }


    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
}
