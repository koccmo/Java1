package student_georgij_galin.lesson5.level_2;

import java.util.Random;

public class task_15 {

    public static void main(String[] args){
        int [] numbers = new int [3];

        Random random = new Random();


        for (int i = 0; i < numbers.length; i++) {
            int randomNumber = random.nextInt(100);
            numbers[i] = randomNumber;

        }

        for (int i = 0; i< numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println("");

        for (int i=0; i<numbers.length; i++){
            numbers[i] += 2;
        }

        for (int i = 0; i< numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }

    }

}
