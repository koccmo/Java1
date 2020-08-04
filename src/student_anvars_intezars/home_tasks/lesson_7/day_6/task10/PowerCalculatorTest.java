package student_anvars_intezars.home_tasks.lesson_7.day_6.task10;

public class PowerCalculatorTest {

    public static void main(String[] args) {

        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();
        powerCalculatorTest.firstPowerCalculatorTest();
        powerCalculatorTest.secondPowerCalculatorTest();
    }

    public void firstPowerCalculatorTest() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int resultOfRaisingNumberToPower = powerCalculator.raiseNumberToPower(3,3);
        if (resultOfRaisingNumberToPower == 27) {
            System.out.println("First Test of raising number to a power = OK");
        }else {
            System.out.println("First Test of raising number to a power = FAIL");
        }
    }

    public void secondPowerCalculatorTest() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int resultOfRaisingNumberToPower = powerCalculator.raiseNumberToPower(2,10);
        if (resultOfRaisingNumberToPower == 1024) {
            System.out.println();
            System.out.println("Second Test of raising number to a power = OK");
        }else {
            System.out.println("Second Test of raising number to a power = FAIL");
        }
    }
}
