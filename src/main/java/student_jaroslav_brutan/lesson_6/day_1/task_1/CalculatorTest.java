package student_jaroslav_brutan.lesson_6.day_1.task_1;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest test = new CalculatorTest();
        test.isEvenTest();
		// тест на отрицательный результат тоже нужен
    }
    public void isEvenTest(){
        int number = 6;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(number);
        if (result){
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FALSE");
        }
    }

    public void isEvenTestFail(){
        Calculator calculator = new Calculator();

        if (!calculator.isEven(7)){
            System.out.println("Test - OK!");
        } else {
            System.out.println("Test - FAIL!");
        }
    }
}
