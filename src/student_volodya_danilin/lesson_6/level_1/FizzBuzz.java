package student_volodya_danilin.lesson_6.level_1;

import java.util.Random;

public class FizzBuzz {
// метод можно реализовать сразу через параметр number
    public String detect(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) return "FizzBuzz";
        else if (number % 3 == 0) return "Fizz";
        else if (number % 5 == 0) return "Buzz";
        else return "" + number; // Integer.toString(initialNumber);
    }

}

class FizzBuzzTest{

    public static void main(String[] Args) {

        FizzBuzz fizzBuzz = new FizzBuzz();
        Random randomNumber = new Random();

        for (int i = 0; i <=20; i++) {

            int testNumber = randomNumber.nextInt(21);
            System.out.println(testNumber + " " + fizzBuzz.detect(testNumber));
        }
    }
}