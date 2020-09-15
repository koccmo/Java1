package student_sandra_arniece.lesson_5.level_4; //Task 30

import java.util.Arrays;
import java.util.Random;

class OddRandom {

    public static void main(String[] args) {

        int[] randomArray = new int[9];

        Random randomNumber = new Random();
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = randomNumber.nextInt(20);
            System.out.println(Arrays.toString(randomArray));

            for (int j : randomArray) {
                if (j % 2 != 0) {
                    System.out.println(j);
                }
            }
        }
    }

}
