package student_svjatoslavs_cernobrivecs.lesson_4.level_1;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, input a number");
        int userNumber = scanner.nextInt();

        if (userNumber > 0){
            System.out.println("Number is positive");
        } else {
            if (userNumber < 0) {
                System.out.println("Number is negative");
            } else {
                System.out.println("Number equals to zero");
            }
        }

    }
}
