package student_igors_bartkevics.lesson_8.homework.level_x.super_task_2;

class MathOperationTest {

    public static void main(String[] args) {
        MathOperationTest test = new MathOperationTest();
        test.argumentCalculateTest();
        test.additionCalculateTest();
        test.subtractionCalculateTest();
        test.multiplicationCalculateTest();
        test.divisionCalculateTest();
    }

    public void argumentCalculateTest() {
        Argument argument = new Argument(5);
        checkResult(argument.calculate() == 5.0, "Argument calculate");
    }

    public void additionCalculateTest() {
        MathOperation addition = new Addition(new Argument(5), new Argument(10));
        checkResult(addition.calculate() == 15.0, "Addition calculate");
    }

    public void subtractionCalculateTest() {
        MathOperation subtraction = new Subtraction(new Argument(10), new Argument(5));
        checkResult(subtraction.calculate() == 5.0, "Subtraction calculate");
    }

    public void multiplicationCalculateTest() {
        MathOperation multiplication = new Multiplication(new Argument(10), new Argument(5));
        checkResult(multiplication.calculate() == 50.0, "Multiplication calculate");
    }

    public void divisionCalculateTest() {
        MathOperation division = new Division(new Argument(10), new Argument(5));
        checkResult(division.calculate() == 2.0, "Division calculate");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
}
