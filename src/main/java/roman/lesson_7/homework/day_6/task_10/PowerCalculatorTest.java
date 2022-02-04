package roman.lesson_7.homework.day_6.task_10;

import java.util.Objects;

public class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.baseNumberPositiveDegreePositive();
        test.baseNumberNegativeDegreeNegative();
        test.baseNumberPositiveDegreeNegative();
        test.baseNumberNegativeDegreePositive();
        test.baseNumberZeroDegreePositive();
    }

    PowerCalculator check = new PowerCalculator();

    public void checkResult(boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println(nameOfTest + "Test is OK!");
        } else System.out.println(nameOfTest + "Test is Fail");
    }

    public void baseNumberPositiveDegreePositive() {
        double baseNumber = 2;
        int degree = 2;
        double expectedAnswer = 4;
        String nameOfTest = "BaseNumber - Positive, Degree - Positive ";
        checkResult(Objects.equals(check.numberExponentiation(baseNumber, degree), expectedAnswer),
                nameOfTest);
    }

    public void baseNumberNegativeDegreeNegative() {
        double baseNumber = -2;
        int degree = -2;
        double expectedAnswer = 0.25;
        String nameOfTest = "BaseNumber - Negative, Degree - Positive ";
        checkResult(check.numberExponentiation(baseNumber, degree) == 0.25, nameOfTest);
    }

    public void baseNumberNegativeDegreePositive() {
        double baseNumber = -2;
        int degree = 2;
        double expectedAnswer = 4;
        String nameOfTest = "BaseNumber - Negative, Degree - Positive ";
        checkResult(Objects.equals(check.numberExponentiation(baseNumber, degree), expectedAnswer),
                nameOfTest);
    }

    public void baseNumberPositiveDegreeNegative() {
        double baseNumber = 2;
        int degree = -2;
        double expectedAnswer = 0.25;
        String nameOfTest = "BaseNumber - Positive, Degree - Negative ";
        checkResult(Objects.equals(check.numberExponentiation(baseNumber, degree), expectedAnswer),
                nameOfTest);
    }

    public void baseNumberZeroDegreePositive() {
        double baseNumber = 0;
        int degree = 2;
        double expectedAnswer = 0;
        String nameOfTest = "BaseNumber - Zero, Degree - Positive ";
        checkResult(Objects.equals(check.numberExponentiation(baseNumber, degree), expectedAnswer),
                nameOfTest);
    }

}
