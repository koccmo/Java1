package student_sandra_arniece.lesson_5.level_4; //Task 27

import java.util.Arrays;
import java.util.Random;

class HighestRandom {

    public static void main(String[] args) {

        int[] randomArray = new int[5];

        Random randomNumber = new Random();
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = randomNumber.nextInt(20);
            System.out.println(Arrays.toString(randomArray));

            int maxNumber = randomArray[0];
            for (int element : randomArray) {
                if (element > maxNumber) {
                    maxNumber = element;
                }
            }
            System.out.println(maxNumber);
        }
    }

}
