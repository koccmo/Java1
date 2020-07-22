package student_vladimir_kobenko.lesson6.homeworks.level_1.Task_3;

public class FizzBuzzTest {
    public static void main(String [] args){
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.testFizzBuzz();
        fizzBuzzTest.testBuzz();
        fizzBuzzTest.testFizz();
        fizzBuzzTest.testNotFizzBuzz();
    }

    void checkString(String name, String methodsResult, String expectedResult){
        if (methodsResult.equals(expectedResult)){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    public void testFizzBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkString("FizzBuzzTest",fizzBuzz.detect(30), "FizzBuzz");
    }

    public void testFizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkString("FizzBuzzTest",fizzBuzz.detect(9), "Fizz");
    }

    public void testBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkString("FizzBuzzTest",fizzBuzz.detect(25), "Buzz");
    }

    public void testNotFizzBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkString("NotFizzBuzzTest",fizzBuzz.detect(4), "4");
    }
}
