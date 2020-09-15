package student_sandra_arniece.lesson_5.level_4; //Task 25

import java.util.Arrays;
import java.util.Scanner;

class UserLengthArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input an integer for array length and press Enter: ");
        int userArrayLength = sc.nextInt();

        int[] userArray = new int[userArrayLength];

        System.out.println("Input " + userArray.length + " integer numbers to fill the array, after each integer input pressing Enter:");
        for (int i = 0; i < userArray.length; i++) {
            userArray[i] = sc.nextInt();
        }

        System.out.println("Your array: " + Arrays.toString(userArray));
    }

}
