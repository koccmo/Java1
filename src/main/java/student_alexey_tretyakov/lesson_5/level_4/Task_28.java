package student_alexey_tretyakov.lesson_5.level_4;

import java.util.Random;

public class Task_28 {
    public static void main(String[] args) {

        int[] numbers = new int[10];

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000);
            System.out.println(" Значения  в " + (i + 1) + " ячейке = " + numbers[i]);
        }
        int minInt = numbers[0];
        for (int number : numbers) {
            if (number <= minInt) minInt = number;
        }
        System.out.println(" Наименьшее значение массива = " + minInt);
    }
}
