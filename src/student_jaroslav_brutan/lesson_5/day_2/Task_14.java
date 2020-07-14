package student_jaroslav_brutan.lesson_5.day_2;

import java.util.Random;

public class Task_14 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random random = new Random();
        numbers[0] = random.nextInt();
        numbers[1] = random.nextInt();
        numbers[2] = random.nextInt();
        int averageValue = numbers[0] + numbers[1] + numbers[2] / 3;
        System.out.println("Average value of numbers is - " + averageValue);
    }
}
