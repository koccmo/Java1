package student_jaroslav_brutan.lesson_5.day_4;

import java.util.Random;

public class Task_30 {
    public static void main(String[] args) {
        int[] numbers = new int[9];
        Random randomNum = new Random();
        for (int i = 0;i < numbers.length;i++){
            numbers[i] = randomNum.nextInt(90);
        }
        for (int i = 0;i < numbers.length;i++){
            System.out.println("[" + i + "] = " + numbers[i]);
        }
        for (int i : numbers){
            if (i % 2 != 0){
                System.out.println("Odd numbers are - " + i);
            }
        }
    }
}
