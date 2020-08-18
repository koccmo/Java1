package student_aleksandra_maksimovic.lesson_7.level_6.task_10;

import student_aleksandra_maksimovic.testing.Tester;

public class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.elevateTest();
        test.elevateTest2();
        test.elevateTest3();
        test.elevateTest4();
    }

    PowerCalculator powerCalculator = new PowerCalculator();
    Tester tester = new Tester();

    public void elevateTest() {
        int result = powerCalculator.elevate(5,8);
        tester.check((result) == 390625, "Elevate test #1");
    }

    public void elevateTest2() {
        int result = powerCalculator.elevate(0,8);
        tester.check((result) == 0, "Elevate test #2(if number = 0)");
    }

    public void elevateTest3() {
       int result = powerCalculator.elevate(0, 0);
       tester.check((result) == 1, "Elevate test #3(if power = 0)");
    }

    public void elevateTest4() {
        int result = powerCalculator.elevate(5, 1);
        tester.check((result) == 5, "Elevate test #4(if power = 1)");
    }

}
