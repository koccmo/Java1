package student_vladimir_kobenko.lesson5.homeworls.level_2;

import java.util.Random;

public class Task_14 {
    public static void main(String[] args) {
        int[] digits = new int[3];

        Random random = new Random();

        for (int i = 0; i < digits.length; i++) {
            int randomNumber = random.nextInt(100);
            digits[i] = randomNumber;
        }

        for (int j = 0; j<3; j++) {
            System.out.println(digits[j]);
        }
            int sumArray = 0;

        for (int number : digits) {
            sumArray += number;

        }
        double arrayAverage = sumArray / 3;
        System.out.println("Average of array elements = " + arrayAverage);
    }
}
