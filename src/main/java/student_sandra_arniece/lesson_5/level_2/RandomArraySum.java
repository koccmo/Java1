package student_sandra_arniece.lesson_5.level_2; //Task 13

import java.util.Random;

class RandomArraySum {

    public static void main(String[] args) {

        int[] randomArray = new int[3];

        int arraySum = 0;

        Random randomNumber = new Random();
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = randomNumber.nextInt();
            arraySum += randomArray[i];
        }
        System.out.println(arraySum);
    }

}
