package roman.lesson_6.homework.day_1.task_3;

public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();

        test.numberFizzBuzz();
        test.numberFizz();
        test.numberBuzz();
        test.notCorrectNumber();
    }

    FizzBuzz check = new FizzBuzz();

    public void checkResults (boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println("Test " + nameOfTest + " OK!");
        } else System.out.println("Test " + nameOfTest + " False!");
    }

    public void numberFizzBuzz () {
        int number = 15;
        String nameOfTest = "FizzBuzz number Fifteen";
        String expectedAnswer = check.detect(number);
        checkResults(expectedAnswer.equals("FizzBuzz"), nameOfTest);
    }

    public void numberFizz () {
        int number = 9;
        String expectedAnswer = "Fizz";
        String nameOfTest = "Fizz number Nine";
        boolean condition = expectedAnswer.equals(check.detect(number));
        checkResults(condition, nameOfTest);
    }

    public void numberBuzz () {
        int number = 5;
        String nameOfTest = "Buzz number Five";
        String expectedAnswer = "Buzz";
        boolean condition = expectedAnswer.equals(check.detect(number));
        checkResults(condition, nameOfTest);
    }

    public void notCorrectNumber () {
        int number = 23;
        String nameOfTest = "Not correct number";
        String expectedAnswer = "23";
        boolean condition = expectedAnswer.equals(check.detect(number));
        checkResults(condition, nameOfTest);
    }
}
