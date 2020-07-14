package student_jaroslav_brutan.lesson_5.day_4;

import java.util.Arrays;
import java.util.Scanner;

public class Task_25 {
    public static void main(String[] args) {
        Scanner scanNum = new Scanner(System.in);
        System.out.println("Enter array length");
        int arrayLength = scanNum.nextInt();
        int[] numbers = new int[arrayLength];
        System.out.println("Enter numbers for array's index");
        for (int i = 0;i < numbers.length;i++){
            numbers[i] = scanNum.nextInt();
        }
        for (int i= 0; i < numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
}
