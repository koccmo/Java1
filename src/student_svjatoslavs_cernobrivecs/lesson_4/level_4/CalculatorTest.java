package student_svjatoslavs_cernobrivecs.lesson_4.level_4;

public class CalculatorTest {

    public static void main(String[] args){

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.substractTest();
        calculatorTest.multiplyTest();
        calculatorTest.devideTest();
    }
    public void sumTest(){
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        if (result == 15) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }
    public void substractTest(){
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.substract(firstNumber, secondNumber);
        if (result == 5) {
            System.out.println("Substract test = OK");
        } else {
            System.out.println("Substract test = FAIL");
        }
    }
    public void multiplyTest(){
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.multiply(firstNumber, secondNumber);
        if (result == 50) {
            System.out.println("Multiply test = OK");
        } else {
            System.out.println("Multiply test = FAIL");
        }
    }
    public void devideTest(){
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.devide(firstNumber, secondNumber);
        if (result == 2){
            System.out.println("Devide test = OK");
        } else {
            System.out.println("Devide test = FAIL");
        }

    }
}
