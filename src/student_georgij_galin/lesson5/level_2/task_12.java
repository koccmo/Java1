package student_georgij_galin.lesson5.level_2;

import java.util.Random;

public class task_12 {

    public static void main(String[] args){
        int [] numbers = new int [3];

        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            int randomNumber = random.nextInt(100);
            numbers[i] = randomNumber;
        }

        for (int number:numbers
        ) {
            System.out.println(number);
        }

    }

}