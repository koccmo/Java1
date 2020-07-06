package student_roberts_kupcs.lesson_4.homework.level_4;

class CalculatorTest {
    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();

        calculatorTest.subtractionTest();

        calculatorTest.multiplicationTest();

        calculatorTest.divisionTest();
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        if (result == 15) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subtractionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.subtraction(firstNumber, secondNumber);
        if (result == 5) {
            System.out.println("Subtraction test = OK");
        } else {
            System.out.println("Subtraction test = FAIL");
        }
    }

    public void multiplicationTest() {
        int firstNumber = 5;
        int secondNumber = 4;
        Calculator calculator = new Calculator();
        int result = calculator.multiplication(firstNumber, secondNumber);
        if (result == 20) {
            System.out.println("Multiplication test = OK");
        } else {
            System.out.println("Multiplication test = FAIL");
        }
    }

    public void divisionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.division(firstNumber, secondNumber);
        if (result == 2) {
            System.out.println("Division test = OK");
        } else {
            System.out.println("Division test = FAIL");
        }
    }
}
