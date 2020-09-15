package student_valerija_ionova.lesson_6.level_1.task_3;

//Создайте класс FizzBuzzTest и напишите автоматические тесты
//на все сценарии.

class FizzBuzzTest {
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
        checkString("FizzBuzzTest",fizzBuzz.detect(15), "FizzBuzz");
    }

    public void testFizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkString("FizzBuzzTest",fizzBuzz.detect(6), "Fizz");
    }

    public void testBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkString("FizzBuzzTest",fizzBuzz.detect(20), "Buzz");
    }

    public void testNotFizzBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkString("NotFizzBuzzTest",fizzBuzz.detect(8), "8");
    }
}
