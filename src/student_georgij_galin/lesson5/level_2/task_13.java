package student_georgij_galin.lesson5.level_2;

import java.util.Random;

public class task_13 {

    public static void main(String[] args){
        int [] numbers = new int [3];

        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            int randomNumber = random.nextInt(100);
            numbers[i] = randomNumber;
        }

        int sum = 0;

        for (int number:numbers
        ) {
            sum += number;
        }

        System.out.println("Sum = "+ sum);

    }

}