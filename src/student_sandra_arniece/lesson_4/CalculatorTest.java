package student_sandra_arniece.lesson_4;
//Task 12,13,14,15
public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.additionTest();
        calculatorTest.divisionTest();
        calculatorTest.subtractionTest();
        calculatorTest.multiplicationTest();
        calculatorTest.evenTest1();
        calculatorTest.evenTest2();
        calculatorTest.maxOfTwoTest1();
        calculatorTest.maxOfTwoTest2();
        calculatorTest.maxOfTwoTest3();
        calculatorTest.maxOfThreeTest1();
        calculatorTest.maxOfThreeTest2();
        calculatorTest.maxOfThreeTest3();
        calculatorTest.maxOfThreeTest4();
        calculatorTest.maxOfThreeTest5();
        calculatorTest.maxOfThreeTest6();
        calculatorTest.maxOfThreeTest7();
    }
    public void additionTest(){
        int firstInteger = 10;
        int secondInteger = 5;
        Calculator calculator = new Calculator();
        int result = calculator.addition(firstInteger, secondInteger);
        if(result == 15){
            System.out.println("Addition test = OK");
        }
        else{
            System.out.println("Addition test = FAIL");
        }
    }
    public void divisionTest(){
        int firstInteger = 10;
        int secondInteger = 5;
        Calculator calculator = new Calculator();
        int result = calculator.division(firstInteger, secondInteger);
        if(result == 2){
            System.out.println("Division test = OK");
        }
        else{
            System.out.println("Division test = FAIL");
        }
    }
    public void subtractionTest(){
        int firstInteger = 10;
        int secondInteger = 5;
        Calculator calculator = new Calculator();
        int result = calculator.subtraction(firstInteger, secondInteger);
        if(result == 5){
            System.out.println("Subtraction test = OK");
        }
        else{
            System.out.println("Subtraction test = FAIL");
        }
    }
    public void multiplicationTest(){
        int firstInteger = 10;
        int secondInteger = 5;
        Calculator calculator = new Calculator();
        int result = calculator.multiplication(firstInteger, secondInteger);
        if(result == 50){
            System.out.println("Multiplication test = OK");
        }
        else{
            System.out.println("Multiplication test = FAIL");
        }
    }
    public void evenTest1(){
        int integer = 10;
        Calculator calculator = new Calculator();
        boolean result = calculator.even(integer);
        if(result){
            System.out.println("Even test = OK");
        }
        else{
            System.out.println("Even test = FAIL");
        }
    }
    public void evenTest2(){
        int integer = 5;
        Calculator calculator = new Calculator();
        boolean result = calculator.even(integer);
        if(!result){
            System.out.println("Even test = OK");
        }
        else{
            System.out.println("Even test = FAIL");
        }
    }
    public void maxOfTwoTest1(){
        int firstInteger = 10;
        int secondInteger = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwo(firstInteger, secondInteger);
        if(result == 10){
            System.out.println("MaxOfTwo test1 = OK");
        }
        else{
            System.out.println("MaxOfTwo test1 = FAIL");
        }
    }
    public void maxOfTwoTest2(){
        int firstInteger = 5;
        int secondInteger = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwo(firstInteger, secondInteger);
        if(result == 10){
            System.out.println("MaxOfTwo test2 = OK");
        }
        else{
            System.out.println("MaxOfTwo test2 = FAIL");
        }
    }
    public void maxOfTwoTest3(){
        int firstInteger = 5;
        int secondInteger = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwo(firstInteger, secondInteger);
        if(result == 5){
            System.out.println("MaxOfTwo test3 = OK");
        }
        else{
            System.out.println("MaxOfTwo test3 = FAIL");
        }
    }
    public void maxOfThreeTest1(){
        int firstInteger = 10;
        int secondInteger = 5;
        int thirdInteger = 1;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThree(firstInteger, secondInteger, thirdInteger);
        if(result == 10){
            System.out.println("MaxOfTwo test3 = OK");
        }
        else{
            System.out.println("MaxOfTwo test3 = FAIL");
        }
    }
    public void maxOfThreeTest2(){
        int firstInteger = 5;
        int secondInteger = 10;
        int thirdInteger = 1;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThree(firstInteger, secondInteger, thirdInteger);
        if(result == 10){
            System.out.println("MaxOfTwo test3 = OK");
        }
        else{
            System.out.println("MaxOfTwo test3 = FAIL");
        }
    }
    public void maxOfThreeTest3(){
        int firstInteger = 1;
        int secondInteger = 5;
        int thirdInteger = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThree(firstInteger, secondInteger, thirdInteger);
        if(result == 10){
            System.out.println("MaxOfTwo test3 = OK");
        }
        else{
            System.out.println("MaxOfTwo test3 = FAIL");
        }
    }
    public void maxOfThreeTest4(){
        int firstInteger = 10;
        int secondInteger = 10;
        int thirdInteger = 1;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThree(firstInteger, secondInteger, thirdInteger);
        if(result == 10){
            System.out.println("MaxOfTwo test3 = OK");
        }
        else{
            System.out.println("MaxOfTwo test3 = FAIL");
        }
    }
    public void maxOfThreeTest5(){
        int firstInteger = 10;
        int secondInteger = 5;
        int thirdInteger = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThree(firstInteger, secondInteger, thirdInteger);
        if(result == 10){
            System.out.println("MaxOfTwo test3 = OK");
        }
        else{
            System.out.println("MaxOfTwo test3 = FAIL");
        }
    }
    public void maxOfThreeTest6(){
        int firstInteger = 10;
        int secondInteger = 5;
        int thirdInteger = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThree(firstInteger, secondInteger, thirdInteger);
        if(result == 10){
            System.out.println("MaxOfTwo test3 = OK");
        }
        else{
            System.out.println("MaxOfTwo test3 = FAIL");
        }
    }
    public void maxOfThreeTest7(){
        int firstInteger = 5;
        int secondInteger = 5;
        int thirdInteger = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThree(firstInteger, secondInteger, thirdInteger);
        if(result == 5){
            System.out.println("MaxOfTwo test3 = OK");
        }
        else{
            System.out.println("MaxOfTwo test3 = FAIL");
        }
    }

}