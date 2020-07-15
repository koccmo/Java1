package student_valerija_ionova.lesson_6.level_1.task_1;

public class CalculatorTest {
    public static void main(String [] args){
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.testIsEvenFalse();
        calculatorTest.testIsEvenTrue();
    }

    public void testIsEvenFalse(){
        Calculator calculator = new Calculator();

        if (!calculator.isEven(5)){
            System.out.println("Test isEvenFalse OK");
        }else{
            System.out.println("Test isEvenFalse FAIL");
        }
    }

    public void testIsEvenTrue(){
        Calculator calculator = new Calculator();

        if (calculator.isEven(58)){
            System.out.println("Test isEvenTrue OK");
        }else{
            System.out.println("Test isEvenTrue FAIL");
        }
    }
}
