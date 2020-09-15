package student_vladimir_kobenko.lesson5.homeworls.level_2;

import java.util.Random;

public class Task_15 {
    public static void main(String[] args) {
        int[] digits = new int[3];

        Random random = new Random();

        for (int i = 0; i < digits.length; i++) {
            int randomNumber = random.nextInt(100);
            digits[i] = randomNumber;
            System.out.println(digits[i]);
        }
        System.out.println("New array elements:");

        for (int i = 0; i < digits.length; i++) {
            digits[i] = digits[i]+2;
            System.out.println(digits[i]);
        }
    }
}
