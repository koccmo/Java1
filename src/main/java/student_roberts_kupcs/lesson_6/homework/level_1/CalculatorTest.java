package student_roberts_kupcs.lesson_6.homework.level_1;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.isEvenFalse();
        calculatorTest.isEvenTrue();
    }

    public void isEvenFalse() {
        Calculator calculator = new Calculator();

        if (!calculator.isEven(9)) {
            System.out.println("Test is EvenFalse TRUE");
        } else {
            System.out.println("Test isEvenFalse FALSE");
        }
    }

    public void isEvenTrue() {
        Calculator calculator = new Calculator();

        if (calculator.isEven(10)) {
            System.out.println("Test is EvenTrue TRUE");
        } else {
            System.out.println("Test isEvenTrue FALSE");
        }
    }
}
