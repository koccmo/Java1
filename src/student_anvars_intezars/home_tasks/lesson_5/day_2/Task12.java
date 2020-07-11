package student_anvars_intezars.home_tasks.lesson_5.day_2;

import java.util.Random;

public class Task12 {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(5);
            System.out.println( "[" + i + "] =" + numbers[i]);
        }
    }
}


