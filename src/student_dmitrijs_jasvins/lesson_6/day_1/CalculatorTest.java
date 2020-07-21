package student_dmitrijs_jasvins.lesson_6.day_1;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.numberIsEven();
    }

        public void numberIsEven () {
        Calculator calculator = new Calculator();
            if (calculator.isEven(6)){
                System.out.println("Test = OK");
            } else {
                System.out.println("Test = FAIL");
            }
        }
    }

