package student_valerija_ionova.lesson_7.homeworks.level_6.task_10;

/*Разработать класс PowerCalculator, который реализует единственный функциональный метод
для возведения заданного числа в заданную степень.
Математическую операцию реализовать с использованием цикла.
Написать тестовые сценарии для класса PowerCalculator в классе PowerCalculatorTest.
Все тестовые сценарии должны отрабатывать без ошибок.*/

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class PowerCalculatorTest {
    public static void main(String[] args){
        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();

        powerCalculatorTest.testPower3Of2();
        powerCalculatorTest.testPower1Of5();
        powerCalculatorTest.testPower0Of8();

    }

    public void checkInt(String name, int methodsResult, int expectedResult){
        if (methodsResult == expectedResult){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    public void testPower3Of2 (){
        PowerCalculator powerCalculator = new PowerCalculator();
        checkInt("test Power 3 Of 2", powerCalculator.powerOfNumber(2, 3), 8);
        //System.out.println(powerCalculator.powerOfNumber(2, 3));
    }

    public void testPower1Of5 (){
        PowerCalculator powerCalculator = new PowerCalculator();
        checkInt("test Power 1 Of 5", powerCalculator.powerOfNumber(5, 1), 5);
        //System.out.println(powerCalculator.powerOfNumber(2, 3));
    }

    public void testPower0Of8 (){
        PowerCalculator powerCalculator = new PowerCalculator();
        checkInt("test Power 0 Of 8", powerCalculator.powerOfNumber(8, 0), 1);
        //System.out.println(powerCalculator.powerOfNumber(2, 3));
    }
}
