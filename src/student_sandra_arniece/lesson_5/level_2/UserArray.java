package student_sandra_arniece.lesson_5.level_2; //Task 11

import java.util.Arrays;
import java.util.Scanner;

class UserArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input three integers, after each integer input pressing Enter: ");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int thirdNumber = sc.nextInt();

        int[] array = new int[3];
        array[0] = firstNumber;
        array[1] = secondNumber;
        array[2] = thirdNumber;
        System.out.println(Arrays.toString(array));
    }

}
