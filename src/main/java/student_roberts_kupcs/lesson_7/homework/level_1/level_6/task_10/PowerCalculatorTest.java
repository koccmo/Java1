package student_roberts_kupcs.lesson_7.homework.level_1.level_6.task_10;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();
        powerCalculatorTest.test1();
    }

    public void test1() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int testResult = powerCalculator.numberPower(2, 3);

        if (testResult == 8) {
            System.out.println("Test 1 = OK");
        } else {
            System.out.println("Test 1 = FAIL");
        }
    }

}
