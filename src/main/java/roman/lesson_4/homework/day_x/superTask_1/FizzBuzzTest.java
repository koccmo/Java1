package roman.lesson_4.homework.day_x.superTask_1;

public class FizzBuzzTest {
    FizzBuzz test = new FizzBuzz();
    public static void main(String[] args) {
        FizzBuzzTest numbers = new FizzBuzzTest();
        numbers.numberTestOne();
        numbers.numberTestTwo();
        numbers.numberTestThree();
        numbers.numberTestFour();

    }

    public void numberTestOne() {
        if (test.detect(15).equals("FizzBuzz")) {
            System.out.println("Test with number 15 Ok!!!!");
        } else System.out.println("Test with number 15 FAIL!!!!");
    }
    public void numberTestTwo() {
        if (test.detect(12).equals("Fizz")) {
            System.out.println("Test with number 12 OK!!!");
        } else System.out.println("Test with number 12 FAIL!!");
    }
    public void numberTestThree() {
        if (test.detect(25).equals("Buzz")) {
            System.out.println("Test with number 25 OK!!!");
        } else System.out.println("Test with number 25 FAIL!!!");
    }
    public void numberTestFour() {
        if (test.detect(11).equals("11")) {
            System.out.println("Test with number 11 OK!!!!");
        } else System.out.println("Test with number 11 FAIL!!!!");
    }
}
