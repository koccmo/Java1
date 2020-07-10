package student_anvars_intezars.home_tasks.lesson_5.day_2;

import java.util.Random;

public class Task12Nr2 {

    public static void main(String[] args) {

        // Второй вариант 12 задания из Day5. Можно исползовать не массив при выводе на консоль,
        // а создать отдельную переменную(randomNumber).

        int[] numbers = new int[3];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
        int randomNumber = random.nextInt(5);
        numbers[i] = randomNumber;
        System.out.println( "[" + i + "] =" + numbers[i]);
            }
        }
    }
