package student_aleksandra_maksimovic.lesson_4.level_x.task_3;

import student_aleksandra_maksimovic.testing.Tester;

public class CalculatorTest {
    public static void main(String[] args) {
        Tester tester = new Tester();

        Calculator calculator = new Calculator();

        tester.check(calculator.sum(35, 40) == 75, "Sum test");
        tester.check(calculator.sub(35, 15) == 20, "Sub test");
        tester.check(calculator.mul(5, 5) == 25, "Mul test");
        tester.check(calculator.div(40, 8) == 5, "Div test");
        tester.check(calculator.isEven(40), "Even test");
        tester.checkFalse(calculator.isEven(33), "Odd test");
    }

}