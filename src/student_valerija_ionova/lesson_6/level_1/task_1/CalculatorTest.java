package student_valerija_ionova.lesson_6.level_1.task_1;

public class CalculatorTest {
    public static void main(String [] args){
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.testIsEven();
    }

    public void testIsEven(){
        Calculator calculator = new Calculator();

        if (!calculator.isEven(5)){
            System.out.println("Test isEven OK");
        }else{
            System.out.println("Test isEven FAIL");
        }
    }
}
