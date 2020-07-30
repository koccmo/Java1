package student_sandra_arniece.lesson_5.level_4; //Task 26

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class UserLengthRandomArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input an integer for array length and press Enter: ");
        int userArrayLength = sc.nextInt();

        int[] userArray = new int[userArrayLength];

        Random randomNumber = new Random();
        for (int i = 0; i < userArray.length; i++) {
            userArray[i] = randomNumber.nextInt(99);
        }

        System.out.println("Your array: " + Arrays.toString(userArray));
    }

}
