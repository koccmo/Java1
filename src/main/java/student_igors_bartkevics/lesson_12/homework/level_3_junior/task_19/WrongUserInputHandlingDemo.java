package student_igors_bartkevics.lesson_12.homework.level_3_junior.task_19;

import java.util.InputMismatchException;
import java.util.Scanner;

class WrongUserInputHandlingDemo {

    public static void main(String[] args) {

        while(true) {

            try {
                var scanner = new Scanner(System.in);
                System.out.println("Please enter integer value: ");
                scanner.nextInt();
                System.out.println("Thank you!");
                break;
            }
            catch (InputMismatchException exception) {
                System.out.println("You entered value of wrong type");
            }
        }
    }

}
