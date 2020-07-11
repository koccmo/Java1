package student_igors_bartkevics.lesson_4.homeworks.day_x.super_task_1;

class FizzBuzzTest {

    public static void main(String[] args) {

        FizzBuzzTest test = new FizzBuzzTest();
        test.numberDivBy_3_And_5();
        test.numberDivBy_3();
        test.numberDivBy_5();
        test.numberIsNotDivBy_3_Or_5();
    }

    public void numberDivBy_3_And_5() {
        int number = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(number);
        if (result.equals("FizzBuzz")) {
            System.out.println("Number is divisible by 3 and 5 test = OK");
        }
        else {
            System.out.println("Number is divisible by 3 and 5 test = FAIL");
        }
    }

    public void numberDivBy_3() {
        int number = 9;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(number);
        if (result.equals("Fizz")) {
            System.out.println("Number is divisible by 3 test = OK");
        }
        else {
            System.out.println("Number is divisible by 3 test = FAIL");
        }
    }

    public void numberDivBy_5() {
        int number = 10;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(number);
        if (result.equals("Buzz")) {
            System.out.println("Number is divisible by 5 test = OK");
        }
        else {
            System.out.println("Number is divisible by 5 test = FAIL");
        }
    }

    public void numberIsNotDivBy_3_Or_5() {
        int number = 11;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(number);
        if (result.equals("" + number)) {
            System.out.println("Number is NOT divisible by 3 or 5 test = OK");
        }
        else {
            System.out.println("Number is NOT divisible by 5 test = FAIL");
        }
    }

}
