package student_anvars_intezars.home_tasks.lesson_6.day_1.task_1.task_3;

public class FizzBuzzTest {

    public static void main(String[] args) {

        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.firstTestFizzBuzz();
        fizzBuzzTest.secondTestFizz();
        fizzBuzzTest.thirdTestBizz();
    }

    public void firstTestFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(15);
        if (result.equals("FizzBuzz")) {
            System.out.println("First Test for FizzBuzz = OK");
        }
        else {
            System.out.println("First Test for FizzBuzz = FAIL");
        }
    }

    public void secondTestFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(3);
        if (result.equals("Fizz")) {
            System.out.println("Second Test for Fizz = OK");
        }
        else {
            System.out.println("Second Test for Fizz = FAIL");
        }
    }

    public void thirdTestBizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(5);
        if (result.equals("Fizz")) {
            System.out.println("Third Test for Fizz = OK");
        }
        else {
            System.out.println("Third Test for Fizz = OK");
        }
    }
}

