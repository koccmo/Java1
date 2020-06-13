package student_svjatoslavs_cernobrivecs.lesson_2.day_3;

import java.util.Scanner;

public class Task_9v2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, input number:");
        int myNumber = scanner.nextInt();

        for(int i = 1; i < 11; i++){
            System.out.println("Result: " + myNumber + " x " + i + " = " + myNumber * i);
        }

    }
}
