package student_valerija_ionova.lesson_8.level_x.super_task_2;

public class MathOperationTest {

    public static void main (String [] args){

        MathOperationTest test = new MathOperationTest();

        test.testAddition();
        test.testSubtraction();
        test.testMultiplication();
        test.testDivision();
        test.testArgument();
        test.testMultipleOperations();
        test.testMultipleOperations2();
    }

    public void resultOfTest(String name, boolean resultOfTest){
        if (resultOfTest){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    public void testArgument(){
        Argument arg1 = new Argument (5);
        resultOfTest("testArgument", arg1.calculate() == 5);
    }

    public void testAddition(){
        Argument arg1 = new Argument(20);
        Argument arg2 = new Argument(10);

        Addition addition = new Addition(arg1, arg2);
        resultOfTest("testAddition", addition.calculate() == 30);
    }

    public void testSubtraction(){
        Argument arg1 = new Argument(20);
        Argument arg2 = new Argument(10);

        Subtraction subtraction = new Subtraction(arg1, arg2);
        resultOfTest("testSubtraction", subtraction.calculate() == 10);
    }

    public void testMultiplication(){
        Argument arg1 = new Argument(20);
        Argument arg2 = new Argument(10);

        Multiplication result = new Multiplication(arg1, arg2);
        resultOfTest("testMultiplication", result.calculate() == 200);
    }

    public void testDivision(){
        Argument arg1 = new Argument(20);
        Argument arg2 = new Argument(10);

        Division division = new Division(arg1, arg2);
        resultOfTest("testAddition", division.calculate() == 2);
    }

    public void testMultipleOperations(){
        Argument arg1 = new Argument(20);
        Argument arg2 = new Argument(10);
        Argument arg3 = new Argument(30);
        Argument arg4 = new Argument(15);

        Multiplication result1 = new Multiplication(arg1, arg2);

        Division result2 = new Division(arg3, arg4);

        Addition result3 = new Addition(result1, result2);
        resultOfTest("testMultipleOperations", result3.calculate() == 202);
    }

    public void testMultipleOperations2(){
        Argument arg1 = new Argument(10);
        Argument arg2 = new Argument(10);
        Argument arg3 = new Argument(30);
        Argument arg4 = new Argument(15);

        Division result1 = new Division(arg1, arg2);

        Addition result2 = new Addition(arg3, arg4);

        Multiplication result3 = new Multiplication(result1, result2);

        resultOfTest("testMultipleOperations2", result3.calculate() == 45);
    }
}
