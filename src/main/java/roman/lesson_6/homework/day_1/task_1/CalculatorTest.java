package roman.lesson_6.homework.day_1.task_1;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest test = new CalculatorTest();
        test.evenNumberTest();
    }
    Calculator calc = new Calculator();
    public void checkResult (boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println("Test of " + nameOfTest + " OK!");
        } else {
            System.out.println("Test of " + nameOfTest + " False");
        }
    }

    public void evenNumberTest () {
        int number = 6;
        String nameOfTest = "Even number";
        boolean results = calc.isEven(number);
        checkResult(results, nameOfTest);
    }
}
