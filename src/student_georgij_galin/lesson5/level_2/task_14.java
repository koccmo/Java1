package student_georgij_galin.lesson5.level_2;

import java.util.Random;

public class task_14 {

    public static void main(String[] args){
        int [] numbers = new int [3];

        Random random = new Random();

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            int randomNumber = random.nextInt(100);
            numbers[i] = randomNumber;
            sum += numbers[i];
        }

        double result = (double)sum / numbers.length;

        System.out.println("Result = "+ result);

    }

}