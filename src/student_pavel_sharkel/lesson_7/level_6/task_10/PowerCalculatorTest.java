package student_pavel_sharkel.lesson_7.level_6.task_10;

class PowerCalculatorTest {

    public static void main(String[] args) {

        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();
        powerCalculatorTest.powerTest();

    }
        void powerTest() {
            PowerCalculator powerCalculator = new PowerCalculator();

            if (powerCalculator.intoPower(4, 3) == 64) {
                System.out.println("PowerCalculator test is OK");
            } else {
                System.out.println("PowerCalculator test is FAILED");
            }
        }

}
