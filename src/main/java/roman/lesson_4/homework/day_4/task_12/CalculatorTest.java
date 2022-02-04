package roman.lesson_4.homework.day_4.task_12;

import roman.lesson_4.homework.day_4.task_11.Calculator;


public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calcTest = new CalculatorTest();
        calcTest.test1();
        calcTest.test2();
        calcTest.test3();
        calcTest.test4();
        calcTest.largerNumberTest1();
        calcTest.largerNumberTest2();
        calcTest.largerNumberTest3();
        calcTest.biggersNumberOfTreeTest1();
        calcTest.biggersNumberOfTreeTest2();
        calcTest.biggersNumberOfTreeTest3();
        calcTest.biggersNumberOfTreeTest4();
        calcTest.biggersNumberOfTreeTest5();
        calcTest.biggersNumberOfTreeTest6();
        calcTest.biggersNumberOfTreeTest7();
        calcTest.biggersNumberOfTreeTest8();
        calcTest.biggersNumberOfTreeTest9();
        calcTest.biggersNumberOfTreeTest10();
        calcTest.biggersNumberOfTreeTest11();
        calcTest.biggersNumberOfTreeTest12();
        calcTest.equalsTreeNumbersTest13();
    }

    public void test1() {
        int firstNumber = 5;
        int secondNumber = 10;
        Calculator calc = new Calculator();
        int result = calc.sum(firstNumber,secondNumber);
        if (result == 15) {
            System.out.println("Sum test = True!");
        } else {
            System.out.println("Sum test = Fail!");
        }
    }
    public void test2() {
        int firstNumber = 2;
        int secondNumber = 2;
        Calculator calc = new Calculator();
        int result = calc.real(firstNumber,secondNumber);
        if (result == 4) {
            System.out.println("Double test = True!");
        } else {
            System.out.println("Double test = Fail!");
        }
    }
    public void test3() {
        int firstNumber = 4;
        int secondNumber = 2;
        Calculator calc = new Calculator();
        int result = calc.devide(firstNumber,secondNumber);
        if (result == 2) {
            System.out.println("Devide test = True!");
        } else {
            System.out.println("Devide test = Fail!");
        }
    }
    public void test4() {
        int firstNumber = 5;
        int secondNumber = 1;
        Calculator calc = new Calculator();
        int result = calc.minus(firstNumber,secondNumber);
        if (result == 4) {
            System.out.println("Minus test = True!");
        } else {
            System.out.println("Minus test = Fail");
        }
    }
    public void largerNumberTest1() {
        int firstNumber = 2;
        int secondNumber = 3;
        Calculator calc = new Calculator();
        int result = calc.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 3) {
            System.out.println("Larger number test is OK");
        } else {System.out.println("Larger number test1 is Fail");}
    }
    public void largerNumberTest2() {
        int firstNumber = 3;
        int secondNumber = 2;
        Calculator calc = new Calculator();
        int result = calc.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 3) {
            System.out.println("Larger number test is OK");
        } else {System.out.println("Larger number test2 is Fail");}
    }
    public void largerNumberTest3() {
        int firstNumber = 3;
        int secondNumber = 3;
        Calculator calc = new Calculator();
        int result = calc.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 3) {
            System.out.println("Larger number test3 is OK");
        } else {System.out.println("Larger number test is Fail");}
    }
    public void biggersNumberOfTreeTest1() {
        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber = 3;
        Calculator calc = new Calculator();
        int result = calc.biggerNumberOfThree(firstNumber,secondNumber,thirdNumber);
        if (result == 3) {
            System.out.println("Biggest numbers Test1 is OK!");
        } else {
            System.out.println("Test is Fail!!!!!");
        }
    }
    public void biggersNumberOfTreeTest2() {
        int firstNumber = 3;
        int secondNumber = 1;
        int thirdNumber = 2;
        Calculator calc = new Calculator();
        int result = calc.biggerNumberOfThree(firstNumber,secondNumber,thirdNumber);
        if (result == 3) {
            System.out.println("Biggest numbers Test2 is OK!");
        } else {
            System.out.println("Test is Fail!!!!!");
        }
    }
    public void biggersNumberOfTreeTest3() {
        int firstNumber = 2;
        int secondNumber = 3;
        int thirdNumber = 1;
        Calculator calc = new Calculator();
        int result = calc.biggerNumberOfThree(firstNumber,secondNumber,thirdNumber);
        if (result == 3) {
            System.out.println("Biggest numbers Test3 is OK!");
        } else {
            System.out.println("Test is Fail!!!!!");
        }
    }
    public void biggersNumberOfTreeTest4() {
        int firstNumber = 1;
        int secondNumber = 1;
        int thirdNumber = 3;
        Calculator calc = new Calculator();
        int result = calc.biggerNumberOfThree(firstNumber,secondNumber,thirdNumber);
        if (result == 3) {
            System.out.println("Biggest numbers Test4 is OK!");
        } else {
            System.out.println("Test is Fail!!!!!");
        }
    }
    public void biggersNumberOfTreeTest5() {
        int firstNumber = 3;
        int secondNumber = 1;
        int thirdNumber = 1;
        Calculator calc = new Calculator();
        int result = calc.biggerNumberOfThree(firstNumber,secondNumber,thirdNumber);
        if (result == 3) {
            System.out.println("Biggest numbers Test5 is OK!");
        } else {
            System.out.println("Test is Fail!!!!!");
        }
    }
    public void biggersNumberOfTreeTest6() {
        int firstNumber = 1;
        int secondNumber = 3;
        int thirdNumber = 1;
        Calculator calc = new Calculator();
        int result = calc.biggerNumberOfThree(firstNumber,secondNumber,thirdNumber);
        if (result == 3) {
            System.out.println("Biggest numbers Test6 is OK!");
        } else {
            System.out.println("Test is Fail!!!!!");
        }
    }
    public void biggersNumberOfTreeTest7() {
        int firstNumber = 3;
        int secondNumber = 3;
        int thirdNumber = 2;
        Calculator calc = new Calculator();
        int result = calc.biggerNumberOfThree(firstNumber,secondNumber,thirdNumber);
        if (result == 3) {
            System.out.println("Biggest numbers Test7 is OK!");
        } else {
            System.out.println("Test is Fail!!!!!");
        }
    }
    public void biggersNumberOfTreeTest8() {
        int firstNumber = 2;
        int secondNumber = 3;
        int thirdNumber = 3;
        Calculator calc = new Calculator();
        int result = calc.biggerNumberOfThree(firstNumber,secondNumber,thirdNumber);
        if (result == 3) {
            System.out.println("Biggest numbers Test8 is OK!");
        } else {
            System.out.println("Test is Fail!!!!!");
        }
    }
    public void biggersNumberOfTreeTest9() {
        int firstNumber = 3;
        int secondNumber = 2;
        int thirdNumber = 3;
        Calculator calc = new Calculator();
        int result = calc.biggerNumberOfThree(firstNumber,secondNumber,thirdNumber);
        if (result == 3) {
            System.out.println("Biggest numbers Test9 is OK!");
        } else {
            System.out.println("Test is Fail!!!!!");
        }
    }
    public void biggersNumberOfTreeTest10() {
        int firstNumber = 3;
        int secondNumber = 2;
        int thirdNumber = 2;
        Calculator calc = new Calculator();
        int result = calc.biggerNumberOfThree(firstNumber,secondNumber,thirdNumber);
        if (result == 3) {
            System.out.println("Biggest numbers Test10 is OK!");
        } else {
            System.out.println("Test is Fail!!!!!");
        }
    }
    public void biggersNumberOfTreeTest11() {
        int firstNumber = 2;
        int secondNumber = 3;
        int thirdNumber = 2;
        Calculator calc = new Calculator();
        int result = calc.biggerNumberOfThree(firstNumber,secondNumber,thirdNumber);
        if (result == 3) {
            System.out.println("Biggest numbers Test11 is OK!");
        } else {
            System.out.println("Test is Fail!!!!!");
        }
    }
    public void biggersNumberOfTreeTest12() {
        int firstNumber = 2;
        int secondNumber = 2;
        int thirdNumber = 3;
        Calculator calc = new Calculator();
        int result = calc.biggerNumberOfThree(firstNumber,secondNumber,thirdNumber);
        if (result == 3) {
            System.out.println("Biggest numbers Test12 is OK!");
        } else {
            System.out.println("Test is Fail!!!!!");
        }
    }
    public void equalsTreeNumbersTest13() {
        int firstNumber = 5;
        int secondNumber = 5;
        int thirdNumber = 5;
        Calculator calc = new Calculator();
        int result = calc.biggerNumberOfThree(firstNumber,secondNumber,thirdNumber);
        if (result == 5) {
            System.out.println("Biggest number Test13 for Equals all number it OK!");
        } else {System.out.println("Test when all number equal Failed!!!");}
    }

}
