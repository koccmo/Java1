package student_vladimir_kobenko.lesson6.homeworks.level_1.Task_1;

public class CalculatorTest {
public static void main (String[] args) {
CalculatorTest calculatorTest = new CalculatorTest();
calculatorTest.TestEven();

    }

public void TestEven (){
    Calculator calculator = new Calculator();
    if (calculator.isEven(6) == true) {
        System.out.println("Test Even number is Ok");
    } else {
        System.out.println("Test Even is failed");
    }
    if (calculator.isEven(7) == false){
        System.out.println("Test NotEven is Ok");
    } else {
        System.out.println ("Test NotEven is failed");
    }
    }
}