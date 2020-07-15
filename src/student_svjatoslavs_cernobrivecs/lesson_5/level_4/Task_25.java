package student_svjatoslavs_cernobrivecs.lesson_5.level_4;

import java.util.Scanner;

public class Task_25 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of Array:");

        int arrayLength = scanner.nextInt();

        int[] number = new int[arrayLength];

        System.out.println("Enter the list of numbers:");


        for (int i = 0; i < arrayLength; i ++){
            number[i] = scanner.nextInt();
        }
        for (int i = 0; i <arrayLength; i ++){
            System.out.println("[" + i + "] = " + number[i]);
        }
    }
}
