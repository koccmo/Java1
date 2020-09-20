package student_volodya_danilin.lesson_12.level_3.Task_19;

import java.util.InputMismatchException;
import java.util.Scanner;

class WrongUserInputHandlingDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean isDone = false;
        int inputInt;


        while (!isDone) {
            try {
                System.out.print("Enter integer : ");
                inputInt = sc.nextInt();
                isDone = true;
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input!");
                sc.next();
            }
        }

    }
}
