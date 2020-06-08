package student_aleksandra_maksimovic.lesson_2.homeworks.day_5.task_18;

import java.util.Scanner;

    public class Task_15 {

        public static void main(String[] args) {
            System.out.println("Enter your number");
            Scanner input = new Scanner(System.in);
            int userNumber = input.nextInt();

            for (int i = 1; i <= 10; i++){

                System.out.print ( userNumber + " x " + i +" = " + (i * userNumber) + "; ");
            }


        }


}
