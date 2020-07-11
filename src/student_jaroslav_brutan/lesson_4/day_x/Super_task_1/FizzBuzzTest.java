package student_jaroslav_brutan.lesson_4.day_x.Super_task_1;

public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzTest();
        fizzBuzzTest.buzzTest();
        fizzBuzzTest.fizzBuzzTest();
        fizzBuzzTest.notFizzBuzzTest();
    }
    public void fizzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(9);
        if (result .equals("Fizz")){
            System.out.println("Test Fizz is ok!");
        } else {
            System.out.println("Test Fizz is false!");
        }
    }

    public void buzzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(10);
        if (result .equals("Buzz")){
            System.out.println("Test Buzz is ok!");
        } else {
            System.out.println("Test Buzz is false!");
        }
    }

    public void fizzBuzzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(15);
        if (result .equals("FizzBuzz")){
            System.out.println("Test FizzBuzz is ok!");
        } else {
            System.out.println("Test FizzBuzz is false!");
        }
    }

    public void notFizzBuzzTest(){   // а по лучше название придумать этому тесту?
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(16);
        if (result .equals("16")){
            System.out.println("Test Not FizzBuzz is ok!");
        } else {
            System.out.println("Test Not FizzBuzz is false!");
        }
    }
}
