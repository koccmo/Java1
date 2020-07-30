package student_valerija_ionova.lesson_4.level_x.super_task_3;

/*Task12
Создайте класс CalculatorTest и напишите тесты для
всех методов класса Calculator из предыдущего задания.

Test13 Добавьте в класс CalculatorTest тесты для этого метода.

Task14 Добавьте в класс CalculatorTest тесты для этого метода.
}*/



class CalculatorTest {
    public static void main(String[] args) {

        //Calculator calculator = new Calculator();
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.substractTest();
        calculatorTest.multiplyTest();
        calculatorTest.divideTest();
        calculatorTest.isEvenTestTrue();
        calculatorTest.isEvenTestFalse();


    }

   public void checkResultInt(String name, int methodsResult, int rightResult){
            if (methodsResult == rightResult){
                System.out.println(name+" = OK");
            } else System.out.println(name+" = FAIL");
    }

    public void checkResultBoolean(String name, boolean methodsResult, boolean rightResult){
        if (methodsResult == rightResult){
            System.out.println(name+" = OK");
        } else System.out.println(name+" = FAIL");
    }

    public void sumTest() {
        Calculator calculator = new Calculator();
        checkResultInt("SumTest", calculator.sum(5, 10), 15);
    }

    public void substractTest() {
        Calculator calculator = new Calculator();
        checkResultInt("SubstractTest", calculator.substract(10, 4), 6);
    }

    public void multiplyTest() {
        Calculator calculator = new Calculator();
        checkResultInt("MultiplyTest", calculator.multiply(10, 2), 20);
    }

    public void divideTest() {
        Calculator calculator = new Calculator();
        checkResultInt("DivideTest", calculator.multiply(2, 40), 80);
    }

    public void isEvenTestTrue() {
        Calculator calculator = new Calculator();
        checkResultBoolean("isEvenTest", calculator.isEven(10), true);
    }

    public void isEvenTestFalse() {
        Calculator calculator = new Calculator();
        checkResultBoolean("isEvenTest", calculator.isEven(5), false);
    }


}

