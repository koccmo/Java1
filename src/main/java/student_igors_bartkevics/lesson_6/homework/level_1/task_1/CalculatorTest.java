package student_igors_bartkevics.lesson_6.homework.level_1.task_1;



public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calc = new CalculatorTest();
        calc.evenTest();
    }
    public void checkResult(boolean condition, String name) {
        if (condition) {
            System.out.println(name + "Ok!");
        } else System.out.println(name + "False!");
    }
    public void evenTest() {
        Calculator calc = new Calculator();
        int number = 4;
        String nameOfTest = "Even Test";
        boolean result = calc.isEven(number);
        checkResult(result, nameOfTest);

    }
}
