package student_sandra_arniece.lesson_5.level_4; //Task 28

import java.util.Arrays;
import java.util.Random;

class LowestRandom {

    public static void main(String[] args) {

        int[] randomArray = new int[5];

        Random randomNumber = new Random();
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = randomNumber.nextInt(20);
            System.out.println(Arrays.toString(randomArray));

            int minNumber = randomArray[0];
            for (int element : randomArray) {
                if (element < minNumber) {
                    minNumber = element;
                }
            }
            System.out.println(minNumber);
        }
    }

}
