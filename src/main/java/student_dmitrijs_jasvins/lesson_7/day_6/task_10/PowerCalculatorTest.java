package student_dmitrijs_jasvins.lesson_7.day_6.task_10;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();
        powerCalculatorTest.shouldPower();
    }
    public void shouldPower(){
        PowerCalculator powerCalculator = new PowerCalculator();
        int actualResult = powerCalculator.calculate(5,3);
        assertResult("Power Test :", actualResult,125);

    }
    public void assertResult(String name, int actualResult, int expectedResult){
        if(actualResult == expectedResult){
            System.out.println(name + " Test = OK");
        } else {
            System.out.println(name + " Test = FAIL");
        }
    }
}
