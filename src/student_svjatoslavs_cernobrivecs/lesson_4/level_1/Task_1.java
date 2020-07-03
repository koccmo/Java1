package student_svjatoslavs_cernobrivecs.lesson_4.level_1;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input number");
        int userNumber = scanner.nextInt();
        if (0 < userNumber) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
    }
}
