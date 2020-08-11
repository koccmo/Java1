package student_eduards_jasvins.lesson_7.day_6.task_10;

public class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();
        powerCalculatorTest.testPowerCalc();
        powerCalculatorTest.testPowerCalc2();
        powerCalculatorTest.testPowerCalc3();
    }

    public void checkInt(String name, int methodsResult, int expectedResult) {
        if (methodsResult == expectedResult) {
            System.out.println(name + "Test OK");
        } else {
            System.out.println(name + "Test FAIL");
        }
    }

    public void testPowerCalc() {
        PowerCalculator powerCalculator = new PowerCalculator();
        checkInt("Power is 3, number 2 = ", powerCalculator.powerCalculator(3, 2), 8);
    }

    public void testPowerCalc2() {
        PowerCalculator powerCalculator = new PowerCalculator();
        checkInt("Power is 6, number 2 = ", powerCalculator.powerCalculator(6, 2), 64);
    }

    public void testPowerCalc3() {
        PowerCalculator powerCalculator = new PowerCalculator();
        checkInt("Power is 5, number 4 = ", powerCalculator.powerCalculator(5, 4), 1024);
    }
}



