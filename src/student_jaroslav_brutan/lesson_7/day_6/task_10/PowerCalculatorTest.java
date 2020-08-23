package student_jaroslav_brutan.lesson_7.day_6.task_10;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class PowerCalculatorTest {

    public static void main(String[] args) {

        PowerCalculatorTest test = new PowerCalculatorTest();
        test.powerTest1();
        test.powerTest2();
        test.powerTest3();
    }

    public void powerTest1(){
        PowerCalculator powerCalculator = new PowerCalculator();
        int result = powerCalculator.powerNumber(5,2);
        if (result == 25){
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FAIL");
        }
    }

    public void powerTest2(){
        PowerCalculator powerCalculator = new PowerCalculator();
        int result = powerCalculator.powerNumber(5,1);
        if (result == 5){
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FAIL");
        }
    }

    public void powerTest3(){
        PowerCalculator powerCalculator = new PowerCalculator();
        int result = powerCalculator.powerNumber(0,2);
        if (result == 0){
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FAIL");
        }
    }
}
