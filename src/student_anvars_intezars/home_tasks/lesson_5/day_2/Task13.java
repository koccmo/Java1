package student_anvars_intezars.home_tasks.lesson_5.day_2;

import java.util.Random;

public class Task13 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] randomNumbers = new int[3];
        for (int i = 0; i < randomNumbers.length; i++) {
            int randomNumber = random.nextInt(10);
            randomNumbers[i] = randomNumber;
        }
        int sum = 0;
        for (int randomNumber : randomNumbers) {
            sum = sum + randomNumber;
        }
        System.out.println("Sum of Array Random Numbers = " + sum);
    }
}