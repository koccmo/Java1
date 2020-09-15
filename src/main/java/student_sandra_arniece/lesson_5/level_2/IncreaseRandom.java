package student_sandra_arniece.lesson_5.level_2; //Task 15

import java.util.Random;
import java.util.Arrays;

class IncreaseRandom {

    public static void main(String[] args) {

        int[] randomArray = new int[3];

        Random randomNumber = new Random();
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = randomNumber.nextInt(99);
        }
        System.out.println(Arrays.toString(randomArray));
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] += 2;
        }
        System.out.println(Arrays.toString(randomArray));
    }

}
